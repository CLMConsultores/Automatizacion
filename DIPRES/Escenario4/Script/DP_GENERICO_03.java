package Script;
import resources.Script.DP_GENERICO_03Helper;
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


public class DP_GENERICO_03 extends DP_GENERICO_03Helper
{
	/**
	 * Script Name   : <b>DP_GENERICO_03</b>
	 * Generated     : <b>10/03/2014 15:34:15</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/03/10
	 * @author cpena
	 */
	

	
		public void DatosGeneralesDP()
	{
		/**
		 * Ingresar Devengo Documento Multiple
		 * Devengo > Generar Devengo > Documento de Negocio > Documento Multiple
		 */
		
		link_devengo().click();
		table_idPgTplJ_id51Menu2().click(atCell(
                                        atRow(atIndex(1)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id53Menu2().click(atCell(
                                        atRow(atIndex(0)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id54Menu().click(atCell(
                                        atRow(atIndex(4)), 
                                        atColumn(atIndex(1))));
//		Ingreso de Título
		text_idPgTplIdIntTitulo().setText(dpString("TituloDP1"));
//		Ingreso de Descripcion
		text_idPgTplIdInteDescripcionD().setText(dpString("DescripcionDP1"));
//		Ingreso Tipo de presupuesto
		list_seleccione().select(dpString("TipoPresupuestoDP1"));
		TipoDocumentoDP();
	}
	public void TipoDocumentoDP()
	{
		sleep(2.0);
		list_seleccione2().select(dpString("TipoDocumentoDP"));
		sleep(3.0);
		
	}
	public void TipoDocumentoDP2()
	{
		sleep(2.0);
		list_seleccione2().select(dpString("TipoDocumentoDP2"));
		sleep(3.0);
		
	}
	public void BuscarPrincipalDP(String RUT)
	{
		sleep(2.0);
		link_idPgTplIdCmlIrBuscarPrinc().waitForExistence();
		sleep(2.0);
		link_idPgTplIdCmlIrBuscarPrinc().click();
		sleep(2.0);
		radioButton_idbuscarPrincipalB().waitForExistence();
		sleep(2.0);
		radioButton_idbuscarPrincipalB().click();
		sleep(3.0);
		text_idbuscarPrincipalBPPopupI().setText(RUT);
		sleep(3.0);
		button_buscarsubmit().click();
		sleep(3.0);
		radioButton_seleccionidbuscarP().waitForExistence();
		sleep(2.0);
		radioButton_seleccionidbuscarP().click();
		sleep(2.0);
		button_aceptarsubmit().click();
		sleep(4.0);
	}
	public void BuscarCompromisoDP()
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
		button_buscarsubmit2().click();
		sleep(2.0);
		checkBox_idbuscarDocRefPopupTR2().waitForExistence();
		sleep(2.0);
		checkBox_idbuscarDocRefPopupTR2().click();
		sleep(2.0);
		button_confirmarSelecciónsubmi().click();
		sleep(2.0);
		
		checkBox_idbuscarSeleccionItSe().setState(SELECTED);
		checkBox_idbuscarSeleccionItSe2().setState(SELECTED);
		checkBox_idbuscarSeleccionItSe11().setState(SELECTED);
		checkBox_idbuscarSeleccionItSe3().setState(SELECTED);

		checkBox_idbuscarSeleccionItSe4().setState(SELECTED);
		checkBox_idbuscarSeleccionItSe5().setState(SELECTED);
		checkBox_idbuscarSeleccionItSe6().setState(SELECTED);

		checkBox_idbuscarSeleccionItSe7().setState(SELECTED);
		checkBox_idbuscarSeleccionItSe8().setState(SELECTED);
		checkBox_idbuscarSeleccionItSe9().setState(SELECTED);
//		checkBox_idbuscarSeleccionItSe10().setState(SELECTED);
		sleep(20.0);
		button_aceptarsubmit2().click();

		sleep(2.0);
	}
		
		public void DatosGeneralesDoc1()
		{
			sleep(3.0);
			text_idPgTplIdInteDescripcionD2().setText(dpString("DescripcionDocumentoNegocio1"));
			sleep(2.0);
			text_idPgTplIdInteNumeroDocume().setText(dpString("NumeroDocumentoDP1"));
			sleep(2.0);
			text_idPgTplIdIndaFechaDocumen().setText(dpString("FechaDocumentoDP1"));
			sleep(2.0);
			text_idPgTplIdNetoMontoDocumen().setText(dpString("NetoMontoDP1"));
			sleep(2.0);
			text_idPgTplIdIndaFechaRecepci().setText(dpString("FechaRecepcionConformeDP1"));
			sleep(2.0);
			browser_htmlBrowser(document_búsquedaDeAsientosCon(),DEFAULT_FLAGS).inputKeys("{TAB}");
			text_idPgTplIdIndaFechaCumplim().click();
			text_idPgTplIdIndaFechaCumplim().setText(dpString("FechaCumplimientoDP1"));
			sleep(2.0);
//			//	Seleccionar Tipo Documento del tipo : Factura Afecta - Factura Exenta 
//			
//				TipoDocumentoDP();
			
		}
		public void CamposVariablesDP1()
		{
			sleep(2.0);
			link_idPgTplIdCmlIrCamposVaria().click();
			sleep(3.0);
			text_svwCamposVariablesFechade().click();
			text_svwCamposVariablesFechade().setText(dpString("CamposVariablesFechaIngresoDP"));
			text_svwCamposVariablesFechade2().setText(dpString("CamposVariablesFechaEmisionDP"));
			text_svwCamposVariablesIdentif().setText(dpString("CamposVariablesIdentificadorChileCompraDP"));
			button_aceptarsubmit5().click();
			sleep(2.0);
		}
		
		public void DatosGeneralesDoc2()
		{
			sleep(3.0);
			text_idPgTplIdInteDescripcionD2().setText(dpString("DescripcionDocumentoNegocio2"));
			sleep(2.0);
			text_idPgTplIdInteNumeroDocume().setText(dpString("NumeroDocumentoDP2"));
			sleep(2.0);
			text_idPgTplIdIndaFechaDocumen().setText(dpString("FechaDocumentoDP2"));
			sleep(2.0);
			text_idPgTplIdNetoMontoDocumen().setText(dpString("NetoMontoDP2"));
			sleep(2.0);
			text_idPgTplIdIndaFechaRecepci().setText(dpString("FechaRecepcionConformeDP2"));
			sleep(2.0);	
			browser_htmlBrowser(document_búsquedaDeAsientosCon(),DEFAULT_FLAGS).inputKeys("{TAB}");
			text_idPgTplIdIndaFechaCumplim().click();
			text_idPgTplIdIndaFechaCumplim().setText(dpString("FechaCumplimientoDP2"));  
			sleep(2.0);
		}
		public void CamposVariablesDP2()
		{
			sleep(2.0);
			link_idPgTplIdCmlIrCamposVaria().click();
			sleep(3.0);
			text_svwCamposVariablesFechade().click();
			text_svwCamposVariablesFechade().setText(dpString("CamposVariablesFechaIngresoDP2"));
			text_svwCamposVariablesFechade2().setText(dpString("CamposVariablesFechaEmisionDP2"));
			text_svwCamposVariablesIdentif().setText(dpString("CamposVariablesIdentificadorChileCompraDP2"));
			button_aceptarsubmit5().click();
			sleep(2.0);
		}
		public void ImpuestosDP()
		{
			sleep(2.0);
			link_idPgTplSbc1().click();			
			checkBox_idseleccionImpuestosP().waitForExistence();
			//table_htmlTable_0_3().checkBox_idseleccionImpuestosP().setState(SELECTED);
			sleep(2.0);
			checkBox_idseleccionImpuestosP().click();
			//checkBox_idseleccionImpuestosP().setState(State.selected());
			sleep(5.0);
			table_htmlTable_0_3().click();
			sleep(3.0);
			button_aceptarsubmit3().waitForExistence();
			button_aceptarsubmit3().click();
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
//			Primer Insumo
			sleep(3.0);
			link_idPgTplItAgrps0IdCmbConce().click();
			sleep(3.0);
			text_idregistroInsumoPopupIdTb().waitForExistence();
			sleep(3.0);
			text_idregistroInsumoPopupIdTb().setText(M1);
			sleep(3.0);
			button_aceptarsubmit4().click();
			sleep(5.0);
//			Segundo Insumo
			sleep(3.0);
			link_idPgTplItAgrps0IdCmbConce2().click();
			sleep(3.0);
			text_idregistroInsumoPopupIdTb().waitForExistence();
			sleep(3.0);
			text_idregistroInsumoPopupIdTb().click();
			text_idregistroInsumoPopupIdTb().setText(M2);
			sleep(3.0);
			text_idregistroInsumoPopupIdTb2().setText("");
			text_idregistroInsumoPopupIdTb2().setText(M3);
			sleep(3.0);
			text_idregistroInsumoPopupIdTb3().setText("");
			text_idregistroInsumoPopupIdTb3().setText(M4);
			sleep(3.0);
			button_aceptarsubmit4().click();
			sleep(5.0);
//			Tercer Insumo
			sleep(3.0);
			link_idPgTplItAgrps1IdCmbConce().click();
			sleep(3.0);
			text_idregistroInsumoPopupIdTb().waitForExistence();
			sleep(3.0);
			text_idregistroInsumoPopupIdTb().setText(M5);
			sleep(3.0);
			button_aceptarsubmit4().click();
			sleep(5.0);
//			Cuarto Insumo
			sleep(3.0);
			link_idPgTplItAgrps1IdCmbConce2().click();
			sleep(2.0);
			text_idregistroInsumoPopupIdTb().waitForExistence();
			sleep(2.0);
			text_idregistroInsumoPopupIdTb().setText(M6);
			sleep(3.0);
			button_aceptarsubmit4().click();
			sleep(5.0);
//			Quinto Insumo
			sleep(3.0);
			link_idPgTplItAgrps1IdCmbConce3().click();
			sleep(3.0);
			text_idregistroInsumoPopupIdTb().waitForExistence();
			sleep(3.0);
			text_idregistroInsumoPopupIdTb().click();
			text_idregistroInsumoPopupIdTb().setText(M7);
			sleep(3.0);
			text_idregistroInsumoPopupIdTb2().setText("");
			text_idregistroInsumoPopupIdTb2().setText(M8);
			sleep(3.0);
			button_aceptarsubmit4().click();
			sleep(5.0);
//			Sexto Insumo
			sleep(3.0);
			link_idPgTplItAgrps2IdCmbConce().click();
			sleep(3.0);
			text_idregistroInsumoPopupIdTb().waitForExistence();
			sleep(3.0);
			text_idregistroInsumoPopupIdTb().click();
			text_idregistroInsumoPopupIdTb().setText(M9);
			sleep(3.0);
			text_idregistroInsumoPopupIdTb2().setText("");
			text_idregistroInsumoPopupIdTb2().setText(M10);
			sleep(3.0);
			button_aceptarsubmit4().click();
			sleep(5.0);
			
		}
		
		public void IngresoMontosConceptos(	String M11,
											String M12,
											String M13,
											String M14,
											String M15)
		{
			sleep(3.0);
			text_idPgTplItAgrps0IdCmbConce().setText(M11);
			sleep(3.0);
//			text_idPgTplItAgrps0IdCmbConce2().setText(M14);
//			sleep(2.0);
//			text_idPgTplItAgrps2IdCmbConce().setText(M15);
//			sleep(2.0);
			text_idPgTplItAgrps2IdCmbConce().setText("");
			text_idPgTplItAgrps2IdCmbConce().setText(M14);
			sleep(3.0);
			text_idPgTplItAgrps2IdCmbConce2().setText("");
			text_idPgTplItAgrps2IdCmbConce2().setText(M15);
			sleep(3.0);
			
		}
		
		public void IngresoMontosInsumos2(	String M1,
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
				//Primer Insumo
				sleep(3.0);
				link_idPgTplItAgrps0IdCmbConce().click();
				sleep(3.0);
				text_idregistroInsumoPopupIdTb().waitForExistence();
				sleep(3.0);
				text_idregistroInsumoPopupIdTb().setText(M1);
				sleep(3.0);
				button_aceptarsubmit4().click();
				sleep(5.0);
				//Segundo Insumo
				sleep(3.0);
				link_idPgTplItAgrps0IdCmbConce2().click();
				sleep(3.0);
				text_idregistroInsumoPopupIdTb().waitForExistence();
				sleep(3.0);
				text_idregistroInsumoPopupIdTb().setText(M2);
				sleep(3.0);
				text_idregistroInsumoPopupIdTb2().click();
				sleep(3.0);
				text_idregistroInsumoPopupIdTb2().setText("");
				text_idregistroInsumoPopupIdTb2().setText(M3);
				sleep(3.0);
				text_idregistroInsumoPopupIdTb3().click();
				sleep(3.0);
				text_idregistroInsumoPopupIdTb3().setText("");
				text_idregistroInsumoPopupIdTb3().setText(M4);
				sleep(3.0);
				button_aceptarsubmit4().click();
				sleep(5.0);
				//Tercer Insumo
				sleep(3.0);
				link_idPgTplItAgrps1IdCmbConce().click();
				sleep(3.0);
				text_idregistroInsumoPopupIdTb().waitForExistence();
				sleep(3.0);
				text_idregistroInsumoPopupIdTb().setText(M5);
				sleep(3.0);
				button_aceptarsubmit4().click();
				sleep(5.0);
				//Cuarto Insumo
				sleep(3.0);
				link_idPgTplItAgrps1IdCmbConce2().click();
				sleep(3.0);
				text_idregistroInsumoPopupIdTb().waitForExistence();
				sleep(3.0);
				text_idregistroInsumoPopupIdTb().setText(M6);
				sleep(3.0);
				button_aceptarsubmit4().click();
				sleep(5.0);
				//Quinto Insumo
				sleep(3.0);
				link_idPgTplItAgrps1IdCmbConce3().click();
				sleep(3.0);
				text_idregistroInsumoPopupIdTb().waitForExistence();
				sleep(3.0);
				text_idregistroInsumoPopupIdTb().setText(M7);
				sleep(3.0);
				text_idregistroInsumoPopupIdTb2().setText("");
				text_idregistroInsumoPopupIdTb2().setText(M8);
				sleep(3.0);
				button_aceptarsubmit4().click();
				sleep(5.0);
				//Sexto Insumo
				sleep(3.0);
				link_idPgTplItAgrps2IdCmbConce().click();
				sleep(3.0);
				text_idregistroInsumoPopupIdTb().waitForExistence();
				sleep(3.0);
				text_idregistroInsumoPopupIdTb().setText(M9);
				sleep(3.0);
				text_idregistroInsumoPopupIdTb2().setText("");
				text_idregistroInsumoPopupIdTb2().setText(M10);
				sleep(3.0);
				button_aceptarsubmit4().click();
				sleep(5.0);
				
				}
				
				public void IngresoMontosConceptos2(	String M11,
														String M12,
														String M13,
														String M14,
														String M15)
				{
					sleep(3.0);
					text_idPgTplItAgrps0IdCmbConce().setText(M11);
					sleep(3.0);
//					text_idPgTplItAgrps0IdCmbConce2().setText(M14);
//					sleep(2.0);
//					text_idPgTplItAgrps2IdCmbConce().setText(M15);
//					sleep(2.0);
					text_idPgTplItAgrps2IdCmbConce().setText("");
					text_idPgTplItAgrps2IdCmbConce().setText(M14);
					sleep(3.0);
					text_idPgTplItAgrps2IdCmbConce2().setText("");
					text_idPgTplItAgrps2IdCmbConce2().setText(M15);
					sleep(3.0);
					link_idPgTplItAgrps0IdCmbConce3().click();
					sleep(3.0);
					
				}
				public void BuscarCompromisoDP2()
				{
					sleep(2.0);
					link_idPgTplIdCmiIrDocumentoRe().waitForExistence();
					sleep(2.0);
					link_idPgTplIdCmiIrDocumentoRe().click();
					sleep(2.0);
					text_idbuscarDocRefPopupId_fol().waitForExistence();
					sleep(2.0);
					text_idbuscarDocRefPopupId_fol().setText(dpString("CP2_FOLIO_APR"));
					sleep(2.0);
					text_idbuscarDocRefPopupIdInte().setText(dpString("NumeroDocumentoOrdenCompra1"));
					sleep(2.0);
					button_buscarsubmit2().click();
					sleep(2.0);
					checkBox_idbuscarDocRefPopupTR2().waitForExistence();
					sleep(2.0);
					checkBox_idbuscarDocRefPopupTR2().click();
					sleep(2.0);
					button_confirmarSelecciónsubmi().click();
					sleep(2.0);
					
					checkBox_idbuscarSeleccionItSe().setState(SELECTED);
					sleep(1.0);
					checkBox_idbuscarSeleccionItSe2().setState(SELECTED);
					sleep(1.0);
					checkBox_idbuscarSeleccionItSe11().setState(SELECTED);
					sleep(1.0);
					checkBox_idbuscarSeleccionItSe3().setState(SELECTED);

					sleep(1.0);
					checkBox_idbuscarSeleccionItSe4().setState(SELECTED);
					sleep(1.0);
					checkBox_idbuscarSeleccionItSe5().setState(SELECTED);
					sleep(1.0);
					checkBox_idbuscarSeleccionItSe6().setState(SELECTED);
					
					sleep(1.0);
					checkBox_idbuscarSeleccionItSe7().setState(SELECTED);
					sleep(1.0);
					checkBox_idbuscarSeleccionItSe8().setState(SELECTED);
					sleep(1.0);
					checkBox_idbuscarSeleccionItSe9().setState(SELECTED);
					

					sleep(7.0);
					button_aceptarsubmit2().click();

					sleep(4.0);
				}
				public void GuardarDigitadoDP1()
				{
					/**
					 * Guardar Digitado de DP y capturar ID 
					 */
	
					sleep(2.0);
					link_idPgTplIdCmlIrGuardarVari().waitForExistence();
					sleep(2.0);
					link_idPgTplIdCmlIrGuardarVari().click();
					sleep(2.0);
					String IDDP1_GD = (String)table_htmlTable_0().getProperty(".text");
					sleep(2.0);
					Libreria.IDDP1_GD = Integer.parseInt(IDDP1_GD.replaceAll("[\\D]", ""));
					logInfo("El Valor de IDDP1_GD es: " + Libreria.IDDP1_GD);
					datapoolValueSetting("IDDP1_GD", Libreria.IDDP1_GD);
					sleep(2.0);
					Captura();
					sleep(2.0);
					button_aceptarsubmit6().waitForExistence();
					sleep(2.0);
					button_aceptarsubmit6().click();
					sleep(2.0);
					
				}
				
				public void GenerarDP1()
				{	

					button_generarsubmit().click();
					sleep(2.0);
					button_aceptarsubmit7().waitForExistence();
					sleep(2.0);
					button_aceptarsubmit7().click();
					sleep(2.0);
					String IDDP1_GEN = (String)table_pt2ContenedorMsj().getProperty(".text");
					Libreria.IDDP1_GEN = Integer.parseInt(IDDP1_GEN.replaceAll("[\\D]", ""));
					logInfo("El Valor de IDDP1_GEN es: " + Libreria.IDDP1_GEN);
					datapoolValueSetting("IDDP1_GEN", Libreria.IDDP1_GEN);
					sleep(2.0);
					Captura();
					sleep(2.0);
					button_irALaBandejaDeEntradasu().click();
					sleep(3.0);	
					link_irABienvenida().click();
					sleep(3.0);			

				}
			public void CompletarDP1()
			{
				sleep(3.0);	
				link_contabilidad().click();
				table_idPgTplJ_id66Menu().click(atCell(
                                        atRow(atIndex(0)), 
                                        atColumn(atIndex(1))));
				list_seleccione4().click();
				list_seleccione5().select(dpString("ProcesoFuenteDP1"));
				list_seleccione4().select(dpString("ESTADO_DP1"));
				button_buscarsubmit3().click();
				sleep(3.0);	
		
		table_htmlTable_0_2().click(atCell(atRow(atIndex(0)), 
                                     atColumn(atIndex(4))));
		browser_htmlBrowser(document_búsquedaDeAsientosCon(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		browser_htmlBrowser(document_búsquedaDeAsientosCon(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		sleep(3.0);	
				
			}
				
		/**
		 * Cadena principal de Ejecucion
		 */
		
	public void testMain(Object[] args) 
	{

		String sNombreCaso = args[0].toString();	
		switch (sNombreCaso){ 	
	
		case "SIGFE2_132_1_E4DP":              				
		{                                  			
		// "CP_SIGFE2_132_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales"
			
//			Ingreso de Datos Generales
			
				DatosGeneralesDP();
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_133_1_E4DP":              				
		{                                  			
		// "CP_SIGFE2_133_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Principal"
			


//				Buscar Principal para Devengo Presupuestario
				
				BuscarPrincipalDP(dpString("RutDP"));
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_134_1_E4DP":              				
		{                                  			
		// "CP_SIGFE2_134_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"
			
//			Buscar Compromiso Presupuestario
			
				BuscarCompromisoDP();
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_135_1_E4DP":              				
		{                                  			
		// "CP_SIGFE2_135_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Completar Campos Variables"
			
//			Ingreso de Datos Generales
			

				CamposVariablesDP1();
			

				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_136_1_E4DP":              				
		{                                  			
		// "CP_SIGFE2_136_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales Factura Afecta sin Contabilidad de Impuestos"
			
			DatosGeneralesDoc1();
			
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_137_1_E4DP":              				
		{                                  			
		// "CP_SIGFE2_137_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Ingresar Impuesto"
			
		
			ImpuestosDP();
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_138_1_E4DP":              				
		{                                  			
		// "CP_SIGFE2_138_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"
			
			
		//	Ingreso de Montos
			
			IngresoMontosInsumos(	dpString("MontoDP1_1"),
									dpString("MontoDP1_2"),
									dpString("MontoDP1_3"),
									dpString("MontoDP1_4"),
									dpString("MontoDP1_5"),
									dpString("MontoDP1_6"),
									dpString("MontoDP1_7"),
									dpString("MontoDP1_8"),
									dpString("MontoDP1_9"),
									dpString("MontoDP1_10"));
		
			IngresoMontosConceptos(	dpString("MontoDP1_11"),
									dpString("MontoDP1_12"),
									dpString("MontoDP1_13"),
									dpString("MontoDP1_14"),
									dpString("MontoDP1_15"));
			
			
		                        			
		   break;                          			
		}                                  			
		//		Fecha de Cumplimiento
		

	
		case "SIGFE2_139_1_E4DP":              				
		{                                  			
		// "CP_SIGFE2_139_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Crear Factura Afecta"
			
//			Crea Nuevo documento
			sleep(2.0);
			link_idPgTplNvPnDetCmAddNavIte().click();
			sleep(2.0);
//			Tipo de Documento
			TipoDocumentoDP2();
			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_133_2_E4DP":              				
		{                                  			
		// "CP_SIGFE2_133_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Principal"
			
//			Buscar Principal
			
			BuscarPrincipalDP(dpString("RutDP2"));
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_134_2_E4DP":              				
		{                                  			
		// "CP_SIGFE2_134_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"
			
//			Buscar Compromiso 2
			
			BuscarCompromisoDP2();
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_135_2_E4DP":              				
		{                                  			
		// "CP_SIGFE2_135_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Completar Campos Variables"
			
//			Ingreso de Datos Generales
			

			CamposVariablesDP2();
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_136_2_E4DP":              				
		{                                  			
		// "CP_SIGFE2_136_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales Factura Afecta sin Contabilidad de Impuestos"
			DatosGeneralesDoc2();
			
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_137_2_E4DP":              				
		{                                  			
		// "CP_SIGFE2_137_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Ingresar Impuesto"
			
//			Seleccionar Impuestos
			
			ImpuestosDP();
			
			
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_138_2_E4DP":              				
		{                                  			
		// "CP_SIGFE2_138_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"
			
//			Ingreso de Montos
			
			IngresoMontosInsumos2(	dpString("MontoDP2_1"),
									dpString("MontoDP2_2"),
									dpString("MontoDP2_3"),
									dpString("MontoDP2_4"),
									dpString("MontoDP2_5"),
									dpString("MontoDP2_6"),
									dpString("MontoDP2_7"),
									dpString("MontoDP2_8"),
									dpString("MontoDP2_9"),
									dpString("MontoDP2_10"));

			 IngresoMontosConceptos2(	dpString("MontoDP2_11"),
										dpString("MontoDP2_12"),
										dpString("MontoDP2_13"),
										dpString("MontoDP2_14"),
										dpString("MontoDP2_15"));
			
			            			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_140_1_E4DP":              				
		{                                  			
		// "CP_SIGFE2_140_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Guardar Digitado"
			
			
//	 		Guardar Digitado
			
			GuardarDigitadoDP1();
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_141_1_E4DP":              				
		{                                  			
		// "CP_SIGFE2_141_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Generar"
			
			
//			Generar
			GenerarDP1();
			
//			REVISAR

//			Completar
			
//			CompletarDP1();
				                        			
		   break;                          			
		}                                  			
		
		
		}
		
	}
	
	
	
	


}

