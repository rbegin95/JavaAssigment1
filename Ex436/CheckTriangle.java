import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 3 sides of triangle
        System.out.print("Enter side a: ");
        double a = input.nextDouble();

        System.out.print("Enter side b: ");
        double b = input.nextDouble();

        System.out.print("Enter side c: ");
        double c = input.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Sides must be positive and non-zero.");
            return;
        }

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("These values can represent the sides of a triangle.");
        } else {
            System.out.println("These values CANNOT form a triangle.");
        }
    }
}
