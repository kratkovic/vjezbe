package edunova;

import javax.swing.JOptionPane;

public class Z05 {
	      
	      //Za upisana 3 cijela broja program ispisuje najveći  
	
	
public static void main(String[] args) {
	int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
	int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
	int c = Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj"));
	
	if (a > b) {
		System.out.println(a);
	}else if (b>a) {
		System.out.println(b);
	}else {
		System.out.println(c);
	}
	

	
}
}

