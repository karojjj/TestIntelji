package com.replit.exercises;
import java.util.Scanner;
public class Replit43 {

	public static void main(String[] args) {
		/*
		 * Write a program to input number "Input a number between 1-12" and when you
		 * input a number it should display the month using Scanner and Switch
		 * statement. case: 1 will display January case: 12 will display December
		 * Anything outside of 12 will display "Invalid"
		 */
		Scanner med = new Scanner(System.in); // Write a program to input number
		System.out.println("Input a number between 1-12");

		int num = med.nextInt();
		String month;

		switch (num) {

		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		default:
			month = "Invalid";
		}
		System.out.println(month);
	}

}
