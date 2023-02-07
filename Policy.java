
import java.util.Scanner;
// Output and Input
public class Policy
{
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
   System.out.println("Please enter the Policy Number: ");
   int policyNumber = scanner.nextInt();
    
      
   System.out.println("Please enter the Provider Name: ");
   String providerName = scanner.nextLine();
   
    System.out.println("Please enter the Policyholder’s First Name: ");
    String firstName = scanner.nextLine();
    
     System.out.println("Please enter the Policyholder’s Last Name: ");
     String lastName = scanner.nextLine();
     
      System.out.println("Please enter the Policyholder’s Age: ");
      int age = scanner.nextInt();
      
       System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
            String smokerStatus = scanner.nextLine();

       
        System.out.println("Please enter the Policyholder’s Height (in inches):  ");
             String height = scanner.nextLine();

        
         System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
              String weight = scanner.nextLine();

        
     //Code is not fully Functional, I am understanding the concept of what its supposed to do but I am a little rusty, Learning more by the minute.
        
     
System.out.println("Policy Number:"+policyNumber);
System.out.println("Provider Name:"+providerName);
System.out.println("Policyholder First Name:"+firstName);
System.out.println("Policyholder Last Name:"+lastName);
System.out.println("Policyholder Age:"+age);
System.out.println("Policyholder Smoker Status:"+smokerStatus);
System.out.println("Policyholder Height:"+height);
System.out.println("Policyholder’s Weight:"+weight);
}
//Variables
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokerStatus;
   private int height;
   private int weight;


public Policy(){
   this.policyNumber="";
   this.providerName = "";
   this.firstName = "";
   this.lastName = "";
   this.age = 0;
   this.smokerStatus = "";
   this.height = 0;
   this.weight = 0;
    }
    
public Policy(String policyNumber, String providerName, String firstName, String lastName,
 int age, String smokerStatus, int height, int weight){
 this.policyNumber= policyNumber;
this.providerName = providerName;
this.firstName = firstName;
this.lastName = lastName;
this.age = age;
this.smokerStatus = smokerStatus;
this.height = height;
this.weight = weight;
}
   public String getPolicyNumber() {
       return policyNumber;
   }

   public void setPolicyNumber(String policyNumber) {
       this.policyNumber = policyNumber;
   }

   public String getProviderName() {
       return providerName;
   }

   public void setProviderName(String providerName) {
       this.providerName = providerName;
   }

   public String getFirstName() {
       return firstName;
   }

   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   public int getAge() {
       return age;
   }

   public void setAge(int age) {
       this.age = age;
   }

 public String getSmokerStatus() {
     return smokerStatus;
   }

 public void setSmokerStatus(String smokerStatus) {
     this.smokerStatus = smokerStatus;
   }

 public int getHeight() {
     return height;
   }

 public void setHeight(int height) {
     this.height = height;
   }

   public int getWeight() {
       return weight;
   }

   public void setWeight(int weight) {
       this.weight = weight;
   }

  
   public double calculateBmi() {
       double bmi = (this.weight * 703) / (this.height * this.height);
       return bmi;
   }

   public double calculatePrice() {
       double price = 600;
       if (this.age > 50) {
            price += 75;
   }
        if (this.smokerStatus.equals("smoker")) {
            price += 100;
   }
        if (this.calculateBmi() > 35) {
            price += (this.calculateBmi() - 35) * 20;
   }
        return price;
   }
}
