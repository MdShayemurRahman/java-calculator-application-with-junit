import java.util.Scanner;

public class MassCalculator {

    public static void massCalculator(Scanner input) {
        System.out.println("=====================================");
        System.out.println("|          MASS CALCULATOR          |");
        System.out.println("=====================================");

        System.out.println("Select an option:");
        System.out.println("1. Kilograms to grams");
        System.out.println("2. Kilograms to pounds");
        System.out.println("3. Pounds to kilograms");
        System.out.println("4. Kilograms to metric tonnes");
        System.out.println("5. Kilograms to ounces");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the number of kilograms: ");
                double kilograms = input.nextDouble();
                double grams = kilogramsToGrams(kilograms);
                System.out.println(kilograms + " kilograms = " + grams + " grams");
                break;
            case 2:
                System.out.print("Enter the number of kilograms: ");
                kilograms = input.nextDouble();
                double pounds = kilogramsToPounds(kilograms);
                System.out.println(kilograms + " kilograms = " + pounds + " pounds");
                break;
            case 3:
                System.out.print("Enter the number of pounds: ");
                double poundsInput = input.nextDouble();
                double kilogramsOutput = poundsToKilograms(poundsInput);
                System.out.println(poundsInput + " pounds = " + kilogramsOutput + " kilograms");
                break;
            case 4:
                System.out.print("Enter the number of kilograms: ");
                kilograms = input.nextDouble();
                double tonnes = kilogramsToTonnes(kilograms);
                System.out.println(kilograms + " kilograms = " + tonnes + " metric tonnes");
                break;
            case 5:
                System.out.print("Enter the number of kilograms: ");
                kilograms = input.nextDouble();
                double ounces = kilogramsToOunces(kilograms);
                System.out.println(kilograms + " kilograms = " + ounces + " ounces");
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    public static double kilogramsToGrams(double kilograms) {
        return kilograms * 1000.0;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }

    public static double kilogramsToTonnes(double kilograms) {
        return kilograms / 1000.0;
    }

    public static double kilogramsToOunces(double kilograms) {
        return kilograms * 35.274;
    }
}
