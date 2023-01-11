package edunova;

public class E03_ForeachPetlja {

	public static void main(String[] args) {

		int[] niz = { 2, 2, 3, 4, 5, 3 };

		// ispišite svaki element
		// niza jedan ispod drugog

		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}

		// foreach petlja uvijek ide od početka do kraja svaki element
		for (int v : niz) {
			System.out.println(v);
		}

		// continue i break rade isto kao kod for
		// ugnježđivanje radi kao na for
		// prekidanje vanjskih petljiradi isto kao na for

		
		// iste ove brojeve u nizu
		// ispisati unazad
		for(int i = niz.length-1;i>-1;i--) {
			System.out.println(niz[i]);
		}
		
	}
}
