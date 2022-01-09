package javaa;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {

	public static void main(String[] args) {
		
		//cria calendário
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
		
		
		//formato do calendário
		//cria o dateformat = class.metodo(tipo de formatacao)
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		//impressão do formato
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL,brasil);
		//impressão do formato
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL,india);
		//impressão do formato
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL,usa);
		//impressão do formato
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL,japao);
		//impressão do formato
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL,italia);
		//impressão do formato
		System.out.println(f.format(date));

	}

}
