package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	// Za dva unesena cijela broja program ispisuje Osijek ako je zbroj veci od 10
	// inace ispisuje Edunova
	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int z = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		if ((a + z) > 10) {
			System.out.println("Osijek");
		} else
			System.out.println("Edunova");
	}
}
