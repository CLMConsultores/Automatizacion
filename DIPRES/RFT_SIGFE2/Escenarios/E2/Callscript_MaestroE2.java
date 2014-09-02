package Escenarios.E2;
import resources.Escenarios.E2.Callscript_MaestroE2Helper;
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
 * @author Daniel Palma
 */
public class Callscript_MaestroE2 extends Callscript_MaestroE2Helper
{
	/**
	 * Script Name   : <b>Callscript_MaestroE2</b>
	 * Generated     : <b>29/08/2014 15:19:09</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/08/29
	 * @author Daniel Palma
	 */
	public void testMain(Object[] args) 
	{
		String[] CASO001 = new String [1]; 		
		CASO001[0] = "SIGFE2_001_1_E2RP";				
		callScript("Modulos.Requerimiento.RP_Multiple_Gastos_Moneda_Nacional_Generar",args,DP_ALL);
		
		String[] CASO002 = new String [1]; 		
		CASO002[0] = "SIGFE2_002_1_E2RP";				
		callScript("Modulos.Requerimiento.RP_Multiple_Gastos_Moneda_Nacional_Aprobar",args,DP_ALL);
		
//		String[] CASO003 = new String [1]; 		
//		CASO003[0] = "SIGFE2_003_1_E2CP";				
//		callScript("Modulos.Compromiso.CP_Licitacion_Gastos_Moneda_Nacional_Generar",CASO003);
//		
//		String[] CASO004 = new String [1]; 		
//		CASO004[0] = "SIGFE2_004_1_E2CP";				
//		callScript("Modulos.Compromiso.CP_Licitacion_Gastos_Moneda_Nacional_Aprobar",CASO004);
//		
//		String[] CASO005 = new String [1]; 		
//		CASO005[0] = "SIGFE2_005_1_E2CP";				
//		callScript("Modulos.Compromiso.CP_Contrato_Gastos_Moneda_Nacional_Generar",CASO005);
//		
//		String[] CASO006 = new String [1]; 		
//		CASO006[0] = "SIGFE2_006_1_E2CP";				
//		callScript("Modulos.Compromiso.CP_Contrato_Gastos_Moneda_Nacional_Aprobar",CASO006);
	}
}

