/*
 * Kurt Kangas
 * CIS 2212 Java Software Development I
 * CFA Pay - Coin Denomination Counter in CFA
 */

import java.util.Scanner;

public class CFAPay {
	@SuppressWarnings("resource")

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		// Program start
		System.out.println("Welcome! This program calculates how many each bill and coin is required to fulfill payroll into a payroll report in CFA.");
		// Program inputs
		System.out.print("\nEnter employee's first name: ");
		String FirstName = input.nextLine();
		System.out.print("Enter employee's last name: ");
		String LastName = input.nextLine();
		System.out.print("Enter employee's CFA pay: ");
		int CFAPay = input.nextInt();
		// Program calculations
		int amountLeft;
		int TenK = CFAPay / 10000;
		amountLeft = CFAPay % 10000;
		int FiveK = amountLeft / 5000;
		amountLeft = amountLeft % 5000;
		int OneK = amountLeft / 1000;
		amountLeft = amountLeft % 1000;
		int FiveHundred = amountLeft / 500;
		amountLeft = amountLeft % 500;
		int OneHundred = amountLeft / 100;
		amountLeft = amountLeft % 100;
		int Fifty = amountLeft / 50;
		amountLeft = amountLeft % 50;
		int TwentyFive = amountLeft / 25;
		amountLeft = amountLeft % 25;
		int Ten = amountLeft / 10;
		amountLeft = amountLeft % 10;
		int Five = amountLeft / (amountLeft + 1);
		// Program outputs
		System.out.println("\nName            Pay   10k  5k  1k 500 100  50  25  10   5");
		System.out.println("=============== ===== === === === === === === === === ===");
		System.out.printf("%-15s", LastName + ", " + FirstName);
		System.out.printf(" %d%4s%4s%4s%4s%4s%4s%4s%4s%4s", CFAPay, TenK, FiveK, OneK, FiveHundred, OneHundred, Fifty, TwentyFive, Ten, Five);
	}
}

