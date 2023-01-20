package edunova;

import java.util.Date;

public class E02_Start {

	
	public static void main(String[] args) {
		// Ovo morate znati u svako doba dana i noći
		// Objekt je instanca klase
		// Osoba je tip podatka - klasa
		// osoba je instanca klase/objekt/varijabla
		// new: ključna riječ za poziv konstruktora klase
		Osoba osoba = new Osoba();
		
		// Po OOP pravilima ne smije se omogućiti direktan pristup svojstvima
		// OVO NEĆEMO RADITI
		//osoba.ime="Pero";
		//System.out.println(osoba.ime);
		
		//postavljanje vrijednosti svojstava na objekt
		osoba.setIme(Pomocno.obavezanUnosStringa("Unesi ime"));
		osoba.setPrezime("Perić");
		osoba.setGodine(24);
		
		System.out.println(osoba.getPrezime());
		
		Osoba[] osobe = new Osoba[5];
		osobe[0] = osoba;

		osoba = new Osoba();
		osoba.setIme("Marina");
		osobe[1]=osoba;
		osobe[2] = kreirajOsobu("Ana", "Gal", 19);
		osobe[3] = kreirajOsobu("Tin", "Ked", 19);
		osobe[4] = kreirajOsobu("Lu", "Ked", 19);
		
		for(Osoba o : osobe) {
			System.out.println(o.getIme());
		}
		
		
		Mjesto mjesto = new Mjesto();
		Zupanija zupanija = new Zupanija();
		zupanija.setNaziv("OBŽ");
		mjesto.setZupanija(zupanija);
		System.out.println(mjesto.getZupanija().getNaziv());
		
		
		Grupa jp27 = kreirajGrupu(1, 
				"JP27", 20, new Date(), 
				kreirajSmjer(1, "Java programiranje", 
						5999.99f, 500, true));
		
		Grupa pp26 = kreirajGrupu(1, 
				"PP26", 20, new Date(), 
				kreirajSmjer(1, "PHP programiranje", 
						5999.99f, 500, false));
		
		// zadaci
		// Ispišite JP27
		// Ispišite PHP programiranje
		// Ispišite zbroj cijena oba smjera
		
		
		
	}
	
	private static Osoba kreirajOsobu(
			String ime, String prezime, int godine) {
		Osoba osoba = new Osoba();
		osoba.setGodine(godine);
		osoba.setIme(ime);
		osoba.setPrezime(prezime);
		return osoba;
	}
	
	private static Smjer kreirajSmjer(
			int sifra, String naziv,
			float cijena, float upisnina,
			boolean certificiran) {
		Smjer smjer = new Smjer();
		smjer.setSifra(sifra);
		smjer.setNaziv(naziv);
		smjer.setCijena(cijena);
		smjer.setUpisnina(upisnina);
		smjer.setCertificiran(certificiran);
		return smjer;
	}
	
	private static Grupa kreirajGrupu(
			int sifra, String naziv,
			int mp, Date datum, Smjer s) {
		Grupa g = new Grupa();
		g.setSifra(sifra);
		g.setNaziv(naziv);
		g.setMaksimalnoPolaznika(mp);
		g.setDatumPocetka(datum);
		g.setSmjer(s);
		return g;
	}
	
}
