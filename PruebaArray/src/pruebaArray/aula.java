package pruebaArray;

public class aula {
	private persona[] aula;
	
	public aula(int pnumalumnos) {
		aula = new persona[pnumalumnos];
	}
	
	public int getNumAlumnosAula() {
		return aula.length;
	}

}
