package edunova;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class RadSDatumima {

	
	public RadSDatumima() {
		Date d = new Date();
		
		System.out.println(d);
		
		// OVO NE RADITI
		// prekriženo znači depricated
		d.setHours(14);
		
		System.out.println(d);
		
		// broj milisekundi od 01.01.1970
		// https://www.epochconverter.com/
		System.out.println(d.getTime());
		
		
		GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
		
		gc.set(Calendar.YEAR, 2000);
		gc.set(Calendar.MONTH, 0); // 0 je siječanj
		gc.set(Calendar.DAY_OF_MONTH, 1);
		gc.set(Calendar.SECOND, 1);
		
		System.out.println(gc.getTime());
		
		// https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		SimpleDateFormat df = 
				new SimpleDateFormat("dd. MMMM. yyyy. HH:mm:ss", Locale.FRANCE);
		
		System.out.println(df.format(gc.getTime()));
		
		
		
		
	}
	
	public static void main(String[] args) {
		new RadSDatumima();
	}
}
