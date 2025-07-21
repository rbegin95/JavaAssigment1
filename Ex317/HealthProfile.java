public class HealthProfile {
    // Attributes
    private String firstName;
    private String lastName;
    private String gender;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private double heightInInches;
    private double weightInPounds;

    // Constructor
    public HealthProfile(String firstName, String lastName, String gender, int birthDay, int birthMonth, int birthYear, double heightInInches, double weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setGender(String gender) { this.gender = gender; }
    public void setBirthDay(int birthDay) { this.birthDay = birthDay; }
    public void setBirthMonth(int birthMonth) { this.birthMonth = birthMonth; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }
    public void setHeightInInches(double heightInInches) { this.heightInInches = heightInInches; }
    public void setWeightInPounds(double weightInPounds) { this.weightInPounds = weightInPounds; }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGender() { return gender; }
    public int getBirthDay() { return birthDay; }
    public int getBirthMonth() { return birthMonth; }
    public int getBirthYear() { return birthYear; }
    public double getHeightInInches() { return heightInInches; }
    public double getWeightInPounds() { return weightInPounds; }

    // Since we haven't learned java.time. I decided to hardcode it.
    public int getAge() {
        int currentYear = 2025;
        return currentYear - birthYear;
    }

    // Max heart rate = 220 - age
    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRateRange() {
        int max = getMaxHeartRate();
        double lower = max * 0.50;
        double upper = max * 0.85;
        return String.format("%.1f - %.1f bpm", lower, upper);
    }

    public double getBMI() {
        return (weightInPounds * 703) / (heightInInches * heightInInches);
    }
}
