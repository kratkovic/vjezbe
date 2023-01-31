package edunova;

public class Start {
	
	private Mjesto m1; //null
	private Mjesto m2; //null

	// Od sada, pa nadalje i ubuduće
	// 1. Napravimo prazan konstruktor
	public Start() {
		// 4. ovje krećem s programiranjem
		
		m1 = new Mjesto(1,"Osijek");
		m2 = new Mjesto(1,"Osijek");
		
		nacinRadaEquals();
		nacinRadaToString();
		specificnostStringKlase();
	}
	
	
	private void specificnostStringKlase() {
		
		String s = "Osijek";
		System.out.println(s.hashCode());
		s+=" Edunova";
		// String je immutable
		// https://www.geeksforgeeks.org/java-string-is-immutable-what-exactly-is-the-meaning/
		System.out.println(s.hashCode());
		System.out.println(s);
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode());
		sb.append("Osijek");
		sb.append(" Edunova");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		System.out.println(sb.toString());
	}


	private void nacinRadaToString() {
		System.out.println(m1);
		//ispiše edunova.Mjesto@1d42f797
		
		// ako pregazimo toString metodu u Mjestu tada dobijemo ono što smo derinirali u toj metodi
		
	}


	private void nacinRadaEquals() {
		//Mjesto m1 = new Mjesto(1,"Osijek");
		//Mjesto m2 = new Mjesto(1,"Osijek");
		
		// NE koristiti == na objektima
		//System.out.println(m1==m2);
		
		// koristimo metodu equals iz klase Object
		System.out.println(m1.equals(m2));
		
		// ispiše false, zašto??
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
		// u Mjesto prepisali hachode i equals te onda dobijemo true
		
		
		
	}


	//2. kreiramo main metodu
	public static void main(String[] args) {
		
		//3. pozovemo kostruktor ove klase
		new Start();
	}
	
	
	
}
