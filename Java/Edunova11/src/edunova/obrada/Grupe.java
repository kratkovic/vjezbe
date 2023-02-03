package edunova.obrada;

import java.util.ArrayList;
import java.util.List;

import edunova.Pomocno;
import edunova.Start;
import edunova.model.Grupa;
import edunova.model.Smjer;

public class Grupe {
	
	private List<Grupa> grupe;
	private Start start;
	
	public Grupe(Start start) {
		super();
		this.start = start;
		grupe = new ArrayList<>();
		//napraviti testne podatke
	}
	
	
	
	public Grupe(List<Grupa> grupe, Start start) {
		super();
		this.grupe = grupe;
		this.start = start;
		// paraviti testne podatke
	}
	
	
	public void izbornik() {
		System.out.println("");
		System.out.println("Grupa izbornik");
		System.out.println("Dostupne opcije");
		System.out.println("1. Pregled svih grupa");
		System.out.println("2. Unos novog grupe");
		System.out.println("3. Promjena postojećeg grupe");
		System.out.println("4. Brisanje grupe");
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
//			if (smjerovi.size() == 0) {
//				System.out.println("Nema smjerova koje " + "bi mjenjali!");
//				izbornik();
//			} else {
//				promjena();
//			}

			break;
		case 4:
//			if (smjerovi.size() == 0) {
//				System.out.println("Nema smjerova "
//						+ "koje " + "bi brisali!");
//				izbornik();
//			} else {
//				brisanje();
//			}
			break;
		case 5:
			start.glavniIzbornik();
		}

	}
	
	private void unosNovog() {
		Grupa g = new Grupa();
		g.setSifra(Pomocno.unosBrojRaspon("Unesi šifru grupe: ", 1, Integer.MAX_VALUE));
		g.setNaziv(Pomocno.unosTeksta("Unesi naziv grupe: "));

		start.getSmjerovi().pregled(false);
		int rb = Pomocno.unosBrojRaspon("Odabrite smjer na kojem je grupa: ", 1, 
				start.getSmjerovi().getSmjerovi().size());
		
		g.setSmjer(start.getSmjerovi()
				.getSmjerovi().get(rb-1));
		// predavač isto
		// za datum početka treba unos datuma u Pomocno
		
		while(true) {
			start.getPolaznici().pregled(false);
			rb = Pomocno.unosBrojRaspon("Odabrite polaznika za dodavanje na grupu: ", 1, 
					start.getPolaznici().getPolaznici().size());
			g.getPolaznici().add(
					start.getPolaznici().getPolaznici().get(rb-1));
			if(Pomocno.unosBrojRaspon(
					"0 za kraj dodavanja polaznika", 
					0, Integer.MAX_VALUE)==0) {
				break;
			}
		}
		
		grupe.add(g);
		izbornik();
	}



	private void pregled(boolean prikaziIzbornik) {
		System.out.println("\nGrupe u aplikaciji");
		int rb = 1;
		for (Grupa g : grupe) {
			System.out.println(rb++ + ". " + g);
		}
		System.out.println("---------");
		if (prikaziIzbornik) {
			izbornik();
		}

	}



	public List<Grupa> getGrupe() {
		return grupe;
	}
	public void setGrupe(List<Grupa> grupe) {
		this.grupe = grupe;
	}
	
	

}
