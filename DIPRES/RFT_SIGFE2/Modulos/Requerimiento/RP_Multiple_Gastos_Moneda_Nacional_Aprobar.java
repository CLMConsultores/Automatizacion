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
		
		// Menú Buscar
		// Document: Bienvenid@ a SIGFE: http://192.168.203.10/sigfe/faces/bienvenida?_adf.ctrl-state=10ay1znz2_14&_afrLoop=491936980492953
		link_requerimiento().click();
		table_idPgTplJ_id11Menu().click(atCell(
                                        atRow(atIndex(0)), 
                                        atColumn(atIndex(1))));
		
		// Buscar Requerimiento Presupuestario
				
		// Document: Búsqueda de Requerimientos Presupuestarios: http://192.168.203.10/sigfe/faces/task-flow-requerimiento-buscar/busquedaRequerimiento?_adf.ctrl-state=10ay1znz2_88&_afrLoop=492386081445809
		text__1164425().setText(dpString("RP_ID"));
		button_buscarsubmit().click();
		link_idTmpBIdTbRqB0LinkVisuali().click();
		button_aprobarsubmit().click();
		button_aceptarsubmit().click();
		table_htmlTable_0().performTest(HtmlTable_0_textVP());
		button_aceptarsubmit2().click();
		link_irABienvenida().click();
		// Document: Bienvenid@ a SIGFE: http://192.168.203.10/sigfe/faces/bienvenida?_adf.ctrl-state=10ay1znz2_14&_afrLoop=491936980492953
		link_irABienvenida2().click();
		
	}
}

