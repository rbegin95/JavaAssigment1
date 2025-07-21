import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // The input.NextInt(); Is where the user has to input text.
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();

        System.out.printf("Diameter: %d%n", (2 * radius));
        System.out.printf("Circumference: %.5f%n", (2 * Math.PI * radius));
        
        // The Math.PI is = 3.1415 ... Other words π
        System.out.printf("Area: %.5f%n", (Math.PI * radius * radius));
    }
}
