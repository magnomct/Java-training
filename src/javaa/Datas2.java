package javaa;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		Date date = c.getTime();
		System.out.println(date);
		
		/* FORMATA��O DE DATAS*/
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date));
		
		/* FORMATA��O de Time */
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(date));
		
		/* FORMATA��O de Data e hora */
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(date));
		
		/* ESTILOS */
		
		f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(f.format(date));
		
		Date data2  = f.parse("12/02/1980");
		System.out.println(data2);
		
		/* SimpleDateFormat */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(date));
		System.out.println(sdf.parse("10/10/2010"));
		
	}

}
