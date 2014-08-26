package Librerias;

import com.rational.test.ft.script.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.RationalTestScript;
import com.rational.test.ft.vp.*;
import java.awt.image.BufferedImage;
import java.sql.*;
import java.util.Properties;
import java.util.Vector;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Description   : Super class for script helper
 * 
 * @author Leafar Maina
 * @since  junio 19, 2008
 */
public abstract class Funciones_Globales extends Variables_Globales 
{	
	/**
	 * Function: FormatoFecha
	 * Description: Se encarga de convertir una fecha de entrada en el formato aceptado por la aplicacion SADE.
	 * @param sFecha (String)
	 * @return sFecha (String)
	 * @author Leafar Maina
	 * Fecha: 25/06/2008
	 **/
	public static String FormatoFecha(String sFecha){
		try{
			sFecha = sFecha.replace("-", "");
			sFecha = sFecha.substring(6, 8) + "/" + sFecha.substring(4, 6) + "/" + sFecha.substring(0, 4);
			return sFecha;
		}catch(Exception e){
//		ImprimeExcepcion(e, "Ocurrio un error en formato fecha.");	
//		//System.out.println("Ocurrió un error " + e.getMessage());
			return null;
		}
	}
	
	/**
	 * Function: FormatoFechaBD
	 * Description: Se encarga de convertir una fecha de entrada en el formato aceptado por BD SADE.
	 * @param sFecha (String)
	 * @return sFecha (String)
	 * @author Leafar Maina
	 * Fecha: 25/06/2008
	 **/
	public static String FormatoFechaBD(String sFecha){
		try{
			sFecha = sFecha.replaceAll("/", "");			
			sFecha = sFecha.substring(4, 8) + sFecha.substring(2, 4) + sFecha.substring(0, 2);			
			return sFecha;
		}catch(Exception e){
//			ImprimeExcepcion(e, "Ocurrio un error en formato fecha.");	
//		//System.out.println("Ocurrió un error " + e.getMessage());
			return null;
		}
	}
	
	/**
	 * Function: FormatoFechaBD
	 * Description: Se encarga de convertir una fecha de entrada en el formato aceptado por BD SADE.
	 * @param sFecha (String)
	 * @return sFecha (String)
	 * @author Leafar Maina
	 * Fecha: 25/06/2008
	 **/
	public static String FormatoFechaBD2(String sFecha){
		try{
			sFecha = sFecha.replaceAll("-", "");
			sFecha = sFecha.substring(4, 8) + sFecha.substring(2, 4) + sFecha.substring(0, 2);			
			return sFecha;
		}catch(Exception e){
//			ImprimeExcepcion(e, "Ocurrio un error en formato fecha");	
//		//System.out.println("Ocurrió un error " + e.getMessage());
			return null;
		}
	}
	
	/**
	 * Function: FormatoHora
	 * Description: Se encarga de convertir una hora de entrada (BD) en el formato aceptado por BD SADE.
	 * @param sHora (String)
	 * @return sHora (String)
	 * @author Leafar Maina
	 * Fecha: 01/07/2008
	 **/
	public static String FormatoHora(String sHora){
		try{
			sHora = sHora.substring(0, 2) + ":" + sHora.substring(2, 4);			
			return sHora;
		}catch(Exception e){
//			ImprimeExcepcion(e, "Ocurrio un error en formato hora");
//		//System.out.println("Ocurrió un error " + e.getMessage());
			return null;
		}
	}
	
	/**
	 * Function: FormatoHoraBD
	 * Description: Se encarga de convertir una hora de entrada (SADE) en el formato aceptado por BD SADE.
	 * @param sHora (String)
	 * @return sHora (String)
	 * @author Leafar Maina
	 * Fecha: 03/07/2008
	 **/
	public static String FormatoHoraBD(String sHora){
		try{
			sHora = sHora.replaceAll(":", "");		
			return sHora;
		}catch(Exception e){
			ImprimeExcepcion(e, "Ocurrio un error en formato hora");
//		//System.out.println("Ocurrió un error " + e.getMessage());
			return null;
		}
	}
	
	/**
	 * Function: FormatoValor
	 * Description: Se encarga de convertir un valor de entrada (BD) en el formato aceptado por Applicacion SADE.
	 * @param sValor (String)
	 * @param IdFormato (int)
	 * @return Valor (String)
	 * @author Leafar Maina
	 * Fecha: 11/07/2008
	 **/
	public static String FormatoValor(String sValor, int IdFormato){
		/**
		 * ID Formatos:
		 * 1 = ###,##0.0000
		 * 2 = ###0.0000
		 */
		try{
//		Valida si el Valor viene en blanco
		if (sValor.equals(""))
			return "";
		String formato = "";
		if (IdFormato == 1) formato = "###,##0.0000";
		if (IdFormato == 2) formato = "###0.0000";
		if (IdFormato == 3) formato = "#,##0.000000";
		if (IdFormato == 4) formato = "##########0.000000";
		else formato = "###,##0.0000";
		
//		Se crea la variable formateadora de números
		DecimalFormat myFormatter = new DecimalFormat(formato);
//		Se retorna el valor formateado
		return myFormatter.format(Double.valueOf(sValor).doubleValue());
		}
		catch(NullPointerException e){
			return "";			
		}
		catch (Exception e2){
			ImprimeExcepcion(e2, "Ocurrio un error en formato de numero");
//		//System.out.println("Ocurrió un error " + e2.getMessage());
			return null;			
		}
	}
	

	/**
	 * Function: PosLetraTilde
	 * Description: Se encarga de devolver la posicion de la letra que está tildada.
	 * @param sCadena (String)
	 * @return x (int)
	 * @author Leafar Maina
	 * Fecha: 25/06/2008
	 **/
	public static int PosLetraTilde(String sCadena){
		// Recorre toda la cadena
	    for (int x=0; x < sCadena.length();++x)
	    {
	        if (sCadena.substring(x, x+1).matches("[áéíóúÁÉÍÓÚ]")){
	        	if (x==0)
	        		return sCadena.length();
	        	else
	        		return x;	        
	        }
		}
	    return sCadena.length();
	}
	
	/**
	 * Function: ParamLetraTilde
	 * Description: Se encarga de formatear el parametro de Sentencia SQL con tilde.
	 * @param iPos (int)
	 * @param sCadena (String)
	 * @return (String)
	 * @author Leafar Maina
	 * Fecha: 25/06/2008
	 **/
	public static String ParamLetraTilde(int iPos, String sCadena){
		try{
		if (iPos == sCadena.length())
			return sCadena;
		else
			return sCadena.substring(0, iPos) + "%";
		}
		catch (Exception e){
			ImprimeExcepcion(e, "Ocurrio un error en parametro de Sentencia SQL");
//		//System.out.println("Ocurrio un error: " + e.getMessage());
			return "%";
		}
	}
	
	
	/**
	 * Function: logPrintScreenInfo
	 * Description: Se encarga de enviar mensaje de Informacion al Log con PrintScreen.
	 * @param Mensaje (String)
	 * @return 
	 * @author Leafar Maina
	 * Fecha: 30/06/2008
	 **/
	public void logPrintScreenInfo(String Mensaje)
    {
    	logInfo(Mensaje, getRootTestObject().getScreenSnapshot());
    }
	
	/**
	 * Function: logPrintScreenError
	 * Description: Se encarga de enviar mensaje de Error al Log con PrintScreen.
	 * @param Mensaje (String)
	 * @return 
	 * @author Leafar Maina
	 * Fecha: 30/06/2008
	 **/
    public void logPrintScreenError(String Mensaje)
    {
    	logError(Mensaje, getRootTestObject().getScreenSnapshot());
    }    
    
    /**
	 * Function: logPrintScreenObjError
	 * Description: Se encarga de enviar mensaje de Error al Log con PrintScreen del Objeto.
	 * @param Mensaje (String)
	 * @param ObjetoPrueba (GuiTestObject)
	 * @return 
	 * @author Leafar Maina
	 * Fecha: 11/07/2008
	 **/
    public void logPrintScreenObjError(String Mensaje, GuiTestObject  ObjetoPrueba)
    {
    	logError(Mensaje, ObjetoPrueba.getScreenSnapshot());
    }    
    
    /**
	 * Function: logPrintScreenWarning
	 * Description: Se encarga de enviar mensaje de Warning al Log con PrintScreen.
	 * @param Mensaje (String)
	 * @return 
	 * @author Leafar Maina
	 * Fecha: 30/06/2008
	 **/
    public void logPrintScreenWarning(String Mensaje)
    {
    	logWarning(Mensaje, getRootTestObject().getScreenSnapshot());
    }   
    
    /**
	 * Function: ObtenerValorProp
	 * Description: Se encarga de obtener el valor de una propiedad especifica de un objeto.
	 * @param ObjetoPrueba (GuiTestObject)
	 * @param sProp (String)
	 * @return Valor Propiedad (String)
	 * @author Leafar Maina
	 * Fecha: 1/07/2008
	 **/
    public static String ObtenerValorProp(GuiTestObject  ObjetoPrueba, String sProp){
    	try{
    		return ObjetoPrueba.getProperty(sProp).toString();
    	}catch(Exception e){
    		ImprimeExcepcion(e, "Ocurrio un error al obtener el valor de una propiedad especifica de un objeto.");
//		//System.out.println( "Ocurrio un error: " + e.getMessage());
//	        e.printStackTrace();
	        return "";
    	}
    }

	
	/**
	 * Function: DocumentarLog
	 * Description: 
	 * @param Mensaje (String)
	 * @param Descripcion (String)
	 * @param Resultado (Integer)
	 * @return 
	 * @author Daniel Tolosa
	 * Fecha: 
	 **/
	public void DocumentarLog(String Mensaje , String Descripcion, Integer Resultado)
    {
		intResultadoVP.addElement(Resultado);
		strDescripcionVP.addElement(Mensaje);
		strVP.addElement(Descripcion);     	
    	Imagen.addElement(""); 	
    	ImprimirResultados(Resultado.intValue());
    	intContadorVP++;
    }
	
	/**
	 * Function: DocumentarLog
	 * Description: 
	 * @param Mensaje (String)
	 * @param Descripcion (String)
	 * @param Resultado (Integer)
	 * @param ImagenCapturada (BufferedImage)
	 * @return 
	 * @author Daniel Tolosa
	 * Fecha: 
	 **/
    public void DocumentarLog(String Mensaje , String Descripcion, Integer Resultado, BufferedImage ImagenCapturada)
    {
    	intResultadoVP.addElement(Resultado);
		strDescripcionVP.addElement(Mensaje);
		strVP.addElement(Descripcion);    	
    	Imagen.addElement(ImagenCapturada);
    	ImprimirResultados(Resultado.intValue());
    	intContadorVP++;
    }
    
    /**
	 * Function: DocumentarLog
	 * Description: 
	 * @param Mensaje (String)
	 * @param Descripcion (String)
	 * @param Resultado (Integer)
	 * @return 
	 * @author Daniel Tolosa
	 * Fecha: 
	 **/
	public void DocumentarLog(String Descripcion, boolean Resultado)
    {
		int iResultado = 0;
    	if (!Resultado) iResultado = 1;    	
    	intResultadoVP.addElement(Integer.valueOf(iResultado));
		strDescripcionVP.addElement("");
		strVP.addElement(Descripcion);     	
    	Imagen.addElement(""); 
    	intContadorVP++;
    }
	
  	
    public void ResumenTC(String TC ,  Integer Resultado)
    {
    	intResultadoTC.addElement(Resultado);
		strTC.addElement(TC);
    	intContadorTC++;
    	
    	intResultadoTCSH.addElement(Resultado);
		strTCSH.addElement(TC);
    	intContadorTCSH++;
    	
    }
    
    
    public void ImprimirResultadosVP ()
    {
    try{
    	int intResultadoParcialTC = 0;
    	String ResultadoVP = "";
    	strValidaciones =Identificacion_Subtitulo ("Validaciones") ;
//    //System.out.println(strDescripcionVP.size());
//    //System.out.println(intContadorVP);
    	for (int i=0; i<=intContadorVP-1; i++)
    	{
//    	//System.out.println(Integer.valueOf(intResultadoVP.get(i).toString()).intValue());
			switch (Integer.valueOf(intResultadoVP.get(i).toString()).intValue())
			{
				case 0 : 	
//					logTestResult((String) strDescripcionVP.get(i),true);
					 ResultadoVP = Log_Fmt_PASADO("PASÓ");
					 break;
				case 1 : 	
//					logError((String) strDescripcionVP.get(i), (BufferedImage) Imagen.get(i));
					ResultadoVP = Log_Fmt_FALLO("FALLÓ");
					intResultadoParcialTC = 1;
					break;
				case 2 : 	
//					logWarning((String) strDescripcionVP.get(i));
					ResultadoVP = Log_Fmt_PENDIENTE("PENDIENTE");
					intResultadoParcialTC = 2;
				break;
				case 3 : 	
//					logError((String) strDescripcionVP.get(i), (BufferedImage) Imagen.get(i));
					ResultadoVP = Log_Fmt_FALLO("FALLÓ");
					intResultadoParcialTC = 3;
				break;
				default: break;
			}
			strValidaciones		=	strValidaciones + Identificacion_Linea_Simple(ResultadoVP, (String) strVP.get(i));	
    	}
		ResumenTC (strNombreTC,Integer.valueOf(intResultadoParcialTC));
    }
    catch(Exception e)
    	{
    	ImprimeExcepcion(e, "Ocurrio un error.");
//    	//System.out.println( "Ocurrio un error: " + e.getMessage());
//    		e.printStackTrace();
    	}
    }
    
    public void ImprimirResultadosTC()
    {
    try{
    	String ResultadoTC = "";
    	strResumen = Identificacion_Subtitulo ("Resumen Casos de Pruebas") ;
    	strResumenShell += Identificacion_Subtitulo ("Resumen Casos de Pruebas") ;
    	for (int i=0; i<=intContadorTC-1; i++)
    	{
			switch (Integer.valueOf(intResultadoTC.get(i).toString()).intValue())
			{
				case 0 : 	
					ResultadoTC = Log_Fmt_PASADO("PASÓ");
					break;
				case 1 :					
					ResultadoTC = Log_Fmt_FALLO("FALLÓ");
					break;
				case 2 : 	
					ResultadoTC = Log_Fmt_PENDIENTE("PENDIENTE");
					break;
				case 3 :
					ResultadoTC = Log_Fmt_FALLO("FALLÓ");
					break;
				default: break;
			}
			strResumen	+= Identificacion_Linea_Simple(ResultadoTC, (String) strTC.get(i));
			
			strResumenShell	+=	Identificacion_Linea_Simple(ResultadoTC, (String) strTC.get(i));
    	}
    	strResumen += Identificacion_Subtitulo ("");    	
    	strResumenShell += Identificacion_Subtitulo ("");

		intContadorTC=0;
    	}catch(Exception e){
    		ImprimeExcepcion(e, "Ocurrio un error.");
//    	//System.out.println( "Ocurrio un error: " + e.getMessage());
//    		e.printStackTrace();
    	}
    
    }
    
    public void ImprimirResultadosShell()
    {
    try{
    	String tempTC = "";   
    	int CPCor = 0, CPFal = 0, Esc = 0, EscCor = 0, EscFal = 0;
    	double Porcentaje = 0.0;
    	boolean EscStatus = true;
    	strResumenShell = Identificacion_Subtitulo ("Resumen Resultados Ejecución Casos de Pruebas") ;
    	for (int i=0; i<=intContadorTCSH-1; i++)
    	{			
    		if(!tempTC.equalsIgnoreCase((String) strTCSH.get(i))){
    			if (i>0){
    				if (EscStatus)
        				{EscCor++;}
        			else
        				{EscFal++;}
        			EscStatus = true;
        			tempTC = (String) strTCSH.get(i);
        			Esc++; 
    			}
    			else{
    				tempTC = (String) strTCSH.get(i);
        			Esc++;
    			}
   				
    		}
    		switch (Integer.valueOf(intResultadoTCSH.get(i).toString()).intValue())
			{
				case 0 : 	
					CPCor++; //ResultadoTC = Log_Fmt_PASADO("PASÓ");
//					EscStatus = true;
					break;
				case 1 :					
					CPFal++; //ResultadoTC = Log_Fmt_FALLO("FALLÓ");
					EscStatus = false;
					break;
				case 2 : 	
					CPCor++; //ResultadoTC = Log_Fmt_PENDIENTE("PENDIENTE");
//					EscStatus = true;
					break;
				case 3 :
					CPFal++; //ResultadoTC = Log_Fmt_FALLO("FALLÓ");
					EscStatus = false;
					break;
				default: break;
			}    		
    	}
    	if (EscStatus)
			EscCor++;
		else
			EscFal++;
    	
    	
    	strResumenShell	+=	Identificacion_Subtitulo("Escenarios de Prueba");
    	strResumenShell	+=	Identificacion_Linea_Simple("" + EscCor, "Escenarios Correctos:");
    	strResumenShell	+=	Identificacion_Linea_Simple("" + EscFal, "Escenarios Fallidos:");
    	strResumenShell	+=	Identificacion_Linea_Simple("" + Esc, "Total de Escenarios:");
    	strResumenShell	+=	Identificacion_Subtitulo("Casos de Prueba");
    	strResumenShell	+=	Identificacion_Linea_Simple("" + CPCor, "Casos de Prueba Correctos:");
    	strResumenShell	+=	Identificacion_Linea_Simple("" + CPFal, "Casos de Prueba Fallidos:");
    	strResumenShell	+=	Identificacion_Linea_Simple("" + (CPFal + CPCor), "Total de Casos de Prueba:");
    	strResumenShell	+=	Identificacion_Subtitulo("Porcentaje de Ejecución Correcta");
    	Porcentaje = (EscCor / (EscCor + EscFal)) * 100;
    	System.out.println("EscCor ="+EscCor+"  EscFal ="+EscFal);
    	strResumenShell	+=	Identificacion_Linea_Simple( "" + Porcentaje + "%", "Porcentaje de Escenarios:");  
    	Porcentaje = (CPCor / (CPCor + CPFal)) * 100;
    	System.out.println("CPCor ="+CPCor+"  CPFal ="+CPFal);
    	strResumenShell	+=	Identificacion_Linea_Simple( "" + Porcentaje + "%", "Porcentaje de Casos de Prueba:");
    	strResumenShell += Identificacion_Subtitulo ("");

		intContadorTC=0;
    	}catch(Exception e){
    		ImprimeExcepcion(e, "Ocurrio un error.");
//    	//System.out.println( "Ocurrio un error: " + e.getMessage());
//    		e.printStackTrace();
    	}
    }
    
    public void ImprimirResultados(int Resultado)
    {
	    try{
	    	switch (Resultado)
			{
				case 0 : 	
					logTestResult((String) strDescripcionVP.get(intContadorVP),true);
					break;
				case 1 : 	
					logError((String) strDescripcionVP.get(intContadorVP), (BufferedImage) Imagen.get(intContadorVP));
					break;
				case 2 : 	
					logWarning((String) strDescripcionVP.get(intContadorVP));
					break;
				case 3 :
					logError((String) strDescripcionVP.get(intContadorVP));
				default: break;
			}
	    }
	    catch(Exception e)
    	{
	    	ImprimeExcepcion(e, "Ocurrio un error al imprimir resultados .");
//    	//System.out.println( "Ocurrio un error: " + e.getMessage());
//    		e.printStackTrace();
    	}
    }
 
	public String Log_Fmt_PASADO (String log_Mensaje )
	{
		return "<font color=darkgreen>" + log_Mensaje + "</font>";
	}

	public String Log_Fmt_PENDIENTE (String log_Mensaje )
	{
		return "<font color=darkgoldenrod>" + log_Mensaje + "</font>";
	}

	public String Log_Fmt_FALLO (String log_Mensaje )
	{
		return "<font color=darkred>" + log_Mensaje + "</font>";
	}
	

	public String Identificacion_Subtitulo ( String Subtitulo )
    {
		return  "</ul><br>" + Subtitulo +"<ul>";
		
    }
	
	public String Identificacion_Pendiente (  )
	{
		return  "<br><br>"+ Log_Fmt_PENDIENTE( "<i>Caso Pendiente<ul></i><b>"  + rtsScriptLlamador.getScriptName() + "</b>" ) + "</ul>" ;
	}
	
	public String Identificacion_Final ( )
    {
        return "</ul><hr>Acciones: <ul><b>" + dpString("descripcion")           + "</b></ul>" +   
        "<hr>Resultado Esperado: <ul><b>"       + dpString("descripcion") + "</b></ul>" +
        "<hr>Comentario: <ul><b>"               + dpString("descripcion")         + "</b></ul>" +		
        "<hr></Font>";
    }	
	
	public static String Identificacion_Linea_Simple (String Campo, String Desc_Campo)
    {
        return "<li><i>" + Desc_Campo + "</i><b> " + Campo + "</b>";
    }	

	public String Identificacion_Linea_Compleja (String Campo,String Desc_Campo)
    {
        return "<li><i>" + Desc_Campo + "</i><ul><b>" + Campo + "</b></ul>";
    }	
	
	public String Identificacion_Linea_Multiple (String[] Campos)
    {
    	   String Titulo  = "<br><ul><table border=\"1\" style=\"font: 10pt\"><tr style=\"font: italic\">";
	       String Detalle = "<tr style=\"font-weight: bolder\">";
	       
	       for (int i = 0; i < Campos.length; i++) 
	       {
	           Titulo  += "<th>" + Campos [i] +"</th>";
	           Detalle += "<td>" + rtsScriptLlamador.dpString(Campos[i]) + "</td>";
	       }
	       Titulo  += "</i></tr>";
	       Detalle += "</tr></table></ul>"; 	       
	       return Titulo + Detalle ;
    } 	
	
		
	public static void ImprimeExcepcion(Exception e, String titulo){
		String sExcepcion = "";
    	int largo = e.getStackTrace().length;
    	StackTraceElement var [] = e.getStackTrace();
    	for (int i=0; i<largo;i++){
    		sExcepcion = sExcepcion+Identificacion_Linea_Simple (var[i].toString(),"");
    	}
    	sExcepcion = Identificacion_Linea_Simple (e.getMessage(),"") + sExcepcion;
    	logTestResult (titulo, false, sExcepcion);
	}
    
    public void CompararValorTabla (ITestDataTable Tabla,int intFila, int intColumna, String Baseline, String MensajeVP) 
    {    	
//    //System.out.println (Tabla.getCell(intFila,intColumna));
    	if (Tabla.getCell(intFila,intColumna)==null||!Tabla.getCell(intFila,intColumna).toString().equals(Baseline))
    		DocumentarLog(("Valor: " + Tabla.getCell(intFila,intColumna) + " no concuerda con el esperado: " + Baseline),MensajeVP , Integer.valueOf(3));
    	else
    		DocumentarLog("Valor Tabla concuerda con dato esperado: " + Baseline,MensajeVP , Integer.valueOf(0));
    }

    public void CompararValorHeader (ITestDataTable Tabla,int intColumna, String Baseline, String MensajeVP) 
    {	
//    //System.out.println (Tabla.getCell(0,intColumna));
    	if (Tabla.getCell(0,intColumna)==null||!Tabla.getCell(0,intColumna).toString().equals(Baseline))
    		DocumentarLog(("Valor: " + Tabla.getCell(0,intColumna) + " no concuerda con el esperado: " + Baseline),MensajeVP, Integer.valueOf(1), getRootTestObject().getScreenSnapshot());
    	else
    		DocumentarLog("Valor Tabla concuerda con dato esperado: " + Baseline,MensajeVP , Integer.valueOf(0));
    }
	
    
    public void LimpiaVariables(){
    	 
    	strDatosGenerales  	= ""; 
    	strEncabezado 		= ""; 
    	strDatosdeOperacion	= ""; 
    	strValidaciones		= ""; 
    	strResumen			= "";    	
    	
    	strVP 				= new Vector ();
    	intResultadoVP		= new Vector (); 
    	strDescripcionVP 	= new Vector ();
    	Imagen 				= new Vector ();
    	 	
    	intContadorVP 		= 0;
    }
	
    public void LimpiaVariablesTC(){	 
    	
    	strTC				= new Vector ();
    	intResultadoTC		= new Vector ();
    	strDescripcionTC	= new Vector ();
    	intContadorTC 		= 0;    	
    	
    }
    
public void LimpiaVariablesTCSH(){	 
    	
    	strTCSH				= new Vector ();
    	intResultadoTCSH	= new Vector ();
    	strDescripcionTC	= new Vector ();
    	intContadorTCSH 	= 0;    	
    	
    }
    
//    Obtener el valor de un ComboListBox
    public Vector ComboVector (GuiTestObject ObjetoPrueba){
    	try{
            Vector vtrLista = new Vector();
            ITestDataList ITDL = (ITestDataList)ObjetoPrueba.getTestData("list");
            ITestDataElementList elementos_lista = ITDL.getElements();
            ITestDataElement list_elem;
            int iElemCount = ITDL.getElementCount();
            for(int i = 0; i < iElemCount; i++){
            	list_elem = elementos_lista.getElement(i);
     //       //System.out.println(list_elem.getElement());
            	vtrLista.addElement(list_elem.getElement().toString());
            }
//          Retornar el Vector con la lista
            return vtrLista;
    	}
    	catch(Exception e){
    		ImprimeExcepcion(e, "Ocurrio un error.");
//		//System.out.println( "Ocurrio un error: " + e.getMessage());
//	        e.printStackTrace();
    		return null;
    	}
    }
    
//  Realiza un clic en elemeto de ComboListBox
    public void ClicCombo (SelectGuiSubitemTestObject ObjetoPrueba, String valor){
    	boolean bNoSeleccionado = true;
    	try{
           // Vector vtrLista = new Vector();
            ITestDataList ITDL = (ITestDataList)ObjetoPrueba.getTestData("list");
            ITestDataElementList elementos_lista = ITDL.getElements();
            ITestDataElement list_elem;
            int iElemCount = ITDL.getElementCount();
            for(int i = 0; i < iElemCount; i++){
            	list_elem = elementos_lista.getElement(i);
            	if (valor.equalsIgnoreCase(list_elem.getElement().toString())){
            		ObjetoPrueba.select(list_elem.getElement().toString());
            		bNoSeleccionado=false;
            		iSelCombo= iSelCombo * 1;
//            	//System.out.println(list_elem.getElement());
            //	vtrLista.addElement(list_elem.getElement().toString());
            	}
            }
//          Retornar el Vector con la lista
            //return vtrLista;
            if (bNoSeleccionado){
            	DocumentarLog("Ocurrio un error al seleccionar Combo Valor:"+ valor, false);
            	iSelCombo = iSelCombo * 0;
            }
    	}
    	catch(Exception e){
    		iSelCombo = iSelCombo * 0;
    		ImprimeExcepcion(e, "Ocurrio un excepción al intentar seleccionar Valor en Combo.");
//		//System.out.println( "Ocurrio un error: " + e.getMessage());
//	        e.printStackTrace();
    		//return null;
    	}
    }
    
    
	 /** realiza comparacion de 2 vectores de string, en tamaño, orden y contenido de los elementos*/
   public boolean ComparaListaVT (Vector vtrListaEsp, Vector vtrListaEnc, boolean bCualquiera){
	   strLogs = "";
	   	String sElemEsp = "", sElemEnc = "";
	   	int iLength = 0;
	   	boolean bResultado = true;
       
//	   	En caso de añadir el Cualquiera en la lista se evalua en esta condicion
	   	if(bCualquiera)
	   		vtrListaEsp.insertElementAt("Cualquiera", 0);            
       
       // se evaluan los largos de los arreglos
	   	if(vtrListaEsp.size() >= vtrListaEnc.size())
	   		iLength = vtrListaEsp.size();
	   	else
	   		iLength = vtrListaEnc.size();
       	       
	   	if (vtrListaEsp.size() != vtrListaEnc.size())
	   		bResultado = false;
       
       // si largo de arreglos son iguales, se compara elemento por elemento, en orden
       // (el primero del array1 con el primero del array2, el segundo con el segundo, asi sucesivamente)
	   	for (int i=0; i < iLength; i++){
//      	Si se terminan los elementos de las dos listas
	   		if(i >= vtrListaEsp.size())
	   			sElemEsp = "";
	   		else
	   			sElemEsp = vtrListaEsp.get(i).toString();
       	
	   		if(i >= vtrListaEnc.size())
	   			sElemEnc = "";
	   		else
	   			sElemEnc = vtrListaEnc.get(i).toString();
       	   		
//      	Comparar elemento de cada vector
	   		if(!sElemEsp.equals(sElemEnc)){
//	   		//System.out.println(sElemEsp + " <> " + sElemEnc);
	   		strLogs	=	strLogs + Identificacion_Linea_Simple (sElemEsp + " <> " + sElemEnc,"");
	   		   		
	   		}
//	   		else
//	   		//System.out.println(sElemEsp);            	
	   	}
	   	if (!bResultado)
	   		logTestResult ("Verificación de valores de lista desplegable", false, strLogs);
//     	Retorna el resultado de la comparación
	   	return bResultado;
   }
	
	
	
	/** 
	 * Function: onObjectNotFound
	 * Description: Se encarga de controlar las excepciones de objetos no encontrados en pantalla
	 * @param testObjectMethodState (ITestObjectMethodState)
	 * @author Leafar Maina
	 * Fecha: 03/09/2008
	 **/	
	public void onObjectNotFound(ITestObjectMethodState testObjectMethodState)
	{  
		iCantObjNotFound ++;
		boolean dismissedAWindow = false;
		DomainTestObject domains[] = getDomains();
		for (int i = 0; i < domains.length; ++i)
		{
	       if (domains[i].getName().equals("Html"))
	       {
	           // HTML domain is found.
	           TestObject[] topObjects = domains[i].getTopObjects();
	           if (topObjects != null)
	           {
	               try
	               {
	                   for (int j = 0; j < topObjects.length; ++j)
	                   {
	                       if (topObjects[j].getProperty(".class").equals("Html.Dialog"))
	                       {
	                           // A top-level HtmlDialog is found.
	                           logWarning("HtmlScript.onObjectNotFound - Ventana Inesperada.", ((TopLevelTestObject)topObjects[j]).getScreenSnapshot());
	                           try
	                           {
	                               dismissedAWindow = true;
	                               ((TopLevelTestObject)topObjects[j]).inputKeys("{enter}");
	                           }
	                           catch(RuntimeException e) {
	                        	   ImprimeExcepcion(e, "Ocurrio un error.");
	                           }
	                       }
	                   }
	               }
	               finally
	               {
	                   //unregister all references to top objects
	                   unregister(topObjects);
	               }
	           }	                       
	       }
		}
	   
		if (dismissedAWindow)
		{
	       logWarning("Se generó una exception en Script: " +getTopScript().getScriptName());	       
	       testObjectMethodState.findObjectAgain();
	   	}
		else{
			logWarning("Se generó una exception en Script: " +getTopScript().getScriptName());
			if (iCantObjNotFound <= 3)
				testObjectMethodState.findObjectAgain();
			else
				iCantObjNotFound = 0;
		}
	   
	}
	
	/** 
	 * Function: onUnhandledException
	 * Description: Se encarga de controlar las excepciones no manejadas durante la ejecucion
	 * @param arg0 (Throwable)
	 * @author Leafar Maina
	 * Fecha: 03/09/2008
	 **/	
	public boolean onUnhandledException(Throwable arg0) {
		DocumentarLog("Se ha producido un error no controlado: " + arg0.toString(), getTopScript().getScriptName(), Integer.valueOf(1), getRootTestObject().getScreenSnapshot());
		arg0.printStackTrace();
//		Detener en caso de presionar la tecla F11
		if (arg0.toString().contains("com.rational.test.ft.UserStoppedScriptError"))
			return false;	
		
		return true;
		
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
								((GuiTestObject)topObjects[j]).click();
								sleep(1.0);
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
	
	
	/** 
	 * Function: ClicLink
	 * Description: Se encarga de hacer clic a un enlace en específico dentro de otro objeto en la aplicacion
	 * @param sTexto (String)
	 * @author Leafar Maina
	 * Fecha: 26/08/2014
	 **/	
	public void ClicLink (GuiTestObject objObjetoPadre, String sPropiedad, String sTexto){
		
		TestObject[] topObjects = objObjetoPadre.find(atDescendant(".class", "Html.A")); 
		if (topObjects != null)
		{
			try
			{
				for (int j = 0; j < topObjects.length; ++j)
				{
//						//System.out.println(topObjects[j].getProperty(".text").toString());
					if ( topObjects[j].getProperty(sPropiedad).toString().equals(sTexto))
					{			
						((GuiTestObject)topObjects[j]).click();
						sleep(1.0);
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
	
	/** 
	 * Function: ClicObjeto
	 * Description: Se encarga de hacer clic a un objeto en específico dentro de la aplicacion
	 * @param sTexto (String)
	 * @author Leafar Maina
	 * Fecha: 03/09/2008
	 **/	
	public void ClicObjeto (String sTexto, String sTipoClass){
		DomainTestObject domains[] = getDomains();
		String sPropiedad = "";
		if (sTipoClass.equals("Html.IMG"))
			sPropiedad = ".src";
		else
			sPropiedad = ".text";
		
		for (int i = 0; i < domains.length; ++i)
		{
			if (domains[i].getName().equals("Html"))
			{
				TestObject[] topObjects = domains[i].find(atDescendant(".class", sTipoClass)); 
				if (topObjects != null)
				{
					try
					{
						for (int j = 0; j < topObjects.length; ++j)
						{
//						//System.out.println(topObjects[j].getProperty(".text").toString());
							if ( topObjects[j].getProperty(sPropiedad).toString().contains(sTexto))
							{			
								((GuiTestObject)topObjects[j]).click();
								sleep(1.0);
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
	
	/** 
	 * Function: ClicObjeto
	 * Description: Se encarga de hacer clic a un objeto en específico dentro de otro objeto en la aplicacion
	 * @param sTexto (String)
	 * @author Leafar Maina
	 * Fecha: 26/08/2014
	 **/	
	public void ClicObjeto (GuiTestObject objObjetoPadre, String sTexto, String sTipoClass){		
		String sPropiedad = "";
		if (sTipoClass.equals("Html.IMG"))
			sPropiedad = ".src";
		else
			sPropiedad = ".text";		
		
		TestObject[] topObjects = objObjetoPadre.find(atDescendant(".class", sTipoClass)); 
		if (topObjects != null)
		{
			try
			{
				for (int j = 0; j < topObjects.length; ++j)
				{
//						//System.out.println(topObjects[j].getProperty(".text").toString());
					if ( topObjects[j].getProperty(sPropiedad).toString().contains(sTexto))
					{			
						((GuiTestObject)topObjects[j]).click();
						sleep(1.0);
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

	/** 
	 * Function: ObtenerTabla
	 * Description: Se encarga de obtener una tabla hija específica dentro de una tabla madre
	 * @param TablaMadre(GuiTestObject)
	 * @param sIndex (String)
	 * @return topObjects[] (GuiTestObject)
	 * @author Leafar Maina
	 * Fecha: 03/09/2008
	 **/	
	public GuiTestObject ObtenerTabla (GuiTestObject TablaMadre, String sIndex){
		TestObject[] topObjects = TablaMadre.find(atChild(".class", "Html.TABLE")); 
		if (topObjects != null)
		{
			try
			{
				for (int j = 0; j < topObjects.length; ++j)
				{
//				//System.out.println(topObjects[j].getProperty(".text").toString());
					if ( topObjects[j].getProperty(".classIndex").toString().equals(sIndex))
					{			
						return (GuiTestObject)topObjects[j];
//						break;
					}	
				}
			}
			catch(Exception e){
				ImprimeExcepcion(e, "Ocurrio un error.");
			}
		}
		else
		    logInfo("No existe tabla solicitada: " + sIndex);
		return null;
	}
	
	
	/** 
	 * Function: ExisteTextoTabla
	 * Description: Se encarga de verificar la existencia de un texto dentro de una tabla
	 * @param TablaMadre(GuiTestObject)
	 * @param sIndex (String)
	 * @return True | False (boolean)
	 * @author Mauricio Arias
	 * Fecha: 03/09/2008
	 **/	
	public boolean ExisteTextoTabla (GuiTestObject TablaMadre, String sIndex){
		boolean bTexTab = false;
		TestObject[] topObjects = TablaMadre.find(atDescendant(".class", "Html.TABLE")); 
		if (topObjects != null)
		{
			try
			{
				for (int j = 0; j < topObjects.length; ++j)
				{
//				//System.out.println(topObjects[j].getProperty(".text").toString());
					if ( topObjects[j].getProperty(".text").toString().trim().equals(sIndex))
					{		
						bTexTab = true;
					}	
				}
			}
			catch(Exception e){
				ImprimeExcepcion(e, "Ocurrio un error.");
			}
		}

		return bTexTab;
	}
	
	/** 
	 * Function: IniciaAplicación
	 * Description: Se encarga de verificar si la aplicacion está iniciada, en caso contrario, levanta la aplicación
	 * @author Mauricio Arias
	 * Fecha: 08/09/2008
	 **/	
	public boolean IniciaAplicación (String sURL){
		boolean browserApp = false;
		int ilenght = 0, iCont = 0;
		DomainTestObject domains[] = getDomains();
		for (int i = 0; i < domains.length; ++i)
		{
			if (domains[i].getName().equals("Html"))
			{
				TestObject[] topObjects = domains[i].find(atDescendant(".class", "Html.HtmlBrowser")); 
				ilenght = ilenght + topObjects.length;
				if (topObjects != null)
				{
					try
					{
						for (int j = 0; j < topObjects.length; ++j)
						{
//							System.out.println(topObjects[j].getProperty(".documentName").toString());
							if ( topObjects[j].getProperty(".documentName").toString().equalsIgnoreCase(sURL))
							{			
								browserApp = true;
								iCont++;
							}								
						}
					}
					finally
					{
						unregister(topObjects);
					}
				}
			}
		} 
		if (!browserApp){
			sleep(3);
			CerrarBrowsers(sURL,iCont);
			sleep(3);
			startBrowser("Internet Explorer", "about:blank");			
		}
		else if (ilenght > 1 && browserApp){
			sleep(3);
			CerrarBrowsers(sURL,iCont);
		}
		return browserApp;
	}
	/** 
	 * Function: StadLoguin
	 * Description: Se encarga de verificar si la aplicacion tiene la sesion iniciada
	 * @return True | False (boolean)
	 * @author Mauricio Arias
	 * Fecha: 08/09/2008
	 **/	
	public boolean StadLoguin (){
		boolean bLoguin = true;
		DomainTestObject domains[] = getDomains();
		for (int i = 0; i < domains.length; ++i)
		{
			if (domains[i].getName().equals("Html"))
			{
				TestObject[] topObjects = domains[i].find(atDescendant(".class", "Html.HtmlBrowser")); 
				if (topObjects != null)
				{
					try
					{
						for (int j = 0; j < topObjects.length; ++j)
						{
//						//System.out.println(topObjects[j].getProperty(".documentName").toString());
							if ( topObjects[j].getProperty(".documentName").toString().endsWith("index.jsp"))
							{			
								bLoguin = false;
								break;
							}	
						}
					}catch(Exception e){
						ImprimeExcepcion(e, "Ocurrio un error al Verificar el Login.");
						bLoguin = false;
					}
					finally
					{
						unregister(topObjects);
					}
				}

			}
		} 
		return bLoguin;
	}
	
	/** 
	 * Function: StadEmpresa
	 * Description: Se encarga de verificar si la aplicacion tiene la empresa indicada
	 * @return True | False (boolean)
	 * @author Mauricio Arias
	 * Fecha: 08/10/2008
	 **/	
	public boolean StadEmpresa (){
		boolean bLoguin = true;
		DomainTestObject domains[] = getDomains();
		for (int i = 0; i < domains.length; ++i)
		{
			if (domains[i].getName().equals("Html"))
			{
//				TestObject[] topObjects = domains[i].find(atDescendant(".class", "Html.HtmlBrowser")); 
				TestObject[] topObjects = domains[i].find(atDescendant(".class", "Html.SELECT")); 
				if (topObjects != null)
				{
					try
					{
						for (int j = 0; j < topObjects.length; ++j)
						{
//						//System.out.println(topObjects[j].getProperty(".documentName").toString());
							if (topObjects[j].getProperty(".name").toString().contains("codEmpresa"))
							{			
								bLoguin = false;
								break;
							}	
						}
					}catch(Exception e){
						ImprimeExcepcion(e, "Ocurrio un error al Verificar la Empresa.");
						bLoguin = false;
					}
					finally
					{
						unregister(topObjects);
					}
				}

			}
		} 
		return bLoguin;
	}
	
	/** 
	 * Function: LoginCorrect
	 * Description: Se encarga de verificar si el usuario y empresa logueado corresponden al caso de prueba en ejecución
	 * @param sTexto1 (String)
	 * @param sTexto2 (String)
	 * @return True | False (boolean)
	 * @author Mauricio Arias
	 * Fecha: 08/09/2008
	 **/	
	public boolean LoginCorrect (String sTexto1, String sTexto2){
		boolean bVar1 = false, bVar2 = false;
		DomainTestObject domains[] = getDomains();
		for (int i = 0; i < domains.length; ++i)
		{
			try{				
			if (domains[i].getName().equals("Html"))
			{
				TestObject[] topObjects = domains[i].find(atDescendant(".class", "Html.INPUT.hidden")); 
				if (topObjects != null)
				{
					try
					{
						for (int j = 0; j < topObjects.length; ++j)
						{
//						//System.out.println(topObjects[j].getProperty(".value").toString());
							if ( topObjects[j].getProperty(".value").toString().contains(sTexto1))
							{			
								bVar1 = true;
							}
							if ( topObjects[j].getProperty(".value").toString().contains(sTexto2))
							{			
								bVar2 = true;
							}
						}
					}catch(Exception e){
						ImprimeExcepcion(e, "Ocurrio un error al Verificar el Login Usuario y Empresa.");
						bVar1 = false;
					}
					finally
					{
						unregister(topObjects);
					}
				}
				if (!bVar1 || !bVar2)	{		
					TestObject[] topObjects2 = domains[i].find(atDescendant(".class", "Html.HtmlBrowser")); 
					if (topObjects2 != null)
					{
						try
						{
							for (int j = 0; j < topObjects2.length; ++j)
							{
								((BrowserTestObject)topObjects2[j]).close();								
							}
						}catch (com.rational.test.ft.sys.InvokeTimeoutException e){
							ImprimeExcepcion(e, "Ocurrio un error al Cerrar el browser.");
							getRootTestObject().emitLowLevelEvent(keyDown("{ENTER}"));
						}
						catch(Exception e){
							ImprimeExcepcion(e, "Ocurrio un error al Cerrar el browser.");
							bVar1 = false;
						}
						finally
						{
							unregister(topObjects2);
						}
					}
				}

			}
			}catch(Exception e){
//				System.out.println(e.getMessage());
			}
		} 
		return (bVar1 & bVar2);
	}
	
	
	/** 
	 * Function: LoginCorrect
	 * Description: Se encarga de verificar si el usuario logueado corresponden al caso de prueba en ejecución
	 * @param sTexto1 (String)
	 * @return True | False (boolean)
	 * @author Mauricio Arias
	 * Fecha: 08/09/2008
	 **/	
	public boolean LoginCorrect (String sTexto1){
		boolean bVar1 = false;
		DomainTestObject domains[] = getDomains();
		for (int i = 0; i < domains.length; ++i)
		{
			try{
			if (domains[i].getName().equals("Html"))
			{
				TestObject[] topObjects = domains[i].find(atDescendant(".class", "Html.INPUT.text")); 
				if (topObjects != null)
				{
					try
					{
						for (int j = 0; j < topObjects.length; ++j)
						{
//						//System.out.println(topObjects[j].getProperty(".value").toString());
							if ( topObjects[j].getProperty(".value").toString().contains(sTexto1))
							{			
								bVar1 = true;
							}
						}
					}catch(Exception e){
						ImprimeExcepcion(e, "Ocurrio un error al Verificar el Login Usuario o Empresa.");
						bVar1 = false;
					}
					finally
					{
						unregister(topObjects);
					}
				}
				if (!bVar1)	{		
					TestObject[] topObjects2 = domains[i].find(atDescendant(".class", "Html.HtmlBrowser")); 
					if (topObjects2 != null)
					{
						try
						{
							for (int j = 0; j < topObjects2.length; ++j)
							{
								((BrowserTestObject)topObjects2[j]).close();								
							}
						}catch (com.rational.test.ft.sys.InvokeTimeoutException e){
							ImprimeExcepcion(e, "Ocurrio un error al Cerrar el browser.");
							getRootTestObject().emitLowLevelEvent(keyDown("{ENTER}"));
						}
						catch(Exception e){
							ImprimeExcepcion(e, "Ocurrio un error al Cerrar el browser.");
							bVar1 = false;
						}
						finally
						{
							unregister(topObjects2);
						}
					}
				}

			}
			}catch(Exception e){
//				System.out.println(e.getMessage());
			}
		} 
		   
			        
		return (bVar1);
	}
	
	/** 
	 * Function: ExisteVentanaDialogo
	 * Description: Se encarga de verificar si se ha desplegado alguna ventana de dialgogo.
	 * @return True | False (boolean)
	 * @author Gerardo Franco
	 * Fecha: 09/10/2008
	 **/
	public static boolean ExisteVentanaDialogo ( )
	{
		DomainTestObject domains[] = getDomains();
		bExisteVentanaDialogo = false;
		cnExisteVentanaDialogo = 0;

		for (int i = 0; i < domains.length; ++i)
		{
			if (domains[i].getName().equals("Html"))
			{
				TestObject[] topObjects = domains[i].find( atDescendant(".class", "Html.Dialog") );

				if (topObjects != null)
				{
					
					if ( topObjects.length > 0)
					{
						cnExisteVentanaDialogo = topObjects.length;
						bExisteVentanaDialogo  = true;
					}

					unregister(topObjects);
				}
			}
		}

		if ( domains != null )
		{
			unregister( domains );
		}

		return bExisteVentanaDialogo;
	}
	
	/** 
	 * Function: CerrarVentanaDialogo
	 * Description: Se encarga de cerrar ventanas de dialgogo.
	 * @author Gerardo Franco
	 * Fecha: 09/10/2008
	 **/
	public String CerrarVentanaDialogo ( )
	{
//		final RegularExpression TextRE = new RegularExpression(".*", false) ;
		
		DomainTestObject domains[] = getDomains();
		//int[] iBrowserPorCerrar = null; //new int[domains.length];
		//int iId = 0;

		boolean bSalto_linea = true;
		String Salto_Linea = "";
		String Cada_Linea = "";
		String Mensaje_Adicional = "";
		String Mensaje_VentanaDialogo = "";

		for (int i = 0; i < domains.length; ++i)
		{
			if (domains[i].getName().equals("Html"))
			{
				//TestObject[] topObjects = domains[i].getTopObjects();
				TestObject[] topObjects = domains[i].find( atDescendant(".class",  "Html.Dialog" ) ); //atDescendant(".class", ClassRE ) );
				if (topObjects != null)
				{
					try
					{
						for (int j = 0; j < topObjects.length; ++j)
						{
							try {
								((TopLevelTestObject)topObjects[j]).activate();							
								
								
								TestObject[] Mensajes_de_Error = ((TopLevelTestObject)topObjects[j]).find(atDescendant(".class", "Html.DialogStatic"));
								int cnMensajes_de_Error =  ( Mensajes_de_Error != null ? Mensajes_de_Error.length : 0 );

								Mensaje_Adicional += "<br>|";
								for ( int k = 0; k < cnMensajes_de_Error; ++k )
								{
									if (!Mensajes_de_Error[k].getProperty(".text").toString().equalsIgnoreCase(""))
									{
										Cada_Linea = Mensajes_de_Error[k].getProperty(".text").toString();
										Mensaje_VentanaDialogo +=  Salto_Linea + Cada_Linea ;
										Mensaje_Adicional +=  Cada_Linea ;

										if ( bSalto_linea )
										{
											Salto_Linea = "<br>";
											bSalto_linea = false;
										}
									}
								}
								Mensaje_Adicional += "|";
								((TopLevelTestObject)topObjects[j]).inputKeys("{enter}");
							}catch(Exception e){
								logWarning("Ventana inesperada no pudo ser localizada.",((TopLevelTestObject)topObjects[j]).getScreenSnapshot());
							}
							finally
							{
							}
						}
					}
					finally
					{
						unregister(topObjects);
					}
				}
			}
		}

		return Mensaje_Adicional;
	}
	
	/** 
	 * Function: CerrarVentanaDialogo
	 * Description: Se encarga de cerrar ventanas de dialgogo.
	 * @author Leafar Maina
	 * Fecha: 28/10/2008
	 **/
	public String CerrarVentanaDialogo (DomainTestObject dominioobjetos)
	{
//		final RegularExpression TextRE = new RegularExpression(".*", false) ;
		
//		DomainTestObject domains[] = getDomains();
		//int[] iBrowserPorCerrar = null; //new int[domains.length];
		//int iId = 0;

		boolean bSalto_linea = true;
		String Salto_Linea = "";
		String Cada_Linea = "";
		String Mensaje_Adicional = "";
		String Mensaje_VentanaDialogo = "";

//		for (int i = 0; i < domains.length; ++i)
//		{
//			if (domains[i].getName().equals("Html"))
//			{
				//TestObject[] topObjects = domains[i].getTopObjects();
		try
		{
				TestObject[] topObjects = dominioobjetos.find( atDescendant(".class",  "Html.Dialog" ) ); //atDescendant(".class", ClassRE ) );
				if (topObjects != null)
				{
					try
					{
						for (int j = 0; j < topObjects.length; ++j)
						{
							try {
								((TopLevelTestObject)topObjects[j]).activate();							
								
								
								TestObject[] Mensajes_de_Error = ((TopLevelTestObject)topObjects[j]).find(atDescendant(".class", "Html.DialogStatic"));
								int cnMensajes_de_Error =  ( Mensajes_de_Error != null ? Mensajes_de_Error.length : 0 );

								Mensaje_Adicional += "<br>|";
								for ( int k = 0; k < cnMensajes_de_Error; ++k )
								{
									if (!Mensajes_de_Error[k].getProperty(".text").toString().equalsIgnoreCase(""))
									{
										Cada_Linea = Mensajes_de_Error[k].getProperty(".text").toString();
										Mensaje_VentanaDialogo +=  Salto_Linea + Cada_Linea ;
										Mensaje_Adicional +=  Cada_Linea ;

										if ( bSalto_linea )
										{
											Salto_Linea = "<br>";
											bSalto_linea = false;
										}
									}
								}
								Mensaje_Adicional += "|";
								((TopLevelTestObject)topObjects[j]).inputKeys("{enter}");
							}catch(com.rational.test.ft.TargetGoneException e){
								logInfo("Ventana de dialogo html cerrada");
							}
							catch(Exception e){
								logWarning("Ventana inesperada no pudo ser localizada.",((TopLevelTestObject)topObjects[j]).getScreenSnapshot());
								((TopLevelTestObject)dominioobjetos.getMappableParent()).inputKeys("{enter}");
							}
							finally
							{
							}
						}
					}
					finally
					{
						unregister(topObjects);
					}
				}
		
			}catch(Exception e){
				logWarning(e.getMessage());
			}
//		}

		return Mensaje_Adicional;
	}
	
	/** 
	 * Function: CerrarBrowsers
	 * Description: Se encarga de cerrar ventanas de Browser.
	 * @author Gerardo Franco
	 * Fecha: 09/10/2008
	 **/
	public void CerrarBrowsers (String sURL, int iCont )
	{
		// final RegularExpression ClassRE = new RegularExpression("[Html.HtmlBrowser|Html.Dialog]", false) ;

		//String Mensaje_Adicional = "<ul>";
		String Browsers_Cerrados = "", Titulo_Browsers = "";

		if ( ExisteVentanaDialogo() )
		{
			Browsers_Cerrados = "<br><br>" + cnExisteVentanaDialogo + " Ventanas de Dialogo Cerradas <br>" + CerrarVentanaDialogo();
		}
		if ( cnExisteVentanaDialogo > 0 )
		{
			Browsers_Cerrados += "<br><hr>";
		}

		DomainTestObject domains[] = getDomains();
//		int[][] iBrowserPorCerrar = new int[100][100]; //new int[domains.length];
		int iId = 0;

		for (int i = 0; i < domains.length; ++i)
		{
			if (domains[i].getName().equals("Html"))
			{				
				TestObject[] topObjects = domains[i].find( atChild(".class", "Html.HtmlBrowser" ) ); //atDescendant(".class", ClassRE ) );
				if (topObjects != null)
				{
					try
					{
						for (int j = 0; j < topObjects.length; ++j)
						{
							if ( iId <100  )
							{
								if (!topObjects[j].getProperty(".documentName").toString().equalsIgnoreCase(sURL) ||							
									(topObjects[j].getProperty(".documentName").toString().equalsIgnoreCase(sURL) && iCont > 1))
								{				
									if (topObjects[j].getProperty(".documentName").toString().equalsIgnoreCase(sURL) )
										iCont--;
									((BrowserTestObject)topObjects[j]).activate();
									sleep(0.5);
									try {
										Titulo_Browsers+="<br>" + topObjects[j].getProperty(".documentName") ;
									} catch (Exception e) {
										Titulo_Browsers+="<br> SIN NOMBRE BROWSER" ;
									}
									((BrowserTestObject)topObjects[j]).close();
									iId++;
								}
								else
									((BrowserTestObject)topObjects[j]).maximize();
							}
						}
					}catch (com.rational.test.ft.sys.InvokeTimeoutException e1){
						Browsers_Cerrados += "<br> Error en CerrarBrowsers <br>"+   e1.toString();
						getRootTestObject().emitLowLevelEvent(keyDown("{ENTER}"));
					}
					catch (Exception e) {
						Browsers_Cerrados+="<br> Error en CerrarBrowsers <br>"+   e.toString();
					}
					finally
					{
						unregister(topObjects);
					}
				}
			}
		}

		// Cerrando Browser
		if (iId > 0)
		{			
			Browsers_Cerrados += Titulo_Browsers;
			Browsers_Cerrados += "<br><br>" + iId + " Browsers Cerrados <br>";
		}
		if (iId > 0 || cnExisteVentanaDialogo > 0 )
		{
			logTestResult( "Cerrando Browsers ", true, Browsers_Cerrados + "<br><hr>" );
		}
	}
	
	/** 
	 * Function: MensajeDialogo
	 * Description: Se encarga de verificar que se despliegue dialogo con el mensaje definido.
	 * @author Mauricio Arias
	 * Fecha: 23/10/2008
	 **/
	public void MensajeDialogo (String mensaje, String campo )
	{
		DomainTestObject domains[] = getDomains();
		boolean bTextoCorrecto = false;
		String fmsg="";
		if (ExisteVentanaDialogo()){
			
			for (int i = 0; i < domains.length; ++i)
			{
				if (domains[i].getName().equals("Html"))
				{
					TestObject[] topObjects = domains[i].find( atDescendant(".class", "Html.DialogStatic") );
	
					if (topObjects != null)
					{
						try
						{
							for (int j = 0; j < topObjects.length; ++j)
							{
	//						//System.out.println(topObjects[j].getProperty(".documentName").toString());
								fmsg=topObjects[j].getProperty(".text").toString();
								if (fmsg.contains(mensaje))
								{			
									bTextoCorrecto = true;
									break;
								}	
							}
						}
						finally
						{
							unregister(topObjects);
						}
					}
				}
			}
	
			if ( domains != null )
			{
				unregister( domains );
			}
		}else
			ClicLink("Volver");
		if (!bTextoCorrecto){
			DocumentarLog("No se despliega mensaje esperado al validar campo: "+campo+".<br>  Mensaje desplegado : "+fmsg, "Verificar que se despliega mensaje al validar campo: "+campo, Integer.valueOf(3));
		}
		else{
			DocumentarLog(mensaje, "Verificar que se despliega mensaje al validar campo: "+campo, Integer.valueOf(0));	
		}
	}
	
	/** 
	 * Function: MensajeDialogoCB
	 * Description: Se encarga de verificar que se despliegue dialogo con el mensaje definido.
	 * @author Mauricio Arias
	 * Fecha: 23/10/2008
	 **/
	public void MensajeDialogoCB (String mensaje, String campo )
	{
		DomainTestObject domains[] = getDomains();
		boolean bTextoCorrecto = false;
		String cbMsg = "";
		if (iSelCombo>0){
			if (ExisteVentanaDialogo()){
				
				for (int i = 0; i < domains.length; ++i)
				{
					if (domains[i].getName().equals("Html"))
					{
						TestObject[] topObjects = domains[i].find( atDescendant(".class", "Html.DialogStatic") );
		
						if (topObjects != null)
						{
							try
							{
								for (int j = 0; j < topObjects.length; ++j)
								{
		//						//System.out.println(topObjects[j].getProperty(".documentName").toString());
									cbMsg=topObjects[j].getProperty(".text").toString();
									if (cbMsg.contains(mensaje))
									{			
										bTextoCorrecto = true;
										break;
									}	
								}
							}
							finally
							{
								unregister(topObjects);
							}
						}
					}
				}
		
				if ( domains != null )
				{
					unregister( domains );
				}
			}else
				ClicLink("Volver");
			if (!bTextoCorrecto){
				DocumentarLog("No se despliega mensaje esperado al validar campo: "+campo+".<br> Mensaje Desplegado : "+cbMsg, "Verificar que se despliega mensaje al validar campo: "+campo, Integer.valueOf(3));
			}
			else{
				DocumentarLog("Verificar que se despliega mensaje al validar campo: "+campo, true);	
			}
		}
		else DocumentarLog("No es posible seleccionar valor invalido en combobox: "+campo, true);
		iSelCombo=1;
	}
	
	/***********************************************************************************************/
	
}