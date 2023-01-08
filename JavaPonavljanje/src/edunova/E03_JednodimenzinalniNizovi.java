package edunova;

import java.util.Arrays;

public class E03_JednodimenzinalniNizovi {
	public static void main(String[] args) {

		// deklarirali smo niz cijelih brojeva duzine 12
		// niz - array - polje
		// index niza pocinje s vrijednoscu 0

		int t[] = new int[12];

		t[0] = -2;

		t[1] = -3;

		t[t.length - 1] = 2;

		System.out.println(Arrays.toString(t));

		// alternativa

		boolean[] b = new boolean[7];
		System.out.println(Arrays.toString(b));

		int temp[] = { -3, 2, 2, 4, 32, 23, 25, 8, 2, 3, -1, };
		System.out.println(Arrays.toString(temp));
		
		//ispis prvog elementa
		
		System.out.println(temp[0]);
		
		System.out.println(temp[temp.length-1]);
				
		//ispis 23
		System.out.println(temp[5]);
		
	}
}
