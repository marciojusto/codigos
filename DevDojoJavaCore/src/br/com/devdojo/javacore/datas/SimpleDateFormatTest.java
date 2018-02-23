package br.com.devdojo.javacore.datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		//String mascara = "yyyy.MM.dd G 'as' HH:mm:ss z";
		String mascara = "'Rio de Janeiro, ' dd 'de' MMM 'de' yyyy";
		SimpleDateFormat formatador = new SimpleDateFormat(mascara);
		System.out.println(formatador.format(c.getTime()));
		
	}
}
