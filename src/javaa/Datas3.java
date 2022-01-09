package javaa;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {

	public static void main(String[] args) {
		
		//cria calend�rio
		Calendar c = Calendar.getInstance();
		//setta valores
		c.set(1980, Calendar.FEBRUARY, 12);
		//recebe o valor
		Date date = c.getTime();
		
		Locale padrao = Locale.getDefault();
		System.out.println(padrao);
		
		Locale brasil = new Locale("pt" , "BR");
		Locale india = new Locale("hi" , "IN");
		Locale usa = Locale.US;
		Locale japao = Locale.JAPAN;
		Locale italia = Locale.ITALY;
		
		
		//formato do calend�rio
		//cria o dateformat = class.metodo(tipo de formatacao)
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		//impress�o do formato
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL,brasil);
		//impress�o do formato
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL,india);
		//impress�o do formato
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL,usa);
		//impress�o do formato
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL,japao);
		//impress�o do formato
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL,italia);
		//impress�o do formato
		System.out.println(f.format(date));

	}

}
