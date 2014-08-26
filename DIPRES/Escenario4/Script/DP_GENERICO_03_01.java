package Script;
import java.awt.image.BufferedImage;

import resources.Script.DP_GENERICO_03_01Helper;
import LIB.Libreria;

import com.rational.test.ft.*;
import com.rational.test.ft.enabler.Browser;
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
public class DP_GENERICO_03_01 extends DP_GENERICO_03_01Helper
{
	/**
	 * Script Name   : <b>DP_GENERICO_03_1</b>
	 * Generated     : <b>13/03/2014 10:46:27</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/03/13
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
	public void DatosGeneralesDP1()
	{
		/**
		 * Ingresar Devengo Documento Multiple
		 * Devengo > Generar Devengo > Documento de Negocio > Documento Multiple
		 */
		link_devengo().click();
		table_idPgTplJ_id51Menu().click(atCell(
                                        atRow(atIndex(1)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id53Menu().click(atCell(
                                        atRow(atIndex(0)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id54Menu().click(atCell(
                                        atRow(atIndex(4)), 
                                        atColumn(atIndex(1))));
		
		sleep(2.0);
		
//		Ingreso de Título
		text_idPgTplIdIntTitulo().setText(dpString("TituloDP2"));
//		Ingreso de Descripcion
		text_idPgTplIdInteDescripcionD().setText(dpString("DescripcionDP2"));
//		Ingreso Tipo de presupuesto
		list_seleccione().select(dpString("TipoPresupuestoDP2"));
		
	}
	public void TipoDocumentoDP1()
	{
		sleep(2.0);
		list_seleccione2().select(dpString("TipoDocumentoDP2_1"));
		sleep(3.0);
		
	}
	public void BuscarPrincipalDP1(String RUT)
	{
		link_idPgTplIdCmlIrBuscarPrinc().waitForExistence();
		link_idPgTplIdCmlIrBuscarPrinc().click();
		radioButton_idbuscarPrincipalB().waitForExistence();
		radioButton_idbuscarPrincipalB().click();
		sleep(3.0);
		text_idbuscarPrincipalBPPopupI().setText(RUT);
		button_buscarsubmit().click();
		radioButton_seleccionidbuscarP().waitForExistence();
		radioButton_seleccionidbuscarP().click();
		button_aceptarsubmit().click();
		sleep(4.0);
		
	}
	public void BuscarCompromisoDP1()
	{
		sleep(2.0);
		link_idPgTplIdCmiIrDocumentoRe().waitForExistence();
		sleep(2.0);
		link_idPgTplIdCmiIrDocumentoRe().click();
		list_seleccioneProceso().waitForExistence();
		list_seleccioneProceso().select(dpString("ProcesoDP1"));
		sleep(2.0);
		list_seleccione3().waitForExistence();
		sleep(2.0);
		list_seleccione3().select(dpString("TipoDemandaDP1"));
		sleep(2.0);
		text_idbuscarDocRefPopupId_fol().setText(dpString("CP2_FOLIO_APR"));
		sleep(2.0);
		text_idbuscarDocRefPopupIdInte().setText(dpString("NumeroDocumentoOrdenCompra2"));
		sleep(2.0);
		list_nacional().select(dpString("MonedaPresupuestaria"));
		sleep(2.0);
		button_buscarsubmit2().click();
		checkBox_idbuscarDocRefPopupTR().waitForExistence();
		checkBox_idbuscarDocRefPopupTR().setState(SELECTED);
		sleep(2.0);
		button_confirmarSelecciónsubmi().click();
		sleep(2.0);
		
		checkBox_idbuscarSeleccionItSe().setState(SELECTED);
		checkBox_idbuscarSeleccionItSe2().setState(SELECTED);
		checkBox_idbuscarSeleccionItSe5().setState(SELECTED);
		sleep(3.0);
		button_aceptarsubmit2().click();
		
		}
	public void DatosDocNegocioDP1()
	{
		sleep(3.0);
		text_idPgTplIdInteDescripcionD2().setText(dpString("DescripcionDocumentoNegocio1_1"));
		sleep(2.0);
		text_idPgTplIdInteNumeroDocume().setText(dpString("NumeroDocumentoDP1_1"));
		sleep(2.0);
		text_idPgTplIdIndaFechaDocumen().setText(dpString("FechaDocumentoDP1_1"));
		sleep(2.0);
		text_idPgTplIdNetoMontoDocumen().setText(dpString("NetoMontoDP1_1"));
		sleep(2.0);
		text_idPgTplIdIndaFechaRecepci().setText(dpString("FechaRecepcionConformeDP1_1"));
		sleep(2.0);
		browser_htmlBrowser(document_generarVariacionPresu(),DEFAULT_FLAGS).inputKeys("{TAB}");
		text_idPgTplIdIndaFechaCumplim().click();
		text_idPgTplIdIndaFechaCumplim().setText(dpString("FechaCumplimientoDP2_1"));
		sleep(2.0);
	}
	public void CamposVariablesDP1()
	{
		sleep(2.0);
		link_idPgTplIdCmlIrCamposVaria().click();
		sleep(2.0);
		text_svwCamposVariablesFechade().setText(dpString("CamposVariablesFechaIngresoDP"));
		text_svwCamposVariablesFechade2().setText(dpString("CamposVariablesFechaEmisionDP"));
		text_svwCamposVariablesIdentif().setText(dpString("CamposVariablesIdentificadorChileCompraDP"));
		button_aceptarsubmit3().click();
		sleep(2.0);
	}
	public void IngresarMontosInsumoDP1()
	{
		
		sleep(2.0);
		link_idPgTplItAgrps0IdCmbConce().click();
		text_idregistroInsumoPopupIdTb().waitForExistence();
		text_idregistroInsumoPopupIdTb().setText(dpString("MontoInsumoDP1_1"));
		button_aceptarsubmit4().click();
		sleep(4.0);
		link_idPgTplItAgrps0IdCmbConce2().click();
		text_idregistroInsumoPopupIdTb().waitForExistence();
		text_idregistroInsumoPopupIdTb().setText(dpString("MontoInsumoDP1_2"));
		sleep(3.0);
		link_idregistroInsumoPopupIdTb().click();
		sleep(3.0);
		link_idregistroInsumoPopupIdTb().click();
		sleep(3.0);
		button_aceptarsubmit4().click();
		sleep(4.0);
		link_idPgTplItAgrps1IdCmbConce().click();
		text_idregistroInsumoPopupIdTb().waitForExistence();
		text_idregistroInsumoPopupIdTb().setText(dpString("MontoInsumoDP1_3"));
		sleep(3.0);
		button_aceptarsubmit4().click();
		sleep(4.0);
			}
	
	public void TipoDocumentoDP2()
	{
		sleep(2.0);
		list_seleccione2().select(dpString("TipoDocumentoDP2_1"));
		sleep(3.0);
		
	}
	public void BuscarPrincipalDP2(String RUT)
	{
		sleep(2.0);
		link_idPgTplIdCmlIrBuscarPrinc().waitForExistence();
		link_idPgTplIdCmlIrBuscarPrinc().click();
		radioButton_idbuscarPrincipalB().waitForExistence();
		radioButton_idbuscarPrincipalB().click();
		sleep(3.0);
		text_idbuscarPrincipalBPPopupI().setText(RUT);
		button_buscarsubmit().click();
		radioButton_seleccionidbuscarP().waitForExistence();
		radioButton_seleccionidbuscarP().click();
		button_aceptarsubmit().click();
		sleep(4.0);
	}
	public void BuscarCompromisoDP2()
	{
		sleep(2.0);
		link_idPgTplIdCmiIrDocumentoRe().waitForExistence();
		sleep(2.0);
		link_idPgTplIdCmiIrDocumentoRe().click();
		text_idbuscarDocRefPopupId_fol().waitForExistence();
		sleep(2.0);
		text_idbuscarDocRefPopupId_fol().setText(dpString("CP2_FOLIO_APR"));
		sleep(2.0);
		text_idbuscarDocRefPopupIdInte().setText(dpString("NumeroDocumentoOrdenCompra2"));
		sleep(2.0);
		button_buscarsubmit2().click();
		checkBox_idbuscarDocRefPopupTR().waitForExistence();
		checkBox_idbuscarDocRefPopupTR().setState(SELECTED);
		sleep(2.0);
		button_confirmarSelecciónsubmi().click();
		sleep(2.0);
		checkBox_idbuscarSeleccionItSe2().setState(SELECTED);
		sleep(4.0);
		checkBox_idbuscarSeleccionItSe8().setState(SELECTED);
		sleep(4.0);
		checkBox_idbuscarSeleccionItSe9().setState(SELECTED);
		sleep(4.0);
		checkBox_idbuscarSeleccionItSe10().setState(SELECTED);
		sleep(4.0);
		button_aceptarsubmit2().click();
		sleep(4.0);
		
	}
	public void DatosDocNegocio2()
	{
		sleep(3.0);
		text_idPgTplIdInteDescripcionD2().setText(dpString("DescripcionDocumentoNegocio2_1"));
		sleep(2.0);
		text_idPgTplIdInteNumeroDocume().setText(dpString("NumeroDocumentoDP2_1"));
		sleep(2.0);
		text_idPgTplIdIndaFechaDocumen().setText(dpString("FechaDocumentoDP2_1"));
		sleep(2.0);
		text_idPgTplIdNetoMontoDocumen().setText(dpString("NetoMontoDP2_1"));
		sleep(2.0);
		text_idPgTplIdIndaFechaRecepci().setText(dpString("FechaRecepcionConformeDP2_1"));
		sleep(2.0);
		browser_htmlBrowser(document_generarVariacionPresu(),DEFAULT_FLAGS).inputKeys("{TAB}");
		text_idPgTplIdIndaFechaCumplim().click();
		text_idPgTplIdIndaFechaCumplim().setText(dpString("FechaCumplimientoDP2_1"));
	}
	public void IngresarMontosDP2()
	{
		sleep(3.0);
		link_idPgTplItAgrps0IdCmbConce3().click();
		text_idregistroInsumoPopupIdTb2().waitForExistence();
		text_idregistroInsumoPopupIdTb2().setText(dpString("MontoInsumoDP2_1"));
		sleep(3.0);
		text_idregistroInsumoPopupIdTb3().setText("");
		text_idregistroInsumoPopupIdTb3().setText(dpString("MontoInsumoDP2_2"));
		sleep(3.0);
		text_idregistroInsumoPopupIdTb4().setText("");
		text_idregistroInsumoPopupIdTb4().setText(dpString("MontoInsumoDP2_3"));
		
		button_aceptarsubmit5().click();
		sleep(5.0);
		
		link_idPgTplItAgrps1IdCmbConce2().click();
		sleep(3.0);
		text_idregistroInsumoPopupIdTb2().waitForExistence();
		text_idregistroInsumoPopupIdTb2().setText("");
		text_idregistroInsumoPopupIdTb2().setText(dpString("MontoInsumoDP2_4"));
		sleep(3.0);
		text_idregistroInsumoPopupIdTb3().setText("");
		text_idregistroInsumoPopupIdTb3().setText(dpString("MontoInsumoDP2_5"));
		sleep(3.0);
		button_aceptarsubmit6().waitForExistence();
		button_aceptarsubmit6().click();
		sleep(3.0);
		
		text_idPgTplItAgrps1IdCmbConce().waitForExistence();
		text_idPgTplItAgrps1IdCmbConce().setText("");
		text_idPgTplItAgrps1IdCmbConce().setText(dpString("MontoInsumoDP2_6"));
		sleep(3.0);
		text_idPgTplItAgrps1IdCmbConce2().setText("");
		text_idPgTplItAgrps1IdCmbConce2().setText(dpString("MontoInsumoDP2_7"));
		sleep(3.0);
		
		
	}
	public void GuardarDigitadoDP2()
	{
		sleep(2.0);
		link_idPgTplIdCmlIrGuardarVari().waitForExistence();
		sleep(2.0);
		link_idPgTplIdCmlIrGuardarVari().click();
		sleep(2.0);
		String IDDP2_GD = (String)table_htmlTable_0().getProperty(".text");
		Libreria.IDDP2_GD = Integer.parseInt(IDDP2_GD.replaceAll("[\\D]", ""));
		logInfo("El Valor de IDDP2_GD es: " + Libreria.IDDP2_GD);
		datapoolValueSetting("IDDP2_GD", Libreria.IDDP2_GD);
		sleep(2.0);
		Captura();
		sleep(2.0);
		button_aceptarsubmit7().waitForExistence();
		sleep(2.0);
		button_aceptarsubmit7().click();
		sleep(2.0);
	}
	
	public void GenerarDP2()
	{
		sleep(2.0);
		button_generarsubmit().click();
		sleep(2.0);
		button_aceptarsubmit8().waitForExistence();
		sleep(2.0);
		button_aceptarsubmit8().click();
		sleep(2.0);
		String IDDP2_GEN = (String)table_pt2ContenedorMsj().getProperty(".text");
		sleep(2.0);
		Libreria.IDDP2_GEN = Integer.parseInt(IDDP2_GEN.replaceAll("[\\D]", ""));
		logInfo("El Valor de IDDP2_GEN es: " + Libreria.IDDP2_GEN);
		sleep(2.0);
		datapoolValueSetting("IDDP2_GEN", Libreria.IDDP2_GEN);
		sleep(2.0);
		Captura();
		sleep(2.0);
		link_irABienvenida().click();
		sleep(4.0);
	}
	
	public void testMain(Object[] args) 
	{
		
		String sNombreCaso = args[0].toString();	
		switch (sNombreCaso){ 	
	case "SIGFE2_132_2_E4DP":              				
	{                                  			
	// "CP_SIGFE2_132_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales"
		
		// Ingreso de Datos Generales
		
		DatosGeneralesDP1();

		
		//Tipo de Documento
		
		TipoDocumentoDP1();
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_133_3_E4DP":              				
	{                                  			
	// "CP_SIGFE2_133_3_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Principal"    
		
		// Buscar Principal
		
		BuscarPrincipalDP1(dpString("RutDP2_1"));
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_134_3_E4DP":              				
	{                                  			
	// "CP_SIGFE2_134_3_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"
		
		// Buscar Requerimiento Compromiso
		
		BuscarCompromisoDP1();
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_135_3_E4DP":              				
	{                                  			
	// "CP_SIGFE2_135_3_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Completar Campos Variables"
		
		//Ingresar Campos Variables
		
		CamposVariablesDP1();
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_142_1_E4DP":              				
	{                                  			
	// "CP_SIGFE2_142_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales Factura Exenta"
		
		// Ingresar datos de Primer Documento de negocio
		
		DatosDocNegocioDP1();
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_138_3_E4DP":              				
	{                                  			
	// "CP_SIGFE2_138_3_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"
		
		// Ingresar Montos
		

		IngresarMontosInsumoDP1();
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_143_1_E4DP":              				
	{                                  			
	// "CP_SIGFE2_143_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Crear Factura Exenta"
		
		// Crear Segundo Documento 
		
		sleep(2.0);
		link_idPgTplNvPnDetCmAddNavIte().click();
		sleep(5.0);
		//Seleccionar Tipo de Documento 
		
		TipoDocumentoDP2();
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_133_4_E4DP":              				
	{                                  			
	// "CP_SIGFE2_133_4_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Principal"
		
		// Buscar Principal
		
		BuscarPrincipalDP2(dpString("RutDP2_1"));

		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_134_4_E4DP":              				
	{                                  			
	// "CP_SIGFE2_134_4_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"
		
		// Buscar Requerimiento/Compromiso 
		
		BuscarCompromisoDP2();
		
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_135_4_E4DP":              				
	{                                  			
	// "CP_SIGFE2_135_4_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Completar Campos Variables"
		
		
		CamposVariablesDP1();
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_142_2_E4DP":              				
	{                                  			
	// "CP_SIGFE2_142_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales Factura Exenta"
		
		// Ingresar datos generales de documento de negocio
		
		DatosDocNegocio2();
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_138_4_E4DP":              				
	{                                  			
	// "CP_SIGFE2_138_4_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"
		
		// Ingresar Montos
		
		IngresarMontosDP2();
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_140_2_E4DP":              				
	{                                  			
	// "CP_SIGFE2_140_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Guardar Digitado"
		
		
		// Guardar Digitado
		
		GuardarDigitadoDP2();
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_141_2_E4DP":              				
	{                                  			
	// "CP_SIGFE2_141_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Generar"
		
		
//		  Generar
		
		GenerarDP2(); 
		
			                        			
	   break;                          			
	}                                  			
		

		





		

		


		
		

		

		


		


		

		



		
		}
	}
}

