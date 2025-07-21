public class Checker {
    public static void main(String[] args) {
        for (int row = 0; row < 8; row++) {
            if (row % 2 == 1) {
                System.out.print(" "); // This will add space
            }

            for (int col = 0; col < 8; col++) {
                System.out.print("* ");
            }

            System.out.println(); // new line after each row
        }
    }
}
