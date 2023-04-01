import java.util.Scanner;

public class UnitConverter {
    public static void unitConverter(Scanner input) {

        System.out.println("=====================================");
        System.out.println("|           UNIT CONVERTER          |");
        System.out.println("=====================================");

        int choice;
        double value, result;

        System.out.println("Please select a conversion:");

        System.out.println("1. Kilometers to Meters");
        System.out.println("2. Kilometers to Miles");
        System.out.println("3. Centimeter to Feet");
        System.out.println("4. Feet to Centimeter");
        System.out.println("5. Meter to Yard");

        System.out.print("Choice: ");
        choice = input.nextInt();

        System.out.print("Enter value: ");
        value = input.nextDouble();

        switch (choice) {
            case 1 -> {
                result = kilometersToMeters(value);
                System.out.println("Result: " + result);

            }
            case 2 -> {
                result = kilometersToMiles(value);
                System.out.println("Result: " + result);
            }
            case 3 -> {

                result = centimeterToFeet(value);
                System.out.println("Result: " + result);

            }
            case 4 -> {
                result = feetToCentimeter(value);
                System.out.println("Result: " + result);
                
            }
            case 5 -> {
                result = meterToYard(value);
                System.out.println("Result: " + result);
            }

            default -> System.out.println("Invalid choice.");
        }
    }

    private static double meterToYard(double value) {
        return value * 1.09361;
    }


    private static double centimeterToFeet(double value) {
        return value / 30.48;
    }


    public static double CelsiusToFahrenheit(double celsius) {
        /*
         Converts Celsius temperature to Fahrenheit temperature.
         @param celsius temperature value in Celsius
         @return temperature value in Fahrenheit
         */
        return (celsius * 9 / 5) + 32;
    }



    public static double kilometersToMeters(double kilometers) {
        /*
         Converts kilometers to meters.
         @param kilometers distance value in kilometers
         @return distance value in meters
         */
        return kilometers * 1000;
    }
    public static double kilometersToMiles(double kilometers) {
        /*
         Converts kilometers to miles.
         @param kilometers distance value in kilometers
         @return distance value in miles
         */
        return kilometers * 0.621371;
    }

    public static double feetToCentimeter(double feet) {
        /*
         Converts feet to centimeters.
         @param feet distance value in feet
         @return distance value in centimeters
         */
        return feet * 30.48;
    }
}
