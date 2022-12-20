package edunova;

import javax.swing.JOptionPane;

public class Z03 {
public static void main(String[] args) {
	
	// Za dva unesena cijela broja
			// program ispisuje Osijek
			// ako je zbroj veći od 10
			// inače ispisuje Edunova
	
	int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));
	int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));
	
	if((a+b)>10) {
		System.out.println("Osijek");
	}else {
		System.out.println("Edunova");
	}
}
}
