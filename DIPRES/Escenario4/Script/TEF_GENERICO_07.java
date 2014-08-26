package Script;
import resources.Script.TEF_GENERICO_07Helper;
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
public class TEF_GENERICO_07 extends TEF_GENERICO_07Helper
{
	/**
	 * Script Name   : <b>TEF_GENERICO_07</b>
	 * Generated     : <b>09/04/2014 09:41:21</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/04/09
	 * @author cpena
	 */
	public void testMain(Object[] args) 
	{
		
		link_funcionalidadesComplement().click();
		table_idPgTplJ_id110Menu().click(atCell(
                                        atRow(atIndex(2)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id117Menu().click(atCell(
                                        atRow(atIndex(1)), 
                                        atColumn(atIndex(1))));
		
		link_idPgTplT10IdCmliLimpiarPE().click();
		sleep(2.0);
		list_seleccione().select("BANCO ESTADO");
		sleep(2.0);
		list_seleccione2().select("00009002189");
		sleep(2.0);
		button_buscarsubmit().click();
		sleep(2.0);
		button_generarsubmit().click();
		sleep(2.0);
		image_ampliarMostrar().click();
		sleep(2.0);

		list_seleccione3().click(atText("CONVENIO DE PROVEEDORES"));
		sleep(2.0);
		button_enviarsubmit().click();
		sleep(2.0);
		button_aceptarsubmit2().click();
		sleep(2.0);
		Captura();
		link_irABienvenida().click();
		sleep(5.0);
		
		link_funcionalidadesComplement().click();
		table_idPgTplJ_id110Menu2().click(atCell(
                                        atRow(atIndex(3)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id120Menu2().click(atCell(
                                        atRow(atIndex(1)), 
                                        atColumn(atIndex(1))));


		sleep(2.0);
		
		list_chequeAutomático().select("Cheque Manual");
		sleep(2.0);
		list_seleccione4().select("BANCO ESTADO");
		sleep(2.0);
		list_seleccione5().select("00009002189");
		sleep(2.0);
		button_buscarsubmit2().click();		
		sleep(2.0);
		button_emitirsubmit().click();
		sleep(2.0);
		button_aceptarsubmit3().click();
		sleep(2.0);
		Captura();
		sleep(5.0);
		link_irABienvenida3().click();
		sleep(5.0);
		
		link_funcionalidadesComplement().click();
		table_idPgTplJ_id110Menu2().click(atCell(
                                        atRow(atIndex(3)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id120Menu2().click(atCell(
                                        atRow(atIndex(1)), 
                                        atColumn(atIndex(1))));


		sleep(2.0);
		list_seleccione4().select("BANCO ESTADO");
		sleep(2.0);
		list_seleccione5().select("00009002189");
		sleep(2.0);
		button_buscarsubmit2().click();		
		sleep(2.0);
		button_emitirsubmit().click();
		sleep(2.0);
		button_aceptarsubmit3().click();
		sleep(2.0);
		Captura();
		sleep(5.0);
		link_irABienvenida3().click();
		sleep(5.0);
		
		
		
		
		
		
		link_funcionalidadesComplement().click();
		table_idPgTplJ_id110Menu2().click(atCell(
                                        atRow(atIndex(3)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id120Menu2().click(atCell(
                                        atRow(atIndex(1)), 
                                        atColumn(atIndex(1))));


		sleep(2.0);
		
		list_chequeAutomático().select("Cheque Manual");
		sleep(2.0);
		list_seleccione4().select("BANCO ESTADO");
		sleep(2.0);
		list_seleccione5().select("00009000488");
		sleep(2.0);
		button_buscarsubmit2().click();		
		sleep(2.0);
		button_emitirsubmit().click();
		sleep(2.0);
		button_aceptarsubmit3().click();
		sleep(2.0);
		Captura();
		sleep(5.0);
		link_irABienvenida3().click();
		sleep(5.0);
		
		link_funcionalidadesComplement().click();
		table_idPgTplJ_id110Menu2().click(atCell(
                                        atRow(atIndex(3)), 
                                        atColumn(atIndex(1))));
		table_idPgTplJ_id120Menu2().click(atCell(
                                        atRow(atIndex(1)), 
                                        atColumn(atIndex(1))));


		sleep(2.0);
		list_seleccione4().select("BANCO ESTADO");
		sleep(2.0);
		list_seleccione5().select("00009000488");
		sleep(2.0);
		button_buscarsubmit2().click();		
		sleep(2.0);
		button_emitirsubmit().click();
		sleep(2.0);
		button_aceptarsubmit3().click();
		sleep(2.0);
		Captura();
		sleep(5.0);
		link_irABienvenida3().click();
		sleep(5.0);
		
		
	}
}

