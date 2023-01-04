package edunova;

import javax.swing.JOptionPane;

public class E01_ForPetlja {
	public static void main(String[] args) {
//	System.out.println("Osijek");
//	System.out.println("Osijek");
//	System.out.println("Osijek");
//	System.out.println("Osijek");
//	System.out.println("Osijek");
//	System.out.println("Osijek");
//	System.out.println("Osijek");
//	System.out.println("Osijek");
//	System.out.println("Osijek");
//	System.out.println("Osijek");
//	System.out.println("Osijek");
//	System.out.println("Osijek");

		for (int i = 0; i < 10; i = i + 1) {
			System.out.println("Osijek");
		}

		for (int i = 0; i < 10; i = i + 1) {
			System.out.println(i);
		}

		int zbroj = 0;
		for (int i = 1; i <= 100; i = i + 1) {
			zbroj = zbroj + i;
			if (i != 100) {
				System.out.println(zbroj + "+" + (i + 1));
			} else {
				System.out.println(zbroj);
			}

		}

		for (int i = 12; i <= 35; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		for (int i=5;i<100;i+=5) {
			System.out.println(i);
		}
		for (int i = 10; i>0; i--) {
			System.out.println(i);
		}
		
		int niz[] = new int[10];
		
		for (int i=0; i<niz.length;i++) {
			niz[i]= Integer.parseInt(
					JOptionPane.showInputDialog("Unesi " + (i+1) + ". broj")
					);
		}
		
		zbroj =0;
		for(int i=0; i<niz.length; i++) {
			zbroj +=niz[i];
			
		}
		System.out.println(zbroj);
		
		String grad = "Osijek";
		for (int i=0; i<grad.length();i++) {
			System.out.println(grad.charAt(i));
		}
		
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}
}
