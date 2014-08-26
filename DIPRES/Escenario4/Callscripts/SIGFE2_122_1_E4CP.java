package Callscripts;
import resources.Callscripts.SIGFE2_122_1_E4CPHelper;
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
 * @author César Peña Catalán
 */
public class SIGFE2_122_1_E4CP extends SIGFE2_122_1_E4CPHelper
{
	/**
	 * Script Name   : <b>SIGFE2_122_1_E4CP</b>
	 * Generated     : <b>20/03/2014 16:47:33</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/03/20
	 * @author César Peña Catalán
	 */
	public void testMain(Object[] args) 
	{
		/**							
		* 	 "CP_SIGFE2_122_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Aprobar"						
		*/							
					
		String[] CASO173 = new String [1]; 		
		CASO173[0] = "SIGFE2_122_1_E4CP";				
		callScript("Script.CP_GENERICO_02",CASO173);		
		}
}

