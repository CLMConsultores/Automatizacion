package Callscripts;
import resources.Callscripts.Z_04_Maestro_CO_01Helper;
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
public class Z_04_Maestro_CO_01 extends Z_04_Maestro_CO_01Helper
{
	/**
	 * Script Name   : <b>Z_04_Maestro_CO_01</b>
	 * Generated     : <b>20/03/2014 16:41:41</b>
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
		 * 	 "CP_SIGFE2_144_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Buscar Asiento Contable"						
		 */							
		 								
			String[] CASO232 = new String [1]; 		
			CASO232[0] = "SIGFE2_144_2_E4AC";				
			callScript("Script.CO_GENERICO_04_01",CASO232);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_145_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Ingresar Datos"						
		 */							
		 								
			String[] CASO233 = new String [1]; 		
			CASO233[0] = "SIGFE2_145_2_E4AC";				
			callScript("Script.CO_GENERICO_04_01",CASO233);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_146_3_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Modificar Auxiliar Financiero"						
		 */							
		 								
			String[] CASO234 = new String [1]; 		
			CASO234[0] = "SIGFE2_146_3_E4AC";				
			callScript("Script.CO_GENERICO_04_01",CASO234);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_147_3_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Buscar Principal"						
		 */							
		 								
			String[] CASO235 = new String [1]; 		
			CASO235[0] = "SIGFE2_147_3_E4AC";				
			callScript("Script.CO_GENERICO_04_01",CASO235);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_148_3_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Ingresar Conjunto de Datos"						
		 */							
		 								
			String[] CASO236 = new String [1]; 		
			CASO236[0] = "SIGFE2_148_3_E4AC";				
			callScript("Script.CO_GENERICO_04_01",CASO236);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_146_4_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Modificar Auxiliar Financiero"						
		 */							
		 								
			String[] CASO237 = new String [1]; 		
			CASO237[0] = "SIGFE2_146_4_E4AC";				
			callScript("Script.CO_GENERICO_04_01",CASO237);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_147_4_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Buscar Principal"						
		 */							
		 								
			String[] CASO238 = new String [1]; 		
			CASO238[0] = "SIGFE2_147_4_E4AC";				
			callScript("Script.CO_GENERICO_04_01",CASO238);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_148_4_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Ingresar Conjunto de Datos"						
		 */							
		 								
			String[] CASO239 = new String [1]; 		
			CASO239[0] = "SIGFE2_148_4_E4AC";				
			callScript("Script.CO_GENERICO_04_01",CASO239);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_149_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Generar"						
		 */							
		 								
			String[] CASO240 = new String [1]; 		
			CASO240[0] = "SIGFE2_149_2_E4AC";				
			callScript("Script.CO_GENERICO_04_01",CASO240);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_150_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Aprobar"						
		 */							
		 								
			String[] CASO241 = new String [1]; 		
			CASO241[0] = "SIGFE2_150_2_E4AC";				
			callScript("Script.CO_GENERICO_04_01",CASO241);			
	}
}

