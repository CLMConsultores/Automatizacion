package Modulos.Compromiso;
import resources.Modulos.Compromiso.CP_Contrato_Gastos_Moneda_Nacional_GenerarHelper;
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
public class CP_Contrato_Gastos_Moneda_Nacional_Generar extends CP_Contrato_Gastos_Moneda_Nacional_GenerarHelper
{
	/**
	 * Script Name   : <b>CP_Contrato_Gastos_Moneda_Nacional_Generar</b>
	 * Generated     : <b>29/08/2014 09:37:59</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/08/29
	 * @author Daniel Palma
	 */
	public void testMain(Object[] args) 
	{
		
		// Link Menú Compromiso Contrato
		link_compromiso().click();
		table_idPgTplJ_id30Menu().click(atCell(
                                        atRow(atIndex(1)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id32ScrollConte().click(atCell(
                                        atRow(atIndex(9)), 
                                        atColumn(atIndex(1))));
		// Datos Generales
		text_cP_Contrato().setText(dpString("CP_Contrato_Titulo"));
		text_cP_Contrato2().setText(dpString("CP_Contrato_Descripcion"));
		list_seleccione().select(dpString("CP_Contrato_TipoPresupuesto"));
		sleep(2.0);
		
		// Asociar CP Licitación
		link_idPgTplIdCmiIrDocumentoRe().click();
		sleep(2.0);
			
			// Buscar Compromiso Presupuestario Licitación
			list_compromisoPresupuestario().select(dpString("CP_Contrato_Proceso"));
			list_licitación().select(dpString("CP_Contrato_TipoDocumento"));
			text__841241().setText(dpString("CP_FolioCPLicitacion"));
			list_leyDePresupuestos().select(dpString("CP_Contrato_TipoDemanda"));
			list_nacional().select(dpString("CP_Contrato_MonedaPresupuestaria"));
			button_buscarsubmit().click();
			sleep(2.0);
			checkBox_svwBuscarDocumentoRef().click();
			button_agregarsubmit().click();
			sleep(2.0);
			button_confirmarSelecciónsubmi().click();
			sleep(2.0);
		
			// Seleccionar Conceptos/Insumos
				//Cata 1, Conceptos 1,2 y 3
				checkBox_svwBuscarDocumentoRef2().click();
				checkBox_svwBuscarDocumentoRef3().click();
				checkBox_svwBuscarDocumentoRef4().click();
				
				//Cata 2, Concepto 2
				checkBox_svwBuscarDocumentoRef6().click();
				
				//Cata 2, Concepto 1,2 y 3
				checkBox_svwBuscarDocumentoRef7().click();
				checkBox_svwBuscarDocumentoRef8().click();
				checkBox_svwBuscarDocumentoRef9().click();
				sleep(1.0);
				button_confirmarSelecciónsubmi2().click();
			sleep(2.0);
		
		// Datos del Contrato
		text_contratoDeLicitacionAnter().setText(dpString("CP_Contrato_Descripcion"));
		text_idPgTplIdInteNumeroDocume().setText(dpString("CP_Contrato_NumeroDocumento"));
		text__18022014().setText(dpString("CP_Contrato_FechaDocumento"));
		list_seleccione2().select(dpString("CP_Contrato_MonedaDocumento"));
		sleep(2.0);
		
		// Agregar Principal
		link_idPgTplIdCmlBuscarPrincip().click();
		radioButton_idbuscarPrincipalP().click();
		sleep(2.0);
		text_idbuscarPrincipalPopupIdI().setText(dpString("CP_Contrato_RutPrincipal"));
		button_buscarsubmit2().click();
		sleep(2.0);
		checkBox_idbuscarPrincipalPopu().click();
		sleep(2.0);
		button_agregarsubmit2().click();
		sleep(2.0);
		button_confirmarSelecciónsubmi3().click();
		sleep(2.0);
		
		// Agregar Montos a Conceptos Presupuestarios Asociados
			// Montos Catálogo 1
			text_idPgTplItAgrp0IdCmbConcep().doubleClick();
			text_idPgTplItAgrp0IdCmbConcep().setText(dpString("CP_Contrato_Cata1_Concept1_Monto"));
			sleep(1.0);
			text_idPgTplItAgrp0IdCmbConcep2().doubleClick();
			text_idPgTplItAgrp0IdCmbConcep2().setText(dpString("CP_Contrato_Cata1_Concept2_Monto"));
			sleep(1.0);
			text_idPgTplItAgrp0IdCmbConcep3().doubleClick();
			text_idPgTplItAgrp0IdCmbConcep3().setText(dpString("CP_Contrato_Cata1_Concept3_Monto"));
			sleep(1.0);
			
			// Montos Catálogo 2
			text_idPgTplItAgrp1IdCmbConcep().doubleClick();
			text_idPgTplItAgrp1IdCmbConcep().setText(dpString("CP_Contrato_Cata2_Concept1_Monto"));
			sleep(1.0);
			
			// Montos Catálogo 3
			text_idPgTplItAgrp2IdCmbConcep().doubleClick();
			text_idPgTplItAgrp2IdCmbConcep().setText(dpString("CP_Contrato_Cata3_Concept1_Monto"));
			sleep(1.0);
			text_idPgTplItAgrp2IdCmbConcep2().doubleClick();
			text_idPgTplItAgrp2IdCmbConcep2().setText(dpString("CP_Contrato_Cata3_Concept2_Monto"));
			sleep(1.0);
			text_idPgTplItAgrp2IdCmbConcep3().doubleClick();
			text_idPgTplItAgrp2IdCmbConcep3().setText(dpString("CP_Contrato_Cata3_Concept3_Monto"));
		sleep(2.0);
			
		// Agregar Fecha de Cumplimiento
		link_idPgTplIdCmbIrFechasCumpl().click();
		sleep(2.0);
		text_buscarFechasCumplimientoP().setText(dpString("CP_Contrato_FechaCumplimiento"));
		text_buscarFechasCumplimientoP2().setText(dpString("CP_Contrato_FechaCumplimiento_Monto"));
		button_paso1De1submit().click();
		sleep(2.0);
		
		// Guardar Digitado
		link_idPgTplIdCmlIrGuardarComp().click();
		table_htmlTable_0().performTest(PV_GD_CPContratoVP());
		button_aceptarsubmit().click();
		sleep(2.0);
		
		// Generar Compromiso Contrato
		button_generarsubmit().click();
		button_aceptarsubmit2().click();
		table_pt2ContenedorMsj().performTest(PV_Generar_CPContratoVP());
		if (table_pt2ContenedorMsj().performTest(PV_Generar_CPContratoVP()))
		{
			String sID_CP_C = (String)table_pt2ContenedorMsj().getProperty(".text");	
			logPrintScreenInfo(sID_CP_C);
			sID_CP_C = String.valueOf(Integer.parseInt(sID_CP_C.replaceAll("[\\D]", ""))).toString();
			dpSetValue("CP_IDGenerado_Contrato", sID_CP_C);
		}
		else
			logPrintScreenError("No se ha generado satisfactoriamente el Requerimiento Presupuestario.");
		button_terminarLaTransacciónsu().click();
				
	}
}

