package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Z07_LjubavniKalkulator {

	public static void main(String[] args) {

		String ime = JOptionPane.showInputDialog("Unesi svoje ime");
		String simpatija = JOptionPane.showInputDialog("Unesi ime simpatije");

		String broj = "";

		for (int i : ljubav(brojSlova(ime, simpatija))) {
			broj += i;
		}
		System.out.println(ime + " i " + simpatija + " se vole " + broj + "%");

	}

	public static int [] brojSlova(String ime, String simpatija) {
		 
		String zajedno = ime + simpatija;
		
		int brojac;
		
		char[] lj = (zajedno.toLowerCase().toCharArray());
		
		System.out.println(Arrays.toString(lj));
		
		int brojevi[] = new int[zajedno.length()];
		
		for (int i = 0; i <=(zajedno.length() - 1 ); i++){
			brojac = 0;
			for (int j = 0 ; j <=(zajedno.length() -1); j++){
				if(lj[i] == lj[j]) {
					brojac++;
				}
			}
			brojevi[i] = brojac;
		}
		
		brojevi = rasclaniBrojeve(brojevi);
		
		System.out.println(Arrays.toString(brojevi));
		
		if (ime.length() >= simpatija.length()) {
			int[] prviUpis = new int[ime.length()];
			for (int i = 0, index = 0; index < ime.length(); index++, i++) {
				if (index >= simpatija.length()) {
					prviUpis[index] = 0 + brojevi[brojevi.length - (1 + i)];
				} else {
					prviUpis[index] = brojevi[i] + brojevi[brojevi.length - (1 + i)];

				}

			}

			prviUpis = rasclaniBrojeve(prviUpis);

			return prviUpis;

		}

		else {
			int[] prviUpis = new int[simpatija.length()];
			for (int i = 0, index = 0; index < simpatija.length(); index++, i++) {
				if (index >= ime.length()) {
					prviUpis[index] = 0 + brojevi[brojevi.length - (1 + i)];
				} else {
					prviUpis[index] = brojevi[i] + brojevi[brojevi.length - (1 + i)];
				}

			}

			prviUpis = rasclaniBrojeve(prviUpis);
				
				return prviUpis;
		

			}		
		
	}

	public static int [] ljubav (int[]medjuZbroj) {
        	  System.out.println(Arrays.toString(medjuZbroj));
        	  
        	  if (medjuZbroj.length <= 2) {

      			return medjuZbroj;
      		} else {
      			if (medjuZbroj.length % 2 == 0) {
      				int[] korak = new int[medjuZbroj.length / 2];
      				for (int i = 0; i < korak.length; i++) {

      					korak[i] = medjuZbroj[i] + medjuZbroj[medjuZbroj.length - (1 + i)];

      				}

      				korak = rasclaniBrojeve(korak);
      				if (korak.length > 2) {

      					return ljubav(korak);

      				} else {

      					return ljubav(korak);

      				}

      			} else {
      				int[] korak = new int[(medjuZbroj.length / 2) + 1];
      				for (int i = 0; i < korak.length; i++) {

      					if (i == korak.length-1) {
      						korak[i] = 0 + medjuZbroj[medjuZbroj.length - (1 + i)];
      					} else {
      						korak[i] = medjuZbroj[i] + medjuZbroj[medjuZbroj.length - (1 + i)];
      					}

	
	}
      				if (korak.length>2) {
      					return ljubav(rasclaniBrojeve(korak));
      					
      				}else {
      					return ljubav(rasclaniBrojeve(korak));
      					
      				}
      			}
      			}
	}
	
	public static int [] rasclaniBrojeve(int[]niz) {
		int brojac = 0;
		for(int i : niz) {
			if(i>=10) {
				brojac++;
			}
		}
		int[] bezViseBrojeva = new int[niz.length + brojac];

		for (int i = 0, j = 0; i < niz.length; i++) {
			if (niz[i] < 10) {
				bezViseBrojeva[j++] = niz[i];
			} else {
				bezViseBrojeva[j++] = (niz[i] / 10);
				bezViseBrojeva[j++] = (niz[i] % 10);

			}
		}

	
		return bezViseBrojeva;
	}

}

