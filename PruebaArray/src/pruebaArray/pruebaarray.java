package pruebaArray;
import java.io.*;

public class pruebaarray {

	static final int MAXNUMEROS = 8;
	public static void main(String[] args) {
		for(int i=0; i<MAXNUMEROS; i++) {
			System.out.println("Valor de i: "+i);
		}
		
		persona[] arPersonas = new persona[3];
		String tmpNombre = "Nombre";
		for(int i=0; i<arPersonas.length; i++) {
			arPersonas[i] = new persona();
			arPersonas[i].setNombre(tmpNombre+i);
		}
		
		for(int i=0; i<arPersonas.length; i++) {
			System.out.println(arPersonas[i].getNombre());
		}
		
		//Creando una clase
		aula myclase = new aula(5);
		System.out.println("Numero de alumnos: "+myclase.getNumAlumnosAula());
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		try {
			for (int i=0; i<arPersonas.length;i++) {
				System.out.println("Nombre: ");
				tmpNombre = br.readLine();
				arPersonas[i].setNombre(tmpNombre);
			}
			
			System.out.println("Nombres del aula:");
			
			for (int i=0; i<arPersonas.length;i++) {
				System.out.println(arPersonas[i].getNombre());
			}
			
		}
		catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
			
	}

}
