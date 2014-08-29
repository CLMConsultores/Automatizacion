package Modulos.Compromiso;
import resources.Modulos.Compromiso.CP_Licitacion_Gastos_Moneda_Nacional_GenerarHelper;
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
public class CP_Licitacion_Gastos_Moneda_Nacional_Generar extends CP_Licitacion_Gastos_Moneda_Nacional_GenerarHelper
{
	/**
	 * Script Name   : <b>Compromiso_Presupuestario_Licitacion</b>
	 * Generated     : <b>28/08/2014 15:36:52</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/08/28
	 * @author Daniel Palma
	 */
	public void testMain(Object[] args) 
	{
		/*
		// Login Sigfe 
		startApp("T03");
		text_j_username().setText(dpString("Username"));
		text_j_password().setText(dpString("Password"));
		button_ingresarsubmit().click();
		*/
		
		// Link Compromiso Licitación
		link_compromiso().click();
		table_idPgTplJ_id30Menu().click(atCell(
                                        atRow(atIndex(1)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id32ScrollConte().click(atCell(
                                        atRow(atIndex(0)), 
                                        atColumn(atIndex(1))));
		
		// Datos Generales
		text_cP_Licitación().setText(dpString("CP_Titulo"));
		text_cP_Licitación2().setText(dpString("CP_Descripcion"));
		list_seleccione().select(dpString("CP_TipoPresupuesto"));
		sleep(2.0);
		
		// Buscar Requerimiento a Asociar.
		link_idPgTplIdCmiIrDocumentoRe().click();
		list_requerimientoPresupuestar().select(dpString("CP_Proceso"));
		list_leyDePresupuestos().select(dpString("CP_TipoDemanda"));
		list_nacional().select(dpString("CP_MonedaPresupuestaria"));
		text__1159().setText(dpString("CP_FolioReq"));
		button_buscarsubmit().click();
		sleep(2.0);
		checkBox_svwBuscarDocumentoRef().click();
		sleep(2.0);
		button_agregarsubmit().click();
		sleep(2.0);
		button_confirmarSelecciónsubmi().click();
			// Seleccionar Conceptos/Insumos
			checkBox_svwBuscarDocumentoRef2().click();
			checkBox_svwBuscarDocumentoRef3().click();
			checkBox_svwBuscarDocumentoRef4().click();
			checkBox_svwBuscarDocumentoRef5().click();
			checkBox_svwBuscarDocumentoRef6().click();
			checkBox_svwBuscarDocumentoRef7().click();
			checkBox_svwBuscarDocumentoRef8().click();
			checkBox_svwBuscarDocumentoRef9().click();
			sleep(1.0);
			button_confirmarSelecciónsubmi2().click();
			sleep(2.0);
			
		// Ingresar Datos del Documento Licitación 1.
		text_cpLicitaciónParaPruebasDe().setText(dpString("CP_DescripcionDoc"));
		text_idPgTplIdInteNumeroDocume().setText(dpString("CP_NumeroDocumento"));
		text__15022014().setText(dpString("CP_FechaDocumento"));
		list_seleccione2().select(dpString("CP_MonedaDocumento"));
		sleep(2.0);
		
		// Ingresar Montos a Conceptos Presupuestarios por Catalogo.
		text_idPgTplItAgrp0IdCmbConcep().doubleClick();
		text_idPgTplItAgrp0IdCmbConcep().setText(dpString("CP_Cata1_Concepto1_Monto"));
		sleep(1.0);
		text_idPgTplItAgrp0IdCmbConcep2().doubleClick();
		text_idPgTplItAgrp0IdCmbConcep2().setText(dpString("CP_Cata1_Concepto2_Monto"));
		sleep(1.0);
		text_idPgTplItAgrp0IdCmbConcep3().doubleClick();
		text_idPgTplItAgrp0IdCmbConcep3().setText(dpString("CP_Cata1_Concepto3_Monto"));
		sleep(1.0);
		text_idPgTplItAgrp0IdCmbConcep4().doubleClick();
		text_idPgTplItAgrp0IdCmbConcep4().setText(dpString("CP_Cata1_Concepto3_Futuro_Monto"));
		sleep(2.0);
		
		text_idPgTplItAgrp1IdCmbConcep().doubleClick();
		text_idPgTplItAgrp1IdCmbConcep().setText(dpString("CP_Cata2_Concepto1_Monto"));
		sleep(1.0);
		text_idPgTplItAgrp1IdCmbConcep2().doubleClick();
		text_idPgTplItAgrp1IdCmbConcep2().setText(dpString("CP_Cata2_Concepto2_Monto"));
		sleep(2.0);
		
		text_idPgTplItAgrp2IdCmbConcep().doubleClick();
		text_idPgTplItAgrp2IdCmbConcep().setText(dpString("CP_Cata3_Concepto1_Monto"));
		sleep(1.0);
		text_idPgTplItAgrp2IdCmbConcep2().doubleClick();
		text_idPgTplItAgrp2IdCmbConcep2().setText(dpString("CP_Cata3_Concepto2_Monto"));
		sleep(1.0);
		text_idPgTplItAgrp2IdCmbConcep3().doubleClick();
		text_idPgTplItAgrp2IdCmbConcep3().setText(dpString("CP_Cata3_Concepto3_Monto"));
		sleep(2.0);
		
		// Agregar Fecha de Cumplimiento
		link_idPgTplIdCmbIrFechasCumpl().click();
		text_buscarFechasCumplimientoP().setText(dpString("CP_FechaCumplimiento1"));
		text_buscarFechasCumplimientoP2().setText(dpString("CP_FechaCumplimiento1_Monto"));
		link_buscarFechasCumplimientoP().click();
		text_buscarFechasCumplimientoP3().setText(dpString("CP_FechaCumplimiento2"));
		text_buscarFechasCumplimientoP4().setText(dpString("CP_FechaCumplimiento2_Monto"));
		button_paso1De1submit().click();
		sleep(2.0);
		
		// Guardar Digitado
		link_idPgTplIdCmlIrGuardarComp().click();
		table_htmlTable_0().performTest(PV_GuardarDigitado_CPVP());
		button_aceptarsubmit().click();
		sleep(2.0);
					
		// Generar Compromiso Presupuestario Licitacion
		button_generarsubmit().click();
		button_aceptarsubmit2().click();
		table_pt2ContenedorMsj().performTest(PV_GenerarCompromiso_LicitacionVP());
		if (table_pt2ContenedorMsj().performTest(PV_GenerarCompromiso_LicitacionVP()))
		{
			String sID_CP = (String)table_pt2ContenedorMsj().getProperty(".text");	
			logPrintScreenInfo(sID_CP);
			sID_CP = String.valueOf(Integer.parseInt(sID_CP.replaceAll("[\\D]", ""))).toString();
			dpSetValue("CP_IDGenerado", sID_CP);
		}
		else
			logPrintScreenError("No se ha generado satisfactoriamente el Requerimiento Presupuestario.");
		button_terminarLaTransacciónsu().click();
				
	}
}

