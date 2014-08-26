package Callscripts;
import resources.Callscripts.Z_03_Maestro_DP_01Helper;
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
public class Z_03_Maestro_DP_01 extends Z_03_Maestro_DP_01Helper
{
	/**
	 * Script Name   : <b>Z_03_Maestro_DP_01</b>
	 * Generated     : <b>20/03/2014 16:40:57</b>
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
			 * 	 "CP_SIGFE2_132_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales"						
			 */							
			 								
				String[] CASO208 = new String [1]; 		
				CASO208[0] = "SIGFE2_132_2_E4DP";				
				callScript("Script.DP_GENERICO_03_01",CASO208);			
			 								
			 								
			/**							
			 * 	 "CP_SIGFE2_133_3_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Principal"						
			 */							
			 								
				String[] CASO209 = new String [1]; 		
				CASO209[0] = "SIGFE2_133_3_E4DP";				
				callScript("Script.DP_GENERICO_03_01",CASO209);			
			 								
			 								
			/**							
			 * 	 "CP_SIGFE2_134_3_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"						
			 */							
			 								
				String[] CASO210 = new String [1]; 		
				CASO210[0] = "SIGFE2_134_3_E4DP";				
				callScript("Script.DP_GENERICO_03_01",CASO210);			
			 								
			 								
			/**							
			 * 	 "CP_SIGFE2_135_3_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Completar Campos Variables"						
			 */							
			 								
				String[] CASO211 = new String [1]; 		
				CASO211[0] = "SIGFE2_135_3_E4DP";				
				callScript("Script.DP_GENERICO_03_01",CASO211);			
			 								
			 								
			/**							
			 * 	 "CP_SIGFE2_142_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales Factura Exenta"						
			 */							
			 								
				String[] CASO212 = new String [1]; 		
				CASO212[0] = "SIGFE2_142_1_E4DP";				
				callScript("Script.DP_GENERICO_03_01",CASO212);			
			 								
			 								
			/**							
			 * 	 "CP_SIGFE2_138_3_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
			 */							
			 								
				String[] CASO213 = new String [1]; 		
				CASO213[0] = "SIGFE2_138_3_E4DP";				
				callScript("Script.DP_GENERICO_03_01",CASO213);			
			 								
			 								
			/**							
			 * 	 "CP_SIGFE2_143_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Crear Factura Exenta"						
			 */							
			 								
				String[] CASO214 = new String [1]; 		
				CASO214[0] = "SIGFE2_143_1_E4DP";				
				callScript("Script.DP_GENERICO_03_01",CASO214);			
			 								
			 								
			/**							
			 * 	 "CP_SIGFE2_133_4_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Principal"						
			 */							
			 								
				String[] CASO215 = new String [1]; 		
				CASO215[0] = "SIGFE2_133_4_E4DP";				
				callScript("Script.DP_GENERICO_03_01",CASO215);			
			 								
			 								
			/**							
			 * 	 "CP_SIGFE2_134_4_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"						
			 */							
			 								
				String[] CASO216 = new String [1]; 		
				CASO216[0] = "SIGFE2_134_4_E4DP";				
				callScript("Script.DP_GENERICO_03_01",CASO216);			
			 								
			 								
			/**							
			 * 	 "CP_SIGFE2_135_4_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Completar Campos Variables"						
			 */							
			 								
				String[] CASO217 = new String [1]; 		
				CASO217[0] = "SIGFE2_135_4_E4DP";				
				callScript("Script.DP_GENERICO_03_01",CASO217);			
			 								
			 								
			/**							
			 * 	 "CP_SIGFE2_142_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales Factura Exenta"						
			 */							
			 								
				String[] CASO218 = new String [1]; 		
				CASO218[0] = "SIGFE2_142_2_E4DP";				
				callScript("Script.DP_GENERICO_03_01",CASO218);			
			 								
			 								
			/**							
			 * 	 "CP_SIGFE2_138_4_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
			 */							
			 								
				String[] CASO219 = new String [1]; 		
				CASO219[0] = "SIGFE2_138_4_E4DP";				
				callScript("Script.DP_GENERICO_03_01",CASO219);			
			 								
			 								
			/**							
			 * 	 "CP_SIGFE2_140_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Guardar Digitado"						
			 */							
			 								
				String[] CASO220 = new String [1]; 		
				CASO220[0] = "SIGFE2_140_2_E4DP";				
				callScript("Script.DP_GENERICO_03_01",CASO220);			
			 								
			 								
			/**							
			 * 	 "CP_SIGFE2_141_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Generar"						
			 */							
			 								
				String[] CASO221 = new String [1]; 		
				CASO221[0] = "SIGFE2_141_2_E4DP";				
				callScript("Script.DP_GENERICO_03_01",CASO221);	
			
	}
}

