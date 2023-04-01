import java.util.Scanner;

public class AdvancedCalculations {
    public static void advancedCalculations(Scanner input) {

        System.out.println("=====================================");
        System.out.println("|         ADVANCE CALCULATOR        |");
        System.out.println("=====================================");

        int choice;
        double num, result, base, expo;

        System.out.println("Please select an operation:");
        System.out.println("1. Square Root");
        System.out.println("2. Cubic Root");
        System.out.println("3. Factorial");
        System.out.println("4. Exponential");
        System.out.println("5. Logarithmic");
        System.out.println("0. Exit");
        System.out.print("Choice: ");
        choice = input.nextInt();


        switch (choice) {
            case 1 -> {
                System.out.print("Enter number: ");
                num = input.nextDouble();
                result = sqrt(num);
                System.out.println("Result: " + result);
            }
            case 2 -> {
                System.out.print("Enter number: ");
                num = input.nextDouble();
                result = cubicRoot(num);
                System.out.println("Result: " + result);
            }
            case 3 -> {
                System.out.print("Enter number: ");
                num = input.nextDouble();
                result = factorial(num);
                System.out.println("Result: " + result);
            }
            case 4 -> {
                System.out.print("Enter base: ");
                base = input.nextDouble();
                System.out.print("Enter exponent: ");
                expo = input.nextDouble();

                result = exponential(base, expo);
                System.out.println("Result: " + result);
            }
            case 5 -> {
                System.out.print("Enter base: ");
                base = input.nextDouble();
                System.out.print("Enter number: ");
                num = input.nextDouble();

                result = logarithm(base, num);
                System.out.println("Result: " + result);
            }
            default -> System.out.println("Invalid choice.");
        }

    }


    public static double sqrt(double num) {
        /*
         * Returns the square root of a given number.
         *
         * @param num a double precision floating-point number whose square root is to be computed
         * @return the square root of the given number
         */
        return Math.sqrt(num);
    }

    public static double cubicRoot(double num) {
        /*
         * Returns the cubic root of a given number.
         *
         * @param num a double precision floating-point number whose cubic root is to be computed
         * @return the cubic root of the given number
         */
        return Math.cbrt(num);
    }

    public static double exponential(double base, double exponent) {
        /*
         * Returns the exponential of a given base and exponent.
         *
         * @param base a double precision floating-point number which is the base of the exponential expression
         * @param exponent a double precision floating-point number which is the exponent of the exponential expression
         * @return the value of the exponential expression base^exponent
         */
        return Math.pow(base, exponent);
    }

    public static double logarithm(double base, double num) {
        /*
         * Returns the logarithm of a given number with a given base.
         *
         * @param base a double precision floating-point number which is the base of the logarithm expression
         * @param num a double precision floating-point number which is the argument of the logarithm expression
         * @return the value of the logarithm expression log_base(num)
         */
        return Math.log(num) / Math.log(base);
    }

    public static double factorial(double num) {
        /*
         * Computes the factorial of a given non-negative number.
         *
         * @param num a non-negative integer whose factorial is to be computed
         * @return the factorial of the given number, which is the product of all positive integers less than or equal to it
         * @throws IllegalArgumentException if the given number is negative
         */
        if (num < 0) {
            return Double.NaN;
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            double result = 1;
            for (int i = 2; i <= num; i++) {
                result *= i;
            }
            return result;
        }
    }

}
