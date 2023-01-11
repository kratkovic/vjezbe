package edunova;

public class Z05_Matrice4x4 {
	public static void main(String[] args) {
		// Kreirati program koji unosi dvije matrice 4x4 te ispisuje njihov zbroj
		
		
		int redaka = 4, kolone = 4;
		int matrica1[][] = { { 1, 3, 4, 6 }, { 2, 4, 3, 5 }, { 3, 4, 5, 7 }, { 4, 2, 5, 6 } };
		int matrica2[][] = { { 1, 3, 4, 5 }, { 2, 4, 3, 9 }, { 1, 2, 4, 6 }, { 4, 7, 4, 6 } };

		int rezultat[][] = new int[redaka][kolone];

		for (int i = 0; i < redaka; i++) {
			for (int j = 0; j < kolone; j++) {
				rezultat[i][j] = matrica1[i][j] + matrica2[i][j];
			}

		}
		System.out.println("Zbroj dvije matrice je: ");
		for (int[] redak : rezultat) {
			for (int kolona : redak) {
				System.out.print(kolona + " ");
			}

			System.out.println();
		}

	}
}
