package edunova;

import javax.swing.JOptionPane;

public class E01_TryCatch {

	public static void main(String[] args) {
		int i = 0;
		String broj="";
		while (true) {
			try {
				broj = JOptionPane.showInputDialog("Daj broj");
				i = Integer.parseInt(broj);
				break;
			} catch (Exception e) {
//				if(broj.length()>=9) {
//					JOptionPane.showMessageDialog(null, 
//							"Unijeli ste preveliki/premali broj");
//					continue;
//				}
				JOptionPane.showInternalMessageDialog(null, 
						"Obavezan unos cijelog broja od "
						+ " -2^31 fo 2^31-1");
			}
		}
		// za danas se ograničavamo na samo jedan catch, inače ih može biti i više

		System.out.println(i);

	}

}
