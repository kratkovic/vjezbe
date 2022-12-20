package edunova;

import javax.swing.JOptionPane;

public class E04PrviProgram {

	public static void main(String[] args) {
		// Prije korištenja JOptionPane
		// u module info treba dodati
		// requires java.desktop;
		
		// Program zbraja dva broja
		//UNOS
		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj")
				);
		
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi broj")
				);
		//ALGORITAM
		int rezultat = prviBroj + drugiBroj;
		
		//IZLAZ
		System.out.println(rezultat);
		
		
		
		
		
		
		
		
	}
}
