package Callscripts;
import resources.Callscripts.SIGFE2_116_1_E4CPHelper;
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
public class SIGFE2_116_1_E4CP extends SIGFE2_116_1_E4CPHelper
{
	/**
	 * Script Name   : <b>SIGFE2_116_1_E4CP</b>
	 * Generated     : <b>20/03/2014 16:46:19</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/03/20
	 * @author C�sar Pe�a Catal�n
	 */
	public void testMain(Object[] args) 
	{
		/**							
		* 	 "CP_SIGFE2_116_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Datos Generales Documento de Negocio Contrato"						
		*/							
					
		String[] CASO165 = new String [1]; 		
		CASO165[0] = "SIGFE2_116_1_E4CP";				
		callScript("Script.CP_GENERICO_02",CASO165);	
		}
}

