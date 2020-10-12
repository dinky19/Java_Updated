package com.java.dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateFuture {

	public static void main(String[] args) {
		System.out.print(" Enter the date in (dd/mm/yyyy) format: ");
		Scanner sc = new Scanner(System.in);
		String dt = sc.nextLine();
		Date date = new Date();
		boolean b = date.getDate(dt);
		if (b) {
			System.out.println("Entered Date: " + dt);
			System.out.print("Enter number of days after which future date is to be found: ");
			int daysToAdd = sc.nextInt();
			date.getNewDate(daysToAdd);
		}

	}

	class Date {
		private LocalDate date;

		public boolean getDate(String dt) {
			try {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				date = LocalDate.parse(dt, formatter);
				return true;
			} catch (DateTimeParseException e) {
				System.out.print("Entered date is not in a valid format.\n Please enter date in dd/mm/yyyy format");
				return false;
			}
		}

		void getNewDate(int daysToAdd) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate newdate = date.plusDays(daysToAdd);
			System.out.print("Future Date : " + formatter.format(newdate));

		}
	}
}
