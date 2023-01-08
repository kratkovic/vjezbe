package edunova;

import javax.swing.JOptionPane;

public class E02_IncrementDeckrement {
	public static void main(String[] args) {
		int i = 1;
		i = i + 4;
		System.out.println(i);

		i += 1; // i = i+1

		i += 3; // i = i+3

		System.out.println(i);

		i++; // samo kada se radi uvećanje za 1
		System.out.println(i);
		System.out.println(++i);

		// ++i prvo uveća pa koristi
		System.out.println(i++);

		// i++ prvo se koristi pa se onda uveća
		System.out.println(i);

		int t = 2, k = 1, z;
		z = k + t++; // t=3, k=1, z=3
		k += z + 1; // t=3, k=5, z=3
		System.out.println(t + z + k);

		// ispisati sve parne brojeve od 12 do 35

		for (int b = 12; b <= 35; b++) {
			if (i % 2 == 0) {
				System.out.println(b);
			}
		}
		// ispisati svaki 5 broj od 5 do 100
		for (int c = 5; c <= 100; c += 5) {
			System.out.println(c);
		}

		// ispisati brojeve od 10 do 1 jedno ispod drugog

		for (int h = 10; h > 0; h--) {
			System.out.println(h);
		}

		// deklarirajte niz od 10 cijelih brojeva

		int niz[] = new int[10];
		// unos vrijednosti za sve elemente niza
		for (int g = 0; g < niz.length; g++) {

			niz[g] = Integer.parseInt(JOptionPane.showInputDialog("Unesi " + (g + 1) + ". broj"));
		}

	}
}
