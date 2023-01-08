package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	
	    //Korisnik unosi cijeli broj program ispisuje da li je paran ili nije
	public static void main(String[] args) {
        
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		
		if (i%2==0) {
			System.out.println("Parni");
		}else 
			System.out.println("Neparni");
	}
}
