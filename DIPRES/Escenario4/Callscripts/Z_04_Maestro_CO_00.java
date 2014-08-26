package Callscripts;
import resources.Callscripts.Z_04_Maestro_CO_00Helper;
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
public class Z_04_Maestro_CO_00 extends Z_04_Maestro_CO_00Helper
{
	/**
	 * Script Name   : <b>Z_04_Maestro_CO_00</b>
	 * Generated     : <b>20/03/2014 16:41:34</b>
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
		 * 	 "CP_SIGFE2_144_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Buscar Asiento Contable"						
		 */							
		 								
			String[] CASO222 = new String [1]; 		
			CASO222[0] = "SIGFE2_144_1_E4AC";				
			callScript("Script.CO_GENERICO_04",CASO222);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_145_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Ingresar Datos"						
		 */							
		 								
			String[] CASO223 = new String [1]; 		
			CASO223[0] = "SIGFE2_145_1_E4AC";				
			callScript("Script.CO_GENERICO_04",CASO223);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_146_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Modificar Auxiliar Financiero"						
		 */							
		 								
			String[] CASO224 = new String [1]; 		
			CASO224[0] = "SIGFE2_146_1_E4AC";				
			callScript("Script.CO_GENERICO_04",CASO224);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_147_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Buscar Principal"						
		 */							
		 								
			String[] CASO225 = new String [1]; 		
			CASO225[0] = "SIGFE2_147_1_E4AC";				
			callScript("Script.CO_GENERICO_04",CASO225);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_148_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Ingresar Conjunto de Datos"						
		 */							
		 								
			String[] CASO226 = new String [1]; 		
			CASO226[0] = "SIGFE2_148_1_E4AC";				
			callScript("Script.CO_GENERICO_04",CASO226);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_146_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Modificar Auxiliar Financiero"						
		 */							
		 								
			String[] CASO227 = new String [1]; 		
			CASO227[0] = "SIGFE2_146_2_E4AC";				
			callScript("Script.CO_GENERICO_04",CASO227);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_147_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Buscar Principal"						
		 */							
		 								
			String[] CASO228 = new String [1]; 		
			CASO228[0] = "SIGFE2_147_2_E4AC";				
			callScript("Script.CO_GENERICO_04",CASO228);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_148_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Ingresar Conjunto de Datos"						
		 */							
		 								
			String[] CASO229 = new String [1]; 		
			CASO229[0] = "SIGFE2_148_2_E4AC";				
			callScript("Script.CO_GENERICO_04",CASO229);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_149_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Generar"						
		 */							
		 								
			String[] CASO230 = new String [1]; 		
			CASO230[0] = "SIGFE2_149_1_E4AC";				
			callScript("Script.CO_GENERICO_04",CASO230);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_150_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Aprobar"						
		 */							
		 								
			String[] CASO231 = new String [1]; 		
			CASO231[0] = "SIGFE2_150_1_E4AC";				
			callScript("Script.CO_GENERICO_04",CASO231);			
	}
}

