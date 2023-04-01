import java.util.Scanner;

public class GeometricsCalculator {
    public static void geometricsCalculator() {

        System.out.println("=====================================");
        System.out.println("|        GEOMETRIC CALCULATOR       |");
        System.out.println("=====================================");

        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("Geometrics Calculator Menu");
        System.out.println("1. Calculate area of a circle");
        System.out.println("2. Calculate perimeter of a circle");
        System.out.println("3. Calculate area of a rectangle");
        System.out.println("4. Calculate perimeter of a rectangle");
        System.out.println("5. Calculate area of a triangle");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                // Calculate area of a circle
                System.out.print("Enter radius: ");
                double radius = input.nextDouble();
                double area = calculateAreaOfCircle(radius);
                System.out.printf("The area of the circle is: %.2f\n", area);
                break;
            case 2:
                // Calculate perimeter of a circle
                System.out.print("Enter radius: ");
                radius = input.nextDouble();
                double perimeter = calculatePerimeterOfCircle(radius);
                System.out.printf("The perimeter of the circle is: %.2f\n", perimeter);
                break;
            case 3:
                // Calculate area of a rectangle
                System.out.print("Enter length: ");
                double length = input.nextDouble();
                System.out.print("Enter width: ");
                double width = input.nextDouble();
                area = calculateAreaOfRectangle(length, width);
                System.out.printf("The area of the rectangle is: %.2f\n", area);
                break;
            case 4:
                // Calculate perimeter of a rectangle
                System.out.print("Enter length: ");
                length = input.nextDouble();
                System.out.print("Enter width: ");
                width = input.nextDouble();
                perimeter = calculatePerimeterOfRectangle(length, width);
                System.out.printf("The perimeter of the rectangle is: %.2f\n", perimeter);
                break;
            case 5:
                // Calculate area of a triangle
                System.out.print("Enter base: ");
                double base = input.nextDouble();
                System.out.print("Enter height: ");
                double height = input.nextDouble();
                area = calculateAreaOfTriangle(base, height);
                System.out.printf("The area of the triangle is: %.2f\n", area);
                break;
            default:
                // Invalid input
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
    /**
     * Calculates the area of a circle.
     *
     * @param radius the radius of the circle
     * @return the area of the circle
     */
    public static double calculateAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter of a circle.
     *
     * @param radius the radius of the circle
     * @return the perimeter of the circle
     */
    public static double calculatePerimeterOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    /**
     * Calculates the area of a rectangle.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the area of the rectangle
     */
    public static double calculateAreaOfRectangle(double length, double width) {
        return length * width;
    }

    /**
     * Calculates the perimeter of a rectangle.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the perimeter of the rectangle
     */
    public static double calculatePerimeterOfRectangle(double length, double width) {
        return 2 * (length + width);
    }

    /**
     * Calculates the area of a triangle.
     *
     * @param base the base of the triangle
     * @param height the height of the triangle
     * @return the area of the triangle
     */
    public static double calculateAreaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }


}
