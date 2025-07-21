import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user input
        System.out.print("First name: ");
        String firstName = input.nextLine();

        System.out.print("Last name: ");
        String lastName = input.nextLine();

        System.out.print("Gender: ");
        String gender = input.nextLine();

        System.out.print("Birth day (1–31): ");
        int day = input.nextInt();

        System.out.print("Birth month (1–12): ");
        int month = input.nextInt();

        System.out.print("Birth year: ");
        int year = input.nextInt();

        System.out.print("Height (in inches): ");
        double height = input.nextDouble();

        System.out.print("Weight (in pounds): ");
        double weight = input.nextDouble();

        HealthProfile profile = new HealthProfile(firstName, lastName, gender, day, month, year, height, weight);

        // Output results
        System.out.println("\n--- Health Profile Summary ---");
        System.out.printf("Name: %s %s%n", profile.getFirstName(), profile.getLastName());
        System.out.println("Gender: " + profile.getGender());
        System.out.printf("Date of Birth: %02d/%02d/%d%n", profile.getBirthDay(), profile.getBirthMonth(), profile.getBirthYear());
        System.out.printf("Height: %.1f inches%n", profile.getHeightInInches());
        System.out.printf("Weight: %.1f pounds%n", profile.getWeightInPounds());
        System.out.println("Age: " + profile.getAge() + " years");
        System.out.printf("BMI: %.1f%n", profile.getBMI());
        System.out.println("Max Heart Rate: " + profile.getMaxHeartRate() + " bpm");
        System.out.println("Target Heart Rate Range: " + profile.getTargetHeartRateRange());

        // Display BMI chart
        System.out.println("\n--- BMI Chart ---");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
    }
}
