package Script;
import resources.Script.CP_GENERICO_02Helper;
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
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author cpena
 */
public class CP_GENERICO_02 extends CP_GENERICO_02Helper
{
	/**
	 * Script Name   : <b>CP_GENRICO_02</b>
	 * Generated     : <b>05/03/2014 17:22:50</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/03/05
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
	public void DatosGenerales()
	{
		sleep(2.0);
		link_compromiso().click();
		table_idPgTplJ_id30Menu().click(atCell(
                                        atRow(atIndex(1)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id32ScrollConte().click(atCell(
                                        atRow(atIndex(9)), 
                                        atColumn(atIndex(1))));
		text_idPgTplIdInteTituloCompro().setText(dpString("TituloCompromiso"));
		text_idPgTplIdInteDescripcionC().setText(dpString("DescripcionCompromiso"));
		list_seleccione().select(dpString("TipoPresupuestoCP"));
		sleep(2.0);
		
	}
	public void BuscarRP()
	{
		sleep(2.0);
		link_idPgTplIdCmiIrDocumentoRe().waitForExistence();
		link_idPgTplIdCmiIrDocumentoRe().click();
		list_requerimientoPresupuestar().waitForExistence();
		list_requerimientoPresupuestar().select(dpString("ProcesoCP"));
		list_svwBuscarDocumentoRefPopu().select(dpString("TipoDemandaCP"));
		text_svwBuscarDocumentoRefPopu().setText(dpString("RP_FOLIO_APR"));
		list_nacional().select(dpString("MonedaPresupuestaria"));
		button_buscarsubmit().click();
		sleep(2.0);
		checkBox_svwBuscarDocumentoRef().click();
		button_confirmarSelecciónsubmi().click();
		
		sleep(2.0);
		checkBox_svwBuscarDocumentoRef2().setState(SELECTED);
		checkBox_svwBuscarDocumentoRef3().setState(SELECTED);
		checkBox_svwBuscarDocumentoRef4().setState(SELECTED);
		checkBox_svwBuscarDocumentoRef5().setState(SELECTED);
		
		sleep(2.0);
		checkBox_svwBuscarDocumentoRef6().setState(SELECTED);
		checkBox_svwBuscarDocumentoRef7().setState(SELECTED);
		checkBox_svwBuscarDocumentoRef8().setState(SELECTED);
		checkBox_svwBuscarDocumentoRef13().setState(SELECTED);

		
		sleep(2.0);
		checkBox_svwBuscarDocumentoRef9().setState(SELECTED);
		checkBox_svwBuscarDocumentoRef10().setState(SELECTED);
		checkBox_svwBuscarDocumentoRef11().setState(SELECTED);

		sleep(5.0);
		button_confirmarSelecciónsubmi2().click();
		

		sleep(7.0);
		image_ampliarIniciativaDeInver().click();
		sleep(5.0);
		radioButton__1svwBuscarDocumen().setState(SELECTED);
		sleep(2.0);
		button_agregarsubmit().click();
		sleep(3.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB 3}");
		sleep(2.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{Enter}");
		sleep(2.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		sleep(2.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputChars(" ");
		sleep(4.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB}");
		sleep(2.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{Enter}");
		sleep(3.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB 3}");
		sleep(2.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{Enter}");
		sleep(4.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		sleep(2.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputChars(" ");
		sleep(2.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB}");
		sleep(2.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{Enter}");
		sleep(4.0);
		button_aceptarsubmit().click();
		sleep(2.0);
		
	}

	public void DatosContrato()
	{
		sleep(2.0);
		text_idPgTplIdInteDescripcionD().setText(dpString("DescripcionContrato"));
		text_idPgTplIdInteNumeroDocume().setText(dpString("NumeroDocumentoContrato"));
		text_idPgTplIdIndaFechaDocumen().setText(dpString("FechaDocumentoContrato"));
		list_seleccione2().select(dpString("MonedaDocContrato"));
		sleep(2.0);
	}

	public void BuscarPrincipal(String RUT)
	{
		sleep(2.0);
		link_idPgTplIdCmlBuscarPrincip().click();
		sleep(2.0);
		radioButton_idbuscarPrincipalP().waitForExistence();
		radioButton_idbuscarPrincipalP().click();
		sleep(2.0);
		text_idbuscarPrincipalPopupIdI2().setText(RUT);

		button_buscarsubmit2().click();
		checkBox_idbuscarPrincipalPopu().click();
		button_confirmarSelecciónsubmi3().click();
		sleep(2.0);
	}
	public void IngresoMontosInsumos1(String M1,
			String M2,
			String M3,
			String M4)
	{
		sleep(2.0);		
		link_idPgTplItAgrp0IdCmbConcep().click();
		sleep(2.0);	
		text_idregistroInsumoPopupTabI().setText(M1);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		button_aceptarsubmit2().waitForExistence();
		button_aceptarsubmit2().click();
		
		sleep(4.0);
		link_idPgTplItAgrp0IdCmbConcep2().click();
		sleep(2.0);
		text_idregistroInsumoPopupTabI().setText(M2);
		text_idregistroInsumoPopupTabI2().setText(M3);
		text_idregistroInsumoPopupTabI3().setText(M4);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		button_aceptarsubmit2().waitForExistence();
		button_aceptarsubmit2().click();
		

	}
	
	public void IngresoMontosInsumos2(String M5,
			String M6,
			String M7,
			String M8)
	{
		sleep(4.0);
		link_idPgTplItAgrp1IdCmbConcep().click();
		sleep(2.0);	
		text_idregistroInsumoPopupTabI().setText(M5);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		button_aceptarsubmit2().waitForExistence();
		button_aceptarsubmit2().click();
		sleep(4.0);
		
		sleep(4.0);	
		link_idPgTplItAgrp1IdCmbConcep2().click();
		sleep(2.0);	
		text_idregistroInsumoPopupTabI().setText(M6);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		button_aceptarsubmit2().waitForExistence();
		button_aceptarsubmit2().click();
		
		
		sleep(4.0);
		link_idPgTplItAgrp1IdCmbConcep3().click();
		sleep(2.0);	
		text_idregistroInsumoPopupTabI().setText(M7);
		text_idregistroInsumoPopupTabI2().setText(M8);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		button_aceptarsubmit2().waitForExistence();
		button_aceptarsubmit2().click();
		sleep(4.0);
		link_idPgTplItAgrp2IdCmbConcep().click();
		sleep(2.0);

		
		
	}
	public void IngresoMontosInsumos3(String M9, String M10)
	{

		sleep(4.0);
		link_idPgTplItAgrp2IdCmbConcep().click();
		sleep(2.0);
		text_idregistroInsumoPopupTabI().setText(M9);
		text_idregistroInsumoPopupTabI2().setText(M10);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		button_aceptarsubmit2().waitForExistence();
		button_aceptarsubmit2().click();
		sleep(2.0);
	}
	
	
	
	public void IngresoMontosConceptos1(String M11,
			String M12)
	{
		
		sleep(4.0);
		link_idPgTplItAgrp0IdCmbConcep3().click();
		sleep(4.0);
		checkBox_idSeleccionConceptoIn().click();
		sleep(4.0);
		button_confirmarSelecciónsubmi4().click();
		
		sleep(4.0);
		text_idPgTplItAgrp0IdCmbConcep().setText(M11);
		text_idPgTplItAgrp0IdCmbConcep2().click();
		sleep(4.0);
		text_idPgTplItAgrp0IdCmbConcep2().setText(M12);
		text_idPgTplItAgrp2IdCmbConcep().click();
		sleep(4.0);
	}
	
	public void IngresoMontosConceptos2(String M13,
			String M14)
	{
		sleep(4.0);
		text_idPgTplItAgrp2IdCmbConcep().setText(M13);
		text_idPgTplItAgrp2IdCmbConcep2().click();
		sleep(4.0);
		text_idPgTplItAgrp2IdCmbConcep2().setText(M14);
		sleep(4.0);
	}


	
	public void FechaCumplimiento()
	{
		sleep(2.0);
		link_idPgTplIdCmbIrFechasCumpl().click();
		text_buscarFechasCumplimientoP().doubleClick();
		text_buscarFechasCumplimientoP().setText(dpString("FechasCumplimientoCP"));
		text_buscarFechasCumplimientoP2().setText(dpString("MontoTotalCP"));
		button_paso1De1submit().click();
		sleep(2.0);
	}
	public void GuardarDigitado()
	{
		sleep(2.0);
		link_idPgTplIdCmlIrGuardarComp().waitForExistence();
		link_idPgTplIdCmlIrGuardarComp().click();
		sleep(2.0);
		String IDCP_GD = (String)table_htmlTable_0().getProperty(".text");
		Libreria.IDCP_GD = Integer.parseInt(IDCP_GD.replaceAll("[A-Za-z]+[\\s]", ""));
		logInfo("El Valor de IDCP_GD es: " + Libreria.IDCP_GD);
		datapoolValueSetting("IDCP_GD", Libreria.IDCP_GD);
		Captura();
		button_aceptarsubmit3().waitForExistence();
		button_aceptarsubmit3().click();
		sleep(2.0);
	}
	public void GenerarCP()
	{
		sleep(2.0);
		button_generarsubmit().waitForExistence();
		sleep(2.0);
		button_generarsubmit().click();
		sleep(2.0);
		button_aceptarsubmit4().waitForExistence();
		sleep(2.0);
		button_aceptarsubmit4().click();
		sleep(2.0);
		String IDCP_GEN = (String)table_pt2ContenedorMsj().getProperty(".text");
		Libreria.IDCP_GEN = Integer.parseInt(IDCP_GEN.replaceAll("[A-Za-záéíóú]+[\\s]", ""));
		logInfo("El Valor de IDCP_GEN es: " + Libreria.IDCP_GEN);
		datapoolValueSetting("IDCP_GEN", Libreria.IDCP_GEN);
		Captura();
		sleep(2.0);
		link_irABienvenida().click();
		sleep(2.0);
	
	}
	public void Aprobar()
	{
		
		
		link_compromiso2().click();
		table_idPgTplJ_id30Menu2().click(atCell(
                                        atRow(atIndex(0)), 
                                        atColumn(atIndex(1))));
		text_idPgTplIdTransaccional().setText(dpString("IDCP_GEN"));
		sleep(2.0);
		button_buscarsubmit3().click();
		sleep(2.0);
		table_htmlTable_0_2().click(atCell(atRow(atIndex(0)), 
                                     atColumn(atIndex(5))));
		sleep(2.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		sleep(2.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{ExtPgDn}");
		sleep(4.0);
		button_aprobarsubmit().click();
		button_aceptarsubmit5().waitForExistence();
		button_aceptarsubmit5().click();
		String CP_FOLIO_APR=(String)table_htmlTable_0_3().getProperty(".text");
		Libreria.CP_FOLIO_APR=Integer.parseInt(CP_FOLIO_APR.replaceAll("[\\D]", ""));
		logInfo("El Valor de CP_FOLIO_APR es: "+Libreria.CP_FOLIO_APR);
		datapoolValueSetting("CP_FOLIO_APR", Libreria.CP_FOLIO_APR);
		sleep(2.0);
		Captura();
		button_aceptarsubmit6().waitForExistence();
		button_aceptarsubmit6().click();
		link_irABienvenida2().click();
		sleep(2.0);
		
	}

	
	
	
	public void testMain(Object[] args) 
	{
		String sNombreCaso = args[0].toString();	
		switch (sNombreCaso){ 	


	case "SIGFE2_114_1_E4CP":              				
	{                                  			
	// "CP_SIGFE2_114_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Datos Generales"  
		
//		Datos Generales
		
			DatosGenerales();
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_115_1_E4CP":              				
	{                                  			
	// "CP_SIGFE2_115_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Buscar Requerimiento/ Compromiso"   
		
//		Buscar Requerimiento Presupuestario
		
			BuscarRP();
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_116_1_E4CP":              				
	{                                  			
	// "CP_SIGFE2_116_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Datos Generales Documento de Negocio Contrato"     
		
		DatosContrato();
        
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_117_1_E4CP":              				
	{                                  			
	// "CP_SIGFE2_117_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Buscar Principal"       
		
//		Buscar Principal
		
			BuscarPrincipal(dpString("RutPrincipalContrato"));
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_118_1_E4CP":              				
	{                                  			
	// "CP_SIGFE2_118_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"    
		
//		Ingreso de Montos
		
		IngresoMontosInsumos1(	dpString("MontoRP_1"),
								dpString("MontoRP_2"),
								dpString("MontoRP_3"),
								dpString("MontoRP_4"));
		
//			IngresoMontosInsumos(dpString("MontoRP_1"),
//									dpString("MontoRP_2"),
//									dpString("MontoRP_3"),
//									dpString("MontoRP_4"),
//									dpString("MontoRP_5"),
//									dpString("MontoRP_6"),
//									dpString("MontoRP_7"),
//									dpString("MontoRP_8"),
//									dpString("MontoRP_9"),
//									dpString("MontoRP_10"));
//			
//			IngresoMontosConceptos(dpString("MontoRP_11"),
//									dpString("MontoRP_12"),
//									dpString("MontoRP_13"),
//									dpString("MontoRP_14"));
			IngresoMontosConceptos1(	dpString("MontoRP_11"),
										dpString("MontoRP_12"));
			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_118_2_E4CP":              				
	{                                  			
	// "CP_SIGFE2_118_2_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"    
		IngresoMontosInsumos2(	dpString("MontoRP_5"),
								dpString("MontoRP_6"),
								dpString("MontoRP_7"),
								dpString("MontoRP_8"));
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_118_3_E4CP":              				
	{                                  			
	// "CP_SIGFE2_118_3_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"      
		
		IngresoMontosInsumos3(	dpString("MontoRP_9"),
								dpString("MontoRP_10"));
		IngresoMontosConceptos2(	dpString("MontoRP_14"),
				dpString("MontoRP_15"));
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_119_1_E4CP":              				
	{                                  			
	// "CP_SIGFE2_119_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Agregar Fecha de Cumplimiento"      
		
//		Agregar Fecha de Cumplimiento
		
			FechaCumplimiento();
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_120_1_E4CP":              				
	{                                  			
	// "CP_SIGFE2_120_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Guardar Digitado"     
//		Guardar Digitado
		
			GuardarDigitado();	
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_121_1_E4CP":              				
	{                                  			
	// "CP_SIGFE2_121_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Generar"  
		
		GenerarCP();
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_122_1_E4CP":              				
	{                                  			
	// "CP_SIGFE2_122_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Aprobar"                          			
			     
//		Aprobar
		
			Aprobar();
		
		
	   break;                          			
	}    

		
		}
		}
}

