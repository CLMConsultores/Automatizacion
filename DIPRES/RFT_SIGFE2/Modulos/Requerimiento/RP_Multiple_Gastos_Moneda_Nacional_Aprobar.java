package Modulos.Requerimiento;
import resources.Modulos.Requerimiento.RP_Multiple_Gastos_Moneda_Nacional_AprobarHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author Daniel Palma
 */
public class RP_Multiple_Gastos_Moneda_Nacional_Aprobar extends RP_Multiple_Gastos_Moneda_Nacional_AprobarHelper
{
	/**
	 * Script Name   : <b>RP_Multiple_Gastos_Moneda_Nacional_Aprobar</b>
	 * Generated     : <b>26/08/2014 10:03:57</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/08/26
	 * @author cpena
	 */
	public void testMain(Object[] args) 
	{
		
		// Avanzar hasta el primer registro de RP generado
		while(!dpDone() && dpString("RP_Generado").isEmpty()){				
			dpNext();
		}
		if (dpDone()){
			logPrintScreenWarning("No existe ningún Requerimiento Presupuestario Generado.");
			return;
		}
		// Menú Buscar
		// Document: Bienvenid@ a SIGFE: http://192.168.203.10/sigfe/faces/bienvenida?_adf.ctrl-state=10ay1znz2_14&_afrLoop=491936980492953
		link_requerimiento().click();
		table_idPgTplJ_id11Menu().click(atCell(
                                        atRow(atIndex(0)), 
                                        atColumn(atIndex(1))));

		
		// HTML Browser
		// Document: Búsqueda de Requerimientos Presupuestarios: http://192.168.203.10/sigfe/faces/task-flow-requerimiento-buscar/busquedaRequerimiento?_adf.ctrl-state=10ay1znz2_88&_afrLoop=492386081445809
		label_búsquedaDeRequerimientos().performTest(
                                        PV_BusquedaRPVP(), 2.0, 
                                        10.0);
		
				
		// Document: Búsqueda de Requerimientos Presupuestarios: http://192.168.203.10/sigfe/faces/task-flow-requerimiento-buscar/busquedaRequerimiento?_adf.ctrl-state=10ay1znz2_88&_afrLoop=492386081445809
		text__1164425().setText(dpString("RP_Generado"));
		button_buscarsubmit().click();
		
		//Verificar si se muestra el RP Generado
//		table_htmlTable_0_2().ensureObjectIsVisible();
		// HTML Browser
		// Document: Búsqueda de Requerimientos Presupuestarios: http://192.168.203.10/sigfe/faces/task-flow-requerimiento-buscar/busquedaRequerimiento?_adf.ctrl-state=10ay1znz2_88&_afrLoop=492386081445809
		if (!table_htmlTable_0_2().performTest(PV_RPGenerado_EncontradoVP())){
			logPrintScreenError("El Requerimiento Presupuestado Generado ID: " + dpString("RP_Generado") + " no fue encontrado.");
			link_irABienvenida().click();
			return;			
		}
		else
			logPrintScreenInfo("Requerimiento Presupuestario encontrado satisfactoriamente.");
		
		//Visualizar requerimiento
		link_idTmpBIdTbRqB0LinkVisuali().click();
		label_visualizarRequerimientoP().waitForExistence(5.0, 2.0);		
		if (label_visualizarRequerimientoP().exists()) 
			logPrintScreenInfo("Requerimiento Presupuestario visualizado satisfactoriamente.");
		else{
			logPrintScreenError("El Requerimiento Presupuestado Generado ID: " + dpString("RP_Generado") + " no fue visualizado.");
			link_irABienvenida().click();
			return;			
		}
		
		//Aprobar requerimiento
		button_aprobarsubmit().click();
		//Verificar mensaje de confirmacion de aprobacion
		html_confirmarPopupPanelMensaj().performTest(
                                        PV_ConfirmaAprobacionVP(), 
                                        2.0, 10.0);
		
		button_aceptarsubmit().click();
		//Verificar RP Aprobado		
		if (table_htmlTable_0().performTest(PV_RPAprobadoVP()))
		{	
			String sRP_Folio = (String)table_htmlTable_0().getProperty(".text");	
			logPrintScreenInfo(sRP_Folio);
			sRP_Folio = String.valueOf(Integer.parseInt(sRP_Folio.replaceAll("[\\D]", ""))).toString();
			dpSetValue("RP_Folio", sRP_Folio);
		}
		else
			logPrintScreenError("No se ha aprobado satisfactoriamente el Requerimiento Presupuestario.");
		button_aceptarsubmit2().click();
		link_irABienvenida().click();
	}
	
	
	public boolean onUnhandledException(Throwable arg0) {
//		DocumentarLog("Se ha producido un error no controlado: " + arg0.toString(), getTopScript().getScriptName(), Integer.valueOf(1), getRootTestObject().getScreenSnapshot());
		arg0.printStackTrace();
//		Detener en caso de presionar la tecla F11
		if (arg0.toString().contains("com.rational.test.ft.UserStoppedScriptError"))
			return false;	
		
		return true;
		
	}
}

