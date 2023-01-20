package edunova;

// Ovo morate znati u svako doba dana i noći
// Klasa je opisnik objekta!!!!
public class Osoba {
	
	// svojstva klase koja opisuju objekt
	// Ovako ne valja i nećemo raditi
	/*
	String ime;
	String prezime;
	int godine;
	*/
	
	// OOP učahurivanje
	// Klasa će sakriti sva svoja svojstva
	private String ime;
	private String prezime;
	private int godine;
	
	
	// Klasa će svojstva učiniti dostupnima putem
		// javnih metoda koje se nazivaju
		// Accessors and mutators, popularno geteri i seteri
		
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}
	
	
	
	

}
