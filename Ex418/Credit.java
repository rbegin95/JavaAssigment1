import java.util.Scanner;

public class Credit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number (7-16 digits): ");
        String accountNumber = input.nextLine();

        // Added extra layer of protection by making account number between 7-16 digits.
        if (accountNumber.length() < 7 || accountNumber.length() > 16 || !accountNumber.matches("\\d+")) {
            System.out.println("Invalid account number. It must be between 7 and 16 digits and contain only numbers.");
            return;
        }
        
        System.out.print("Enter beginning balance: ");
        int beginningBalance = input.nextInt();

        System.out.print("Enter total charges: ");
        int totalCharges = input.nextInt();

        System.out.print("Enter total credits: ");
        int totalCredits = input.nextInt();

        System.out.print("Enter credit limit: ");
        int creditLimit = input.nextInt();

        int newBalance = beginningBalance + totalCharges - totalCredits;

        System.out.println("New balance is: " + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded.");
        }
    }
}
