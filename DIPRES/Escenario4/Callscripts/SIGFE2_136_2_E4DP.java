package Callscripts;
import resources.Callscripts.SIGFE2_136_2_E4DPHelper;
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
public class SIGFE2_136_2_E4DP extends SIGFE2_136_2_E4DPHelper
{
	/**
	 * Script Name   : <b>SIGFE2_136_2_E4DP</b>
	 * Generated     : <b>20/03/2014 16:51:44</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/03/20
	 * @author C�sar Pe�a Catal�n
	 */
	public void testMain(Object[] args) 
	{
		/**							
		* 	 "CP_SIGFE2_136_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales Factura Afecta sin Contabilidad de Impuestos"						
		*/							
					
		String[] CASO203 = new String [1]; 		
		CASO203[0] = "SIGFE2_136_2_E4DP";				
		callScript("Script.DP_GENERICO_03",CASO203);	
		}
}

