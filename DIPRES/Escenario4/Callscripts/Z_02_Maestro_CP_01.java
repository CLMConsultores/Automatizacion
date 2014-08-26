package Callscripts;
import resources.Callscripts.Z_02_Maestro_CP_01Helper;
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
public class Z_02_Maestro_CP_01 extends Z_02_Maestro_CP_01Helper
{
	/**
	 * Script Name   : <b>Z_02_Maestro_RP_01</b>
	 * Generated     : <b>20/03/2014 16:39:44</b>
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
		 * 	 "CP_SIGFE2_123_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Datos Generales"						
		 */							
		 								
			String[] CASO174 = new String [1]; 		
			CASO174[0] = "SIGFE2_123_1_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO174);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_124_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"						
		 */							
		 								
			String[] CASO175 = new String [1]; 		
			CASO175[0] = "SIGFE2_124_1_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO175);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_125_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Datos Generales de la Orden de Compra "						
		 */							
		 								
			String[] CASO176 = new String [1]; 		
			CASO176[0] = "SIGFE2_125_1_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO176);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_126_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
		 */							
		 								
			String[] CASO177 = new String [1]; 		
			CASO177[0] = "SIGFE2_126_1_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO177);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_127_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Fecha de Cumplimiento"						
		 */							
		 								
			String[] CASO178 = new String [1]; 		
			CASO178[0] = "SIGFE2_127_1_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO178);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_128_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Crear Orden de Compra"						
		 */							
		 								
			String[] CASO179 = new String [1]; 		
			CASO179[0] = "SIGFE2_128_1_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO179);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_124_2_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"						
		 */							
		 								
			String[] CASO180 = new String [1]; 		
			CASO180[0] = "SIGFE2_124_2_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO180);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_125_2_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Datos Generales de la Orden de Compra "						
		 */							
		 								
			String[] CASO181 = new String [1]; 		
			CASO181[0] = "SIGFE2_125_2_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO181);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_126_2_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
		 */							
		 								
			String[] CASO182 = new String [1]; 		
			CASO182[0] = "SIGFE2_126_2_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO182);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_127_2_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Fecha de Cumplimiento"						
		 */							
		 								
			String[] CASO183 = new String [1]; 		
			CASO183[0] = "SIGFE2_127_2_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO183);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_128_2_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Crear Orden de Compra"						
		 */							
		 								
			String[] CASO184 = new String [1]; 		
			CASO184[0] = "SIGFE2_128_2_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO184);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_124_3_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"						
		 */							
		 								
			String[] CASO185 = new String [1]; 		
			CASO185[0] = "SIGFE2_124_3_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO185);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_125_3_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Datos Generales de la Orden de Compra "						
		 */							
		 								
			String[] CASO186 = new String [1]; 		
			CASO186[0] = "SIGFE2_125_3_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO186);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_126_3_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
		 */							
		 								
			String[] CASO187 = new String [1]; 		
			CASO187[0] = "SIGFE2_126_3_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO187);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_127_3_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Fecha de Cumplimiento"						
		 */							
		 								
			String[] CASO188 = new String [1]; 		
			CASO188[0] = "SIGFE2_127_3_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO188);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_129_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Guardar Digitado"						
		 */							
		 								
			String[] CASO189 = new String [1]; 		
			CASO189[0] = "SIGFE2_129_1_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO189);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_130_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Generar"						
		 */							
		 								
			String[] CASO190 = new String [1]; 		
			CASO190[0] = "SIGFE2_130_1_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO190);			
		 								
		 								
		/**							
		 * 	 "CP_SIGFE2_131_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Aprobar"						
		 */							
		 								
			String[] CASO191 = new String [1]; 		
			CASO191[0] = "SIGFE2_131_1_E4CP";				
			callScript("Script.CP_GENERICO_02_01",CASO191);		
		
		
		
	}
}

