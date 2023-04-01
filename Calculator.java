import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            try {

                System.out.println("=====================================");
                System.out.println("|              CALCULATOR           |");
                System.out.println("=====================================");

                System.out.println("\nPlease select an option:");

                System.out.println("1. Basic Calculations");
                System.out.println("2. Advanced Calculations");
                System.out.println("3. Unit Converter");
                System.out.println("4. Mass Calculator");
                System.out.println("5. Time Calculator");
                System.out.println("6. Financial Calculator");
                System.out.println("7. Temperature Calculator");
                System.out.println("8. Grade Calculator");
                System.out.println("9. Fitness Calculator");
                System.out.println("10. Geometric Calculator");
                System.out.println("0. Exit");
                System.out.print("Choice: ");

                choice = input.nextInt();

                switch (choice) {
                    case 1 -> BasicCalculation.basicCalculations(input);
                    case 2 -> AdvancedCalculations.advancedCalculations(input);
                    case 3 -> UnitConverter.unitConverter(input);
                    case 4 -> MassCalculator.massCalculator(input);
                    case 5 -> TimeCalculator.timeCalculator();
                    case 6 -> FinancialCalculator.financialCalculator();
                    case 7 -> TemperatureCalculator.temperatureCalculator();
                    case 8 -> GradeCalculator.gradeCalculator();
                    case 9 -> FitnessCalculator.fitnessCalculator();
                    case 10 -> GeometricsCalculator.geometricsCalculator();
                    case 0 -> System.out.println("Exiting calculator...");
                    default -> System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer value.");
                input.nextLine(); // consume the invalid input to avoid an infinite loop
                choice = -1; // set choice to an invalid value to repeat the loop
            }

            System.out.println();

        } while (choice != 0);

        input.close();
    }
}
