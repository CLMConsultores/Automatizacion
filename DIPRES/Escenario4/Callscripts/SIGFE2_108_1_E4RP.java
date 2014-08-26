package Callscripts;
import resources.Callscripts.SIGFE2_108_1_E4RPHelper;
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
 * @author C�sar Pe�a Catal�n
 */
public class SIGFE2_108_1_E4RP extends SIGFE2_108_1_E4RPHelper
{
	/**
	 * Script Name   : <b>SIGFE2_108_1_E4RP</b>
	 * Generated     : <b>20/03/2014 16:44:23</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/03/20
	 * @author C�sar Pe�a Catal�n
	 */
	public void testMain(Object[] args) 
	{
		/**							
		* 	 "CP_SIGFE2_108_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Agregar Combinaci�n de Cat�logos"						
		*/							
					
		String[] CASO157 = new String [1]; 		
		CASO157[0] = "SIGFE2_108_1_E4RP";				
		callScript("Script.RP_GENERICO_01",CASO157);	
	}
}

