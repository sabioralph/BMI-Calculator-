import java.util.Scanner;

/**
 * Name: Ralph Sabio
 * ID: 991646078
 * Date: JAN 25 2025
 * This is the continuation of the bmi calculator with height data validation
 */


public class App {
    public static void main(String[] args) throws Exception {
        // Variables to get user input
    double weight = 0.0; // weight in pounds
    double height = 0; // height in inches
// Variable to model the computed BMI
    double computedBMI;
// Conversion constants
    final double POUND_TO_KG = 0.45359237 ;
    final double INCH_TO_METER = 0.0254;
//Create a Scanner object to get input from the keyboard
    Scanner scan = new Scanner(System.in);
// loop to continue till the user decides to end the computation
// loop control variable
    boolean flag = true;
   do {
// loop for a valid value for the weight
        int weightInputCount = 1;
        while (weightInputCount <= 2){
// Prompt user for weight input
        System.out.println("Please enter weight in pounds:");
// Read the weight value entered by the user
        weight = scan.nextDouble();
// Check if the input value for the weight is valid
        if (weight > 0 && weight < 300){
          break;
        } else {
          System.out.println("The input value for the weight " + weight + " is invalid.");
// If it is the second attempt, terminate the program
        if (weightInputCount == 2) System.exit(101);
        System.out.println("Please re-enter the value.");
        weightInputCount++;
        }
       }
// Prompt user for height input
    
        int heightInputCount= 1;
        //data validation for the height
        while(heightInputCount<=2){
            System.out.println("Please enter height in inches:");
// Read the height value entered by the user
            height = scan.nextInt(); 
        if (0 < height && height < 90  ){
            break;
        }else{
        System.out.println("The input value for the height " +
        height + " is invalid.");
        // If it is the second attempt, terminate the program
        if (heightInputCount == 2) System.exit(101);
        System.out.println("Please re-enter the value.");
        heightInputCount++;
        }
        }

        //Convert the input weight in pounds to weight in kilograms
        double weightInKilograms = POUND_TO_KG * weight;
        //Convert input height in inches to height in meters
        double heightInMeters = INCH_TO_METER * height;
            //Compute BMI
        computedBMI = weightInKilograms / (heightInMeters * heightInMeters);
            // Compute interpretation for the computed BMI
   


// Compute interpretation for the computed BMI
    String bmiInterpretation =""; // Interpretation for the computed BMI
// compute interpretation for the computed BMI
    if(computedBMI < 18.5) {
        bmiInterpretation = "Underwirght";
    }
    if ((computedBMI >= 18.5) && (computedBMI < 25.0) ){
       bmiInterpretation = "Normal";
    }
    if ((computedBMI >= 25.0) && (computedBMI < 30.0)) {
       bmiInterpretation = "Overweight";
       }
    if(computedBMI >= 30) {
      bmiInterpretation = "Obese";
    }
// output
    System.out.printf("Weight: %6.2f pounds %nHeight: %6.2f inches %n" +
       "Computed BMI: %6.2f kilograms per meter square %n",
      weight, height, computedBMI);
     System.out.printf("Computed BMI indicates that you are %s%n",
      bmiInterpretation);
// prompt the user to continue or end the computation
      System.out.println("Will you like to continue the computation?" + "\nPlease enter 1 to continue and 2 to end the computation:");
// user response
      int response = scan.nextInt();
     if (response == 2) flag = false;
     } while (flag);
    scan.close();
   System.out.println("Thank you for using the BMI calculator");
      } // end of main method
} // end of the App class
