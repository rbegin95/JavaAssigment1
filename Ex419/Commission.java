import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define item prices.
        double[] itemPrices = {0.0, 239.99, 129.75, 99.95, 350.89};

        double totalSales = 0.0;

        System.out.println("Enter item numbers sold by the salesperson (1–4).");
        System.out.println("Enter 0 to finish.");

        while (true) {
            System.out.print("Enter item number: ");
            int item = input.nextInt();

            if (item == 0) {
                break; 
            }

            if (item >= 1 && item <= 4) {
                totalSales += itemPrices[item];
            } else {
                System.out.println("Invalid item number. Please enter a number between 1 and 4.");
            }
        }

        double commission = totalSales * 0.09;
        double totalEarnings = 200 + commission;

        System.out.printf("Total sales: $%.2f%n", totalSales);
        System.out.printf("Commission (9%%): $%.2f%n", commission);
        System.out.printf("Total earnings: $%.2f%n", totalEarnings);
    }
}
