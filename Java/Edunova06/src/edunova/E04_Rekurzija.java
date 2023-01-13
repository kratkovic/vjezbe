package edunova;

public class E04_Rekurzija {

	// Rekurzija je kada metoda poziva samu sebe
	// Uz uvjet prekida rekurzije
	
	// dobiti ćemo stackowerflow
	public static void stackoverflow() {
		stackoverflow();
	}
	
	
	public static int zbroj(int broj) {
		//uvjet prekida rekurzije
		if(broj==1) {
			return 1;
		}
		
		return broj + zbroj(broj-1) /* poziv rekurzije */;
	}
	
}
