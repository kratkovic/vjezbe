package edunova;

public class E01_VrsteMetoda {

	// Svaka metoda ima
	// - Način pristupa (public, private, protected i bez načina pristupa)
	// - oznaka static ili bez oznake
	// - static: može se pozivati s klase bez kreiranja instance
	// - tip podatka: svi java tipovi ili void
	// - naziv metode
	// - (lista parametara odvojena zarezom tip podatka i naziv)

	// 4. vrste metoda

	// 1. Vrsta
	// Ne prima parametre,
	// Ne vraća vrijednost
	public static void m1_pozdravi(/* Ne prima parametre */) {
		// 10 puta jedno pokraj drugog
		// ispisati hello
		for (int i = 0; i < 10; i++) {
			System.out.print("hello ");
		}
		System.out.println();

		// Ne vraća vrijednost
		// nema return
	}

	// 2. Vrsta
	// Ne prima parametre,
	// Vraća vrijednost
	public static int m2_slucajniBroj(/* Ne prima parametre */) {
		int sb = (int) (Math.random() * 100);

		// vraća vrijednost tipa int zato štoje to tip podatka metode
		return sb;
	}

	// 3. Vrsta
	// Prima parametre,
	// Ne vraća vrijednost
	public static void m3_alg42(int a, int b, int c) {
		int r = a + b;
		float f = r / c;
		System.out.println(f*10);
	}
	
	
	// 4. Vrsta
	// Prima parametre,
	// Vraća vrijednost
	public static boolean m4_prim(int broj) {
		
		for(int i=2;i<broj;i++) {
			if(broj%i==0) {
				return false; //short cuircuting
			}
		}
		
		return true;
	}
	
	

}
