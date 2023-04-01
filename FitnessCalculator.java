import java.util.Scanner;

public class FitnessCalculator {

    public static void fitnessCalculator() {

        System.out.println("=====================================");
        System.out.println("|         FITNESS CALCULATOR         |");
        System.out.println("=====================================");

        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("1. Calculate BMI");
        System.out.println("2. Calculate Calories Burned");
        System.out.println("3. Calculate Target Heart Rate");
        System.out.println("4. Calculate Maximum Heart Rate");
        System.out.println("5. Calculate Ideal Weight");

        // get user choice
        System.out.print("\nEnter your choice: ");
        choice = input.nextInt();

        // perform calculation based on user choice
        switch (choice) {
            case 1:
                // Calculate BMI
                System.out.print("Enter your weight in kg: ");
                double weight = input.nextDouble();
                System.out.print("Enter your height in meters: ");
                double height = input.nextDouble();
                double bmi = calculateBMI(weight, height);
                System.out.printf("Your BMI is: %.2f\n", bmi);
                break;
            case 2:
                // Calculate Calories Burned
                System.out.print("Enter your weight in kg: ");
                weight = input.nextDouble();
                System.out.print("Enter the activity you performed (running, cycling, swimming, etc.): ");
                String activity = input.next();
                System.out.print("Enter the duration of the activity in minutes: ");
                int duration = input.nextInt();
                double caloriesBurned = calculateCaloriesBurned(weight, activity, duration);
                System.out.printf("You burned %.2f calories during your %s activity.\n", caloriesBurned, activity);
                break;
            case 3:
                // Calculate Target Heart Rate
                System.out.print("Enter your age: ");
                int age = input.nextInt();
                int targetHeartRate = calculateHeartRate(age);
                System.out.printf("Your target heart rate is: %d\n", targetHeartRate);
                break;
            case 4:
                // Calculate Maximum Heart Rate
                System.out.print("Enter your age: ");
                age = input.nextInt();
                int maxHeartRate = calculateMaxHeartRate(age);
                System.out.printf("Your maximum heart rate is: %d\n", maxHeartRate);
                break;
            case 5:
                // Calculate Ideal Weight
                System.out.print("Enter your height in cm: ");
                height = input.nextDouble();
                System.out.print("Enter your gender (male/female): ");
                String gender = input.next();
                double idealWeight = calculateIdealWeight(height, gender);
                System.out.printf("Your ideal weight is: %.2f kg\n", idealWeight);
                break;
            default:
                System.out.println("Invalid choice.");

        }
    }

    /**

     Calculates the body mass index (BMI) of a person given their weight and height.
     @param weight The weight of the person in kilograms.
     @param height The height of the person in meters.
     @return The BMI of the person.
     */
    public static double calculateBMI(double weight, double height) {
        return weight / Math.pow(height, 2);
    }
    /**

     Calculates the number of calories burned by a person during a certain activity.
     @param weight The weight of the person in kilograms.
     @param activity The activity being performed.
     @param duration The duration of the activity in minutes.
     @return The number of calories burned during the activity.
     */
    public static double calculateCaloriesBurned(double weight, String activity, int duration) {
        double caloriesBurned = 0;
        switch (activity) {
            case "running" -> caloriesBurned = weight * 0.63 * duration;
            case "swimming" -> caloriesBurned = weight * 0.84 * duration;
            case "cycling" -> caloriesBurned = weight * 0.3 * duration;
            default -> System.out.println("Invalid activity entered!");
        }
        return caloriesBurned;
    }
    /**

     Calculates the maximum heart rate of a person based on their age.
     @param age The age of the person in years.
     @return The maximum heart rate of the person.
     */
    public static int calculateMaxHeartRate(int age) {
        return 220 - age;
    }
    /**

     Calculates the target heart rate of a person during exercise.
     @param age The age of the person in years.
     @return The target heart rate of the person.
     */
    public static int calculateHeartRate(int age) {
        return (int) (0.7 * (220 - age));
    }
    /**

     Calculates the ideal weight of a person based on their height and gender.
     @param height The height of the person in centimeters.
     @param gender The gender of the person.
     @return The ideal weight of the person.
     */
    public static double calculateIdealWeight(double height, String gender) {
        double idealWeight = 0;
        switch (gender) {
            case "male" -> idealWeight = 50 + 0.91 * (height - 152.4);
            case "female" -> idealWeight = 45.5 + 0.91 * (height - 152.4);
            default -> System.out.println("Invalid gender entered!");
        }
        return idealWeight;
    }
}



