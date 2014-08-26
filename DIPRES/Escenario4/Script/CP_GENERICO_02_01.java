package Script;
import resources.Script.CP_GENERICO_02_01Helper;
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
public class CP_GENERICO_02_01 extends CP_GENERICO_02_01Helper
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
	

	public void DatosGenerales()
	{
		sleep(2.0);
		link_compromiso().click();
		table_idPgTplJ_id30Menu3().click(atCell(
                                        atRow(atIndex(1)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id32ScrollConte2().click(atCell(
                                        atRow(atIndex(12)), 
                                        atColumn(atIndex(1))));
		text_idPgTplIdInteTituloCompro().setText(dpString("TituloCompromiso2"));
		text_idPgTplIdInteDescripcionC().setText(dpString("DescripcionCompromiso2"));
		list_seleccione().select(dpString("TipoPresupuestoCP"));
		sleep(2.0);
		
	}
	public void BuscarCP()
	{
		sleep(2.0);
		link_idPgTplIdCmiIrDocumentoRe().waitForExistence();
		link_idPgTplIdCmiIrDocumentoRe().click();
		list_requerimientoPresupuestar2().waitForExistence();
		list_requerimientoPresupuestar2().select(dpString("ProcesoCP2"));
		sleep(3.0);
		list_svwBuscarDocumentoRefPopu2().select(dpString("TipoDemandaCP"));
		text_svwBuscarDocumentoRefPopu2().setText(dpString("CP_FOLIO_APR"));
		list_nacional2().select(dpString("MonedaPresupuestaria"));
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

		
		sleep(2.0);
		checkBox_svwBuscarDocumentoRef9().setState(SELECTED);
		checkBox_svwBuscarDocumentoRef10().setState(SELECTED);
		checkBox_svwBuscarDocumentoRef11().setState(SELECTED);

		sleep(2.0);
		button_confirmarSelecciónsubmi2().click();
		sleep(2.0);
		
	}
	public void BuscarCP2()
	{
		sleep(3.0);
		link_idPgTplIdCmiIrDocumentoRe().waitForExistence();
		link_idPgTplIdCmiIrDocumentoRe().click();
		text_svwBuscarDocumentoRefPopu2().waitForExistence();
		text_svwBuscarDocumentoRefPopu2().setText(dpString("CP_FOLIO_APR"));
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

		
		sleep(2.0);
		checkBox_svwBuscarDocumentoRef9().setState(SELECTED);
		checkBox_svwBuscarDocumentoRef10().setState(SELECTED);
		checkBox_svwBuscarDocumentoRef11().setState(SELECTED);

		sleep(2.0);
		button_confirmarSelecciónsubmi2().click();
		sleep(2.0);
		
	}

	public void DatosOrdenCompra1()
	{
		sleep(6.0);
		text_idPgTplIdInteDescripcionD().setText(dpString("DescripcionOrdenCompra1"));
		text_idPgTplIdInteNumeroDocume().setText(dpString("NumeroDocumentoOrdenCompra1"));
		text_idPgTplIdIndaFechaDocumen().setText(dpString("FechaDocumentoOrdenCompra1"));
		list_seleccione2().select(dpString("MonedaDocOrdenCompra"));
		sleep(2.0);
	}

	public void DatosOrdenCompra2()
	{
		sleep(6.0);
		text_idPgTplIdInteDescripcionD().setText(dpString("DescripcionOrdenCompra2"));
		text_idPgTplIdInteNumeroDocume().setText(dpString("NumeroDocumentoOrdenCompra2"));
		text_idPgTplIdIndaFechaDocumen().setText(dpString("FechaDocumentoOrdenCompra2"));
		list_seleccione2().select(dpString("MonedaDocOrdenCompra"));
		sleep(2.0);
	}
	public void DatosOrdenCompra3()
	{
		sleep(6.0);
		text_idPgTplIdInteDescripcionD().setText(dpString("DescripcionOrdenCompra3"));
		text_idPgTplIdInteNumeroDocume().setText(dpString("NumeroDocumentoOrdenCompra3"));
		text_idPgTplIdIndaFechaDocumen().setText(dpString("FechaDocumentoOrdenCompra3"));
		list_seleccione2().select(dpString("MonedaDocOrdenCompra"));
		sleep(2.0);
	}

	public void IngresoMontosInsumos(	String M1,
										String M2,
										String M3,
										String M4,
										String M5,
										String M6,
										String M7,
										String M8,
										String M9,
										String M10)
	{
		sleep(2.0);		
		link_idPgTplItAgrp0IdCmbConcep().click();
		sleep(2.0);	
		text_idregistroInsumoPopupTabI().waitForExistence();
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
		
		sleep(4.0);
		link_idPgTplItAgrp1IdCmbConcep().click();
		sleep(2.0);	
		text_idregistroInsumoPopupTabI().setText(M5);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		button_aceptarsubmit2().waitForExistence();
		button_aceptarsubmit2().click();
		
		
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
		text_idregistroInsumoPopupTabI().setText(M9);
		text_idregistroInsumoPopupTabI2().setText(M10);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		button_aceptarsubmit2().waitForExistence();
		button_aceptarsubmit2().click();
		sleep(2.0);

	}
	public void AgregaConceptoFaltante()
	{
		// agregar campo de concepto presupuestario
		
		sleep(4.0);
		link_idPgTplItAgrp0IdCmbConcep3().click();
		sleep(4.0);
		checkBox_idSeleccionConceptoIn().click();
		sleep(4.0);
		button_confirmarSelecciónsubmi4().click();
	}
	public void IngresoMontosConceptos(	String M11,
										String M12,
										String M13,
										String M14,
										String M15)
	{
		

		
//		agregar montos a conceptos presupuestarios
		
		sleep(4.0);
		text_idPgTplItAgrp0IdCmbConcep().setText(M11);
		text_idPgTplItAgrp0IdCmbConcep2().click();
		sleep(4.0);
		text_idPgTplItAgrp0IdCmbConcep2().setText(M12);
		text_idPgTplItAgrp2IdCmbConcep().click();
		sleep(4.0);
		text_idPgTplItAgrp2IdCmbConcep().setText(M14);
		text_idPgTplItAgrp2IdCmbConcep2().click();
		sleep(4.0);
		text_idPgTplItAgrp2IdCmbConcep2().setText(M15);
//		text_idPgTplItAgrp2IdCmbConcep3().click();
//		sleep(4.0);
//		text_idPgTplItAgrp2IdCmbConcep3().setText(M15);
		sleep(4.0);
	}
	public void FechaCumplimiento()
	{
		sleep(2.0);
		link_idPgTplIdCmbIrFechasCumpl().click();
		sleep(2.0);
		text_buscarFechasCumplimientoP().setText(dpString("FechasCumplimientoOC"));
		text_buscarFechasCumplimientoP2().setText(dpString("MontoTotalOC"));
		sleep(2.0);
		button_paso1De1submit().click();
		sleep(2.0);
	}
	public void GuardarDigitado()
	{
		sleep(2.0);
		link_idPgTplIdCmlIrGuardarComp().waitForExistence();
		link_idPgTplIdCmlIrGuardarComp().click();
		sleep(2.0);
		String IDCP2_GD = (String)table_htmlTable_0().getProperty(".text");
		Libreria.IDCP2_GD = Integer.parseInt(IDCP2_GD.replaceAll("[\\D]", ""));
		logInfo("El Valor de IDCP2_GD es: " + Libreria.IDCP2_GD);
		datapoolValueSetting("IDCP2_GD", Libreria.IDCP2_GD);
		Captura();
		button_aceptarsubmit3().waitForExistence();
		sleep(2.0);
		button_aceptarsubmit3().click();
		sleep(2.0);
	}
	public void GenerarCP()
	{
		sleep(2.0);
		button_generarsubmit().waitForExistence();
		button_generarsubmit().click();
		button_aceptarsubmit4().waitForExistence();
		button_aceptarsubmit4().click();
		String IDCP2_GEN = (String)table_pt2ContenedorMsj().getProperty(".text");
		Libreria.IDCP2_GEN = Integer.parseInt(IDCP2_GEN.replaceAll("[A-Za-záéíóú]+[\\s]", ""));
		logInfo("El Valor de IDCP2_GEN es: " + Libreria.IDCP2_GEN);
		datapoolValueSetting("IDCP2_GEN", Libreria.IDCP2_GEN);
		sleep(2.0);
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
		text_idPgTplIdTransaccional().setText(dpString("IDCP2_GEN"));
		sleep(2.0);
		button_buscarsubmit3().click();
		sleep(2.0);
		table_htmlTable_0_2().click(atCell(atRow(atIndex(0)), 
                                     atColumn(atIndex(5))));
		sleep(2.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		sleep(2.0);
		browser_htmlBrowser(document_generarCompromisoPres(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		browser_htmlBrowser(document_buscarCompromisoPresu(),DEFAULT_FLAGS).inputKeys("{ExtPgDn}");
		sleep(4.0);
		button_aprobarsubmit().click();
		button_aceptarsubmit5().waitForExistence();
		button_aceptarsubmit5().click();
		String CP2_FOLIO_APR=(String)table_htmlTable_0_3().getProperty(".text");
		Libreria.CP2_FOLIO_APR=Integer.parseInt(CP2_FOLIO_APR.replaceAll("[\\D]", ""));
		logInfo("El Valor de CP2_FOLIO_APR es: "+Libreria.CP2_FOLIO_APR);
		datapoolValueSetting("CP2_FOLIO_APR", Libreria.CP2_FOLIO_APR);
		Captura();
		sleep(2.0);
		button_aceptarsubmit6().waitForExistence();
		button_aceptarsubmit6().click();
		link_irABienvenida2().click();
		sleep(2.0);
		
	}
	
	public void testMain(Object[] args) 
	{
		String sNombreCaso = args[0].toString();	
		switch (sNombreCaso){ 			
	                                
		case "SIGFE2_123_1_E4CP":              				
		{                                  			
		// "CP_SIGFE2_123_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Datos Generales" 
			
//			Datos Generales
			
				DatosGenerales();
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_124_1_E4CP":              				
		{                                  			
		// "CP_SIGFE2_124_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"   
			
//			Buscar Requerimiento Presupuestario
			
				BuscarCP();
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_125_1_E4CP":              				
		{                                  			
		// "CP_SIGFE2_125_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Datos Generales de la Orden de Compra " 
			
//			Ingreso Datos de Orden de Compra
			
				DatosOrdenCompra1();
			
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_126_1_E4CP":              				
		{                                  			
		// "CP_SIGFE2_126_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"
			
//			Ingreso de Montos Insumos
			
				IngresoMontosInsumos(	dpString("MontoCP_1"),
										dpString("MontoCP_2"),
										dpString("MontoCP_3"),
										dpString("MontoCP_4"),
										dpString("MontoCP_5"),
										dpString("MontoCP_6"),
										dpString("MontoCP_7"),
										dpString("MontoCP_8"),
										dpString("MontoCP_9"),
										dpString("MontoCP_10"));
				
//				Provisorio
				AgregaConceptoFaltante();
				
//				Ingreso de Montos Conceptos
				IngresoMontosConceptos(	dpString("MontoCP_11"),
										dpString("MontoCP_12"),
										dpString("MontoCP_13"),
										dpString("MontoCP_14"),
										dpString("MontoCP_15"));
			
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_127_1_E4CP":              				
		{                                  			
		// "CP_SIGFE2_127_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Fecha de Cumplimiento" 
			
//			Agregar Fecha de Cumplimiento
			
				FechaCumplimiento();
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_128_1_E4CP":              				
		{                                  			
		// "CP_SIGFE2_128_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Crear Orden de Compra"  
			
			
//			Crear Nueva Orden de Compra
			
			sleep(2.0);
			link_idPgTplNvPnDetCmAddNavIte().click();
			sleep(6.0);
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_124_2_E4CP":              				
		{                                  			
		// "CP_SIGFE2_124_2_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"  
			
//			Buscar Concepto Presupuestario
			
			BuscarCP2();
			
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_125_2_E4CP":              				
		{                                  			
		// "CP_SIGFE2_125_2_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Datos Generales de la Orden de Compra "  
			
			
//			Ingresar Datos de la Segunda Orden de Compra
			
			DatosOrdenCompra2();
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_126_2_E4CP":              				
		{                                  			
		// "CP_SIGFE2_126_2_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"
			
//			Ingresar montos de la Segunda Orden de Compra
			
			IngresoMontosInsumos(	dpString("MontoCP_1"),
									dpString("MontoCP_2"),
									dpString("MontoCP_3"),
									dpString("MontoCP_4"),
									dpString("MontoCP_5"),
									dpString("MontoCP_6"),
									dpString("MontoCP_7"),
									dpString("MontoCP_8"),
									dpString("MontoCP_9"),
									dpString("MontoCP_10"));

			IngresoMontosConceptos(	dpString("MontoCP_11"),
									dpString("MontoCP_12"),
									dpString("MontoCP_13"),
									dpString("MontoCP_14"),
									dpString("MontoCP_15"));
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_127_2_E4CP":              				
		{                                  			
		// "CP_SIGFE2_127_2_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Fecha de Cumplimiento"    
			
////		Agregar Fecha de Cumplimiento
			
			FechaCumplimiento();
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_128_2_E4CP":              				
		{                                  			
		// "CP_SIGFE2_128_2_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Crear Orden de Compra"   

			
			sleep(2.0);
			link_idPgTplNvPnDetCmAddNavIte().click();
			sleep(6.0);
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_124_3_E4CP":              				
		{                                  			
		// "CP_SIGFE2_124_3_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"
			
			BuscarCP2();
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_125_3_E4CP":              				
		{                                  			
		// "CP_SIGFE2_125_3_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Datos Generales de la Orden de Compra " 
			
			
//			Ingresar Datos de la Segunda Orden de Compra
			
			DatosOrdenCompra3();
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_126_3_E4CP":              				
		{                                  			
		// "CP_SIGFE2_126_3_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"
			
//			Ingresar montos de insumos
			
			IngresoMontosInsumos(	dpString("MontoCP_1"),
									dpString("MontoCP_2"),
									dpString("MontoCP_3"),
									dpString("MontoCP_4"),
									dpString("MontoCP_5"),
									dpString("MontoCP_6"),
									dpString("MontoCP_7"),
									dpString("MontoCP_8"),
									dpString("MontoCP_9"),
									dpString("MontoCP_10"));
//			Provisorio
			
			AgregaConceptoFaltante();
			
//			Ingresar montos de Conceptos
			
			IngresoMontosConceptos(	dpString("MontoCP_11"),
									dpString("MontoCP_12"),
									dpString("MontoCP_13"),
									dpString("MontoCP_14"),
									dpString("MontoCP_15"));
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_127_3_E4CP":              				
		{                                  			
		// "CP_SIGFE2_127_3_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Fecha de Cumplimiento"     
			
			FechaCumplimiento();
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_129_1_E4CP":              				
		{                                  			
		// "CP_SIGFE2_129_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Guardar Digitado"   
			
//			Guardar Digitado
			
				GuardarDigitado();
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_130_1_E4CP":              				
		{                                  			
		// "CP_SIGFE2_130_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Generar"  
			
//			Generar
			
				GenerarCP();
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_131_1_E4CP":              				
		{                                  			
		// "CP_SIGFE2_131_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Aprobar" 
			
			
//			Aprobar
			
				Aprobar();
			
				                        			
		   break;                          			
		}                                  			
		}
		
	}
}

