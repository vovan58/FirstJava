package ru.intuit.first;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstExample {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
		System.out.println("Сегодня " + sdf.format(cal.getTime()));
		
	}

}
