import java.util.Scanner;

/**

 BasicCalculation class provides methods to perform basic arithmetic operations
 such as addition, subtraction, multiplication, division, and modulus.
 The user is prompted to select an operation and enter the number of values to operate on.
 The class includes the following methods:
 add(double[] numbers): returns the sum of the values in an array of numbers.
 subtract(double[] numbers): returns the difference of the values in an array of numbers.
 multiply(double[] numbers): returns the product of the values in an array of numbers.
 divide(double[] numbers): returns the quotient of the values in an array of numbers.
 modulus(double[] numbers): returns the remainder of the values in an array of numbers.
 The class also includes a main method that prompts the user to select an operation
 and enter the number of values to operate on.
 @author Shayemur
 */
public class BasicCalculation {

    public static void basicCalculations(Scanner input) {

        System.out.println("=====================================");
        System.out.println("|    BASIC ARITHMETIC CALCULATOR    |");
        System.out.println("=====================================");

        int choice;
        int numCount;
        double result;
        double[] numbers;

        System.out.println("Please select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("0. Exit");
        System.out.print("Choice: ");

        choice = input.nextInt();

        System.out.print("How many numbers do you want to enter? ");
        numCount = input.nextInt();

        numbers = new double[numCount];
        for (int i = 0; i < numCount; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }


        switch (choice) {
            case 1 -> {
                result = add(numbers);
                System.out.println("Result: " + result);
            }
            case 2 -> {
                result = subtract(numbers);
                System.out.println("Result: " + result);
            }
            case 3 -> {
                result = multiply(numbers);
                System.out.println("Result: " + result);
            }
            case 4 -> {
                boolean hasZero = false;
                for (double num : numbers) {
                    if (num == 0) {
                        hasZero = true;
                        break;
                    }
                }
                if (hasZero) {
                    System.out.println("Error: Division by zero.");
                } else {
                    result = divide(numbers);
                    System.out.println("Result: " + result);
                }
            }
            case 5 -> {
                    result = modulus(numbers);
                    System.out.println("Result: " + result);
            }
            default -> System.out.println("Invalid choice.");
        }

    }


    public static double add(double[] numbers) {

        /*
         * Calculates the sum of the given numbers.
         *
         * @param numbers an array of double values to be added together
         * @return the sum of the given numbers
        */
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static double subtract(double[] numbers) {
        /*
         * Calculates the result of subtracting each subsequent number in the array
         * from the first number in the array.
         *
         * @param numbers an array of double values to be subtracted from the first value
         * @return the result of subtracting each subsequent number from the first number
        */
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public static double multiply(double[] numbers) {
        /*
         * Calculates the product of the given numbers.
         *
         * @param numbers an array of double values to be multiplied together
         * @return the product of the given numbers
        */
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {

            result *= numbers[i];
        }
        return result;
    }

    public static double divide(double[] numbers) {
        /*
         * Calculates the result of dividing the first number in the array by each
         * subsequent number in the array.
         *
         * @param numbers an array of double values to be divided into the first value
         * @return the result of dividing the first number by each subsequent number
         * @throws ArithmeticException if any of the numbers in the array is zero
         */
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new ArithmeticException("Error: Division by zero.");
            }
            result /= numbers[i];
        }
        return result;
    }

    public static double modulus(double[] numbers) {
        /*
         * Calculates the modulus of two given numbers.
         *
         * @param numbers an array of exactly two double values to be used for the modulus operation
         * @return the modulus of the two given numbers
         * @throws IllegalArgumentException if the length of the array is not exactly 2
         */
        if (numbers.length != 2) {
            throw new IllegalArgumentException("Error: Modulus operation requires exactly 2 operands.");
        }
        return numbers[0] % numbers[1];
    }
}
