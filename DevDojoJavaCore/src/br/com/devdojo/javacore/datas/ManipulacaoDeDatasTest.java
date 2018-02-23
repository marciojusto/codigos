package br.com.devdojo.javacore.datas;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {

	public static void main(String[] args) {
		Date date = new Date();
		date.setTime(date.getTime() + 3_600_000L); //adicionando mais uma hora a hora atual
		System.out.println(date);
		
		Calendar c = Calendar.getInstance();
		if(Calendar.SUNDAY == c.getFirstDayOfWeek()) {
			System.out.println("Domingo é o primeiro dia da semana!");
		}
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		//c.add(Calendar.HOUR, 2); //adicionando mais duas horas a hora atual
		//c.add(Calendar.MONDAY, 9); //adicionando 9 meses ao ano.
		
		c.roll(Calendar.HOUR, 2); //adicionando mais duas horas a hora atual
		c.roll(Calendar.MONDAY, 9); //adicionando 9 meses no início do ano atual.
		
		Date date2 = c.getTime();
		System.out.println(date2);
		
		//Ao trabalhar com formatação para números, moedas ou datas, cinco classes são utilizadas (NumberFormat, Locale, Calendar, Date, DateFormat)
	}
}
