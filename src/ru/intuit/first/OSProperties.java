package ru.intuit.first;

import java.util.Enumeration;
import java.util.Properties;

public class OSProperties {

	public static void main(String[] args) {

//		System.out.println(System.getProperty("os.name"));
//		System.out.println(System.getProperty("os.arch"));
//		System.out.println(System.getProperty("os.version"));
//		System.out.println(System.getProperty("os.name"));
//		System.out.println(
//		System.getProperties().list(System.out); 
				
//				);
		System.out.println("Количество свойств = " + System.getProperties().size());
		Enumeration<?> spenum = System.getProperties().propertyNames();
		while (spenum.hasMoreElements()) {
			  String pn = spenum.nextElement().toString();
		       System.out.println(pn +" | " + System.getProperty(pn));
//			
//		
	}

}
}
