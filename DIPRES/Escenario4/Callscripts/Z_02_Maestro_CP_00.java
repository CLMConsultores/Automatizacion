package Callscripts;
import resources.Callscripts.Z_02_Maestro_CP_00Helper;
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
public class Z_02_Maestro_CP_00 extends Z_02_Maestro_CP_00Helper
{
	/**
	 * Script Name   : <b>Z_02_Maestro_CP</b>
	 * Generated     : <b>20/03/2014 16:38:47</b>
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
		* 	 "CP_SIGFE2_114_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Datos Generales"						
		*/							
					
		String[] CASO163 = new String [1]; 		
		CASO163[0] = "SIGFE2_114_1_E4CP";				
		callScript("Script.CP_GENERICO_02",CASO163);			
					
					
		/**							
		* 	 "CP_SIGFE2_115_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Buscar Requerimiento/ Compromiso"						
		*/							
					
		String[] CASO164 = new String [1]; 		
		CASO164[0] = "SIGFE2_115_1_E4CP";				
		callScript("Script.CP_GENERICO_02",CASO164);			
					
					
		/**							
		* 	 "CP_SIGFE2_116_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Datos Generales Documento de Negocio Contrato"						
		*/							
					
		String[] CASO165 = new String [1]; 		
		CASO165[0] = "SIGFE2_116_1_E4CP";				
		callScript("Script.CP_GENERICO_02",CASO165);			
					
					
		/**							
		* 	 "CP_SIGFE2_117_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Buscar Principal"						
		*/							
					
		String[] CASO166 = new String [1]; 		
		CASO166[0] = "SIGFE2_117_1_E4CP";				
		callScript("Script.CP_GENERICO_02",CASO166);			
					
					
		/**							
		* 	 "CP_SIGFE2_118_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
		*/							
					
		String[] CASO167 = new String [1]; 		
		CASO167[0] = "SIGFE2_118_1_E4CP";				
		callScript("Script.CP_GENERICO_02",CASO167);			
					
					
		/**							
		* 	 "CP_SIGFE2_118_2_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
		*/							
					
		String[] CASO168 = new String [1]; 		
		CASO168[0] = "SIGFE2_118_2_E4CP";				
		callScript("Script.CP_GENERICO_02",CASO168);			
					
					
		/**							
		* 	 "CP_SIGFE2_118_3_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Agregar Montos Conceptos Presupuestarios"						
		*/							
					
		String[] CASO169 = new String [1]; 		
		CASO169[0] = "SIGFE2_118_3_E4CP";				
		callScript("Script.CP_GENERICO_02",CASO169);			
					
					
		/**							
		* 	 "CP_SIGFE2_119_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Agregar Fecha de Cumplimiento"						
		*/							
					
		String[] CASO170 = new String [1]; 		
		CASO170[0] = "SIGFE2_119_1_E4CP";				
		callScript("Script.CP_GENERICO_02",CASO170);			
					
					
		/**							
		* 	 "CP_SIGFE2_120_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Guardar Digitado"						
		*/							
					
		String[] CASO171 = new String [1]; 		
		CASO171[0] = "SIGFE2_120_1_E4CP";				
		callScript("Script.CP_GENERICO_02",CASO171);			
					
					
		/**							
		* 	 "CP_SIGFE2_121_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Generar"						
		*/							
					
		String[] CASO172 = new String [1]; 		
		CASO172[0] = "SIGFE2_121_1_E4CP";				
		callScript("Script.CP_GENERICO_02",CASO172);			
					
					
		/**							
		* 	 "CP_SIGFE2_122_1_E4CP_FUN_Generar CP Contrato Gasto en Moneda Nacional con Insumos-Aprobar"						
		*/							
					
		String[] CASO173 = new String [1]; 		
		CASO173[0] = "SIGFE2_122_1_E4CP";				
		callScript("Script.CP_GENERICO_02",CASO173);			
		
	}
}

