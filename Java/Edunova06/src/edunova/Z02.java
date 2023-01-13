package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	// Metoda od korisnika traži
	// unos broja između 1 i 10
	// te vraća ispravno unesen broj
	
	public static int broj() {
		int z;
		while(true) {
			z = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj između 1 i 10"));
			if(z>=1 && z<=10) {
				return z;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//public static int broj() {
//		int i;
//		while(true) {
//			i=Integer.parseInt(
//					JOptionPane.showInputDialog("Unesi broj između 1 i 10")
//					);
//			if(i>=1 && i<=10) {
//				return i;
//			}
			//break; - ovo se može i obrisati
		}
		
		//return 0;- ovo se može i obrisati
//	}
	
//}
