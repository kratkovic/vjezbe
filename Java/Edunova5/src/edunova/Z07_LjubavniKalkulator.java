package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Z07_LjubavniKalkulator {
	
	public static void main(String[] args) {
		
		String ime1 = JOptionPane.showInputDialog("Unesi svoje ime");
		String ime2 = JOptionPane.showInputDialog("Unesi ime simpatije");
		
		String broj = "";
		
	    for (int i : ljubav(brojSlova(ime1,ime2))) {
	    	broj += i;
	    }
	    System.out.println(ime1 + " i " + ime2 + " se vole " + broj + "%");

	}
	 
	public static int [] brojSlova(String ime1, String ime2) {
		 
		String zajedno = ime1 + ime2;
		
		int brojac;
		
		char a [] = (zajedno.toLowerCase().toCharArray());
		
		System.out.println(Arrays.toString(a));
		
		int brojevi[] = new int[zajedno.length()];
		
		for (int i = 0; i <=(zajedno.length() - 1 ); i++){
			brojac = 0;
			for (int j = 0 ; j <=(zajedno.length() -1); j++){
				if(a[i] == a[j]) {
					brojac++;
				}
			}
			brojevi[i] = brojac;
		}
		
		 
	 }
	
	
	private static int[] ljubav(int[] brojSlova) {
		
		
}
