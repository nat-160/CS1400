public class CheckingAccount extends BankAccount {
  // variables
  private int transactionCount;
  private final int FREE_TRANSACTIONS = 3;
  private final double TRANSACTION_FEE = 2.0;
  private final double CLOSING_FEE = 5.0;
  private final double MAINTENANCE_FEE = 10.0;

  // blank constructor
  public CheckingAccount() {
    super();
    transactionCount = 0;
  }

  // constructor with initial balance
  public CheckingAccount(double initialBalance) {
    super(initialBalance);
    transactionCount = 0;
  }

  // deposits amount and deducts a fee if required
  public void deposit(double amount) {
    super.deposit(amount);
    if (++transactionCount > FREE_TRANSACTIONS) {
      super.withdraw(TRANSACTION_FEE);
    }
  }

  // withdraws amount and deducts a fee if required
  public void withdraw(double amount) {
    super.withdraw(amount);
    if (++transactionCount > FREE_TRANSACTIONS) {
      super.withdraw(TRANSACTION_FEE);
    }
  }

  // deducts maintenance fee from balance
  public void deductMaintenanceFee() {
    super.withdraw(MAINTENANCE_FEE);
    transactionCount = 0;
  }

  // deducts a closing fee then transfers to another BankAccount
  public void close(BankAccount other) {
    transactionCount = 0;
    super.withdraw(CLOSING_FEE);
    transfer(getBalance(), other);
  }
}
