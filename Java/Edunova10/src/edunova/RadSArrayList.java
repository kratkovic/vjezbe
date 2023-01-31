package edunova;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class RadSArrayList {
	
	
	
	public RadSArrayList() {
		//Stari način: LOŠ
		ArrayList lista = new ArrayList();
		
		lista.add("Osijek");
		lista.add(new Mjesto());
		
		//GENERICI, generic klase
		// niti ovo nije dovoljno dobro
		ArrayList<String> ls = new ArrayList<>();
		ls.add("Edunova");
		// ovo ne prolazi, ls može sadržavati samo String instance
		//ls.add(new Mjesto());
		
		// čitati: https://www.geeksforgeeks.org/vector-vs-arraylist-java/
		List<Mjesto> lm = new ArrayList<>();
		lm.add(new Mjesto());
		
		lm = new Vector<>();
		lm.add(new Mjesto());
		
		
		// više o strukturama
		// https://www.cs.wcupa.edu/rkline/ds/data-structures.html
		
	}
	
	public static void main(String[] args) {
		new RadSArrayList();
	}

}
