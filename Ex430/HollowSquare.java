import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter square size (1 to 20): ");
        int size = input.nextInt();

        // This check the size if its between 1 - 30. Anything more will cause error.
        if (size < 1 || size > 20) {
            System.out.println("Invalid size. Must be between 1 and 20.");
            return;
        }

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // new line after each row
        }
    }
}
