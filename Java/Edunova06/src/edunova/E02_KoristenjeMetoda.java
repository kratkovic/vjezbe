package edunova;

public class E02_KoristenjeMetoda {

	public static void main(String[] args) {
		
		E01_VrsteMetoda.m1_pozdravi();
		
		int i = E01_VrsteMetoda.m2_slucajniBroj();
		System.out.println(i);
		System.out.println(E01_VrsteMetoda.m2_slucajniBroj());
		
		int b=0;
		while(b++<10) {
			System.out.println(
					E01_VrsteMetoda.m2_slucajniBroj()
					);
		}
		
		
		E01_VrsteMetoda.m3_alg42(2, i, 4);
		
		
		System.out.println(E01_VrsteMetoda.m4_prim(17));
		
		
		System.out.println(
				Z01.najveci(
						Z02.broj(), 
						Z02.broj(), 
						Z02.broj()
						)
				);
		
		
		int ip = Z03.podaci("Kristijan","Ratkovic");
		
		System.out.println(ip);
		
		
		//E04_Rekurzija.stackoverflow();
		
		System.out.println(
				E04_Rekurzija.zbroj(100)
				);
		
	}
	
}
