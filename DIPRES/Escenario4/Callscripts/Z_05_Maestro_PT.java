package Callscripts;
import resources.Callscripts.Z_05_Maestro_PTHelper;
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
public class Z_05_Maestro_PT extends Z_05_Maestro_PTHelper
{
	/**
	 * Script Name   : <b>Z_05_Maestro_PT</b>
	 * Generated     : <b>20/03/2014 16:42:09</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/03/20
	 * @author César Peña Catalán
	 */
	public void testMain(Object[] args) 
	{
		/**							
		* 	 "Login Sigfe 2 - Escenario 4"						
		*/							
					
		String[] CASO001 = new String [1]; 		
		CASO001[0] = "SIGFE2_001_1_E4RP";				
		callScript("Script.RP_GENERICO_01",CASO001);
		
		/**							
		 * 	 "CP_SIGFE2_151_1_E4T_FUN_Pago a Terceros  Gastos presupuestarios con insumos-Datos Generales"						
		 */							
		 								
			String[] CASO242 = new String [1]; 		
			CASO242[0] = "SIGFE2_151_1_E4T";				
			callScript("Script.PT_GENERICO_05",CASO242);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_152_1_E4T_FUN_Pago a Terceros  Gastos presupuestarios con insumos-Agregar Documento por Pagar"						
		 */							
		 								
			String[] CASO243 = new String [1]; 		
			CASO243[0] = "SIGFE2_152_1_E4T";				
			callScript("Script.PT_GENERICO_05",CASO243);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_153_1_E4T_FUN_Pago a Terceros  Gastos presupuestarios con insumos-Ingresar Montos"						
		 */							
		 								
			String[] CASO244 = new String [1]; 		
			CASO244[0] = "SIGFE2_153_1_E4T";				
			callScript("Script.PT_GENERICO_05",CASO244);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_154_1_E4T_FUN_Pago a Terceros  Gastos presupuestarios con insumos-Ingresar Entidad Bancaria"						
		 */							
		 								
			String[] CASO245 = new String [1]; 		
			CASO245[0] = "SIGFE2_154_1_E4T";				
			callScript("Script.PT_GENERICO_05",CASO245);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_155_1_E4T_FUN_Pago a Terceros  Gastos presupuestarios con insumos-Ingresar Detalle de Pago Parcial"						
		 */							
		 								
			String[] CASO246 = new String [1]; 		
			CASO246[0] = "SIGFE2_155_1_E4T";				
			callScript("Script.PT_GENERICO_05",CASO246);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_156_1_E4T_FUN_Pago a Terceros  Gastos presupuestarios con insumos-Guardar Digitado"						
		 */							
		 								
			String[] CASO247 = new String [1]; 		
			CASO247[0] = "SIGFE2_156_1_E4T";				
			callScript("Script.PT_GENERICO_05",CASO247);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_157_1_E4T_FUN_Pago a Terceros  Gastos presupuestarios con insumos-Generar"						
		 */							
		 								
			String[] CASO248 = new String [1]; 		
			CASO248[0] = "SIGFE2_157_1_E4T";				
			callScript("Script.PT_GENERICO_05",CASO248);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_158_1_E4AC_FUN_Completitud AC Tesoreria  presupuestarios con insumos-Aprobar"						
		 */							
		 								
			String[] CASO249 = new String [1]; 		
			CASO249[0] = "SIGFE2_158_1_E4AC";				
			callScript("Script.PT_GENERICO_05",CASO249);			
		 								

		
	}
}

