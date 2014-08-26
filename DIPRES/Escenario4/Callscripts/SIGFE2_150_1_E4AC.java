package Callscripts;
import resources.Callscripts.SIGFE2_150_1_E4ACHelper;
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
public class SIGFE2_150_1_E4AC extends SIGFE2_150_1_E4ACHelper
{
	/**
	 * Script Name   : <b>SIGFE2_150_1_E4AC</b>
	 * Generated     : <b>20/03/2014 16:56:06</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/03/20
	 * @author César Peña Catalán
	 */
	public void testMain(Object[] args) 
	{
		/**							
		* 	 "CP_SIGFE2_150_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Aprobar"						
		*/							
					
		String[] CASO231 = new String [1]; 		
		CASO231[0] = "SIGFE2_150_1_E4AC";				
		callScript("Script.CO_GENERICO_04",CASO231);	
		}
}

