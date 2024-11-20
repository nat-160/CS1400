public class SavingsAccount extends BankAccount {
  // variables
  private double interestRate;

  // constructor with rate
  public SavingsAccount(double rate) {
    super();
    interestRate = rate;
  }

  // constructor with rate and initial balance
  public SavingsAccount(double rate, double initialBalance) {
    super(initialBalance);
    interestRate = rate;
  }

  // adds interest to balance
  public void addInterest() {
    deposit(getBalance() * interestRate / 100);
  }

  // transfers balance to another BankAccount
  public void close(BankAccount other) {
    transfer(getBalance(), other);
  }
}
