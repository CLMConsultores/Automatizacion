package Script;
import resources.Script.RP_GENERICO_01Helper;
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
public class RP_GENERICO_01 extends RP_GENERICO_01Helper
{
	/**
	 * Script Name   : <b>RP_GENERICO_01</b>
	 * Generated     : <b>05/03/2014 10:03:54</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/03/05
	 * @author cpena
	 */
	
	public void Login()
	{
		Inicio();
		sleep(2.0);
		startApp("T03");
		sleep(2.0);
		text_j_username().setText(dpString("Usuario"));
		text_j_password().setText(dpString("Password"));
		button_ingresarsubmit().click();
		
	}
	public void DatosGenerales()
	{
		
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
		text_idPgTplTitulo().setText(dpString("TituloRP"));
		text_idPgTplDescripcion().setText(dpString("DescripcionRP"));
		list_seleccione().select(dpString("TipoDemanda"));
		//Validar que se haya seleccionado el Tipo de Demanda
		String Titulo_TipoDemanda = (String)list_seleccione().getProperty(".title");
		if (!Titulo_TipoDemanda.equals(dpString("TipoDemanda"))){
			list_seleccione().select(dpString("TipoDemanda"));
		}
		button_crearDetallesubmit().click();
		sleep(2.0);
		
		
		// REV ---------------------->>>
		
		
			
		
//			while (html_idPgTplItTpoDdaContent().getProperty(".text")!=dpString("TipoDemanda"))
//				{				
//				list_seleccione().select(dpString("TipoDemanda"));
//				button_crearDetallesubmit().click();
//				sleep(5.0);
//				logInfo("while log "+html_idPgTplItTpoDdaContent().getProperty(".text")+"//"+dpString("TipoDemanda"));
//					if (html_idPgTplItTpoDdaContent().getProperty(".text")==dpString("TipoDemanda"));
//					logInfo("IF log "+html_idPgTplItTpoDdaContent().getProperty(".text")+"//"+dpString("TipoDemanda"));
//						break;
//					}
//			<<<<---------------------------
	}
	public void CombCatalogos()
	{
//		Primera Combinacion
		radioButton_rbCatalogo1svwComb3().click();
		radioButton_rbCatalogo2svwComb().click();
		radioButton_rbCatalogo3svwComb4().click();
		sleep(2.0);
		button_agregarCombinaciónsubmi().click();
		sleep(2.0);
//		Segunda combinacion
		radioButton_rbCatalogo1svwComb4().click();
		radioButton_rbCatalogo2svwComb().click();
		radioButton_rbCatalogo3svwComb5().click();
		sleep(2.0);
		button_agregarCombinaciónsubmi().click();
		sleep(2.0);
//		Tercera Combinacion
		radioButton_rbCatalogo1svwComb5().click();
		radioButton_rbCatalogo2svwComb().click();
		radioButton_rbCatalogo3svwComb6().click();
		button_agregarCombinaciónsubmi().click();
		sleep(2.0);
		button_aceptarsubmit().waitForExistence();
		sleep(2.0);
		button_aceptarsubmit().click();
		sleep(3.0);
		
		
	}
	public void AgregarInsumos()
	{
//		Buscar Insumos 
		
		// Primera Combinacion de Catalogos - Buscar Insumos
		
		link_idPgTplItAgrps0Cci1Cl2().click();
		BuscarInsumos(dpString("InsumoRP_1"), dpString("MontoRP_1"));
		
		link_idPgTplItAgrps0Cci1Cl2().click();
		BuscarInsumos(dpString("InsumoRP_2"), dpString("MontoRP_2"));
		
		link_idPgTplItAgrps0Cci1Cl2().click();
		BuscarInsumos(dpString("InsumoRP_3"), dpString("MontoRP_3"));
		
		link_idPgTplItAgrps0Cci1Cl2().click();
		BuscarInsumos(dpString("InsumoRP_4"), dpString("MontoRP_4"));
		
			
		// Segunda Combinacion de Catalogos - Buscar Insumos
		
		
		link_idPgTplItAgrps1Cci1Cl2().click();
		BuscarInsumos(dpString("InsumoRP_5"), dpString("MontoRP_5"));
		
		link_idPgTplItAgrps1Cci1Cl2().click();
		BuscarInsumos(dpString("InsumoRP_6"), dpString("MontoRP_6"));
		
		link_idPgTplItAgrps1Cci1Cl2().click();
		BuscarInsumos(dpString("InsumoRP_7"), dpString("MontoRP_7"));
		
		link_idPgTplItAgrps1Cci1Cl2().click();
		BuscarInsumos(dpString("InsumoRP_8"), dpString("MontoRP_8"));
		
		
		//Tercera Combinacion de Catalogos - Buscar Insumos
		
		
		link_idPgTplItAgrps2Cci1Cl2().click();
		BuscarInsumos(dpString("InsumoRP_9"), dpString("MontoRP_9"));
		
		link_idPgTplItAgrps2Cci1Cl2().click();
		BuscarInsumos(dpString("InsumoRP_10"), dpString("MontoRP_10"));

	}
	public void BuscarInsumos(String Insumo, String MontoInsumo)
	{
		sleep(2.0);
		text_svwBuscarInsumoSMIdInteCo().setText(Insumo);
		button_buscarsubmit().click();
		checkBox_svwBuscarInsumoSMSmcI().click();
		button_confirmarSelecciónsubmi().click();
		text_svwAgregarInsumoPopUpTblI().waitForExistence();
		text_svwAgregarInsumoPopUpTblI().setText(MontoInsumo);
		button_aceptarsubmit2().click();
		sleep(2.0);
	}
	
	public void AgregarConceptosPresupuestarios()
	{
		
		// Primera Combinacion de Catalogos - Conceptos Presupuestarios
		link_idPgTplItAgrps0Cci1ClkAdd().click();
		BuscarConceptos(dpString("ConceptoPresup_1"), dpString("MontoRP_11"));
		
		link_idPgTplItAgrps0Cci1ClkAdd().click();
		BuscarConceptos(dpString("ConceptoPresup_2"), dpString("MontoRP_12"));
		
		// Segunda Combinacion de Catalogos - Conceptos Presupuestarios
		
		link_idPgTplItAgrps1Cci1ClkAdd().click();
		BuscarConceptos(dpString("ConceptoPresup_3"), dpString("MontoRP_13"));
		
		// Tercera Combinacion de Catalogos - Conceptos Presupuestarios
		
		link_idPgTplItAgrps2Cci1ClkAdd().click();
		BuscarConceptos(dpString("ConceptoPresup_4"), dpString("MontoRP_14"));
		
		link_idPgTplItAgrps2Cci1ClkAdd().click();
		BuscarConceptos(dpString("ConceptoPresup_5"), dpString("MontoRP_15"));
	}
	public void BuscarConceptos(String Concepto, String MontoConcepto)
	{
		sleep(2.0);
		text_svwBuscarConceptoSMIntxCo().waitForExistence();
		text_svwBuscarConceptoSMIntxCo().setText(Concepto);
		button_buscarsubmit2().click();
		checkBox_svwBuscarConceptoSMSm().click();
		button_confirmarSelecciónsubmi2().click();
		text_svwAgregarConceptoPresPop().waitForExistence();
		text_svwAgregarConceptoPresPop().setText(MontoConcepto);
		button_aceptarsubmit3().click();
		sleep(2.0);
	}
	public void GuardarDigitado()
	{
		sleep(2.0);
		link_idPgTplCmdLnkGuardarBorra().click();
		table_htmlTable_0().waitForExistence();
		String IDRP_GD = (String)table_htmlTable_0().getProperty(".text");
		Libreria.IDRP_GD = Integer.parseInt(IDRP_GD.replaceAll("[A-Za-z]+[\\s]", ""));
		logInfo("El Valor de IDRP_GD es: " + Libreria.IDRP_GD);
		datapoolValueSetting("IDRP_GD", Libreria.IDRP_GD);
		Captura();
		sleep(2.0);
		button_aceptarsubmit4().click();
		sleep(2.0);
	}
	public void Generar()
	{
		sleep(2.0);
		button_generarsubmit().click();
		button_aceptarsubmit5().waitForExistence();
		button_aceptarsubmit5().click();
		String IDRP_GEN = (String)table_pt2ContenedorMsj().getProperty(".text");
		Libreria.IDRP_GEN = Integer.parseInt(IDRP_GEN.replaceAll("[A-Za-záéíóú]+[\\s]", ""));
		logInfo("El Valor de IDRP_GEN es: " + Libreria.IDRP_GEN);
		datapoolValueSetting("IDRP_GEN", Libreria.IDRP_GEN);
		Captura();
		button_irALaBandejaDeEntradasu().click();
		link_irABienvenida().click();
		link_idPgTplIdLinkBandeja().waitForExistence();
		sleep(2.0);
		
	}
	
	public void Aprobar()
	{
		sleep(2.0);
		link_requerimiento2().click();
		table_idPgTplJ_id11Menu2().click(atCell(
                                        atRow(atIndex(0)), 
                                        atColumn(atIndex(1))));
//		Ingresar ID de Busqueda
		text_idTmpBIdTransaccional().setText(dpString("IDRP_GEN"));
		button_buscarsubmit3().click();
		link_idTmpBIdTbRqB0LinkVisuali().waitForExistence();
		link_idTmpBIdTbRqB0LinkVisuali().click();
		button_aprobarsubmit().waitForExistence();
		button_aprobarsubmit().click();
		button_aceptarsubmit6().waitForExistence();
		button_aceptarsubmit6().click();
		
//		Guardar en Datapool Folio de Requerimiento Presupuestario
		
		String RP_FOLIO_APR=(String)table_htmlTable_0_2().getProperty(".text");
		Libreria.RP_FOLIO_APR=Integer.parseInt(RP_FOLIO_APR.replaceAll("[\\D]", ""));
		logInfo("El Valor de RP_FOLIO_APR es: "+Libreria.RP_FOLIO_APR);
		datapoolValueSetting("RP_FOLIO_APR", Libreria.RP_FOLIO_APR);
		Captura();
		button_aceptarsubmit7().click();
		sleep(2.0);
		link_irABienvenida2().click();
		sleep(2.0);
		

	}
	public void testMain(Object[] args) 
	{
		String sNombreCaso = args[0].toString();	
		switch (sNombreCaso){ 			
	                         
	case "SIGFE2_001_1_E4RP":              				
		{                                  			
	// "Login Sigfe 2 - Escenario 4"
			
			
			Login();
				                        			
	   break; 
	}
		
		
	case "SIGFE2_107_1_E4RP":              				
	{                                  			
	// "CP_SIGFE2_107_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Datos Generales"
		
//		Datos Generales
		
		DatosGenerales();
		
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_108_1_E4RP":              				
	{                                  			
	// "CP_SIGFE2_108_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Agregar Combinación de Catálogos"
		
		
//		Combinacion de Catalogos
		
		CombCatalogos();
		
		
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_109_1_E4RP":              				
	{                                  			
	// "CP_SIGFE2_109_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Agregar Insumos"
		
		AgregarInsumos();
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_110_1_E4RP":              				
	{                                  			
	// "CP_SIGFE2_110_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Agregar Conceptos Presupuestarios"
		
		
		AgregarConceptosPresupuestarios();
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_111_1_E4RP":              				
	{                                  			
	// "CP_SIGFE2_111_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Guardar Digitado"
		

		
		GuardarDigitado();
		
				                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_112_1_E4RP":              				
	{                                  			
	// "CP_SIGFE2_112_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Generar"
		
		
		Generar();
		
			                        			
	   break;                          			
	}                                  			
	                                   			
	case "SIGFE2_113_1_E4RP":              				
	{                                  			
	// "CP_SIGFE2_113_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Aprobar"
		
		

//		Aprobar
		
		Aprobar();	
		
			                        			
	   break;                          			
	}                                  			
		}


		
	}
}

