package Callscripts;
import resources.Callscripts.Z_00_Maestro_E4Helper;
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
public class Z_00_Maestro_E4 extends Z_00_Maestro_E4Helper
{
	/**
	 * Script Name   : <b>Z_00_Maestro_E1</b>
	 * Generated     : <b>20/03/2014 16:37:25</b>
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
		
//		/**							
//		* 	 "CP_SIGFE2_107_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Datos Generales"						
//		*/							
//					
//		String[] CASO156 = new String [1]; 		
//		CASO156[0] = "SIGFE2_107_1_E4RP";				
//		callScript("Script.RP_GENERICO_01",CASO156);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_108_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Agregar Combinación de Catálogos"						
//		*/							
//					
//		String[] CASO157 = new String [1]; 		
//		CASO157[0] = "SIGFE2_108_1_E4RP";				
//		callScript("Script.RP_GENERICO_01",CASO157);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_109_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Agregar Insumos"						
//		*/							
//					
//		String[] CASO158 = new String [1]; 		
//		CASO158[0] = "SIGFE2_109_1_E4RP";				
//		callScript("Script.RP_GENERICO_01",CASO158);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_110_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Agregar Conceptos Presupuestarios"						
//		*/							
//					
//		String[] CASO159 = new String [1]; 		
//		CASO159[0] = "SIGFE2_110_1_E4RP";				
//		callScript("Script.RP_GENERICO_01",CASO159);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_111_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Guardar Digitado"						
//		*/							
//					
//		String[] CASO160 = new String [1]; 		
//		CASO160[0] = "SIGFE2_111_1_E4RP";				
//		callScript("Script.RP_GENERICO_01",CASO160);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_112_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Generar"						
//		*/							
//					
//		String[] CASO161 = new String [1]; 		
//		CASO161[0] = "SIGFE2_112_1_E4RP";				
//		callScript("Script.RP_GENERICO_01",CASO161);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_113_1_E4RP_FUN_Generar RP Gasto en Moneda Nacional con Insumos-Aprobar"						
//		*/							
//					
//		String[] CASO162 = new String [1]; 		
//		CASO162[0] = "SIGFE2_113_1_E4RP";				
//		callScript("Script.RP_GENERICO_01",CASO162);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_114_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Datos Generales"						
//		*/							
//					
//		String[] CASO163 = new String [1]; 		
//		CASO163[0] = "SIGFE2_114_1_E4CP";				
//		callScript("Script.CP_GENERICO_02",CASO163);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_115_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Buscar Requerimiento/ Compromiso"						
//		*/							
//					
//		String[] CASO164 = new String [1]; 		
//		CASO164[0] = "SIGFE2_115_1_E4CP";				
//		callScript("Script.CP_GENERICO_02",CASO164);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_116_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Datos Generales Documento de Negocio Contrato"						
//		*/							
//					
//		String[] CASO165 = new String [1]; 		
//		CASO165[0] = "SIGFE2_116_1_E4CP";				
//		callScript("Script.CP_GENERICO_02",CASO165);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_117_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Buscar Principal"						
//		*/							
//					
//		String[] CASO166 = new String [1]; 		
//		CASO166[0] = "SIGFE2_117_1_E4CP";				
//		callScript("Script.CP_GENERICO_02",CASO166);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_118_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
//		*/							
//					
//		String[] CASO167 = new String [1]; 		
//		CASO167[0] = "SIGFE2_118_1_E4CP";				
//		callScript("Script.CP_GENERICO_02",CASO167);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_118_2_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
//		*/							
//					
//		String[] CASO168 = new String [1]; 		
//		CASO168[0] = "SIGFE2_118_2_E4CP";				
//		callScript("Script.CP_GENERICO_02",CASO168);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_118_3_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
//		*/							
//					
//		String[] CASO169 = new String [1]; 		
//		CASO169[0] = "SIGFE2_118_3_E4CP";				
//		callScript("Script.CP_GENERICO_02",CASO169);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_119_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Agregar Fecha de Cumplimiento"						
//		*/							
//					
//		String[] CASO170 = new String [1]; 		
//		CASO170[0] = "SIGFE2_119_1_E4CP";				
//		callScript("Script.CP_GENERICO_02",CASO170);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_120_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Guardar Digitado"						
//		*/							
//					
//		String[] CASO171 = new String [1]; 		
//		CASO171[0] = "SIGFE2_120_1_E4CP";				
//		callScript("Script.CP_GENERICO_02",CASO171);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_121_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Generar"						
//		*/							
//					
//		String[] CASO172 = new String [1]; 		
//		CASO172[0] = "SIGFE2_121_1_E4CP";				
//		callScript("Script.CP_GENERICO_02",CASO172);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_122_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Aprobar"						
//		*/							
//					
//		String[] CASO173 = new String [1]; 		
//		CASO173[0] = "SIGFE2_122_1_E4CP";				
//		callScript("Script.CP_GENERICO_02",CASO173);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_123_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Datos Generales"						
//		*/							
//					
//		String[] CASO174 = new String [1]; 		
//		CASO174[0] = "SIGFE2_123_1_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO174);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_124_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"						
//		*/							
//					
//		String[] CASO175 = new String [1]; 		
//		CASO175[0] = "SIGFE2_124_1_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO175);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_125_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Datos Generales de la Orden de Compra "						
//		*/							
//					
//		String[] CASO176 = new String [1]; 		
//		CASO176[0] = "SIGFE2_125_1_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO176);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_126_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
//		*/							
//					
//		String[] CASO177 = new String [1]; 		
//		CASO177[0] = "SIGFE2_126_1_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO177);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_127_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Fecha de Cumplimiento"						
//		*/							
//					
//		String[] CASO178 = new String [1]; 		
//		CASO178[0] = "SIGFE2_127_1_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO178);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_128_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Crear Orden de Compra"						
//		*/							
//					
//		String[] CASO179 = new String [1]; 		
//		CASO179[0] = "SIGFE2_128_1_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO179);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_124_2_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"						
//		*/							
//					
//		String[] CASO180 = new String [1]; 		
//		CASO180[0] = "SIGFE2_124_2_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO180);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_125_2_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Datos Generales de la Orden de Compra "						
//		*/							
//					
//		String[] CASO181 = new String [1]; 		
//		CASO181[0] = "SIGFE2_125_2_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO181);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_126_2_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
//		*/							
//					
//		String[] CASO182 = new String [1]; 		
//		CASO182[0] = "SIGFE2_126_2_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO182);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_127_2_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Fecha de Cumplimiento"						
//		*/							
//					
//		String[] CASO183 = new String [1]; 		
//		CASO183[0] = "SIGFE2_127_2_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO183);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_128_2_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Crear Orden de Compra"						
//		*/							
//					
//		String[] CASO184 = new String [1]; 		
//		CASO184[0] = "SIGFE2_128_2_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO184);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_124_3_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"						
//		*/							
//					
//		String[] CASO185 = new String [1]; 		
//		CASO185[0] = "SIGFE2_124_3_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO185);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_125_3_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Datos Generales de la Orden de Compra "						
//		*/							
//					
//		String[] CASO186 = new String [1]; 		
//		CASO186[0] = "SIGFE2_125_3_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO186);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_126_3_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
//		*/							
//					
//		String[] CASO187 = new String [1]; 		
//		CASO187[0] = "SIGFE2_126_3_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO187);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_127_3_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Fecha de Cumplimiento"						
//		*/							
//					
//		String[] CASO188 = new String [1]; 		
//		CASO188[0] = "SIGFE2_127_3_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO188);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_129_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Guardar Digitado"						
//		*/							
//					
//		String[] CASO189 = new String [1]; 		
//		CASO189[0] = "SIGFE2_129_1_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO189);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_130_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Generar"						
//		*/							
//					
//		String[] CASO190 = new String [1]; 		
//		CASO190[0] = "SIGFE2_130_1_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO190);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_131_1_E4CP_FUN_Generar CP Orden de Compra Gasto en Moneda Nacional con Insumos-Aprobar"						
//		*/							
//					
//		String[] CASO191 = new String [1]; 		
//		CASO191[0] = "SIGFE2_131_1_E4CP";				
//		callScript("Script.CP_GENERICO_02_01",CASO191);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_132_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales"						
//		*/							
//					
//		String[] CASO192 = new String [1]; 		
//		CASO192[0] = "SIGFE2_132_1_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO192);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_133_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Principal"						
//		*/							
//					
//		String[] CASO193 = new String [1]; 		
//		CASO193[0] = "SIGFE2_133_1_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO193);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_134_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"						
//		*/							
//					
//		String[] CASO194 = new String [1]; 		
//		CASO194[0] = "SIGFE2_134_1_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO194);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_135_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Completar Campos Variables"						
//		*/							
//					
//		String[] CASO195 = new String [1]; 		
//		CASO195[0] = "SIGFE2_135_1_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO195);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_136_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales Factura Afecta sin Contabilidad de Impuestos"						
//		*/							
//					
//		String[] CASO196 = new String [1]; 		
//		CASO196[0] = "SIGFE2_136_1_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO196);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_137_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Ingresar Impuesto"						
//		*/							
//					
//		String[] CASO197 = new String [1]; 		
//		CASO197[0] = "SIGFE2_137_1_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO197);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_138_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
//		*/							
//					
//		String[] CASO198 = new String [1]; 		
//		CASO198[0] = "SIGFE2_138_1_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO198);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_139_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Crear Factura Afecta"						
//		*/							
//					
//		String[] CASO199 = new String [1]; 		
//		CASO199[0] = "SIGFE2_139_1_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO199);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_133_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Principal"						
//		*/							
//					
//		String[] CASO200 = new String [1]; 		
//		CASO200[0] = "SIGFE2_133_2_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO200);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_134_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"						
//		*/							
//					
//		String[] CASO201 = new String [1]; 		
//		CASO201[0] = "SIGFE2_134_2_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO201);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_135_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Completar Campos Variables"						
//		*/							
//					
//		String[] CASO202 = new String [1]; 		
//		CASO202[0] = "SIGFE2_135_2_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO202);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_136_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales Factura Afecta sin Contabilidad de Impuestos"						
//		*/							
//					
//		String[] CASO203 = new String [1]; 		
//		CASO203[0] = "SIGFE2_136_2_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO203);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_137_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Ingresar Impuesto"						
//		*/							
//					
//		String[] CASO204 = new String [1]; 		
//		CASO204[0] = "SIGFE2_137_2_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO204);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_138_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
//		*/							
//					
//		String[] CASO205 = new String [1]; 		
//		CASO205[0] = "SIGFE2_138_2_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO205);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_140_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Guardar Digitado"						
//		*/							
//					
//		String[] CASO206 = new String [1]; 		
//		CASO206[0] = "SIGFE2_140_1_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO206);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_141_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Generar"						
//		*/							
//					
//		String[] CASO207 = new String [1]; 		
//		CASO207[0] = "SIGFE2_141_1_E4DP";				
//		callScript("Script.DP_GENERICO_03",CASO207);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_132_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales"						
//		*/							
//					
//		String[] CASO208 = new String [1]; 		
//		CASO208[0] = "SIGFE2_132_2_E4DP";				
//		callScript("Script.DP_GENERICO_03_01",CASO208);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_133_3_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Principal"						
//		*/							
//					
//		String[] CASO209 = new String [1]; 		
//		CASO209[0] = "SIGFE2_133_3_E4DP";				
//		callScript("Script.DP_GENERICO_03_01",CASO209);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_134_3_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"						
//		*/							
//					
//		String[] CASO210 = new String [1]; 		
//		CASO210[0] = "SIGFE2_134_3_E4DP";				
//		callScript("Script.DP_GENERICO_03_01",CASO210);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_135_3_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Completar Campos Variables"						
//		*/							
//					
//		String[] CASO211 = new String [1]; 		
//		CASO211[0] = "SIGFE2_135_3_E4DP";				
//		callScript("Script.DP_GENERICO_03_01",CASO211);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_142_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales Factura Exenta"						
//		*/							
//					
//		String[] CASO212 = new String [1]; 		
//		CASO212[0] = "SIGFE2_142_1_E4DP";				
//		callScript("Script.DP_GENERICO_03_01",CASO212);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_138_3_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
//		*/							
//					
//		String[] CASO213 = new String [1]; 		
//		CASO213[0] = "SIGFE2_138_3_E4DP";				
//		callScript("Script.DP_GENERICO_03_01",CASO213);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_143_1_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Crear Factura Exenta"						
//		*/							
//					
//		String[] CASO214 = new String [1]; 		
//		CASO214[0] = "SIGFE2_143_1_E4DP";				
//		callScript("Script.DP_GENERICO_03_01",CASO214);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_133_4_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Principal"						
//		*/							
//					
//		String[] CASO215 = new String [1]; 		
//		CASO215[0] = "SIGFE2_133_4_E4DP";				
//		callScript("Script.DP_GENERICO_03_01",CASO215);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_134_4_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Buscar Requerimiento / Compromiso"						
//		*/							
//					
//		String[] CASO216 = new String [1]; 		
//		CASO216[0] = "SIGFE2_134_4_E4DP";				
//		callScript("Script.DP_GENERICO_03_01",CASO216);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_135_4_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Completar Campos Variables"						
//		*/							
//					
//		String[] CASO217 = new String [1]; 		
//		CASO217[0] = "SIGFE2_135_4_E4DP";				
//		callScript("Script.DP_GENERICO_03_01",CASO217);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_142_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Datos Generales Factura Exenta"						
//		*/							
//					
//		String[] CASO218 = new String [1]; 		
//		CASO218[0] = "SIGFE2_142_2_E4DP";				
//		callScript("Script.DP_GENERICO_03_01",CASO218);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_138_4_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
//		*/							
//					
//		String[] CASO219 = new String [1]; 		
//		CASO219[0] = "SIGFE2_138_4_E4DP";				
//		callScript("Script.DP_GENERICO_03_01",CASO219);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_140_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Guardar Digitado"						
//		*/							
//					
//		String[] CASO220 = new String [1]; 		
//		CASO220[0] = "SIGFE2_140_2_E4DP";				
//		callScript("Script.DP_GENERICO_03_01",CASO220);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_141_2_E4DP_FUN_Generar DP Gasto en Moneda Nacional con Insumos-Generar"						
//		*/							
//					
//		String[] CASO221 = new String [1]; 		
//		CASO221[0] = "SIGFE2_141_2_E4DP";				
//		callScript("Script.DP_GENERICO_03_01",CASO221);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_144_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Buscar Asiento Contable"						
//		*/							
//					
//		String[] CASO222 = new String [1]; 		
//		CASO222[0] = "SIGFE2_144_1_E4AC";				
//		callScript("Script.CO_GENERICO_04",CASO222);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_145_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Ingresar Datos"						
//		*/							
//					
//		String[] CASO223 = new String [1]; 		
//		CASO223[0] = "SIGFE2_145_1_E4AC";				
//		callScript("Script.CO_GENERICO_04",CASO223);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_146_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Modificar Auxiliar Financiero"						
//		*/							
//					
//		String[] CASO224 = new String [1]; 		
//		CASO224[0] = "SIGFE2_146_1_E4AC";				
//		callScript("Script.CO_GENERICO_04",CASO224);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_147_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Buscar Principal"						
//		*/							
//					
//		String[] CASO225 = new String [1]; 		
//		CASO225[0] = "SIGFE2_147_1_E4AC";				
//		callScript("Script.CO_GENERICO_04",CASO225);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_148_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Ingresar Conjunto de Datos"						
//		*/							
//					
//		String[] CASO226 = new String [1]; 		
//		CASO226[0] = "SIGFE2_148_1_E4AC";				
//		callScript("Script.CO_GENERICO_04",CASO226);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_146_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Modificar Auxiliar Financiero"						
//		*/							
//					
//		String[] CASO227 = new String [1]; 		
//		CASO227[0] = "SIGFE2_146_2_E4AC";				
//		callScript("Script.CO_GENERICO_04",CASO227);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_147_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Buscar Principal"						
//		*/							
//					
//		String[] CASO228 = new String [1]; 		
//		CASO228[0] = "SIGFE2_147_2_E4AC";				
//		callScript("Script.CO_GENERICO_04",CASO228);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_148_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Ingresar Conjunto de Datos"						
//		*/							
//					
//		String[] CASO229 = new String [1]; 		
//		CASO229[0] = "SIGFE2_148_2_E4AC";				
//		callScript("Script.CO_GENERICO_04",CASO229);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_149_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Generar"						
//		*/							
//					
//		String[] CASO230 = new String [1]; 		
//		CASO230[0] = "SIGFE2_149_1_E4AC";				
//		callScript("Script.CO_GENERICO_04",CASO230);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_150_1_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Aprobar"						
//		*/							
//					
//		String[] CASO231 = new String [1]; 		
//		CASO231[0] = "SIGFE2_150_1_E4AC";				
//		callScript("Script.CO_GENERICO_04",CASO231);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_144_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Buscar Asiento Contable"						
//		*/							
//					
//		String[] CASO232 = new String [1]; 		
//		CASO232[0] = "SIGFE2_144_2_E4AC";				
//		callScript("Script.CO_GENERICO_04_01",CASO232);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_145_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Ingresar Datos"						
//		*/							
//					
//		String[] CASO233 = new String [1]; 		
//		CASO233[0] = "SIGFE2_145_2_E4AC";				
//		callScript("Script.CO_GENERICO_04_01",CASO233);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_146_3_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Modificar Auxiliar Financiero"						
//		*/							
//					
//		String[] CASO234 = new String [1]; 		
//		CASO234[0] = "SIGFE2_146_3_E4AC";				
//		callScript("Script.CO_GENERICO_04_01",CASO234);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_147_3_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Buscar Principal"						
//		*/							
//					
//		String[] CASO235 = new String [1]; 		
//		CASO235[0] = "SIGFE2_147_3_E4AC";				
//		callScript("Script.CO_GENERICO_04_01",CASO235);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_148_3_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Ingresar Conjunto de Datos"						
//		*/							
//					
//		String[] CASO236 = new String [1]; 		
//		CASO236[0] = "SIGFE2_148_3_E4AC";				
//		callScript("Script.CO_GENERICO_04_01",CASO236);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_146_4_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Modificar Auxiliar Financiero"						
//		*/							
//					
//		String[] CASO237 = new String [1]; 		
//		CASO237[0] = "SIGFE2_146_4_E4AC";				
//		callScript("Script.CO_GENERICO_04_01",CASO237);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_147_4_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Buscar Principal"						
//		*/							
//					
//		String[] CASO238 = new String [1]; 		
//		CASO238[0] = "SIGFE2_147_4_E4AC";				
//		callScript("Script.CO_GENERICO_04_01",CASO238);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_148_4_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Ingresar Conjunto de Datos"						
//		*/							
//					
//		String[] CASO239 = new String [1]; 		
//		CASO239[0] = "SIGFE2_148_4_E4AC";				
//		callScript("Script.CO_GENERICO_04_01",CASO239);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_149_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Generar"						
//		*/							
//					
//		String[] CASO240 = new String [1]; 		
//		CASO240[0] = "SIGFE2_149_2_E4AC";				
//		callScript("Script.CO_GENERICO_04_01",CASO240);			
//					
//					
//		/**							
//		* 	 "CP_SIGFE2_150_2_E4AC_FUN_Completitud AC Gasto en Moneda Nacional con Insumos-Aprobar"						
//		*/							
//					
//		String[] CASO241 = new String [1]; 		
//		CASO241[0] = "SIGFE2_150_2_E4AC";				
//		callScript("Script.CO_GENERICO_04_01",CASO241);			
					
					
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

