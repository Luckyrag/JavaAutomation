package assignment_2;
import java.util.*;

public class BankAppMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String accountHolderName = sc.nextLine();
		String accountNumber = sc.nextLine();
		double balance = sc.nextDouble();

		// Create object 
		BankAccount account = new BankAccount(accountHolderName,accountNumber,balance);
		try {
            account.displayCustomerDetails();
            System.out.println();

            account.deposite(2000);
            System.out.println("Balance: ₹" + account.balanceEnquiry());

            account.withdraw(3000);
            System.out.println("Balance: ₹" + account.balanceEnquiry());

            // Uncomment to test exceptions
            // account.withdraw(10000);
            // account.deposit(-500);

        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nThank you for banking with us!");
		

	}

}
