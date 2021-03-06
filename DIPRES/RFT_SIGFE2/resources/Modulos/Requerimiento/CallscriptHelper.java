// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.Modulos.Requerimiento;
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
 * Script Name   : <b>Callscript</b><br>
 * Generated     : <b>2014/08/26 12:57:20</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows XP x86 5.1 <br>
 * 
 * @since  agosto 26, 2014
 * @author cpena
 */
public abstract class CallscriptHelper extends Librerias.Funciones_Globales
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
	 * Cancelarsubmit: with default state.
	 *		.id : svwBuscarConceptoSM:idDialConBusq::cancel
	 * 		.type : submit
	 * 		.value : 
	 * 		.class : Html.BUTTON
	 * 		.title : 
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_cancelarsubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_cancelarsubmit"));
	}
	/**
	 * Cancelarsubmit: with specific test context and state.
	 *		.id : svwBuscarConceptoSM:idDialConBusq::cancel
	 * 		.type : submit
	 * 		.value : 
	 * 		.class : Html.BUTTON
	 * 		.title : 
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_cancelarsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_cancelarsubmit"), anchor, flags);
	}
	
	/**
	 * BienvenidASIGFE: with default state.
	 *		.title : Bienvenid@ a SIGFE
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://192.168.203.10/sigfe/faces/task-flow-requerimiento-multiprograma-registro ...
	 */
	protected DocumentTestObject document_bienvenidASIGFE() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_bienvenidASIGFE"));
	}
	/**
	 * BienvenidASIGFE: with specific test context and state.
	 *		.title : Bienvenid@ a SIGFE
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://192.168.203.10/sigfe/faces/task-flow-requerimiento-multiprograma-registro ...
	 */
	protected DocumentTestObject document_bienvenidASIGFE(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_bienvenidASIGFE"), anchor, flags);
	}
	
	/**
	 * Institucional: with default state.
	 *		.id : 
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_institucional() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_institucional"));
	}
	/**
	 * Institucional: with specific test context and state.
	 *		.id : 
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_institucional(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_institucional"), anchor, flags);
	}
	
	/**
	 * OtrasReparacionesYRemodelacionesEnViviendasYOficinasFisc: with default state.
	 *		.id : 
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_otrasReparacionesYRemode() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_otrasReparacionesYRemode"));
	}
	/**
	 * OtrasReparacionesYRemodelacionesEnViviendasYOficinasFisc: with specific test context and state.
	 *		.id : 
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_otrasReparacionesYRemode(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_otrasReparacionesYRemode"), anchor, flags);
	}
	
	/**
	 * P01ContraloríaGeneralDeLaRepública: with default state.
	 *		.id : 
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_p01ContraloríaGeneralDeL() 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_p01ContraloríaGeneralDeL"));
	}
	/**
	 * P01ContraloríaGeneralDeLaRepública: with specific test context and state.
	 *		.id : 
	 * 		.value : 
	 * 		.title : 
	 * 		.class : Html.LABEL
	 * 		.classIndex : 0
	 */
	protected GuiTestObject label_p01ContraloríaGeneralDeL(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("label_p01ContraloríaGeneralDeL"), anchor, flags);
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
	 * HtmlTable_0: with default state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_0_2() 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_0_2"));
	}
	/**
	 * HtmlTable_0: with specific test context and state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_0_2(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_0_2"), anchor, flags);
	}
	
	/**
	 * HtmlTable_0: with default state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_0_3() 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_0_3"));
	}
	/**
	 * HtmlTable_0: with specific test context and state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_0_3(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_0_3"), anchor, flags);
	}
	
	

	protected CallscriptHelper()
	{
		setScriptName("Modulos.Requerimiento.Callscript");
	}
	
}

