package edunova;

import java.util.Arrays;

public class E03_MetodeKlaseString {

	public static void main(String[] args) {
		String s = Pomocno.obavezanUnosStringa("Unesi ime svog grada");
		
		try {
			System.out.println(s.toUpperCase());
			System.out.println(s.toLowerCase());
			System.out.println(s.charAt(0));
			System.out.println(s.contains("O"));
			System.out.println(s.indexOf("i"));
			System.out.println(s.substring(1));
			System.out.println(s.substring(1, 4));
			System.out.println(Arrays.toString(s.split("")));
			System.out.println(s.split(" ").length);
		//Osijek je najbolji grad
		} catch (Exception e) {
			System.out.println("Za dani unos program ne može izvršiti operaciju");
			
		}
	}
	
}
