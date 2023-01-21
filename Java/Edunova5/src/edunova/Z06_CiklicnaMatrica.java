package edunova;

import javax.swing.JOptionPane;

public class Z06_CiklicnaMatrica {
	public static void main(String[] args) {
		
		int broj = 1;
		int r = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		int s = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		int mat[][] = new int[r][s];

		int PocRed = r - 1;
		int KrajRed = 0;
		int PocStupac = s - 1;
		int KrajStupac = 0;

		while (broj <= r * s) {
			for (int z = PocStupac; z >= KrajStupac; z--) {
				if (broj > r * s) {
					break;
				} else {
					mat[PocRed][z] = broj++;
				}
			}
			PocRed--;
			
			for(int z = PocRed; z>=KrajRed; z--){
				if (broj > r *s) {
					break;
			}else {
				mat[z][KrajStupac] = broj ++;

	
				}
			}
			KrajStupac++;
			
			for(int z = KrajStupac; z<=PocStupac;z++) {
				if (broj > r * s) {
					break;
				}else {
					mat[KrajRed][z] = broj ++;
					
				}
			}
			
			KrajRed++;
			for(int z = KrajRed; z<=PocRed; z++) {
				if (broj> r*s) {
					break;
				}else {
					mat[z][PocStupac] = broj++;
				}
			}
			PocStupac--;
		}
		
		for (int i = 0; i < r; i++) {
			for (int z = 0; z < s; z++) {
				System.out.print(mat[i][z] + "   ");
			}
			System.out.println();
		}
	}
}