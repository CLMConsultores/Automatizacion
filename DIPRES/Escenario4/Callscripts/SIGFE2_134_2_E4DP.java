package Callscripts;
import resources.Callscripts.SIGFE2_134_2_E4DPHelper;
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
public class SIGFE2_134_2_E4DP extends SIGFE2_134_2_E4DPHelper
{
	/**
	 * Script Name   : <b>SIGFE2_134_2_E4DP</b>
	 * Generated     : <b>20/03/2014 16:51:27</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/03/20
	 * @author C�sar Pe�a Catal�n
	 */
	public void testMain(Object[] args) 
	{
		/**							
		* 	 "CP_SIGFE2_134_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"						
		*/							
					
		String[] CASO201 = new String [1]; 		
		CASO201[0] = "SIGFE2_134_2_E4DP";				
		callScript("Script.DP_GENERICO_03",CASO201);	
		}
}

