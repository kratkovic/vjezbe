package edunova;

public class Z04 {

	// Metoda prima niz cijelih brojeva
	// Metoda vraća 
	// zbroj svih parnih brojeva 
	// u primljenom nizu
	
	public static int zbroj(int[] brojevi) {
		int zbroj = 0;
		for(int u: brojevi) {
			if (u%2!=0) {
				continue;
			}
			zbroj +=u;
		}
		return zbroj;
	}
	
}
	
	
	
	
	
	
	
	
	
	
//	public static int zbroji(int[] brojevi) {
//		//zbrojiti i vratiti 
//		// sve brojeve u nizu brojevi
//		int zbroj=0;
//		for(int i: brojevi) {
//			if(i%2!=0) {
//				continue;
//			}
//			zbroj+=i;
//		}
//		return zbroj;
//	}
//	
//}
