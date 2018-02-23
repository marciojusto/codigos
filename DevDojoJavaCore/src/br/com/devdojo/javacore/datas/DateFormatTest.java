package br.com.devdojo.javacore.datas;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		DateFormat[] dateFormat = new DateFormat[6];
		dateFormat[0] = DateFormat.getInstance();
		dateFormat[1] = DateFormat.getDateInstance();
		dateFormat[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dateFormat[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dateFormat[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dateFormat[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for (DateFormat dt : dateFormat) {
			System.out.println(dt.format(c.getTime()));
		}
	}
}
