package edunova;

import javax.swing.JOptionPane;

public class Z06_CiklicnaMatrica {
	public static void main(String[] args) {

		int broj = 1;
		int r = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		int s = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));

		int mat[][] = new int[r][s];

		
		int PocRed = 0;
		int KrajRed = r - 1;
		int PocStupac = 0;
		int KrajStupac = s - 1;

		while (PocRed < KrajRed && PocStupac < KrajStupac) {
			for (int i = PocStupac; i < KrajStupac; ++i) {
				mat[PocRed][i] = broj++;

			}
			PocRed++;

			for (int i = PocRed; i < KrajRed; ++i) {
				mat[i][KrajStupac] = broj++;

			}
			KrajStupac--;

			if (PocRed < KrajRed) {
				for (int i = KrajStupac; i > PocStupac; --i) {
					mat[KrajRed][i] = broj++;

				}

				KrajRed--;

				if (PocStupac < KrajStupac) {
					for (int i = KrajRed; i >= PocRed; --i) {
						mat[i][PocStupac] = broj++;

					}
					PocStupac++;
				}

			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < s; j++) {
				System.out.println(mat[i][j] + " ");
			}
			System.out.println();
		}

	}
}
