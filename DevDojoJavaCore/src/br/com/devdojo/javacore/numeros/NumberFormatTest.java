package br.com.devdojo.javacore.numeros;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
		
		float valor = 123.4567f;
		Locale locale = new Locale("jp");
		
		NumberFormat[] nf = new NumberFormat[4];
		nf[0] = NumberFormat.getInstance();
		nf[1] = NumberFormat.getInstance(locale);
		nf[2] = NumberFormat.getCurrencyInstance();
		nf[3] = NumberFormat.getCurrencyInstance(locale);
		
		for (NumberFormat nFormat : nf) {
			System.out.println(nFormat.format(valor));
		}
		
		NumberFormat nf2 = NumberFormat.getInstance();
		System.out.println(nf2.getMaximumFractionDigits());
		nf2.setMaximumFractionDigits(5);
		System.out.println(nf2.format(valor));
		
		String valorString = "212,4567";
		try {
			System.out.println(nf2.parse(valorString));
			nf2.setParseIntegerOnly(true);
			System.out.println(nf2.parse(valorString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
