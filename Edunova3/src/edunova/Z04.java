package edunova;

import javax.swing.JOptionPane;

public class Z04 {
public static void main(String[] args) {
	// Za unesena dva cijela broj
			// program ispisuje veći
			// 3 i 5 -> 5
			// 5 i 3 -> 3
			// 5 i 5 ->
	
	int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));
	int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));

	if (a > b) {
		System.out.println(a);
	} else {
		System.out.println(b);
	}
}
}

