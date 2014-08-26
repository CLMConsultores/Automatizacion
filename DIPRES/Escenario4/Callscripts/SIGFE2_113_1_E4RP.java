package Callscripts;
import resources.Callscripts.SIGFE2_113_1_E4RPHelper;
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
public class SIGFE2_113_1_E4RP extends SIGFE2_113_1_E4RPHelper
{
	/**
	 * Script Name   : <b>SIGFE2_113_1_E4RP</b>
	 * Generated     : <b>20/03/2014 16:45:50</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/03/20
	 * @author César Peña Catalán
	 */
	public void testMain(Object[] args) 
	{
		/**							
		* 	 "CP_SIGFE2_113_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Aprobar"						
		*/							
					
		String[] CASO162 = new String [1]; 		
		CASO162[0] = "SIGFE2_113_1_E4RP";				
		callScript("Script.RP_GENERICO_01",CASO162);	
		}
}

