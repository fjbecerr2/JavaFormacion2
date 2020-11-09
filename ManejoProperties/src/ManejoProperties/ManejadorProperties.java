package ManejoProperties;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Enumeration;
import java.util.Properties;

/*Documento de referencia:
 * https://javiergarciaescobedo.es/programacion-en-java/15-ficheros/358-archivo-de-propiedades-properties
 * https://docs.oracle.com/javase/7/docs/api/java/util/Properties.html#loadFromXML(java.io.InputStream)
 */

public class ManejadorProperties {

	private final static String ficheroProperties ="resources/ManejoProperties.properties";
	private final static String ficheroPropertiesXML ="resources/ManejoProperties.xml";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Usar un fichero Properties
		Properties properties = new Properties();
		Properties propertiesXML= new Properties();
		
		try {
			//Tres posibilidades de CARGAR el fichero si es properties
			properties.load(new FileReader(ficheroProperties));
			//properties.load(new BufferedReader(new FileReader(ficheroProperties)));
			//properties.load(new FileInputStream(ficheroProperties));
			
			//Sistema para cargar el xml
			propertiesXML.loadFromXML(new FileInputStream(ficheroPropertiesXML));
			
			//El segundo parametros es el valor por defecto
			String rutadocumentos =properties.getProperty("rutadocumentos");
			String rutarecursos =properties.getProperty("rutarecursos");
			String rutalibrerias =properties.getProperty("rutalibrerias","No existe");
			String colorError =properties.getProperty("colorError");
			String colorOK =properties.getProperty("colorOK");
			
			//Mostrar los valores
			System.out.println("[VALORES]");
			System.out.println("Valor ruta documentos: "+rutadocumentos);
			System.out.println("Valor ruta recursos: "+rutarecursos);
			System.out.println("Valor ruta librerias: "+rutalibrerias);
			//System.out.println(colorError+"Valor ruta librerias: "+rutarecursos+colorError);
			
			rutadocumentos ="";
			rutarecursos ="";
			rutalibrerias ="";
			
			rutadocumentos =propertiesXML.getProperty("rutadocumentos");
			rutarecursos =propertiesXML.getProperty("rutarecursos");
			rutalibrerias =propertiesXML.getProperty("rutalibrerias","No existe");
			//Mostrar los valores
			System.out.println("[VALORES XML]");
			System.out.println("Valor ruta documentos: "+rutadocumentos);
			System.out.println("Valor ruta recursos: "+rutarecursos);
			System.out.println("Valor ruta librerias: "+rutalibrerias);
			
			//Mostrar todos los valores disponibles
			Enumeration<Object> keys = properties.keys();

			System.out.println("[CLAVES Y VALORES]");
			while (keys.hasMoreElements()){
			   Object key = keys.nextElement();
			   System.out.println(key + " = "+ properties.get(key));
			}
			
			Enumeration<Object> keysXML = propertiesXML.keys();
			System.out.println("[CLAVES Y VALORES XML]");
			while (keysXML.hasMoreElements()){
			   Object key = keysXML.nextElement();
			   System.out.println(key + " = "+ properties.get(key));
			}
			
			cabeza();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void cabeza() {
		System.out.println(" _____");
		System.out.println("[ D O ]");
		System.out.println("| ___ |");
		//System.out.println(" -----");	  
	}


}
