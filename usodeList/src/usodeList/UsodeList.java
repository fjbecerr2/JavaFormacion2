package usodeList;

import java.util.*;

public class UsodeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lista doblemente enlazada
		LinkedList Lista1 = new LinkedList(); //Sin tipo definido
		LinkedList <String> Lista2 = new LinkedList<String>(); //Tipo especificado
		
		Lista1.add("Cadiz");
		Lista1.add("Jaen");
		Lista1.add("Malaga");
		
		Lista2.add("Cadiz"); //No tiene warning por definir el tipo
		Lista2.add("Jaen");
		Lista2.add("Malaga");
		
		for(int i=0; i<Lista1.size(); i++) {
			System.out.println(Lista1.get(i));
		}
		
		for(int i=0; i<Lista2.size(); i++) {
			System.out.println(Lista2.get(i));
		}
	
		
	}

}
