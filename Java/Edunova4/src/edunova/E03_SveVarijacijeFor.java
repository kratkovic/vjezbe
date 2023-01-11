package edunova;

public class E03_SveVarijacijeFor {
	public static void main(String[] args) {
		// 9 različitih načina zbranjanja prvih 100 brojeva
		
		int i, s = 0;
		for (i = 1; i <= 100; i++)
			s += 1;
		s = s + i;
		
		System.out.println(s);

	}
}
