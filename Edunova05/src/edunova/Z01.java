package edunova;

public class Z01 {

	// while petljom ispisati 
	// zbroj prvih 100 brojeva
	public static void main(String[] args) {
		int zbroj = 0, broj =1;
		while(broj<=100) {
			zbroj+=broj++;
			
		}
		System.out.println(zbroj);
	}
	
}
