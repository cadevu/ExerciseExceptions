package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class program {

	public static void main(String[] args) {

		try {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double limit = sc.nextDouble();
			Account account = new Account(number, holder, balance, limit);
			System.out.print("Enter amount for withdraw: ");
			Double withdraw = sc.nextDouble();
			account.withdraw(withdraw);
			System.out.println("New balance: " +account.getBalance());
			sc.close();
		}
		catch (DomainException e) {
			System.out.println("Withdraw error: "+e.getMessage());
		}
//		catch (RuntimeException e) {
//			System.out.println("Invalid input.");
//		}
		
	}

}
