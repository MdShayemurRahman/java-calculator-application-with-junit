import java.util.Scanner;

public class TemperatureCalculator {
    public static void temperatureCalculator() {

        System.out.println("=====================================");
        System.out.println("|       TEMPERATURE CALCULATOR       |");
        System.out.println("=====================================");

        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");

        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                // Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                double celsius = input.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", celsius, fahrenheit);
                break;
            case 2:
                // Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                double f = input.nextDouble();
                double c = fahrenheitToCelsius(f);
                System.out.printf("%.2f Fahrenheit = %.2f Celsius\n", f, c);
                break;
            case 3:
                // Celsius to Kelvin
                System.out.print("Enter temperature in Celsius: ");
                celsius = input.nextDouble();
                double kelvin = celsiusToKelvin(celsius);
                System.out.printf("%.2f Celsius = %.2f Kelvin\n", celsius, kelvin);
                break;
            case 4:
                // Kelvin to Celsius
                System.out.print("Enter temperature in Kelvin: ");
                kelvin = input.nextDouble();
                celsius = kelvinToCelsius(kelvin);
                System.out.printf("%.2f Kelvin = %.2f Celsius\n", kelvin, celsius);
                break;
            case 5:
                // Fahrenheit to Kelvin
                System.out.print("Enter temperature in Fahrenheit: ");
                f = input.nextDouble();
                kelvin = fahrenheitToKelvin(f);
                System.out.printf("%.2f Fahrenheit = %.2f Kelvin\n", f, kelvin);
                break;

            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                break;
        }

    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        return celsiusToKelvin(celsius);
    }
}
