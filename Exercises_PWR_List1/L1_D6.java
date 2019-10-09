import java.util.Calendar;
import java.text.*;
public class WhatDate {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat pattern = new SimpleDateFormat("dd, MM, yyyy");
		System.out.println("Dzisiaj jest " + pattern.format(c.getTime()));
		c.roll(c.DATE, -1);
		System.out.println("Wczoraj był " + pattern.format(c.getTime()));
		c.roll(c.DATE, 2);
		System.out.println("Jutro będzie " + pattern.format(c.getTime()));
	} //main
} //WhatDate


