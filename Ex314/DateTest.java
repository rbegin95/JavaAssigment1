public class DateTest {
    public static void main(String[] args) {
        // Create a Date object
        Date today = new Date(7, 18, 2025);

        // Display initial date
        System.out.print("Initial date: ");
        today.displayDate();

        // Change the date
        today.setMonth(1);
        today.setDay(1);
        today.setYear(2026);

        // Display updated date
        System.out.print("Updated date: ");
        today.displayDate();
    }
}
