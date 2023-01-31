package edunova.polimorfizam;

public class Start {

	private Oblik[] oblici;

	public Start() {
		oblici = new Oblik[2];
		oblici[0] = new Krug(10);
		oblici[1] = new Pravokutnik(4, 3);
		prikazPolimofrizma();
	}

	private void prikazPolimofrizma() {
		
		for(Oblik o: oblici) {
			// Višeobličje
			System.out.println(o.getClass());
			System.out.println(o.povrsina());
		}
		
		
	}

	public static void main(String[] args) {
		new Start();
	}

}
