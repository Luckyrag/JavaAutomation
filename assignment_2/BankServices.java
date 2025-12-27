package assignment_2;

// Bank operational Services:

public interface BankServices {
        void deposite(int amount)throws InvalidAmountException;
        void withdraw(int amount)throws InvalidAmountException , InsufficientBalanceException;
        double balanceEnquiry();
}
