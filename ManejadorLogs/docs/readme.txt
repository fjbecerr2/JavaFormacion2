--
Documento de referencia: 
https://medium.com/el-acordeon-del-programador/logs-en-java-con-java-util-logging-d344ae2ba7bc
https://danjared.wordpress.com/2009/05/11/usar-logs-en-java-parte-1/
https://www.loggly.com/ultimate-guide/java-logging-basics/
https://examples.javacodegeeks.com/core-java/util/logging/java-util-logging-example/

https://medium.com/el-acordeon-del-programador (tutoriales varios)


Niveles de logs: (son escalonados si de da acceso a uno es ese y los que vienen debajo)
INFO: Mostrar mensajes informativos
CONFIG: Mostrar mensajes de configuración
WARNING: Mostrar mensajes de alerta
SEVERE: Mostrar mensajes críticos
FINE: Mostrar mensajes de depuración de nivel 1
FINER: Mostrar mensajes de depuración de nivel 2
FINEST: Mostrar mensajes de depuración de nivel 3

//ORDEN DE IMPORTANCIA DESCENDENTE
SEVERE: Nivel de mensaje indicando un error serio.
WARNING: Indica un error potencial.
INFO: Para mensajes informativos.
CONFIG: Usado con mensajes relacionados con la configuración.
FINE: Proporciona información de traza de la ejecución.
FINER: Información de traza más detallada.
FINEST: Información de traza muy detallada.

ALL: Muestra todos los mensajes
OFF: No muestra ningún mensaje

1.- CONFIGURAR EL FICHERO DE LOGS
	- Desde la ejecución de la aplicación con el parametro -Djava.util.logging.config.file:
		java -Djava.util.logging.config.file=./log.properties 
    	-cp ./classes:./lib/* ClassMain

	- Desde código fuente:

		public void metodo() {
		    LogManager.getLogManager().readConfiguration(
		        new FileInputStream("./log.properties"));
		}