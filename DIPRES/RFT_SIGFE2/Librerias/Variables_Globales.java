package Librerias;

import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.*;

import org.eclipse.hyades.execution.runtime.datapool.IDatapoolIterator;

import com.rational.test.ft.script.RationalTestScript;

/**
 * Description   : Super class for script helper
 * 
 * @author Leafar Maina
 * @since  junio 19, 2008
 */
public abstract class Variables_Globales extends RationalTestScript
{
		
	/**
	 * Variables Ambiente QA SIGFE2
	 **/
	public static String strServer   = ""; 
    public static String strPort     = "";
    public static String strDatabase = ""; 
    public static String strUserName = "";
    public static String strPassword = "";
    /************************************************************/
   
    
    /**
     * Variables Datos de Pruebas
     */
    /**Requerimiento**/
    public static IDatapoolIterator iDP_RP_CombCat;
    public static IDatapoolIterator iDP_RP_ConcPres;
    public static String sDP_RP_CombCat = "/Escenarios/E2/RP_CombinaCatalogos.rftdp";
    public static String sDP_RP_ConcPres = "/Escenarios/E2/RP_ConceptosPresupuestarios.rftdp";
    public static String sRP_ID = "";
    public static String sRP_CAT_ID = "";
    
    public static int iContador = 0;
    public static int iContador2 = 0;
    
    public static String sUsuario = "";
    public static String sCodEmpresa = "";
    public static Vector vtrLista				= new Vector ();
    public static boolean bRegistroEncontrado = false;
    public static String Indices = "9";
    public static String Monedas = "10";
    public Vector Cuenta = new Vector();
    public Vector Camara = new Vector();
    public static int iCantPagEsp = 0;
    public static int iCantPagEnc = 0;
	public static String sPaginas = "";
	public static String sPagIni = "";
	public int iPag = 1;
	public static boolean bPagMayor = false;
	public static boolean bPagCache = true;
	public static int iPagMed = 5;
	public static int iPagTot = 10;
	public static int iUltPag = 0;
	public static int iRegBloq = 100;
	public static int iUltBloq = 0;
	public static String sUrlApp = "http://192.168.0.99:9080/";
	public static String sUrlSitUsu = sUrlApp+"portalweb/Servicios/Portal/val_3_4_usuario.jsp";
	public static String sUrlSitDep = sUrlApp+"Servicios/Portal/val_3_1_1-1_deposito.jsp";
	public static boolean bScriptLogin = false;
	public static String sEtapa = "";
	public static boolean bExisteVentanaDialogo = false;
	public static int cnExisteVentanaDialogo = 0;
	public static String Mensaje_VentanaDialogo = "";
	public static int iSelCombo = 1;
	public static int iCantObjNotFound = 0;
    /************************************************************/
    
    /**
     * Log de pruebas 
     * */	
	public static String strNombreTC 			= ""; 
	public static String strNombreShell			= ""; 
	public static String strNombreShellSADER1	= "";
	public static String strCodigoTC 			= ""; 
	public static String strDatosGenerales  	= ""; 
	public static String strEncabezado 			= ""; 
	public static String strDatosdeOperacion	= ""; 
	public static String strValidaciones		= ""; 
	public static String strResumen				= ""; 
	public static String strResumenShell		= ""; 
	public static String strCombos				= "";
	public static String strLogs				= "";
	
	
	public static Vector strVP 					= new Vector ();
	public static Vector intResultadoVP			= new Vector (); 
	public static Vector strDescripcionVP 		= new Vector ();
	public static Vector Imagen 				= new Vector ();

	public static Vector strTC					= new Vector ();
	public static Vector strTCSH				= new Vector ();
	public static Vector intResultadoTC			= new Vector ();
	public static Vector intResultadoTCSH		= new Vector ();
	public static Vector strDescripcionTC		= new Vector ();
	
	
	public static int intContadorVP   = 0;
	public static int intContadorTC   = 0;
	public static int intContadorTCSH = 0;
	/************************************************************/
	
	
    /**
     * Variables Manejo de Scripts
     */
    public static RationalTestScript rtsScriptLlamador = null;
    
}
