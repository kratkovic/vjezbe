package edunova;


import java.math.BigDecimal;
import java.util.Scanner;

public class Pomocno {

	public static Scanner ulaz;

	public static int unosBrojRaspon(String poruka, int min, int max) {
		int i;
		while(true) {
			try {
				System.out.println(poruka);
				i = Integer.parseInt(ulaz.nextLine());
				if(i<min || i>max) {
					System.out.println("Broj mora biti između " 
							+ min + " i " + max);
					continue;
				}
				return i;
			} catch (Exception e) {
				System.out.println("Niste unijeli broj");
			}
		}
	}

	public static String unosTeksta(String poruka) {
		String s;
		while(true) {
			System.out.println(poruka);
			s = ulaz.nextLine();
			if(s.trim().isEmpty()) {
				System.out.println("Obavezan unos");
				continue;
			}
			return s;
		}
		
		}	
		
		public static BigDecimal unosNovca(String poruka) {
			  try (Scanner input = new Scanner(System.in)) {
			        System.out.print(poruka);
			        String unos = input.nextLine();
			        try {
			            BigDecimal uneseniIznos = new BigDecimal(unos);
			            System.out.println("Uneseni iznos: " + uneseniIznos + "€");

			            System.out.print("Unesite upisninu: ");
			            unos = input.nextLine();
			            try {
			                BigDecimal unesenaUpisnina = new BigDecimal(unos);
			                System.out.println("Unesena upisnina: " + unesenaUpisnina + "€");
			                return uneseniIznos.add(unesenaUpisnina);
			            } catch (NumberFormatException e) {
			                System.out.println("Unesena upisnina nije ispravna.");
			                return null;
			            }
			        } catch (NumberFormatException e) {
			            System.out.println("Uneseni iznos nije ispravan.");
			            return null;
			}
			}
		}
}
	

	
