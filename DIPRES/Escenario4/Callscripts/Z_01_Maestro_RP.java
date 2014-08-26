package Callscripts;
import resources.Callscripts.Z_01_Maestro_RPHelper;
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
public class Z_01_Maestro_RP extends Z_01_Maestro_RPHelper
{
	/**
	 * Script Name   : <b>Z_01_Maestro_RP</b>
	 * Generated     : <b>20/03/2014 16:38:24</b>
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
		 * 	 "CP_SIGFE2_107_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Datos Generales"						
		 */							
		 								
			String[] CASO156 = new String [1]; 		
			CASO156[0] = "SIGFE2_107_1_E4RP";				
			callScript("Script.RP_GENERICO_01",CASO156);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_108_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Agregar Combinación de Catálogos"						
		 */							
		 								
			String[] CASO157 = new String [1]; 		
			CASO157[0] = "SIGFE2_108_1_E4RP";				
			callScript("Script.RP_GENERICO_01",CASO157);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_109_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Agregar Insumos"						
		 */							
		 								
			String[] CASO158 = new String [1]; 		
			CASO158[0] = "SIGFE2_109_1_E4RP";				
			callScript("Script.RP_GENERICO_01",CASO158);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_110_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Agregar Conceptos Presupuestarios"						
		 */							
		 								
			String[] CASO159 = new String [1]; 		
			CASO159[0] = "SIGFE2_110_1_E4RP";				
			callScript("Script.RP_GENERICO_01",CASO159);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_111_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Guardar Digitado"						
		 */							
		 								
			String[] CASO160 = new String [1]; 		
			CASO160[0] = "SIGFE2_111_1_E4RP";				
			callScript("Script.RP_GENERICO_01",CASO160);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_112_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Generar"						
		 */							
		 								
			String[] CASO161 = new String [1]; 		
			CASO161[0] = "SIGFE2_112_1_E4RP";				
			callScript("Script.RP_GENERICO_01",CASO161);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_113_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Aprobar"						
		 */							
		 								
			String[] CASO162 = new String [1]; 		
			CASO162[0] = "SIGFE2_113_1_E4RP";				
			callScript("Script.RP_GENERICO_01",CASO162);			
	}
}

