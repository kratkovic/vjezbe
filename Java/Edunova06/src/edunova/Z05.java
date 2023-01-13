package edunova;

public class Z05 {

	// Metoda prima dva decimalna broja
	// metoda vraća zbroj samo 
	// decimalnih vrijednosti
	
	// 3.14, 1.12
	// 0.26
	
	// 2.78, 0.30
	// 1.08
	
	public static String decimala(double a, double b) {
		double prvibroj,drugibroj;
		prvibroj = a%1;
		drugibroj = b%1;
		
		return (String.format("%.2f",(prvibroj + drugibroj)));
	
		
		
		
	
	
	}	
}
