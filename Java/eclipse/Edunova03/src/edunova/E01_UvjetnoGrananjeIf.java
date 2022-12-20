package edunova;

public class E01_UvjetnoGrananjeIf {

	public static void main(String[] args) {

		// if uvijek radi s boolean tipom podatka
		boolean uvjet = true;
		// minimalni oblik if naredbe
		if (uvjet) {
			System.out.println("1");
		}
		// opcionalni dio
		else {
			System.out.println("2");
		}

		// uobičajna sintaksa
		int i = 7;
		if (i < 10) {
			System.out.println("3");
		}

		uvjet = i < 5;
		if (uvjet) {
			System.out.println("4");
		} else {
			System.out.println("5");
		}

		// provjeravanje vrijednosti
		if (i == 7) {
			System.out.println("6");
		}

		// operator različito
		if (i != 7) // kada nema {} if se primjenjuje samo na prvu sljedeću liniju - to nije dobra
					// praksa
			System.out.println("7");
		System.out.println("8");

		// Princip dobre prakse: zvije koristiti {}

		i = 0;

		// logički operatori
		if (i > 1 & i < 5) {
			System.out.println("9");
		} else {
			System.out.println("10");
		}

		// & provjerava oba uvjeta uvijek

		// uvjetovani i (&)
		if (i > 1 && i < 5) {
			System.out.println("11");
		} else {
			System.out.println("12");
		}
		// u slučaju d prvi uvjet je false, drugi se ne provjerava

		// logički ili (|)
		if (i == 0 | i > 1) {
			System.out.println("13");
		}

		// | provjerava oba uvjeta uvijek

		if (i == 0 || i > 1) {
			System.out.println("14");
		}

		// || u slučaju zadovoljenja prvog uvjeta drugi se ne provjerava

		int t = 12, k = 10;

		if ((t > 5 && t <= 10) || k == 10) {
			System.out.println("15");
		}

		// ugnježđeni if

		if (k >= 10) {
			if (i < 100) {
				System.out.println("16");
			}
		}

		if (i == 0) {
			System.out.println("17");
		} else if (i == 7) {
			System.out.println("18");
		} else {
			System.out.println("19");
		}

		i = 3;
		if (i > 1) {
			System.out.print("Pozitivna ");
		} else {
			System.out.print("Negativna ");
		}
		System.out.println("ocjena");

		// tercijarni operator
		// inline if
		System.out.println((i > 1 ? "Pozitivna " : "Negativna ") + "ocjena");

	}

}
