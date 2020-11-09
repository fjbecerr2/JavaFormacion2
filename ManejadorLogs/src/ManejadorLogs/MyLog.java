package ManejadorLogs;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;
import java.util.logging.Logger;

public class MyLog {
	private FileHandler fileTxt; //Manejador del fichero
	private Handler consoleHandler; //Manejado de consola
	private Logger logger; //Objeto para mensajes
	private SimpleFormatter formatterTxt; //Formateador de salida txt o xml (por defecto)
	
	public MyLog() {
		try {
			fileTxt =new FileHandler("Logging.txt");
			//fileTxt =new FileHandler("Logging.txt",true); //true sobreescribir o añadir
			consoleHandler = new ConsoleHandler();
			//logger = Logger.getLogger("MyLog"); //Asignar un nombre
			logger = Logger.getLogger(MyLog.class.getName()); //Asignar el nombre de la clase, paquete etc
			formatterTxt =new SimpleFormatter();
			fileTxt.setFormatter(formatterTxt); //Formateo de salida txt (si se quita es xml)
			//fileTxt.setFormatter(new XMLFormatter()); //Forzar formateo xml			
			
			
			logger.addHandler(fileTxt);//Asignamos la salida por fichero
			fileTxt.setLevel(Level.WARNING); //Niveles que muestra
			
			logger.addHandler(consoleHandler);//Salida por consola
			consoleHandler.setLevel(Level.CONFIG); //Niveles que muestra
			
			//consoleHandler.setLevel(Level.ALL); //Niveles que muestra
			//consoleHandler.setLevel(Level.OFF); //Niveles que muestra desactivado
			 
			logger.info("Logger Name: "+logger.getName());
			
		
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void escribeLog(String msg) {
		//logger.info(msg); //Mensaje simple
		//logger.log(Level.WARNING, msg); //Mensaje con nivel
		//logger.log(Level.INFO, msg); //Mensaje con nivel
		
		//Mensaje de muestra de niveles
		logger.severe("Mensaje SEVERE");
		logger.warning("Mensaje WARNING");
		logger.info("Mensaje INFO");
		logger.config("Mensaje CONFIG");
		logger.fine("Mensaje FINE");
		logger.finer("Mensaje FINER");
		logger.finest("Mensaje FINEST");
		
	}

}
