package edunova;

public class E05_UlazniParametri {

	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("Obavezno dva parametra");
			return; // prekidam izvođenje programa - short curcuiting
		}
		
		System.out.println("Izvodim program");
		
		// ispišite Edunova
		System.out.println(args[0]);
		
	}
}
