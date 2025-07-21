public class EmployeeTest {
    public static void main(String[] args) {
        // Created two employed Students
        Employee Richard = new Employee("Richard", "Begin", 3000.00);
        Employee Jacob = new Employee("Jacob", "Bakun", 3500.00);

        // This display the salary before the raise.
        System.out.printf("%s %s's yearly salary: $%.2f%n",
            Richard.getFirstName(), Richard.getLastName(), Richard.getYearlySalary());

        System.out.printf("%s %s's yearly salary: $%.2f%n",
            Jacob.getFirstName(), Jacob.getLastName(), Jacob.getYearlySalary());

        // Give each employee a 10% raise
        Richard.giveRaise(0.10);
        Jacob.giveRaise(0.10);

        System.out.println("\nAfter 10% raise:");

        // This will display the salary after the raise.
        System.out.printf("%s %s's yearly salary: $%.2f%n",
            Richard.getFirstName(), Richard.getLastName(), Richard.getYearlySalary());

        System.out.printf("%s %s's yearly salary: $%.2f%n",
            Jacob.getFirstName(), Jacob.getLastName(), Jacob.getYearlySalary());
    }
}
