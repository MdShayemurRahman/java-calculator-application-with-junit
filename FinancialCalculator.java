import java.util.Scanner;

public class FinancialCalculator {
    public static void financialCalculator() {
        Scanner input = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("|        FINANCIAL CALCULATOR        |");
        System.out.println("=====================================");

        System.out.println("1. Tax Calculator");
        System.out.println("2. Simple Interest Calculator");
        System.out.println("3. Compound Interest Calculator");
        System.out.println("4. Payment Calculator");
        System.out.println("5. Present Value Calculator");
        System.out.println("6. Future Value Calculator");

        double presentValue, futureValue;

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                // Tax Calculator
                System.out.print("Enter your income: ");
                double income = input.nextDouble();
                System.out.print("Enter tax rate (%): ");
                double taxRate = input.nextDouble();
                double tax = calculateTax(income, taxRate);
                System.out.printf("Your tax is: $%.2f\n", tax);
                break;
            case 2:
                // Simple Interest Calculator
                System.out.print("Enter principal amount: ");
                double principal = input.nextDouble();
                System.out.print("Enter interest rate (%): ");
                double interestRate = input.nextDouble();
                System.out.print("Enter time period (years): ");
                double time = input.nextDouble();
                double simpleInterest = calculateSimpleInterest(principal, interestRate, time);
                System.out.printf("Your simple interest is: $%.2f\n", simpleInterest);
                break;
            case 3:
                // Compound Interest Calculator
                System.out.print("Enter principal amount: ");
                principal = input.nextDouble();
                System.out.print("Enter interest rate (%): ");
                interestRate = input.nextDouble();
                System.out.print("Enter time period (years): ");
                time = input.nextDouble();
                System.out.print("Enter number of compounding periods per year: ");
                int n = input.nextInt();
                double compoundInterest = calculateCompoundInterest(principal, interestRate, time, n);
                System.out.printf("Your compound interest is: $%.2f\n", compoundInterest);
                break;
            case 4:
                // Payment Calculator
                System.out.print("Enter principal amount: ");
                principal = input.nextDouble();
                System.out.print("Enter interest rate (%): ");
                interestRate = input.nextDouble();
                System.out.print("Enter time period (years): ");
                time = input.nextDouble();
                System.out.print("Enter number of payments: ");
                n = input.nextInt();
                double payment = calculatePayment(principal, interestRate, time, n);
                System.out.printf("Your payment is: $%.2f\n", payment);
                break;
            case 5:
                // Present Value Calculator
                System.out.print("Enter future value: ");
                 futureValue = input.nextDouble();
                System.out.print("Enter interest rate (%): ");
                interestRate = input.nextDouble();
                System.out.print("Enter time period (years): ");
                time = input.nextDouble();
                 presentValue = calculatePresentValue(futureValue, interestRate, time);
                System.out.printf("Your present value is: $%.2f\n", presentValue);
                break;
            case 6:
                // Future Value Calculator
                System.out.print("Enter present value: ");
                presentValue = input.nextDouble();
                System.out.print("Enter interest rate (%): ");
                interestRate = input.nextDouble();
                System.out.print("Enter time period (years): ");
                time = input.nextDouble();
                 futureValue = calculateFutureValue(presentValue, interestRate
                        , time);
                System.out.printf("Your future value is: $%.2f\n", futureValue);
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
    /**

     Calculates the tax to be paid given the income and tax rate.
     @param income the income to be taxed
     @param taxRate the tax rate in percentage
     @return the tax amount to be paid
     */
    public static double calculateTax(double income, double taxRate) {
        return income * (taxRate / 100.0);
    }
    /**

     Calculates the simple interest given the principal, interest rate, and time.
     @param principal the principal amount
     @param interestRate the interest rate in percentage
     @param time the time period in years
     @return the simple interest amount
     */
    public static double calculateSimpleInterest(double principal, double interestRate, double time) {
        return principal * (interestRate / 100.0) * time;
    }
    /**

     Calculates the compound interest given the principal, interest rate, time, and number of compounding periods per year.
     @param principal the principal amount
     @param interestRate the interest rate in percentage
     @param time the time period in years
     @param n the number of compounding periods per year
     @return the compound interest amount
     */
    public static double calculateCompoundInterest(double principal, double interestRate, double time, int n) {
        double r = (interestRate / 100.0) / n;
        double nt = n * time;
        return principal * Math.pow((1 + r), nt) - principal;
    }
    /**

     Calculates the periodic payment required to pay off a loan given the principal, interest rate, time, and number of payments per year.
     @param principal the principal amount
     @param interestRate the interest rate in percentage
     @param time the time period in years
     @param n the number of payments per year
     @return the periodic payment amount
     */
    public static double calculatePayment(double principal, double interestRate, double time, int n) {
        double r = (interestRate / 100.0) / n;
        double nt = n * time;
        double denominator = 1 - Math.pow((1 + r), -nt);
        return (principal * r) / denominator;
    }
    /**

     Calculates the present value of an investment given the future value, interest rate, and time.
     @param futureValue the future value of the investment
     @param interestRate the interest rate in percentage
     @param time the time period in years
     @return the present value of the investment
     */
    public static double calculatePresentValue(double futureValue, double interestRate, double time) {
        double r = (interestRate / 100.0);
        return futureValue / Math.pow((1 + r), time);
    }
    /**

     Calculates the future value of an investment given the present value, interest rate, and time.
     @param presentValue the present value of the investment
     @param interestRate the interest rate in percentage
     @param time the time period in years
     @return the future value of the investment
     */
    public static double calculateFutureValue(double presentValue, double interestRate, double time) {
        double rate = interestRate / 100.0;
        return presentValue * Math.pow(1 + rate, time);
    }
}



