package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	public static void main(String[] args) {

		// Korisnik unosi cijeli broj
				// Za broj manji od 10
				// ispisuje se Osijek
				// inače se ispisuje Donji Miholjac
		
			int i = Integer.parseInt(JOptionPane.showInputDialog("Upisi jedan broj"));
	
	     	if(i<10) {
				System.out.println("Osijek");
			}else {
				System.out.println("Donji Miholjac");
			}

}
}