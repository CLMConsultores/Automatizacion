package Modulos.Requerimiento;
import resources.Modulos.Requerimiento.RP_Multiple_Gastos_Moneda_Nacional_GenerarHelper;
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
 * @author cpena
 */
public class RP_Multiple_Gastos_Moneda_Nacional_Generar extends RP_Multiple_Gastos_Moneda_Nacional_GenerarHelper
{
	/**
	 * Script Name   : <b>RP_Multiple_Gastos_Moneda_Nacional_Generacion</b>
	 * Generated     : <b>25/08/2014 16:12:33</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/08/25
	 * @author cpena
	 */
	public void testMain(Object[] args) 
	{
//		/**Inicio de Sesion**/
//		/****************************************************************************/
//		startApp("T03");
//		
//		// HTML Browser
//		// Document: Autenticacion: http://192.168.203.10/sigfe/faces/autenticacion?_afrLoop=427905388800638&_afrWindowMode=0&_adf.ctrl-state=hpa6rjt9u_9
//		text_j_username().setText("Usua_0401013");
//		text_j_password().setText("usuario1234");
//		button_ingresarsubmit().click();
//		/****************************************************************************/
		
		
		/**Acceso a la transaccion**/
		// Document: Bienvenid@ a SIGFE: http://192.168.203.10/sigfe/faces/bienvenidaInicio?_adf.no-new-window-redirect=true&_afrWindowMode=0&_afrLoop=427990606233320&_adf.ctrl-state=hpa6rjt9u_14
		link_requerimiento().click();
		table_idPgTplJ_id11Menu().click(atCell(
                                        atRow(atIndex(2)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id22Menu().click(atCell(
                                        atRow(atIndex(0)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id23Menu().click(atCell(
                                        atRow(atIndex(0)), 
                                        atColumn(atIndex(1))));
		/****************************************************************************/
		
		
		/**Datos Generales RP**/
		// Document: Bienvenid@ a SIGFE: http://192.168.203.10/sigfe/faces/task-flow-requerimiento-multiprograma-registro/registroRequerimientoMultiprograma?_adf.ctrl-state=hpa6rjt9u_17&_afrLoop=428030262300502
		text_idPgTplTitulo().setText(dpString("RP_Titulo"));
		text_idPgTplDescripcion().setText(dpString("RP_Descripcion"));
		list_seleccione().click();
		list_seleccione().select(dpString("RP_TipoDemanda"));
		/****************************************************************************/
		

		/**Crear Detalle(Agregar Combinaciones de Catálogo)**/
		//Indicar el ID del Requerimiento
		sRP_ID = dpString("RP_ID");
		button_crearDetallesubmit().click();
		sleep(2.0);		
		
		//Inicializa el DP de Combinacion de Catalogos
		iDP_RP_CombCat = InicializaDP(sDP_RP_CombCat);
		iContador = 1;
		do		
		{	
			// Avanzar hasta el primer registro coincidente con el RP actual
			while(!iDP_RP_CombCat.dpDone() && !iDP_RP_CombCat.dpString("RP_CAT_ID").equals(sRP_ID + iContador)){				
				iDP_RP_CombCat.dpNext();
			}
			ClicObjeto (htmlTable_Programas_Internos(),iDP_RP_CombCat.dpString("RP_CAT_ProgramaInterno"), "Html.LABEL");		
			ClicObjeto (htmlTable_UnidadesDemandantes(),iDP_RP_CombCat.dpString("RP_CAT_UnidadDemandante"), "Html.LABEL");		
			ClicObjeto (htmlTable_ProgramaPres(),iDP_RP_CombCat.dpString("RP_CAT_ProgramaPresupuestario"), "Html.LABEL");		
			button_agregarCombinaciónsubmi().click();
			// Si el datapool no ha terminado, entonces avanza al proximo registro
			if (!iDP_RP_CombCat.dpDone()){  
				iDP_RP_CombCat.dpNext();
				//Aumentar el contador
				iContador++;
			}
		}while(!iDP_RP_CombCat.dpDone() && iDP_RP_CombCat.dpString("RP_CAT_ID").equals(sRP_ID + iContador));
		// Confirmar las combinaciones de catalogos
		button_aceptarsubmit().click();
		sleep(2.0);
		// Resetear el datapool
		iDP_RP_CombCat.dpReset();
		/****************************************************************************/

		/**Catalogos - Agregar Conceptos Presupuestarios.**/
		//Inicializa el DP de Combinacion de Catalogos
		iDP_RP_CombCat = InicializaDP(sDP_RP_CombCat);
		iContador = 1;
		iContador2 = 0;
		do
		{	
			// Avanzar hasta el primer registro coincidente con el RP actual
			while(!iDP_RP_CombCat.dpDone() && !iDP_RP_CombCat.dpString("RP_CAT_ID").equals(sRP_ID + iContador)){				
				iDP_RP_CombCat.dpNext();
			}
			//Abrir ventana de busqueda de conceptos
			ClicLink(html_idPgTplPglRequerimientos(),".id","idPgTpl:itAgrps:" + iContador2 + ":cci1:clkAddConc");
			//Inicializa el DP de Conceptos Presupuestarios
			iDP_RP_ConcPres = InicializaDP(sDP_RP_ConcPres);
			//Seleccion de Conceptos Presupuestarios
			do
			{	
				// Avanzar hasta el primer registro coincidente con el RP Catalogo actual
				while(!iDP_RP_ConcPres.dpDone() && !iDP_RP_ConcPres.dpString("RP_CAT_ID").equals(iDP_RP_CombCat.dpString("RP_CAT_ID"))){				
					iDP_RP_ConcPres.dpNext();
				}
				// Data Driven Code inserted on 25/08/2014
				text_CodigoConcepto().setText(iDP_RP_ConcPres.dpString("RP_IDConcepto"));
				button_buscarsubmit().click();
				sleep(2.0);
				checkBox_svwBuscarConceptoSMSm().click();
				button_agregarsubmit().click();
				sleep(1.0);
				// Si el datapool no ha terminado, entonces avanza al proximo registro
				if (!iDP_RP_ConcPres.dpDone()){  
					iDP_RP_ConcPres.dpNext();
				}
			}while(!iDP_RP_ConcPres.dpDone() && iDP_RP_ConcPres.dpString("RP_CAT_ID").equals(iDP_RP_CombCat.dpString("RP_CAT_ID")));
			//Confirma la seleccion de los Cocneptos Presupuestarios
			button_confirmarSelecciónsubmi().click();
			// Resetear el datapool
			iDP_RP_ConcPres.dpReset();
			sleep(2.0);
			
			// Ingreso de montos			
			do
			{	
				// Avanzar hasta el primer registro coincidente con el RP Catalogo actual
				while(!iDP_RP_ConcPres.dpDone() && !iDP_RP_ConcPres.dpString("RP_CAT_ID").equals(iDP_RP_CombCat.dpString("RP_CAT_ID"))){				
					iDP_RP_ConcPres.dpNext();
				}
				browser_htmlBrowser(document_bienvenidASIGFE(),DEFAULT_FLAGS).inputKeys("{TAB}");
				browser_htmlBrowser(document_bienvenidASIGFE(),DEFAULT_FLAGS).inputChars(iDP_RP_ConcPres.dpString("RP_Monto"));
				browser_htmlBrowser(document_bienvenidASIGFE(),DEFAULT_FLAGS).inputKeys("{TAB}");
				sleep(1.0);
				// Si el datapool no ha terminado, entonces avanza al proximo registro
				if (!iDP_RP_ConcPres.dpDone())  
					iDP_RP_ConcPres.dpNext();
				else //Salir del loop cuando el dp haya finalizado
					break;				
			}while(!iDP_RP_ConcPres.dpDone() && iDP_RP_ConcPres.dpString("RP_CAT_ID").equals(iDP_RP_CombCat.dpString("RP_CAT_ID")));
			
			//Confirma los montos de los Conceptos Presupuestarios
			button_aceptarsubmit2().click();
			sleep(2.0);
			
			// Si el datapool no ha terminado, entonces avanza al proximo registro
			if (!iDP_RP_CombCat.dpDone()){  
				iDP_RP_CombCat.dpNext();
				//Aumentar el contador
				iContador++;
				//Aumentar el contador2
				iContador2++;
			}
			
		}while(!iDP_RP_CombCat.dpDone() && iDP_RP_CombCat.dpString("RP_CAT_ID").equals(sRP_ID + iContador));
		/****************************************************************************/
		
		
		/**Guardar Digitado**/
		sleep(2.0);
		link_idPgTplCmdLnkGuardarBorra().click();
		table_htmlTable_0_5().waitForExistence(5.0, 1.0);
		if (!table_htmlTable_0_5().exists()){
			logPrintScreenWarning("Mensaje de Guardado Digitado del Requerimiento Presupuestario no fue mostrado.  Se intenta nuevamente.");
			link_idPgTplCmdLnkGuardarBorra().click();
		}
		table_htmlTable_0_5().performTest(PV_Guardar_DigitadoVP());
		button_aceptarsubmit8().click();
		/****************************************************************************/
		
		
		/**Generar**/
		button_generarsubmit().click();
		PV_Confirma_GenerarVP().performTest();
		button_aceptarsubmit7().click();
//		// Document: Mensaje de Éxito: http://192.168.203.10/sigfe/faces/task-flow-requerimiento-multiprograma-registro/registroRequerimientoMultiprograma?_adf.ctrl-state=10ay1znz2_82
		if (table_pt2ContenedorMsj().performTest(PV_Generacion_RPVP()))
		{
			String sID_RP = (String)table_pt2ContenedorMsj().getProperty(".text");	
			logPrintScreenInfo(sID_RP);
			sID_RP = String.valueOf(Integer.parseInt(sID_RP.replaceAll("[\\D]", ""))).toString();
			dpSetValue("RP_Generado", sID_RP);
		}
		else
			logPrintScreenError("No se ha generado satisfactoriamente el Requerimiento Presupuestario.");
		button_terminarLaTransacciónsu().click();
		/****************************************************************************/		
		
	}
}

