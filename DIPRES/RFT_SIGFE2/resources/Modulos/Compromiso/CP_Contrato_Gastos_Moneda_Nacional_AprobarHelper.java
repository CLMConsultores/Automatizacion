// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Modulos.Compromiso;
import Librerias.Funciones_Globales;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>CP_Contrato_Gastos_Moneda_Nacional_Aprobar</b><br>
 * Generated     : <b>2014/08/29 14:55:50</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  agosto 29, 2014
 * @author cpena
 */
public abstract class CP_Contrato_Gastos_Moneda_Nacional_AprobarHelper extends Librerias.Funciones_Globales
{
	/**
	 * htmlBrowser: with default state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : Firefox 17.0
	 * 		.processName : firefox.exe
	 */
	protected BrowserTestObject browser_htmlBrowser() 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"));
	}
	/**
	 * htmlBrowser: with specific test context and state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : Firefox 17.0
	 * 		.processName : firefox.exe
	 */
	protected BrowserTestObject browser_htmlBrowser(TestObject anchor, long flags) 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"), anchor, flags);
	}
	
	/**
	 * Aceptarsubmit: with default state.
	 *		.id : confirmarPopup:botonGrabarDistribucion
	 * 		.type : submit
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_aceptarsubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_aceptarsubmit"));
	}
	/**
	 * Aceptarsubmit: with specific test context and state.
	 *		.id : confirmarPopup:botonGrabarDistribucion
	 * 		.type : submit
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_aceptarsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_aceptarsubmit"), anchor, flags);
	}
	
	/**
	 * Aceptarsubmit: with default state.
	 *		.id : idDocPrincipal::msgDlg::cancel
	 * 		.type : submit
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_aceptarsubmit2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_aceptarsubmit2"));
	}
	/**
	 * Aceptarsubmit: with specific test context and state.
	 *		.id : idDocPrincipal::msgDlg::cancel
	 * 		.type : submit
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_aceptarsubmit2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_aceptarsubmit2"), anchor, flags);
	}
	
	/**
	 * Aprobarsubmit: with default state.
	 *		.id : idswvVisualizaCompromiso:idCmBtPrAprobars:idCmdBtAprobar
	 * 		.type : submit
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_aprobarsubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_aprobarsubmit"));
	}
	/**
	 * Aprobarsubmit: with specific test context and state.
	 *		.id : idswvVisualizaCompromiso:idCmBtPrAprobars:idCmdBtAprobar
	 * 		.type : submit
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_aprobarsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_aprobarsubmit"), anchor, flags);
	}
	
	/**
	 * Buscarsubmit: with default state.
	 *		.id : idPgTpl:comp_Boton_BuscarCompPresu:idCmbIrBuscar
	 * 		.type : submit
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_buscarsubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_buscarsubmit"));
	}
	/**
	 * Buscarsubmit: with specific test context and state.
	 *		.id : idPgTpl:comp_Boton_BuscarCompPresu:idCmbIrBuscar
	 * 		.type : submit
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_buscarsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_buscarsubmit"), anchor, flags);
	}
	
	/**
	 * BuscarCompromisoPresupuestario: with default state.
	 *		.title : Buscar Compromiso Presupuestario
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://192.168.203.10/sigfe/faces/task-flow-busqueda-compromiso/busquedaCompromi ...
	 */
	protected DocumentTestObject document_buscarCompromisoPresu() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_buscarCompromisoPresu"));
	}
	/**
	 * BuscarCompromisoPresupuestario: with specific test context and state.
	 *		.title : Buscar Compromiso Presupuestario
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://192.168.203.10/sigfe/faces/task-flow-busqueda-compromiso/busquedaCompromi ...
	 */
	protected DocumentTestObject document_buscarCompromisoPresu(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_buscarCompromisoPresu"), anchor, flags);
	}
	
	/**
	 * idDocPrincipal: with default state.
	 *		.id : idDocPrincipal
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_idDocPrincipal() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_idDocPrincipal"));
	}
	/**
	 * idDocPrincipal: with specific test context and state.
	 *		.id : idDocPrincipal
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_idDocPrincipal(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_idDocPrincipal"), anchor, flags);
	}
	
	/**
	 * idPgTplTResScroller: with default state.
	 *		.id : idPgTpl:tRes::scroller
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 5
	 */
	protected GuiTestObject html_idPgTplTResScroller() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_idPgTplTResScroller"));
	}
	/**
	 * idPgTplTResScroller: with specific test context and state.
	 *		.id : idPgTpl:tRes::scroller
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 5
	 */
	protected GuiTestObject html_idPgTplTResScroller(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_idPgTplTResScroller"), anchor, flags);
	}
	
	/**
	 * Compromiso: with default state.
	 *		.text : Compromiso
	 * 		.href : http://192.168.203.10/sigfe/faces/bienvenida?_adf.ctrl-state=qqsnktzua_14&_afrLo ...
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_compromiso() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_compromiso"));
	}
	/**
	 * Compromiso: with specific test context and state.
	 *		.text : Compromiso
	 * 		.href : http://192.168.203.10/sigfe/faces/bienvenida?_adf.ctrl-state=qqsnktzua_14&_afrLo ...
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_compromiso(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_compromiso"), anchor, flags);
	}
	
	/**
	 * IrABienvenida: with default state.
	 *		.text : noMostrar
	 * 		.id : idPgTpl:goBienvenida
	 * 		.href : http://192.168.203.10/sigfe/faces/task-flow-busqueda-compromiso/busquedaCompromi ...
	 * 		.title : Ir a Bienvenida!
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_irABienvenida() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_irABienvenida"));
	}
	/**
	 * IrABienvenida: with specific test context and state.
	 *		.text : noMostrar
	 * 		.id : idPgTpl:goBienvenida
	 * 		.href : http://192.168.203.10/sigfe/faces/task-flow-busqueda-compromiso/busquedaCompromi ...
	 * 		.title : Ir a Bienvenida!
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_irABienvenida(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_irABienvenida"), anchor, flags);
	}
	
	/**
	 * HtmlTable_0: with default state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_0() 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_0"));
	}
	/**
	 * HtmlTable_0: with specific test context and state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_0(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_0"), anchor, flags);
	}
	
	/**
	 * idPgTplJ_id30Menu: with default state.
	 *		.id : idPgTpl:j_id30::menu
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject table_idPgTplJ_id30Menu() 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_idPgTplJ_id30Menu"));
	}
	/**
	 * idPgTplJ_id30Menu: with specific test context and state.
	 *		.id : idPgTpl:j_id30::menu
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject table_idPgTplJ_id30Menu(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_idPgTplJ_id30Menu"), anchor, flags);
	}
	
	/**
	 * _841258: with default state.
	 *		.id : idPgTpl:idTransaccional::content
	 * 		.type : text
	 * 		.title : 841258
	 * 		.class : Html.INPUT.text
	 * 		.name : idPgTpl:idTransaccional
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text__841258() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text__841258"));
	}
	/**
	 * _841258: with specific test context and state.
	 *		.id : idPgTpl:idTransaccional::content
	 * 		.type : text
	 * 		.title : 841258
	 * 		.class : Html.INPUT.text
	 * 		.name : idPgTpl:idTransaccional
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text__841258(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text__841258"), anchor, flags);
	}
	
	/**
	 * Locate and return the verification point PV_FolioCompromiso_Contrato object in the SUT.
	 */
	protected IFtVerificationPoint PV_FolioCompromiso_ContratoVP() 
	{
		return vp("PV_FolioCompromiso_Contrato");
	}
	protected IFtVerificationPoint PV_FolioCompromiso_ContratoVP(TestObject anchor)
	{
		return vp("PV_FolioCompromiso_Contrato", anchor);
	}
	
	

	protected CP_Contrato_Gastos_Moneda_Nacional_AprobarHelper()
	{
		setScriptName("Modulos.Compromiso.CP_Contrato_Gastos_Moneda_Nacional_Aprobar");
	}
	
}

