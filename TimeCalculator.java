import java.util.Scanner;

public class TimeCalculator {
    public static void timeCalculator() {

        System.out.println("=====================================");
        System.out.println("|          TIME CALCULATOR          |");
        System.out.println("=====================================");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the unit of the value (seconds, minutes, hours, or days):");
        String unit = scanner.next().toLowerCase();

        System.out.println("Enter the unit to convert to (seconds, minutes, hours, or days):");
        String targetUnit = scanner.next().toLowerCase();

        System.out.println("Enter the value to be converted:");
        double value = scanner.nextDouble();

        double result = 0;
        switch (unit) {
            case "seconds":
                switch (targetUnit) {
                    case "seconds" -> result = value;
                    case "minutes" -> result = secondsToMinutes(value);
                    case "hours" -> result = minutesToHours(secondsToMinutes(value));
                    case "days" -> result = hoursToDays(minutesToHours(secondsToMinutes(value)));
                }
                break;
            case "minutes":
                result = switch (targetUnit) {
                    case "seconds" -> minutesToSeconds(value);
                    case "minutes" -> value;
                    case "hours" -> minutesToHours(value);
                    case "days" -> hoursToDays(minutesToHours(value));
                    default -> result;
                };
                break;
            case "hours":
                result = switch (targetUnit) {
                    case "seconds" -> hoursToSeconds(value);
                    case "minutes" -> hoursToMinutes(value);
                    case "hours" -> value;
                    case "days" -> hoursToDays(value);
                    default -> result;
                };
                break;
            case "days":
                result = switch (targetUnit) {
                    case "seconds" -> daysToSeconds(value);
                    case "minutes" -> daysToMinutes(value);
                    case "hours" -> daysToHours(value);
                    case "days" -> value;
                    default -> result;
                };
                break;
        }

        System.out.printf("%.2f %s is equal to %.2f %s", value, unit, result, targetUnit);
    }

    public static double minutesToHours(double minutes) {
        /*
         Converts minutes to hours.
         @param minutes the number of minutes to be converted to hours
         @return the converted number of hours
         */
        return minutes / 60.0;
    }

    public static double hoursToDays(double hours) {
        /*
         Converts hours to days.
         @param hours the number of hours to be converted to days
         @return the converted number of days
         */
        return hours / 24.0;
    }

    public static double secondsToMinutes(double seconds) {
        /*
         Converts seconds to minutes.
         @param seconds the number of seconds to be converted to minutes
         @return the converted number of minutes
         */
        return seconds / 60.0;
    }

    public static double daysToMinutes(double days) {
        /*
         Converts days to minutes.
         @param days the number of days to be converted to minutes
         @return the converted number of minutes
         */
        return days * 24.0 * 60.0;
    }

    public static double minutesToSeconds(double minutes) {
        /*
         Converts minutes to seconds.
         @param minutes the number of minutes to be converted to seconds
         @return the converted number of seconds
         */
        return minutes * 60.0;
    }

    public static double hoursToSeconds(double hours) {
        /*
         Converts hours to seconds.
         @param hours the number of hours to be converted to seconds
         @return the converted number of seconds
         */
        return hours * 60.0 * 60.0;
    }

    public static double hoursToMinutes(double hours) {
        /*
         Converts hours to minutes.
         @param hours the number of hours to be converted to minutes
         @return the converted number of minutes
         */
        return hours * 60.0;
    }

    public static double daysToSeconds(double days) {
        /*
         Converts days to seconds.
         @param days the number of days to be converted to seconds
         @return the converted number of seconds
         */
        return days * 24.0 * 60.0 * 60.0;
    }

    public static double daysToHours(double days) {
        /*
         Converts days to hours.
         @param days the number of days to be converted to hours
         @return the converted number of hours
         */
        return days * 24.0;
    }

}
