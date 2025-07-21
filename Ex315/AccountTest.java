public class AccountTest {
    public static void main(String[] args) {
        // Create Account objects
        Account RichardB = new Account("Richard B", 59.65);
        Account MichaelL = new Account("Michael L", -7.53);

        // Display initial balances
        displayAccount(RichardB);
        displayAccount(MichaelL);

        // Deposit amounts
        RichardB.deposit(154.59);
        MichaelL.deposit(100.45);

        // Display updated balances
        displayAccount(RichardB);
        displayAccount(MichaelL);
    }

    // Static method to display account info
    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n",
            accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
