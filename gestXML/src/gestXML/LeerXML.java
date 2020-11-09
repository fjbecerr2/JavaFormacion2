package gestXML;

import java.io.File;
//import java.io.FileNotFoundException;

import java.lang.Exception;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
//import org.w3c.dom.NameList;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class LeerXML {
	private File fileXML =new File("xml/emailList.xml"); //La carpeta se incluyo en el path
	
	
	public LeerXML() {
		
		System.out.println(fileXML.getAbsoluteFile());
		if(fileXML.exists()==false) {
			System.out.println("No se encontro XML");
			
		}
		else {
		
			try {
			    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			    Document doc = dBuilder.parse(fileXML);
			    
			 // estos métodos podemos usarlos combinados para normalizar el archivo XML
			    doc.getDocumentElement().normalize();
			    
			 // almacenamos los nodos para luego mostrar la
			 // cantidad de ellos con el método getLength()
			 NodeList nList = doc.getElementsByTagName("nota");
			 System.out.println("Número de notas: " + nList.getLength());
			 
			 for(int temp = 0; temp < nList.getLength(); temp++) {
				  Node nNode = nList.item(temp);

				  if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				    Element eElement = (Element) nNode;
				    //System.out.println("Nota: "+eElement.getAttribute("nota"));
				    System.out.println("Nombre: "+eElement.getElementsByTagName("nombre").item(0).getTextContent());
				    System.out.println("email: "+eElement.getElementsByTagName("emailDireccion").item(0).getTextContent());
				  }
			 }
				
			}catch(Exception excp) {
				excp.printStackTrace();
			}
		}//fin else
	}

}
