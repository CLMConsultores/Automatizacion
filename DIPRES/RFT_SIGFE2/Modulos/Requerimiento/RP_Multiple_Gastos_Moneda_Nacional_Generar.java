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
//		// Data Driven Code inserted on 25/08/2014
//		
//		// HTML Browser
//		// Document: Autenticacion: http://192.168.203.10/sigfe/faces/autenticacion?_afrLoop=427905388800638&_afrWindowMode=0&_adf.ctrl-state=hpa6rjt9u_9
//		text_j_username().setText(dpString("Username"));
//		text_j_password().setText(dpString("Password"));
//		button_ingresarsubmit().click();
//		/****************************************************************************/
//		
//		
//		/**Acceso a la transaccion**/
//		// Document: Bienvenid@ a SIGFE: http://192.168.203.10/sigfe/faces/bienvenidaInicio?_adf.no-new-window-redirect=true&_afrWindowMode=0&_afrLoop=427990606233320&_adf.ctrl-state=hpa6rjt9u_14
//		link_requerimiento().click();
//		table_idPgTplJ_id11Menu().click(atCell(
//                                        atRow(atIndex(2)), 
//                                        atColumn(atIndex(1))));
//		table_idPgTplJ_id22Menu().click(atCell(
//                                        atRow(atIndex(0)), 
//                                        atColumn(atIndex(1))));
//		table_idPgTplJ_id23Menu().click(atCell(
//                                        atRow(atIndex(0)), 
//                                        atColumn(atIndex(1))));
//		/****************************************************************************/
//		
//		
//		/**Datos Generales RP**/
//		// Data Driven Code inserted on 25/08/2014
//		// Document: Bienvenid@ a SIGFE: http://192.168.203.10/sigfe/faces/task-flow-requerimiento-multiprograma-registro/registroRequerimientoMultiprograma?_adf.ctrl-state=hpa6rjt9u_17&_afrLoop=428030262300502
//		text_idPgTplTitulo().setText(dpString("RP_Titulo"));
//		text_idPgTplDescripcion().setText(dpString("RP_Descripcion"));
//		list_seleccione().click();
//		list_seleccione().select(dpString("RP_TipoDemanda"));
//		/****************************************************************************/
//		
//
//		/**Crear Detalle(Agregar Combinaciones de Catálogo)**/
//		button_crearDetallesubmit().click();
//		
//		sleep(2.0);		
//
//		ClicObjeto (htmlTable_Programas_Internos(),"Sin Aplicación", "Html.LABEL");		
//		ClicObjeto (htmlTable_UnidadesDemandantes(),"Contralor General De La República", "Html.LABEL");		
//		ClicObjeto (htmlTable_ProgramaPres(),"P01-Contraloría General de la República", "Html.LABEL");		
//		button_agregarCombinaciónsubmi().click();
//		
//		ClicObjeto (htmlTable_Programas_Internos(),"Remodelación de Oficinas de la Fiscalía y Tribunal de Cuentas", "Html.LABEL");		
//		ClicObjeto (htmlTable_UnidadesDemandantes(),"Juzgado de Cuentas", "Html.LABEL");		
//		ClicObjeto (htmlTable_ProgramaPres(),"P01-Contraloría General de la República", "Html.LABEL");		
//		button_agregarCombinaciónsubmi().click();
//		
//		ClicObjeto (htmlTable_Programas_Internos(),"Control Centralizado de Seguridad", "Html.LABEL");		
//		ClicObjeto (htmlTable_UnidadesDemandantes(),"Secretaría General", "Html.LABEL");		
//		ClicObjeto (htmlTable_ProgramaPres(),"P01-Contraloría General de la República", "Html.LABEL");		
//		button_agregarCombinaciónsubmi().click();		
//		button_aceptarsubmit().click();
//		
//		/****************************************************************************/

		/**Catalogo 1 - Agregar Conceptos Presupuestarios.**/		
		ClicLink(html_idPgTplPglRequerimientos(),".id","idPgTpl:itAgrps:0:cci1:clkAddConc");		
		// Data Driven Code inserted on 25/08/2014
		text_CodigoConcepto().setText(dpString("RP_CP1"));
		button_buscarsubmit().click();
		sleep(2.0);
		checkBox_svwBuscarConceptoSMSm().click();
		button_agregarsubmit().click();
		
		// Data Driven Code inserted on 25/08/2014
		text_CodigoConcepto().setText(dpString("RP_CP2"));
		button_buscarsubmit().click();
		sleep(2.0);
		checkBox_svwBuscarConceptoSMSm().click();
		button_agregarsubmit().click();
		
		// Data Driven Code inserted on 25/08/2014
		text_CodigoConcepto().setText(dpString("RP_CP3"));
		button_buscarsubmit().click();
		sleep(2.0);
		checkBox_svwBuscarConceptoSMSm().click();
		button_agregarsubmit().click();
		
		// Data Driven Code inserted on 25/08/2014
		text__2907001().setText(dpString("RP_CP4"));
		button_buscarsubmit().click();
		sleep(2.0);
		checkBox_svwBuscarConceptoSMSm().click();
		button_agregarsubmit().click();
		button_confirmarSelecciónsubmi().click();				
		sleep(2.0);
		
		// Ingreso de montos
		for (int x=0;x<4;x++){
			browser_htmlBrowser(document_bienvenidASIGFE(),DEFAULT_FLAGS).inputKeys("{TAB}");
			browser_htmlBrowser(document_bienvenidASIGFE(),DEFAULT_FLAGS).inputChars(dpString("RP_Monto_CP1"));
			browser_htmlBrowser(document_bienvenidASIGFE(),DEFAULT_FLAGS).inputKeys("{TAB}");
			sleep(1.0);
		}
		button_aceptarsubmit2().click();
		/****************************************************************************/
		
		
		
		stop();
		
		ClicLink(html_idPgTplPglRequerimientos(),".id","idPgTpl:itAgrps:1:cci1:clkAddConc");
		button_cancelarsubmit().click();
		sleep(2.0);
		ClicLink(html_idPgTplPglRequerimientos(),".id","idPgTpl:itAgrps:2:cci1:clkAddConc");
		button_cancelarsubmit().click();
		/****************************************************************************/
		
		
		
		
		
		// Ingreso De Montos a Conceptos Presupuestarios Cata 1
		// Data Driven Code inserted on 25/08/2014
		text_svwAgregarConceptoPresPop().setText(dpString("RP_Monto_CP1"));
		text_svwAgregarConceptoPresPop2().setText(dpString("RP_Monto_CP2"));
		text_svwAgregarConceptoPresPop3().setText(dpString("RP_Monto_CP3"));
		text_svwAgregarConceptoPresPop4().setText(dpString("RP_Monto_CP4"));
		
//		
//		// Catalogo 2, Agregar Conceptos Presupuestarios.
//		sleep(2.0);
//		link_idPgTplItAgrps1Cci1ClkAdd().click();
//		// Data Driven Code inserted on 25/08/2014
//		
//		// HTML Browser
//		// Document: Bienvenid@ a SIGFE: http://192.168.203.10/sigfe/faces/task-flow-requerimiento-multiprograma-registro/registroRequerimientoMultiprograma?_adf.ctrl-state=hpa6rjt9u_17&_afrLoop=428030262300502
//		text__2205002().setText(dpString("RP_CP5"));
//		button_buscarsubmit2().click();
//		sleep(2.0);
//		checkBox_svwBuscarConceptoSMSm2().click();
//		button_agregarsubmit2().click();
//		
//		// Data Driven Code inserted on 25/08/2014
//		text__210100103().setText(dpString("RP_CP6"));
//		button_buscarsubmit2().click();
//		sleep(2.0);
//		checkBox_svwBuscarConceptoSMSm2().click();
//		button_agregarsubmit2().click();
//		
//		// Data Driven Code inserted on 25/08/2014
//		text__2205001().setText(dpString("RP_CP7"));
//		button_buscarsubmit2().click();
//		sleep(2.0);
//		checkBox_svwBuscarConceptoSMSm2().click();
//		button_agregarsubmit2().click();
//		
//		button_confirmarSelecciónsubmi2().click();
//		
//		// Data Driven Code inserted on 25/08/2014
//		text_svwAgregarConceptoPresPop5().setText(dpString("RP_Monto_CP5"));
//		text_svwAgregarConceptoPresPop6().setText(dpString("RP_Monto_CP6"));
//		text_svwAgregarConceptoPresPop7().setText(dpString("RP_Monto_CP7"));
//		button_aceptarsubmit3().click();
//		
//		// Catalogo 3, Agregar Conceptos Presupuestarios.
//		sleep(2.0);
//		link_idPgTplItAgrps2Cci1ClkAdd().click();
//		
//		// Data Driven Code inserted on 25/08/2014
//		text__2204001().setText(dpString("RP_CP8"));
//		button_buscarsubmit3().click();
//		sleep(2.0);
//		checkBox_svwBuscarConceptoSMSm3().click();
//		button_agregarsubmit3().click();
//		
//		// Data Driven Code inserted on 25/08/2014
//		text__2205001().setText(dpString("RP_CP9"));
//		button_buscarsubmit3().click();
//		sleep(2.0);
//		checkBox_svwBuscarConceptoSMSm3().click();
//		button_agregarsubmit3().click();
//		
//		// Data Driven Code inserted on 25/08/2014
//		text__2205002().setText(dpString("RP_CP10"));
//		button_buscarsubmit3().click();
//		sleep(2.0);
//		checkBox_svwBuscarConceptoSMSm3().click();
//		button_agregarsubmit3().click();
//		
//		button_confirmarSelecciónsubmi3().click();
//		
//		// Data Driven Code inserted on 25/08/2014
//		text_svwAgregarConceptoPresPop8().setText(dpString("RP_Monto_CP8"));
//		text_svwAgregarConceptoPresPop9().setText(dpString("RP_Monto_CP9"));
//		text_svwAgregarConceptoPresPop10().setText(dpString("RP_Monto_CP10"));
//		button_aceptarsubmit4().click();
//		
//		// Guardar Digitado
//		sleep(2.0);
//		link_idPgTplCmdLnkGuardarBorra().click();
//		table_htmlTable_0_5().performTest(HtmlTable_0_textVP());
//		//String IDRP_GD=(String)table_htmlTable_0_5().getProperty(".text");
//		
//		button_generarsubmit().click();
//		
//		
//		// HTML Browser
//		// Document: Bienvenid@ a SIGFE: http://192.168.203.10/sigfe/faces/task-flow-requerimiento-multiprograma-registro/registroRequerimientoMultiprograma?_adf.ctrl-state=hpa6rjt9u_17&_afrLoop=428030262300502
//		button_aceptarsubmit6().click();
//		button_generarsubmit().click();
//		button_aceptarsubmit7().click();
//		// Document: Mensaje de Éxito: http://192.168.203.10/sigfe/faces/task-flow-requerimiento-multiprograma-registro/registroRequerimientoMultiprograma?_adf.ctrl-state=10ay1znz2_82
//		table_pt2ContenedorMsj().performTest(pt2ContenedorMsj_textVP());
//		button_terminarLaTransacciónsu().click();
		
		
		
		
		/*
		String RP_FOLIO_APR=(String)table_htmlTable_0_2().getProperty(".text");
		Libreria.RP_FOLIO_APR=Integer.parseInt(RP_FOLIO_APR.replaceAll("[\\D]", ""));
		logInfo("El Valor de RP_FOLIO_APR es: "+Libreria.RP_FOLIO_APR);
		datapoolValueSetting("RP_FOLIO_APR", Libreria.RP_FOLIO_APR);
		button_aceptarsubmit8().waitForExistence();
		*/
	}
}

