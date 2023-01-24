package edunova;

public class Racunalo {
      private int sifra;
      private String naziv;
      private double cijena;
      private char razred;
      private boolean ukraden;
      
      
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getCijena() {
		return cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}
	public char getRazred() {
		return razred;
	}
	public void setRazred(char razred) {
		this.razred = razred;
	}
	public boolean isUkraden() {
		return ukraden;
	}
	public void setUkraden(boolean ukraden) {
		this.ukraden = ukraden;
	}
      
}
