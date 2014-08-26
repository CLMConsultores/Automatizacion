package Script;
import javax.swing.JOptionPane;

import resources.Script.CO_GENERICO_04Helper;
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
public class CO_GENERICO_04 extends CO_GENERICO_04Helper
{
	/**
	 * Script Name   : <b>AC_GENERICO_04</b>
	 * Generated     : <b>13/03/2014 20:06:39</b>
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
	public void BuscarAC1()
	{
		sleep(3.0);	
		link_contabilidad().click();
		table_idPgTplJ_id66Menu().click(atCell(
                                atRow(atIndex(0)), 
                                atColumn(atIndex(1))));
		
		sleep(2.0);
		
		list_seleccione().select(dpString("ProcesoFuenteDP1"));
		list_seleccione2().select(dpString("ESTADO_DP1"));
		sleep(3.0);	
		button_buscarsubmit2().click();
		sleep(3.0);	

		table_htmlTable_0().click(atCell(atRow(atIndex(0)), 
                atColumn(atIndex(4))));
		// TODO seteo de 2 tab por revisar estadoa actual de ubicacion de boton completar en T1
		browser_htmlBrowser(document_búsquedaDeAsientosCon(),DEFAULT_FLAGS).inputKeys("{TAB 2}");
		browser_htmlBrowser(document_búsquedaDeAsientosCon(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		sleep(3.0);	
		
		
	}
	public void EliminarDatos()
	{
		sleep(3.0);
		//----------->Ingresado por Daniel Palma
		
		//link_idPgTplItAgrp0SgfCmbCuent().click();
		
		// HTML Browser
		// Document: Asiento Contable: http://192.168.203.10/sigfe/faces/task-flow-buscar-variacion-patrimonial/busquedaVariacionPatrimonial?_adf.ctrl-state=17zicgw0cf_17
		link_idPgTplItAgrp0SgfCmbCuent75().click();
		sleep(3.0);	
		link_idPgTplItAgrp0SgfCmbCuent75().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent75().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent75().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent75().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent75().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent75().click();
		sleep(3.0);
		
		// HTML Browser
		// Document: Asiento Contable: http://192.168.203.10/sigfe/faces/task-flow-buscar-variacion-patrimonial/busquedaVariacionPatrimonial?_adf.ctrl-state=17zicgw0cf_17
		link_idPgTplItAgrp0SgfCmbCuent74().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent74().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent74().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent74().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent74().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent74().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent74().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent74().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent74().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent74().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent74().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent74().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent74().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent74().click();
		sleep(3.0);
		
		// HTML Browser
		// Document: Asiento Contable: http://192.168.203.10/sigfe/faces/task-flow-buscar-variacion-patrimonial/busquedaVariacionPatrimonial?_adf.ctrl-state=17zicgw0cf_17
		link_idPgTplItAgrp0SgfCmbCuent73().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent73().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent73().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent73().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent73().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent73().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent73().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent73().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent73().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent73().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent73().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent73().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent73().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent73().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent73().click();
		sleep(3.0);
		
		
		// HTML Browser
		// Document: Asiento Contable: http://192.168.203.10/sigfe/faces/task-flow-buscar-variacion-patrimonial/busquedaVariacionPatrimonial?_adf.ctrl-state=17zicgw0cf_17
		link_idPgTplItAgrp0SgfCmbCuent72().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent72().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent72().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent72().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent72().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent72().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent72().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent72().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent72().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent72().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent72().click();
		sleep(3.0);
		link_idPgTplItAgrp0SgfCmbCuent72().click();
		sleep(3.0);
		//-------> Fin Agregado

//		link_idPgTplItAgrp0SgfCmbCuent2().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent3().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent4().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent5().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent6().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent7().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent8().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent9().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent10().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent11().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent12().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent13().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent14().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent15().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent16().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent17().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent18().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent19().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent20().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent22().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent23().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent24().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent25().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent26().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent27().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent28().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent29().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent30().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent31().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent32().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent33().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent34().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent35().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent36().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent36().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent37().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent38().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent39().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent40().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent41().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent42().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent43().click();
//		sleep(3.0);	
//		link_idPgTplItAgrp0SgfCmbCuent43().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent44().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent45().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent46().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent47().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent48().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent49().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent50().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent51().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent52().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent53().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent54().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent55().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent56().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent57().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent58().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent59().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent60().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent61().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent62().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent63().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent64().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent65().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent66().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent67().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent68().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent69().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent70().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent71().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent72().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent73().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent74().click();
//		sleep(3.0);
//		link_idPgTplItAgrp0SgfCmbCuent75().click();
//		sleep(3.0);
	}
	
	public void ConjuntoDatosAC(	String FechaDoc,
									String TipoDoc,
									String NumeroDoc,
									String MontoOrigen,
									String Descripcion)
	{

		text_svwAuxiliarFinancieroDocs().setText(FechaDoc);
		list_seleccionado().select(TipoDoc);
		text_svwAuxiliarFinancieroDocs2().setText(NumeroDoc);
		text_svwAuxiliarFinancieroDocs3().setText(MontoOrigen);
		text_svwAuxiliarFinancieroDocs4().setText(Descripcion);
		button_aceptarsubmit().click();
		sleep(3.0);

	}
	public void BuscarPrincipal(String RUT)
	{
		sleep(2.0);
		link_svwAuxiliarFinancieroIdCm().waitForExistence();
		link_svwAuxiliarFinancieroIdCm().click();
		sleep(2.0);
		radioButton_svwBuscarPrincipal().click();
		sleep(4.0);
		text_svwBuscarPrincipalIdInteN().setText(RUT);
		button_buscarsubmit().click();
		radioButton_seleccionsvwBuscar().click();
		button_confirmarSelecciónsubmi().click();
		sleep(2.0);
	}
	public void GenerarAC1()
	{
		sleep(2.0);
		
		button_generarsubmit().click();
		button_aceptarsubmit2().waitForExistence();
		button_aceptarsubmit2().click();
		logInfo("El Valor de IDAC_GEN es: " + Libreria.IDAC1_GEN);	
		String IDAC1_GEN = (String)table_pt2ContenedorMsj().getProperty(".text");	
		IDAC1_GEN= IDAC1_GEN.replaceAll("[\\D]", "");
		Libreria.IDAC1_GEN =Integer.parseInt(IDAC1_GEN.substring(0,7));
		logInfo("El Valor de IDAC1_GEN es: " + Libreria.IDAC1_GEN);
		datapoolValueSetting("IDAC1_GEN", Libreria.IDAC1_GEN);
		Captura();
		sleep(3.0);
		link_irABienvenida2().click();
		sleep(2.0);
	}
	public void AprobarAC1()
	{
		sleep(2.0);

		link_contabilidad().click();
		table_idPgTplJ_id66Menu().click(atCell(
                                        atRow(atIndex(0)), 
                                        atColumn(atIndex(1))));
		text_idTmpBFiltroIdTransaccion().setText(dpString("IDAC1_GEN"));
		button_buscarsubmit2().click();
		sleep(2.0);
		
		table_htmlTable_0().click(atCell(atRow(atIndex(0)), 
                                   atColumn(atIndex(4))));
		browser_htmlBrowser(document_búsquedaDeAsientosCon(),DEFAULT_FLAGS).inputKeys("{TAB}");
		browser_htmlBrowser(document_aboutBlank(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		sleep(2.0);
		button_aprobarsubmit().waitForExistence();
		button_aprobarsubmit().click();
		sleep(2.0);
		
		String AC1_FOLIO_APR = (String)table_htmlTable_0_2().getProperty(".contentText");
		Libreria.AC1_FOLIO_APR=Integer.parseInt(AC1_FOLIO_APR.replaceAll("[\\D]", ""));
		logInfo("El Valor de AC1_FOLIO_APR es: "+Libreria.AC1_FOLIO_APR);
		datapoolValueSetting("AC1_FOLIO_APR", Libreria.AC1_FOLIO_APR);
		Captura();
		button_aceptarsubmit3().click();
		sleep(2.0);
		link_irABienvenida().click();
		
	}
	public void testMain(Object[] args) 
	{
		
		String sNombreCaso = args[0].toString();	
		switch (sNombreCaso){ 
		case "SIGFE2_144_1_E4AC":              				
		{                                  			
		// "CP_SIGFE2_144_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Buscar Asiento Contable"
			
			// Buscar Asiento Contable
			
			
			BuscarAC1();
				  
			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_145_1_E4AC":              				
		{                                  			
		// "CP_SIGFE2_145_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Ingresar Datos"
			
			//Elimina Conceptos sin valor
			
			EliminarDatos();
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_146_1_E4AC":              				
		{                                  			
		// "CP_SIGFE2_146_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Modificar Auxiliar Financiero" 

			// Modificar auxiliar
			sleep(2.0);
			link_idPgTplItAgrp0SgfCmbCuent76().click();
			sleep(2.0);
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_147_1_E4AC":              				
		{                                  			
		// "CP_SIGFE2_147_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Buscar Principal" 
			sleep(2.0);
			BuscarPrincipal(dpString("RutDP"));
			sleep(2.0);                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_148_1_E4AC":              				
		{                                  			
		// "CP_SIGFE2_148_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Ingresar Conjunto de Datos"  
			
			
			ConjuntoDatosAC(dpString("FechaDocAC1"),
							dpString("TipoDocAC1"),
							dpString("NumeroDocAC1"),
							dpString("MontoOrigenAC1"),
							dpString("DescripcionAC1") );
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_146_2_E4AC":              				
		{                                  			
		// "CP_SIGFE2_146_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Modificar Auxiliar Financiero"
			sleep(2.0);
			link_idPgTplItAgrp0SgfCmbCuent77().click();
			sleep(2.0);

				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_147_2_E4AC":              				
		{                                  			
		// "CP_SIGFE2_147_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Buscar Principal"         
			sleep(2.0);
			BuscarPrincipal(dpString("RutDP"));
			sleep(2.0);   			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_148_2_E4AC":              				
		{                                  			
		// "CP_SIGFE2_148_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Ingresar Conjunto de Datos"  
			
			ConjuntoDatosAC(dpString("FechaDocAC2"),
							dpString("TipoDocAC2"),
							dpString("NumeroDocAC2"),
							dpString("MontoOrigenAC2"),
							dpString("DescripcionAC2") );


                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_149_1_E4AC":              				
		{                                  			
		// "CP_SIGFE2_149_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Generar" 
			
			// Generar 

			GenerarAC1();
							
				                        			
		   break;                          			
		}                                  			
		                                   			
		case "SIGFE2_150_1_E4AC":              				
		{                                  			
		// "CP_SIGFE2_150_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Aprobar" 
			
			// Aprobar

			AprobarAC1();
				                        			
		   break;                          			
		}                                  			
		}
		

		

		
		


		
		
		
	}
}

