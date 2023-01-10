package edunova;

import javax.swing.JOptionPane;

public class E01_WhilePetlja {

	public static void main(String[] args) {
		
		// while radi s boolean tipom podatka
		// sve dok je boolean tip podataka true
		while(true) {
			break;
		}
		
		
		boolean uvjet=false;
		while(uvjet) {
			System.out.println("Osijek");
		}
		// oblik for petlje koja se nikada niti jedno ne izvede
		for(int i=0;i<0;) {
			System.out.println("Neće ući");
		}
		
		
		int broj=0;
		while(broj<10) {
			System.out.println(broj++);
			
			// continue i break rade isto kao kod for
		}
		
		
		int b=0;
		while(true) {
			b = Integer.parseInt(
					JOptionPane.showInputDialog(
							"Unesi broj između 1 i 10")
					);
			if(b>=1 && b<=10) {
				break;
			}
		}
		System.out.println(b);
		
		
		// ugnježđivanje radi kao na for 
		// prekidanje vanjskih petljiradi isto kao na for
		
	}
	
}
