package Callscripts;
import resources.Callscripts.SIGFE2_149_1_E4ACHelper;
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
public class SIGFE2_149_1_E4AC extends SIGFE2_149_1_E4ACHelper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>20/03/2014 16:55:50</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/03/20
	 * @author C�sar Pe�a Catal�n
	 */
	public void testMain(Object[] args) 
	{
		/**							
		* 	 "CP_SIGFE2_149_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Generar"						
		*/							
					
		String[] CASO230 = new String [1]; 		
		CASO230[0] = "SIGFE2_149_1_E4AC";				
		callScript("Script.CO_GENERICO_04",CASO230);
		}
}

