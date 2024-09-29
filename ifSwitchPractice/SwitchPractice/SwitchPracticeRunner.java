package SwitchPractice;

import java.util.Scanner;

public class SwitchPracticeRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number between 0 and 6 to choose a day");
		System.out.println("0(Sunday) to 6(Saturday)");
		int dayNumber = scanner.nextInt();
		if(dayNumber >=0 && dayNumber <=6) {
			if (isWeekDay(dayNumber)) {
			System.out.println("The day is a Week Day.");
			}
			System.out.println(determineNameOfDay(dayNumber));
		} else {
			System.out.println("Wrong input.");
		}
		
		
		System.out.println("Enter the number between 1 and 12 to choose a day");
		System.out.println("1(January) to 12(December)");
		int monthNumber = scanner.nextInt();
		if (monthNumber >= 1 && monthNumber <= 12) {
			System.out.println(determineNameOfMonth(monthNumber));
		} else {
			System.out.println("Wrong input.");
		}
		
		scanner.close();
		
		
	}

	public static boolean isWeekDay(int dayNumber) {
		if (!(dayNumber == 0) && !(dayNumber == 6)) {
			return true;
		}
		return false;
	}

	public static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Wrong input";
		}
	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "Wrong input";
		}
	}
}
