package edunova;

import javax.swing.JOptionPane;

public class Z04_IspisPrimarnihBrojeva {
	public static void main(String[] args) {
		// Kreirati program koji za dva unesena broja ispisuje sve primarne brojeve između njih
	
		int izmedju = 0;
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		int veci,manji = 0;
		
		if (a > b) {
			veci = a;
			manji = b;
		} else {
			veci = b;
			manji = a;
		}

		for (int i = manji; i < veci; i++) {
			izmedju = 0;
			for (int j = 2; j < (i); j++) {
				if ((i % j) == 0) {
					izmedju++;
					break;
				}
			}
			if (izmedju == 0 && i != 1) {
				System.out.println(i);
			}

		}

	}
}
