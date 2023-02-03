package edunova.obrada;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import edunova.Pomocno;
import edunova.Start;
import edunova.model.Smjer;

public class Smjerovi {

	private List<Smjer> smjerovi;
	private Start start;

	public Smjerovi(Start start) {
		super();
		this.start = start;
		smjerovi = new ArrayList<>();
		testPodaci();
	}

	public Smjerovi(Start start, List<Smjer> smjerovi) {
		super();
		this.start = start;
		this.smjerovi = smjerovi;
		testPodaci();
	}

	private void testPodaci() {
		if (Pomocno.DEV) {
			smjerovi.add(new Smjer(1, "Java programiranje", 130, new BigDecimal(599.99), new BigDecimal(50), true));
			smjerovi.add(new Smjer(2, "PHP programiranje", 150, new BigDecimal(699.99), new BigDecimal(50), false));
			smjerovi.add(new Smjer(3, "Knjigovodstvo", 130, new BigDecimal(799.99), new BigDecimal(60), true));
		}
	}

	public void izbornik() {
		System.out.println("");
		System.out.println("Smjer izbornik");
		System.out.println("Dostupne opcije");
		System.out.println("1. Pregled svih smjerova");
		System.out.println("2. Unos novog smjera");
		System.out.println("3. Promjena postojećeg smjera");
		System.out.println("4. Brisanje smjera");
		System.out.println("5. Povratak na glavni izbornik");
		odabirIzbornika();
	}

	private void odabirIzbornika() {
		switch (Pomocno.unosBrojRaspon("Odaberi opciju: ", 1, 5)) {
		case 1:
			pregled(true);
			break;
		case 2:
			unosNovog();
			break;
		case 3:
			if (smjerovi.size() == 0) {
				System.out.println("Nema smjerova koje " + "bi mjenjali!");
				izbornik();
			} else {
				promjena();
			}

			break;
		case 4:
			if (smjerovi.size() == 0) {
				System.out.println("Nema smjerova "
						+ "koje " + "bi brisali!");
				izbornik();
			} else {
				brisanje();
			}
			break;
		case 5:
			start.glavniIzbornik();
		}

	}

	private void brisanje() {
		pregled(false);
		int rb = Pomocno.unosBrojRaspon("Odaberite smjer koji želite obrisati: ", 1, smjerovi.size());
		smjerovi.remove(rb - 1);
		izbornik();
	}

	private void promjena() {
		pregled(false);
		int rb = Pomocno.unosBrojRaspon("Odaberite smjer koji želite promjeniti: ", 1, smjerovi.size());
		Smjer s = smjerovi.get(rb - 1);
		s.setNaziv(Pomocno.unosTeksta("Unesite naziv smjera: "));
		// svi ostali atributi
		izbornik();
	}

	public void pregled(boolean prikaziIzbornik) {
		System.out.println("\nSmjerovi u aplikaciji");
		int rb = 1;
		for (Smjer s : smjerovi) {
			System.out.println(rb++ + ". " + s);
		}
		System.out.println("---------");
		if (prikaziIzbornik) {
			izbornik();
		}

	}

	private void unosNovog() {
		smjerovi.add(unesiNoviSmjer());
		izbornik();
	}

	private Smjer unesiNoviSmjer() {
		Smjer s = new Smjer();
		s.setSifra(Pomocno.unosBrojRaspon("Unesi šifru smjera: ", 1, Integer.MAX_VALUE));
		s.setNaziv(Pomocno.unosTeksta("Unesi naziv smjera: "));
		// nastaviti
		return s;
	}

	public List<Smjer> getSmjerovi() {
		return smjerovi;
	}

	public void setSmjerovi(List<Smjer> smjerovi) {
		this.smjerovi = smjerovi;
	}

}
