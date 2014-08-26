package LIB;

import java.awt.image.BufferedImage;

import javax.swing.JOptionPane;

import com.rational.test.ft.object.interfaces.DomainTestObject;
import com.rational.test.ft.object.interfaces.GuiTestObject;
import com.rational.test.ft.object.interfaces.TestObject;
import com.rational.test.ft.script.RationalTestScript;
import com.rational.test.ft.services.IPlaybackMonitor;


/**
 * Description   : Super class for script helper
 * 
 * @author cpena
 * @since  marzo 05, 2014
 */
public abstract class Libreria extends RationalTestScript
{

	
	
	/*********************
     * VARIABLES PUBLICAS
     *********************/

	
	
/**
 * 
 */
	
	public static int IDRP_GD;					// ID Guardar Digitado Requerimiento Presupuestario
	public static int IDRP_GEN;					// ID Generar Requerimiento Presupuestario
	public static int RP_FOLIO_APR;				// Nº de Folio Requerimiento Presupuestario
	public static int IDCP_GD;					// ID Guardar Digitado Compromiso Presupuestario
	public static int IDCP_GEN;					// ID Generar Compromiso Presupuestario
	public static int CP_FOLIO_APR;				// Nº de Folio Compromiso Presupuestario
	public static int IDCP2_GD;					// ID Guardar Digitado Compromiso Presupuestario 2
	public static int IDCP2_GEN;				// ID Generar Compromiso Presupuestario 2
	public static int CP2_FOLIO_APR;			// Nº de Folio Compromiso Presupuestario 2
	public static int IDDP1_GD;					// ID Guardar Digitado Devengo Presupuestario
	public static int IDDP1_GEN;				// ID Generar Devengo Presupuestario
	public static int IDDP2_GD;					// ID Guardar Digitado Devengo Presupuestario
	public static int IDDP2_GEN;				// ID Generar Devengo Presupuestario
	public static int IDAC1_GEN;				// ID Guardar Asiento Contable
	public static int AC1_FOLIO_APR;			//  Nº de Folio Asiento Contable
	public static int IDAC2_GEN;				// ID Guardar Asiento Contable 2
	public static int AC2_FOLIO_APR;			//  Nº de Folio Asiento Contable 2
	public static int IDTE_GD;					// ID Guardar Digitado Tesoreria
	public static int IDTE_GEN;					// ID Guardar Digitado Tesoreria
	public static int IDTE_FOLIO_APR;			// Nº de Folio Tesoreria

	
    /*********************
     * METODOS PUBLICOS
     *********************/  
	
	/** 
     * @author César Peña Catalán
     * Descripcion: Ingreso de registro a datapool, si no existe el nombre de la columna la crea
     * 	setDatapool(dpColumnName, dpvalue);
     * 	setDatapool(<NOMBRE DE LA COLUMNA>,<VALOR>);
     */
	
	public void datapoolValueSetting(String dpColumnName, int dpvalue) 
	{
		setDatapool(dpColumnName, dpvalue);
		storeDatapool();
	}
	
    /** 
     * @author César Peña Catalán
     * Descripcion: Cierra los exploradores que se encuentren abiertos
     */
	
	public void CerrarNavegadores(){
		// Find browser objects using the Rational Functional Tester find function and store into test object
		TestObject[] browsers = find(atChild(".class", "Html.HtmlBrowser"));
		
		if(browsers.length ==0){ 
			System.out.println("Found no Html.HtmlBrowser");
			return;	
		}
		// Close each browser object found, after casting it to a BrowserTestObject
		for (TestObject browser:browsers) {
		    ((com.rational.test.ft.object.interfaces.BrowserTestObject) browser).close();
		}
		// Unregister the test objects. 
		unregister(browsers);
	}

    /** 
     * @author César Peña Catalán
     * Descripcion: Metodo para el inicio de los scripts y borrado de la cache
     */
	
	public void Inicio()
	{
		CerrarNavegadores();
		cleanup();
		sleep(3.0);
		
	}
	
	
	public void Parar()
	{
		JOptionPane.showMessageDialog(null,"Detenido por Usuario");
		sleep(100.0);
	}

	public void Captura() 
	{
		BufferedImage Imagen = getRootTestObject().getScreenSnapshot();
		logInfo("Evidencia " , Imagen);
	}
	
	/** 
	 * Function: ClicLink
	 * Description: Se encarga de hacer clic a un enlace en específico dentro de la aplicacion
	 * @param sTexto (String)
	 * @author Leafar Maina
	 * Fecha: 03/09/2008
	 **/	
	public void ClicLink (String sTexto){
		DomainTestObject domains[] = getDomains();
		for (int i = 0; i < domains.length; ++i)
		{
			if (domains[i].getName().equals("Html"))
			{
				TestObject[] topObjects = domains[i].find(atDescendant(".class", "Html.A")); 
				if (topObjects != null)
				{
					try
					{
						for (int j = 0; j < topObjects.length; ++j)
						{
//						//System.out.println(topObjects[j].getProperty(".text").toString());
							if ( topObjects[j].getProperty(".text").toString().equals(sTexto))
							{	
								try
								{
									((GuiTestObject)topObjects[j]).click();
									sleep(1.0);
								}catch(com.rational.test.ft.UnsupportedActionException e){
//									((GuiTestObject)topObjects[j]).click();
									((GuiTestObject)((TestObject)getRootTestObject())).click();
									
									sleep(2.0);
								}
								break;
							}	
						}
					}
					finally
					{
						unregister(topObjects);
					}
				}
				else
				    logInfo("No hay enlace solicitado: " + sTexto);
			}
		}  	           
	}


}
