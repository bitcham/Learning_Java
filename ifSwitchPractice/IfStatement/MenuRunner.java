package IfStatement;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number1: ");
		int number1 = scanner.nextInt();
		System.out.printf("The number you entered is %d", number1).println();

		System.out.println("Enter Number2: ");
		int number2 = scanner.nextInt();
		System.out.printf("The number you entered is %d", number2).println();

		System.out.println("1 - Add");
		System.out.println("2 - Substract");
		System.out.println("3 - Multiply");
		System.out.println("4 - Divide");
		System.out.println("Choose operation: ");
		int choice = scanner.nextInt();

		// nestedIfElse(number1, number2, choice);
		switchMethod(number1, number2, choice);
	}

	private static void nestedIfElse(int number1, int number2, int choice) {
		int result = 0;

		if (choice == 1) {
			result = number1 + number2;
			System.out.println("The result is " + result);
		} else if (choice == 2) {
			result = number1 - number2;
			System.out.println("The result is " + result);
		} else if (choice == 3) {
			result = number1 * number2;
			System.out.println("The result is " + result);
		} else if (choice == 4) {
			result = number1 / number2;
			System.out.println("The result is " + result);
		} else {
			System.out.println("Wrong input");
		}
	}

	private static void switchMethod(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.println("The result is " + (number1 + number2));
			break;
		case 2:
			System.out.println("The result is " + (number1 - number2));
			break;
		case 3:
			System.out.println("The result is " + (number1 * number2));
			break;
		case 4:
			System.out.println("The result is " + (number1 / number2));
			break;
		default:
			System.out.println("Wrong input");
			break;
		}
	}

}
