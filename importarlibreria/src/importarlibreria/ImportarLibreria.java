package importarlibreria;
import milibreria.Milibreria;
public class ImportarLibreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ImportarLibreria");
		vernombre();
		try {
			Milibreria obj = new Milibreria();
			obj.vernombre();
		}
		catch(Exception exception) {
			System.out.println(exception.toString());
		}
	}
	
	public static void vernombre() { System.out.println("Interno");};

}
