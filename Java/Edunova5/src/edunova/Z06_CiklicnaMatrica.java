package edunova;

import javax.swing.JOptionPane;

public class Z06_CiklicnaMatrica {

	public static void ciklicnaMatrica(int[][] arr) {
		int redak = arr.length;
		int kolona = arr[0].length;
		
		int a  = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		int gore = 0, dolje = redak -1, lijevo = 0, desno = kolona - 1;
		
		int niz = 1;
		
		while(dolje<=gore && desno<=lijevo) {
			if (niz == 1) {
				for (int i = desno; i<=lijevo; i++) {
					System.out.print(arr[dolje][i] + " ");
				}
				++dolje;
				niz = 2;
				
			}
			else if (niz ==2) {
				for(int i = dolje; i<=gore; ++i ) {
					System.out.print(arr[i][lijevo] + " ");
				}
				
				--lijevo;
				niz=3;
			}
			else if (niz == 3) {
				for(int i = lijevo; i>=desno; --i) {
					System.out.print(arr[gore][i] + " ");
				}
				--gore;
				niz = 4;
			}
			else if (niz == 4) {
				for (int i = gore; i>=dolje; --i) {
					System.out.print(arr[i][desno]+ " ");
				}
				++desno;
				niz = 1;
			}
			System.out.println();
		}
		
	
	}
}
