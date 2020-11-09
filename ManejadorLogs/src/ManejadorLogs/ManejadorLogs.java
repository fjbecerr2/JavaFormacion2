package ManejadorLogs;

public class ManejadorLogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cabeza();

	}
	
	public static void cabeza() {
		System.out.println(" _____");
		System.out.println("[ D O ]");
		System.out.println("| ___ |");
		//System.out.println(" -----");	  
		
		MyLog myLog =new MyLog();
		myLog.escribeLog("Prueba de log");
	}

}
