package Callscripts;
import resources.Callscripts.Z_03_Maestro_DP_00Helper;
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
public class Z_03_Maestro_DP_00 extends Z_03_Maestro_DP_00Helper
{
	/**
	 * Script Name   : <b>Z_03_Maestro_DP</b>
	 * Generated     : <b>20/03/2014 16:40:39</b>
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
		 * 	 "CP_SIGFE2_132_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales"						
		 */							
		 								
			String[] CASO192 = new String [1]; 		
			CASO192[0] = "SIGFE2_132_1_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO192);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_133_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Principal"						
		 */							
		 								
			String[] CASO193 = new String [1]; 		
			CASO193[0] = "SIGFE2_133_1_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO193);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_134_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"						
		 */							
		 								
			String[] CASO194 = new String [1]; 		
			CASO194[0] = "SIGFE2_134_1_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO194);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_135_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Completar Campos Variables"						
		 */							
		 								
			String[] CASO195 = new String [1]; 		
			CASO195[0] = "SIGFE2_135_1_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO195);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_136_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales Factura Afecta sin Contabilidad de Impuestos"						
		 */							
		 								
			String[] CASO196 = new String [1]; 		
			CASO196[0] = "SIGFE2_136_1_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO196);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_137_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Ingresar Impuesto"						
		 */							
		 								
			String[] CASO197 = new String [1]; 		
			CASO197[0] = "SIGFE2_137_1_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO197);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_138_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
		 */							
		 								
			String[] CASO198 = new String [1]; 		
			CASO198[0] = "SIGFE2_138_1_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO198);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_139_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Crear Factura Afecta"						
		 */							
		 								
			String[] CASO199 = new String [1]; 		
			CASO199[0] = "SIGFE2_139_1_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO199);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_133_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Principal"						
		 */							
		 								
			String[] CASO200 = new String [1]; 		
			CASO200[0] = "SIGFE2_133_2_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO200);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_134_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"						
		 */							
		 								
			String[] CASO201 = new String [1]; 		
			CASO201[0] = "SIGFE2_134_2_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO201);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_135_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Completar Campos Variables"						
		 */							
		 								
			String[] CASO202 = new String [1]; 		
			CASO202[0] = "SIGFE2_135_2_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO202);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_136_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales Factura Afecta sin Contabilidad de Impuestos"						
		 */							
		 								
			String[] CASO203 = new String [1]; 		
			CASO203[0] = "SIGFE2_136_2_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO203);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_137_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Ingresar Impuesto"						
		 */							
		 								
			String[] CASO204 = new String [1]; 		
			CASO204[0] = "SIGFE2_137_2_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO204);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_138_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
		 */							
		 								
			String[] CASO205 = new String [1]; 		
			CASO205[0] = "SIGFE2_138_2_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO205);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_140_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Guardar Digitado"						
		 */							
		 								
			String[] CASO206 = new String [1]; 		
			CASO206[0] = "SIGFE2_140_1_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO206);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_141_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Generar"						
		 */							
		 								
			String[] CASO207 = new String [1]; 		
			CASO207[0] = "SIGFE2_141_1_E4DP";				
			callScript("Script.DP_GENERICO_03",CASO207);		
	}
}

