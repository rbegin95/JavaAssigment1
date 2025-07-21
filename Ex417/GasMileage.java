import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        while (true) {
            System.out.print("Enter miles driven (-1 to quit): ");
            int miles = input.nextInt();

            if (miles == -1) {
                break; // sentinel value to end loop
            }

            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            // Calculates the mile per gallon
            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);

            // Add to totals
            totalMiles += miles;
            totalGallons += gallons;

            // Calculate and display combined.
            double totalMPG = (double) totalMiles / totalGallons;
            System.out.printf("Total miles per gallon so far: %.2f%n%n", totalMPG);
        }

        System.out.println("Program ended.");
    }
}
