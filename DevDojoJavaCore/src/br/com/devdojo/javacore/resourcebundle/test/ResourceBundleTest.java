package br.com.devdojo.javacore.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
	
	public static void main(String[] args) {

		ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
		System.out.println(rb.getString("oi"));
		System.out.println(rb.getString("bom.dia"));
		
		rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		System.out.println(rb.getString("oi"));
		System.out.println(rb.getString("bom.dia"));
		
		System.out.println(rb.getString("show" ));
	}
}
