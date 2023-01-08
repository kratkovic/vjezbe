package edunova;

import javax.swing.JOptionPane;

public class E01_ForPetlja {
	public static void main(String[] args) {
		// ispisati 10 puta Osijek

//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");

		// for (od kuda; do kuda; korak)
		for (int i = 0; i < 10; i = i + 1) {
			System.out.println("Osijek");
		}
		for (int i = 0; i < 10; i = i + 1) {
			System.out.println(i);
		}

		
		// zbroj prvih 100 brojeva
		int zbroj = 0;
		for (int i = 1; i <= 100; i = i + 1) {
			zbroj = zbroj + i;
			if (i != 100) {
				System.out.println(zbroj + "+" + (i + 1));
			} else {
				System.out.println(zbroj);
			}

		}

		int niz[] = new int[2];
		// unos vrijednosti za sve elemente niza
		for (int g = 0; g < niz.length; g++) {

			niz[g] = Integer.parseInt(JOptionPane.showInputDialog("Unesi " + (g + 1) + ". broj"));
		}

		// zbrojite vrijednosti svih elementa niza i ispiste zbroj

		zbroj = 0;
		for (int g = 0; g < niz.length; g++) {
			zbroj += niz[g];
			System.out.println(zbroj);
		}

		String grad = "Osijek";

		for (int i = 0; i < grad.length(); i++) {
			System.out.println(grad.charAt(i));
		}

		// ugnježđivanje petlji

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j + "  ");
			}
			System.out.println();

		}
	}
}
