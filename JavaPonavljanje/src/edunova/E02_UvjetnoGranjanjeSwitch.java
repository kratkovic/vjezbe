package edunova;

public class E02_UvjetnoGranjanjeSwitch {
	public static void main(String[] args) {

		int ocjena = 2;
		if (ocjena == 1) {
			System.out.println("nedovoljan");
		} else if (ocjena == 2) {
			System.out.println("dovoljan");
		} else {
			System.out.println("ocjena nije broj");
		}

		switch (ocjena) {
		case 1:
			System.out.println("nedovoljan");
			break; // ako se ne koristi onda nastavlja prema sljedećim slučajevima

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
