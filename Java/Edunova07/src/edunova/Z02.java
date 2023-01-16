package edunova;

public class Z02 {
	
	//Program unosi imena dvije osobe i ispisuje koliko se vole 
	//metodom slučajnog broja od 10 do 90

	public static void main(String[] args) {
		String ime1 =Pomocno.obavezanUnosStringa("Unesi svoje ime");
		String ime2 =Pomocno.obavezanUnosStringa("Unesi ime simpatije");
		
		int slucajniBroj= Pomocno.ucitajBrojURasponu(10, 90);
		
		System.out.println(ime1 +" i " + ime2 + " se vole " + slucajniBroj+ " % ");
	}
}
