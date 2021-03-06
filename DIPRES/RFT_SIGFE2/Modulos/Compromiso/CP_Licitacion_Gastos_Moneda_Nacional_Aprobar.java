package Modulos.Compromiso;
import resources.Modulos.Compromiso.CP_Licitacion_Gastos_Moneda_Nacional_AprobarHelper;
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
public class CP_Licitacion_Gastos_Moneda_Nacional_Aprobar extends CP_Licitacion_Gastos_Moneda_Nacional_AprobarHelper
{
	/**
	 * Script Name   : <b>CP_Licitacion_Gastos_Moneda_Nacional_Aprobar</b>
	 * Generated     : <b>29/08/2014 09:52:09</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2014/08/29
	 * @author Daniel Palma
	 */
	public void testMain(Object[] args) 
	{
		
		// Link Buscar Compromiso
		link_compromiso().click();
		table_idPgTplJ_id30Menu().click(atCell(
                                        atRow(atIndex(0)), 
                                        atColumn(atIndex(1))));
		
		// Ingresar ID Compromiso Licitación a Buscar
		text__841241().setText(dpString("CP_IDGenerado"));
		button_buscarsubmit().click();
		sleep(2.0);
		browser_htmlBrowser(document_buscarCompromisoPresu(),DEFAULT_FLAGS).inputKeys("{TAB 8}");
		sleep(2.0);
		browser_htmlBrowser(document_buscarCompromisoPresu(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		sleep(2.0);
		browser_htmlBrowser(document_buscarCompromisoPresu(),DEFAULT_FLAGS).inputKeys("{ExtPgDn}");
		sleep(2.0);
		
		// Aprobar Compromiso Licitacion
		button_aprobarsubmit().click();
		button_aceptarsubmit().click();
		table_htmlTable_0().performTest(CP_FolioVP());
		
		//Verificar CP Aprobado		
				if (table_htmlTable_0().performTest(CP_FolioVP()))
				{	
					String sCP_Folio = (String)table_htmlTable_0().getProperty(".text");	
					logPrintScreenInfo(sCP_Folio);
					sCP_Folio = String.valueOf(Integer.parseInt(sCP_Folio.replaceAll("[\\D]", ""))).toString();
					dpSetValue("CP_Folio", sCP_Folio);
				}
				else
					logPrintScreenError("No se ha aprobado satisfactoriamente el Compromiso Presupuestario.");
				button_aceptarsubmit2().click();
				link_irABienvenida().click();
			}
		
	}


