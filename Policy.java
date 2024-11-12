import java.util.Scanner;
/**
 * The Policy class represents an insurance policy, and details about the policyholder
 * Like their name, age, smoking status, height, weight, and policy number. 
 * also methods for calculating the Body Mass Index (BMI) and price of the policy.
 */
public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus; 
    private double height; 
    private double weight; 
  /**
     * Default constructor that starts the Policy with default values.
     */
    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0;
        this.weight = 0;
    }
 /**
     * Parameterized constructor to create a Policy object with specified values.
     * 
     * @param policyNumber Unique identifier for the insurance policy.
     * @param providerName Name of the insurance provider.
     * @param firstName The first name of the policyholder.
     * @param lastName The last name of the policyholder.
     * @param age Age of the policyholder.
     
     * @param smokingStatus The smoking status of the policyholder
     
     * @param height Height of the policyholder in inches.
     * @param weight Weight of the policyholder in pounds.
     */
    public Policy(String policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Getters

    /**
     * Gets the policy number.
     * 
     * @return The policy number.
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double calculateBMI() {
        if (height > 0) {
            return (weight * 703.0) / (height * height);
        }
        return 0;
    }
 /**
     * Calculates the Insurance Policy price based on the policyholder's Age, Smoking Status, and BMI.
     * 
     * @return The calculated policy price.
     */
    public double calculatePrice() {
        double baseFee = 600.0;
        double additionalFee = 0.0;

        if (age > 50) {
            additionalFee += 75;
        }
        if (smokingStatus.equals("smoker")) {
            additionalFee += 100;
        }

        double bmi = calculateBMI();
        if (bmi > 35) {
            additionalFee += (bmi - 35) * 20;
        }

        return baseFee + additionalFee;
    }
 /**
     * The main method that allows the user to input policyholder details and outputs the policy information.
     */
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the Policy Number: ");
        String policyNumber = scanner.nextLine();

        System.out.print("Please enter the Provider Name: ");
        String providerName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int age = scanner.nextInt();

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.next();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double height = scanner.nextDouble();

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double weight = scanner.nextDouble();

        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        // Output
        System.out.printf("Policy Number: %s%n", policy.getPolicyNumber());
        System.out.printf("Provider Name: %s%n", policy.getProviderName());
        System.out.printf("Policyholder’s First Name: %s%n", policy.getFirstName());
        System.out.printf("Policyholder’s Last Name: %s%n", policy.getLastName());
        System.out.printf("Policyholder’s Age: %d%n", policy.getAge());
        System.out.printf("Policyholder’s Smoking Status: %s%n", policy.getSmokingStatus());
        System.out.printf("Policyholder’s Height: %.1f inches%n", policy.getHeight());
        System.out.printf("Policyholder’s Weight: %.1f pounds%n", policy.getWeight());
        System.out.printf("Policyholder’s BMI: %.2f%n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f%n", policy.calculatePrice());

        scanner.close();
    }
}
