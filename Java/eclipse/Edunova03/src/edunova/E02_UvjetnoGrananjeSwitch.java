package edunova;

public class E02_UvjetnoGrananjeSwitch {

	public static void main(String[] args) {

		int ocjena = 2;
		if (ocjena == 1) {
			System.out.println("Nedovoljan");
		} else if (ocjena == 2) {
			System.out.println("Dovoljan");
		}
		// ...
		else {
			System.out.println("Ocjena nije broj");
		}

		switch (ocjena) {
		case 1:
			System.out.println("Nedovoljan");
			break; // ako se ne koristi onda nastavlja dalje prema sljedećim slučajevima
		case 2:
			System.out.println("Pozitivna");
		case 3:
			System.out.println("Pozitivna");
		default: {
			System.out.println("Nije ocjena");
		}
		}

	}
}
