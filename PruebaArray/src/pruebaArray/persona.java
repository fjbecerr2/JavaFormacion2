package pruebaArray;

public class persona {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	
	persona(){
		this.nombre = "SinNombre";
		this.apellido1 = "sinprimerapellido";
		this.apellido2 = "sinsegundoapellido";
		this.edad = 0;
	}
	
	//set
	public void setNombre(String pnombre) {
		this.nombre = pnombre;
	}
	public void setApellido1(String papellido1) {
		this.apellido1 = papellido1;
		
	}
	public void setApellido2(String papellido2) {
		this.apellido2 = papellido2;
		
	}
	public void setEdad(int pedad) {
		this.edad = pedad;
	}
	
	//get
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido1() {
		return this.apellido1;
	}
	public String getApellido2() {
		return this.apellido2;
	}
	public int getEdad() {
		return this.edad;
	}
}
