package edunova.obrada;

import java.util.ArrayList;
import java.util.List;

import edunova.Pomocno;
import edunova.Start;
import edunova.model.Predavac;

public class Predavaci {

	private List<Predavac> predavaci;
	private Start start;

	public Predavaci(Start start) {
		super();
		this.start = start;
		predavaci = new ArrayList<>();
		testPodaci();
	}
	// SVE OSTALO DOMA

	private void testPodaci() {
		if (Pomocno.DEV) {
			predavaci.add(new Predavac(1, "Martin", "Mak", "11425256254", "mmak@gmail.com", "HR454212454545"));
			predavaci.add(new Predavac(2, "Ines", "Ketonić", "11425256254", "mmak@gmail.com", "HR454212454545"));
		}
	}

	public List<Predavac> getPredavaci() {
		return predavaci;
	}

	public void setPredavaci(List<Predavac> predavaci) {
		this.predavaci = predavaci;
	}
	
	

}
