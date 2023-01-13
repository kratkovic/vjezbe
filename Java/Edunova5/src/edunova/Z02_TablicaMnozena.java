package edunova;

public class Z02_TablicaMnozena {
	public static void main(String[] args) {
		// Kreirati program koji ispisuje tablicu množenja 15x15

		int tablicamnozenja = 15;
		ispisitablicu(tablicamnozenja);
	}
		public static void ispisitablicu(int tablicamnozenja) {
			System.out.format("      ");
			for (int i = 1; i<=tablicamnozenja; i++) {
				System.out.format("%4d", i);
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------");
		
		for (int i = 1; i<=tablicamnozenja; i++) {
			System.out.format("%4d |", i);
			for (int j=1; j<=tablicamnozenja; j++) {
				System.out.format("%4d", i*j);
			}
			System.out.println();
		}
		

	}
}
