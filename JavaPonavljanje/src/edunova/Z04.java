package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	// za unesena dva cjela broja program ispisuje veci
	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		if (a > b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}

	}
}
