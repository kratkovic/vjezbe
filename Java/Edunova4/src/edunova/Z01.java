package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	// Program unosi dva cijela broja
	// Program ispisuje zbroj svih parnih brojeva
	// između dva unesena broja

	public static void main(String[] args) {

		int prviBroj= Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		
		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		int min = prviBroj<drugiBroj ? prviBroj : drugiBroj;
		int max = prviBroj>drugiBroj ? prviBroj : drugiBroj;
		
		//ispisati parne brojeve između dva unesena broja
		int zbroj=0;
		for(int i=min; i<=max; i++){
			if (i%2==0) {
				zbroj+=i;
			}
		}
		
		System.out.println(zbroj);
	}
	
}
