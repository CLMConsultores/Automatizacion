package Modulos.Requerimiento;
import org.eclipse.hyades.execution.runtime.datapool.IDatapool;
import org.eclipse.hyades.execution.runtime.datapool.IDatapoolIterator;

import resources.Modulos.Requerimiento.CallscriptHelper;
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
 * @author cpena
 */
public class Callscript extends CallscriptHelper
{
	/**
	 * Script Name   : <b>Callscript</b>
	 * Generated     : <b>26/08/2014 11:13:23</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/08/26
	 * @author cpena
	 */
	public void testMain(Object[] args) 
	{
		/**							
		* 	 "Login Sigfe 2 - Escenario 4"						
		*/							
					
//		Sin Aplicaci�n
//		Otras Reparaciones y Remodelaciones en Viviendas y Oficinas Fiscales
//		Remodelaciones Divisi�n Toma de Raz�n y Registro
//		Remodelaci�n Subterraneo Edificio Teatinos N*56
//		Reemplazo de Ascensores Edificio Teatinos N*56
//		Dise�o y Construcci�n Sede Contralor�a Regional de Los R�os
//		Dise�o y Construcci�n Sede Contralor�a Regional de La Araucan�a
//		Remodelaci�n de Oficinas de la Fiscal�a y Tribunal de Cuentas
//		Dise�o y Construcci�n Sede Contralor�a Regional de Magallanes
//		Dise�o y Construcci�n Sede Contraloria Regional de Magallanes
//		Dise�o y Construcci�n Sede Contraloria Regional de Arica y Parina
		
//		ClicObjeto ("Sin Aplicaci�n", "Html.LABEL");
//		ClicObjeto ("Remodelaciones Divisi�n Toma de Raz�n y Registro", "Html.LABEL");
//		ClicObjeto ("Dise�o y Construcci�n Sede Contralor�a Regional de Los R�os", "Html.LABEL");
//		ClicObjeto ("Dise�o y Construcci�n Sede Contralor�a Regional de Magallanes", "Html.LABEL");
//		ClicObjeto (table_htmlTable_0_3(),"Sin Aplicaci�n", "Html.LABEL");
//		
//		ClicObjeto (table_htmlTable_0_2(),"Institucional", "Html.LABEL");
//		
//		ClicObjeto (table_htmlTable_0(),"P01-Contralor�a General de la Rep�blica", "Html.LABEL");
//		
		
//		ClicLink(".id","idPgTpl:itAgrps:0:cci1:clkAddConc");
//		
//		// HTML Browser
//		// Document: Bienvenid@ a SIGFE: http://192.168.203.10/sigfe/faces/task-flow-requerimiento-multiprograma-registro/registroRequerimientoMultiprograma?_adf.ctrl-state=qjeurnuy7_27
//		button_cancelarsubmit().click();
//		
//		ClicLink(".id","idPgTpl:itAgrps:1:cci1:clkAddConc");
//		button_cancelarsubmit().click();
//		ClicLink(".id","idPgTpl:itAgrps:2:cci1:clkAddConc");
//		button_cancelarsubmit().click();
		
		SecondDataPool();
		
		
		
		
		
	}
	
	public void SecondDataPool() {


		sRP_ID="1";
		
		iDP_RP_CombCat = InicializaDP(sDP_RP_CombCat);
		
		iContador = 1;
		while(iDP_RP_CombCat.dpString("RP_CAT_ID").equals(sRP_ID + iContador))
		{

		// Get a value from the second datapool, first record
			System.out.println(iDP_RP_CombCat.dpString("RP_CAT_ProgramaInterno"));
			iContador++;
			if (!iDP_RP_CombCat.dpDone()) 
				iDP_RP_CombCat.dpNext();
		}
	}
	
	
}

