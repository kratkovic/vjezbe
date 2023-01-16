package edunova;

public class E02_Program {

	public static void main(String[] args) {
		
		// Treba unijeti od korisnika
		// 5 brojeva i ispisati njihov zbroj
		int suma=0;
		for(int i=0;i<5;i++) {
//			suma+=Pomocno.ucitajCijeliBroj(
//					"Unesi " + (i+1) + ". broj"
//					, "Nisi dobro unio cijeli broj");
			suma+=Pomocno.ucitajCijeliBroj();
		}
		System.out.println(suma);
		
	}


	

	}

