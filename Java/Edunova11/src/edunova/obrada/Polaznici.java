package edunova.obrada;

import java.util.ArrayList;
import java.util.List;

import edunova.Pomocno;
import edunova.Start;
import edunova.model.Polaznik;
import edunova.model.Smjer;

public class Polaznici {
	
	private List<Polaznik> polaznici;
	private Start start;
	
	
	
	
	public Polaznici(Start start) {
		super();
		this.start = start;
		polaznici = new ArrayList<>();
		testPodaci();
	}
	
	

	public Polaznici(Start start, List<Polaznik> polaznici) {
		super();
		this.polaznici = polaznici;
		this.start = start;
		testPodaci();
	}
	
	private void testPodaci() {
		if(Pomocno.DEV) {
			polaznici.add(new Polaznik(1,"Josip","Balog","52658425322","jbalog@gmail.com","2023/1"));
			polaznici.add(new Polaznik(2, "Ana", "Majić", "15252525252", "amajic@gmail.com", "2023/56"));
		}
		
	}



	public void izbornik() {
		System.out.println("");
		System.out.println("Polaznik izbornik");
		System.out.println("Dostupne opcije");
		System.out.println("1. Pregled svih polaznika");
		System.out.println("2. Unos novog polaznika");
		System.out.println("3. Promjena postojećeg polaznika");
		System.out.println("4. Brisanje polaznika");
		System.out.println("5. Povratak na glavni izbornik");
		odabirIzbornika();
	}
	
	private void odabirIzbornika() {
		switch(Pomocno.unosBrojRaspon("Odaberi opciju: ", 1, 5)) {
		case 1:
			pregled(true);
			break;
		case 2:
			//unosNovog();
			break;
		case 5:
			start.glavniIzbornik();
		}
		
	}
	
	public void pregled(boolean prikaziIzbornik) {
		System.out.println("\nPolaznici u aplikaciji");
		int rb = 1;
		for (Polaznik p : polaznici) {
			System.out.println(rb++ + ". " + p);
		}
		System.out.println("---------");
		if (prikaziIzbornik) {
			izbornik();
		}

	}



	public List<Polaznik> getPolaznici() {
		return polaznici;
	}

	public void setPolaznici(List<Polaznik> polaznici) {
		this.polaznici = polaznici;
	}
	
	

}
