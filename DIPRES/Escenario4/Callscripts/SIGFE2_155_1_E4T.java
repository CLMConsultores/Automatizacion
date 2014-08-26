package Callscripts;
import resources.Callscripts.SIGFE2_155_1_E4THelper;
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
public class SIGFE2_155_1_E4T extends SIGFE2_155_1_E4THelper
{
	/**
	 * Script Name   : <b>SIGFE2_155_1_E4T</b>
	 * Generated     : <b>20/03/2014 16:58:28</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/03/20
	 * @author César Peña Catalán
	 */
	public void testMain(Object[] args) 
	{
		/**							
		* 	 "CP_SIGFE2_155_1_E4T_FUN_Pago a Terceros  Gastos presupuestarios con insumos-Ingresar Detalle de Pago Parcial"						
		*/							
					
		String[] CASO246 = new String [1]; 		
		CASO246[0] = "SIGFE2_155_1_E4T";				
		callScript("Script.PT_GENERICO_05",CASO246);	
	}
}

