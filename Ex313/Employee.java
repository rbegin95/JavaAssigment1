public class Employee {
   
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary); 
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // This will calculate yearly salary.
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // This will give raise by pertengage (%)
    public void giveRaise(double percentage) {
        if (percentage > 0) {
            monthlySalary += monthlySalary * percentage;
        }
    }
}
