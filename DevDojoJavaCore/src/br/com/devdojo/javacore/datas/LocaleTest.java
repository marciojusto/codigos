package br.com.devdojo.javacore.datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		
		Locale locItalia = new Locale("it", "IT");
		Locale locSuica = new Locale("it", "CH");
		
		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar.DECEMBER, 23);
		DateFormat dtf1 = DateFormat.getDateInstance(DateFormat.FULL, locItalia);
		DateFormat dtf2 = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
		
		System.out.println(dtf1.format(c.getTime()));
		System.out.println(dtf2.format(c.getTime()));
		
		System.out.println(locItalia.getDisplayLanguage());
		System.out.println(locSuica.getDisplayCountry());
	}
}
