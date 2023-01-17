package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	// Korisnik unosi 5 brojeva
	// program ispisuje najveći
	
	
	public static void main(String[] args) {
		int brojeva=0, b, najveci=Integer.MIN_VALUE;
		
		while(brojeva<5) {
			b = Integer.parseInt(
					JOptionPane.showInputDialog("Broj")
					);
			if(b>najveci) {
				najveci=b;
			}
			brojeva++;
		}
		System.out.println(najveci);
	}
	
}
