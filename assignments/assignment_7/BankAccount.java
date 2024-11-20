public abstract class BankAccount {
  // variables
  private double balance;

  // blank constructor
  public BankAccount() {
    balance = 0;
  }

  // constructor for initialBalance
  public BankAccount(double initialBalance) {
    balance = initialBalance;
  }

  // adds amount to balance
  public void deposit(double amount) {
    balance += amount;
  }

  // subtracts amount from balance
  public void withdraw(double amount) {
    balance -= amount;
  }

  // returns balance
  public double getBalance() {
    return balance;
  }

  // moves amount from this account to another BankAccount
  public void transfer(double amount, BankAccount other) {
    withdraw(amount);
    other.deposit(amount);
  }

  // abstract method defined in each subclass for closing the account
  public abstract void close(BankAccount other);
}
