package Script;
import javax.management.monitor.Monitor;

import resources.Script.PT_GENERICO_05Helper;
import LIB.Libreria;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.services.IPlaybackMonitor;
import com.rational.test.ft.services.IPlaybackMonitorDisplay;
import com.rational.test.ft.services.PlaybackMonitor;
import com.rational.test.ft.services.PlaybackMonitorAdapter;
import com.rational.test.ft.services.PlaybackMonitorPreferences;
import com.rational.test.ft.services.PlaybackMonitorPreferencesValue;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.jvm.dtfjview.commands.helpers.MonitorState;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author cpena
 */
public class PT_GENERICO_05 extends PT_GENERICO_05Helper
{
	/**
	 * Script Name   : <b>PT_GENERICO_05</b>
	 * Generated     : <b>14/03/2014 14:05:33</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/03/14
	 * @author cpena
	 */
	
	public void Login()
	{
		
		Inicio();
		startApp("http://192.168.203.10/sigfe/");
		text_j_username().setText(dpString("Usuario"));
		text_j_password().setText(dpString("Password"));
		button_ingresarsubmit().click();
		sleep(2.0);
	}
	
	public void DatosGeneralesPT1()
	{
		sleep(2.0);
		link_tesorería().click();
		table_idPgTplJ_id71Menu().click(atCell(
                                        atRow(atIndex(1)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id73Menu().click(atCell(
                                        atRow(atIndex(1)), 
                                        atColumn(atIndex(1))));
		text_idPgTplIdIntTitulo().setText(dpString("TituloPT1"));
		text_idPgTplIdIntDescripcion().setText(dpString("DescripcionPT1"));
		
		
	}
	
	public void BuscarPrincipalPT1(String RUT)
	{
		sleep(2.0);
		text_idSubPopupBuscarAcreedorI().setText(RUT);
		sleep(2.0);
		button_buscarsubmit().click();
		sleep(2.0);
		checkBox_idSubPopupBuscarAcree().click();
		sleep(2.0);
		button_confirmarSelecciónsubmi().click();
		sleep(2.0);

	}
	
	public void AgregarDocumentosPT(String RUT, String DocumentosPT)
	{
		sleep(2.0);
		button_agregarDocumentosPorPag().click();
		sleep(2.0);
		link_buscarDocumentoPagarIdCml().click();
		sleep(2.0);
		
		//Buscar Principal Pago a Terceros
		
		BuscarPrincipalPT1(RUT);
		text_buscarDocumentoPagarIdNum().setText(DocumentosPT);
		button_buscarsubmit2().click();
		sleep(2.0);
		checkBox_buscarDocumentoPagarT4().setState(SELECTED);
		checkBox_buscarDocumentoPagarT2().setState(SELECTED);
		checkBox_buscarDocumentoPagarT3().setState(SELECTED);
		button_confirmarSelecciónsubmi2().click();
		sleep(5.0);
	}
	
	public void AgregarDocumentosPT2(String RUT, String DocumentosPT)
	{
		sleep(2.0);
		button_agregarDocumentosPorPag().click();
		sleep(2.0);
		link_buscarDocumentoPagarIdCml().click();
		sleep(2.0);
		
		//Buscar Principal Pago a Terceros
		
		BuscarPrincipalPT1(RUT);
		text_buscarDocumentoPagarIdNum().setText(DocumentosPT);
		button_buscarsubmit2().click();
		sleep(2.0);
		checkBox_buscarDocumentoPagarT4().setState(SELECTED);
		checkBox_buscarDocumentoPagarT2().setState(SELECTED);
		button_confirmarSelecciónsubmi2().click();
		sleep(5.0);
	}
	public void EntidadBancaria1()
	{
		sleep(2.0);
		radioButton_buscarCuentaBancar().click();
		sleep(5.0);
		list_seleccione().waitForExistence();
		sleep(2.0);
		list_seleccione().select("BANCO ESTADO");
		sleep(5.0);
		radioButton_cuentabuscarCuenta().click();
		sleep(2.0);
		button_confirmarSelecciónsubmi3().click();
		sleep(2.0);
		
	}
	public void EntidadBancaria2()
	{
		
		sleep(2.0);
		radioButton_buscarCuentaBancar().click();
		sleep(2.0);
		list_seleccione().waitForExistence();
		sleep(2.0);
		list_seleccione().select("BANCO ESTADO");
		sleep(2.0);
		radioButton_cuentabuscarCuenta2().click();
		sleep(2.0);
		button_confirmarSelecciónsubmi3().click();
		sleep(2.0);
	}
	
	public void MediosPagoPT()
	{
	sleep(2.0);
	list_seleccionar().select(dpString("MedioPagoPT1"));
	sleep(2.0);
	list_seleccionar2().select(dpString("MedioPagoPT2"));
	sleep(2.0);
	list_seleccionar3().select(dpString("MedioPagoPT3"));
	sleep(2.0);
	list_seleccionar4().select(dpString("MedioPagoPT4"));
	sleep(2.0);
	list_seleccionar5().select(dpString("MedioPagoPT5"));
	sleep(2.0);
	list_seleccionar6().select(dpString("MedioPagoPT6"));
	sleep(2.0);
	list_transferenciaElectrónicaD().click();
	sleep(2.0);
	browser_htmlBrowser(document_generarPagosATerceros(),DEFAULT_FLAGS).inputKeys("{TAB}");
	sleep(2.0);
	browser_htmlBrowser(document_generarPagosATerceros(),DEFAULT_FLAGS).inputKeys("d");
	sleep(2.0);
	browser_htmlBrowser(document_generarPagosATerceros(),DEFAULT_FLAGS).inputKeys("{ExtDown}");
	sleep(2.0);
	browser_htmlBrowser(document_generarPagosATerceros(),DEFAULT_FLAGS).inputKeys("d");
	sleep(2.0);
	
	}
	public void GuardarDigitadoPT()
	{
		sleep(2.0);
		link_idPgTplLinkLimpiarVarGuar().waitForExistence();
		link_idPgTplLinkLimpiarVarGuar().click();
		sleep(2.0);
		button_aceptarsubmit().waitForExistence();
		sleep(2.0);
		button_aceptarsubmit().click();
		String IDTE_GD = (String)table_htmlTable_0().getProperty(".text");
		Libreria.IDTE_GD = Integer.parseInt(IDTE_GD.replaceAll("[\\D]", ""));
		logInfo("El Valor de IDTE_GD es: " + Libreria.IDTE_GD);
		datapoolValueSetting("IDTE_GD", Libreria.IDTE_GD);
		sleep(2.0);
		Captura();
		sleep(2.0);
		button_aceptarsubmit3().click();
		sleep(2.0);
	}
	public void GenerarPT()
	{
		sleep(2.0);
		button_generarsubmit().click();
		sleep(4.0);
		button_aceptarsubmit2().waitForExistence();
		button_aceptarsubmit2().click();
		sleep(4.0);
		String IDTE_GEN = (String)table_pt2ContenedorMsj().getProperty(".text");
		Libreria.IDTE_GEN = Integer.parseInt(IDTE_GEN.replaceAll("[\\D]", ""));
		logInfo("El Valor de IDTE_GEN es: " + Libreria.IDTE_GEN);
		datapoolValueSetting("IDTE_GEN", Libreria.IDTE_GEN);
		sleep(2.0);
		Captura();
		sleep(2.0);
		link_irABienvenida().click();
		sleep(2.0);
	}
	public void AprobarPT()
	{
		sleep(2.0);
		link_contabilidad().click();
		table_idPgTplJ_id66Menu().click(atCell(
                                        atRow(atIndex(0)), 
                                        atColumn(atIndex(1))));
		sleep(2.0);
		list_seleccione2().select(dpString("ProcesoFuentePT"));
		sleep(2.0);
		list_seleccione3().select(dpString("EstadoPT"));
		sleep(2.0);
		link_idTmpBLinkBusquedaAvanzad().click();
		sleep(2.0);
		text_idTmpBFiltroIdTesoreria().setText(dpString("IDTE_GEN"));
		sleep(2.0);
		button_buscarsubmit3().click();
		table_htmlTable_0_2().click(atCell(atRow(atIndex(0)), 
                                     atColumn(atIndex(4))));
		sleep(2.0);
		browser_htmlBrowser(document_búsquedaDeAsientosCon(),DEFAULT_FLAGS).inputKeys("{TAB}");
		sleep(2.0);
		browser_htmlBrowser(document_búsquedaDeAsientosCon(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		browser_htmlBrowser(document_búsquedaDeAsientosCon(),DEFAULT_FLAGS).inputKeys("{ExtPgDn}");
		sleep(4.0);
		button_aprobarsubmit().click();
		sleep(2.0);
		String IDTE_FOLIO_APR = (String)table_htmlTable_0_3().getProperty(".contentText");
		Libreria.IDTE_FOLIO_APR = Integer.parseInt(IDTE_FOLIO_APR.replaceAll("[\\D]", ""));
		logInfo("El Valor de IDTE_FOLIO_APR es: " + Libreria.IDTE_FOLIO_APR);
		datapoolValueSetting("IDTE_FOLIO_APR", Libreria.IDTE_FOLIO_APR);
		sleep(2.0);
		Captura();
		sleep(2.0);
		button_aceptarsubmit4().click();
		sleep(2.0);
		link_irABienvenida2().click();
		sleep(3.0);
		callScript("Script.TEF_GENERICO_07");

	}
	
	public void testMain(Object[] args) 
	{
		String sNombreCaso = args[0].toString();	
		switch (sNombreCaso){ 			
	                                   			
	                                   			
	case "SIGFE2_151_1_E4T":              				
	{                                  			
	// "CP_SIGFE2_151_1_E4T_FUN_Pago a Terceros  Gastos presupuestarios con insumos-Datos Generales"
		
		//Datos Generales
		
		DatosGeneralesPT1();
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_152_1_E4T":              				
	{                                  			
	// "CP_SIGFE2_152_1_E4T_FUN_Pago a Terceros  Gastos presupuestarios con insumos-Agregar Documento por Pagar"
		
	// Agregar Documentos por pagar
		
		AgregarDocumentosPT(dpString("RutDP2"), 
							dpString("NumeroDocumentoDP1"));
		
		AgregarDocumentosPT(dpString("RutDP2"), 
							dpString("NumeroDocumentoDP2"));
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_153_1_E4T":              				
	{                                  			
	// "CP_SIGFE2_153_1_E4T_FUN_Pago a Terceros  Gastos presupuestarios con insumos-Ingresar Montos"                          			
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_154_1_E4T":              				
	{                                  			
	// "CP_SIGFE2_154_1_E4T_FUN_Pago a Terceros  Gastos presupuestarios con insumos-Ingresar Entidad Bancaria" 
		
	//Entidad Bancaria
		
		sleep(2.0);
		link_idPgTplItPrincipal0Cci1Ta().click();
		EntidadBancaria1();
		sleep(2.0);
		link_idPgTplItPrincipal0Cci1Ta2().click();
		EntidadBancaria1();
		sleep(2.0);
		link_idPgTplItPrincipal0Cci1Ta3().click();
		EntidadBancaria1();
		sleep(2.0);
		link_idPgTplItPrincipal0Cci1Ta4().click();
		EntidadBancaria1();
		sleep(2.0);
		link_idPgTplItPrincipal0Cci1Ta5().click();
		EntidadBancaria2();
		sleep(2.0);
		link_idPgTplItPrincipal0Cci1Ta6().click();
		EntidadBancaria2();
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_155_1_E4T":              				
	{                                  			
	// "CP_SIGFE2_155_1_E4T_FUN_Pago a Terceros  Gastos presupuestarios con insumos-Ingresar Detalle de Pago Parcial"
		
		//	Medios de Pago
		
		MediosPagoPT();
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_156_1_E4T":              				
	{                                  			
	// "CP_SIGFE2_156_1_E4T_FUN_Pago a Terceros  Gastos presupuestarios con insumos-Guardar Digitado"  
		
		
		//	Guardar Digitado
		
		GuardarDigitadoPT();
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_157_1_E4T":              				
	{                                  			
	// "CP_SIGFE2_157_1_E4T_FUN_Pago a Terceros  Gastos presupuestarios con insumos-Generar"  
		
		//	Generar
		
		GenerarPT();
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_158_1_E4AC":              				
	{                                  			
	// "CP_SIGFE2_158_1_E4AC_FUN_Completitud AC Tesoreria  presupuestarios con insumos-Aprobar"    
		
		AprobarPT();
			                        			
	   break;                          			
	}    
		}
		

		
	
		
	
		

		

		
		
		
	}
}

