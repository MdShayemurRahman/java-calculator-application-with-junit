import java.util.Scanner;

public class GradeCalculator {

    public static void gradeCalculator() {

        System.out.println("=====================================");
        System.out.println("|          GRADE CALCULATOR         |");
        System.out.println("=====================================");

        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("1. Calculate Average");
        System.out.println("2. Calculate Grade");
        System.out.println("3. Calculate GPA");
        System.out.println("4. Calculate Final Grade");
        System.out.println("5. Calculate Class Rank");

        System.out.print("Enter your choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                // Calculate Average
                System.out.print("Enter the number of grades: ");
                int numGrades = input.nextInt();
                double[] grades = new double[numGrades];
                for (int i = 0; i < numGrades; i++) {
                    System.out.printf("Enter grade %d: ", i + 1);
                    grades[i] = input.nextDouble();
                }
                double average = calculateAverage(grades);
                System.out.printf("The average grade is: %.2f\n", average);
                break;
            case 2:
                // Calculate Grade
                System.out.print("Enter the grade percentage: ");
                double gradePercent = input.nextDouble();
                char grade = calculateGrade(gradePercent);
                System.out.printf("The grade is: %s\n", grade);
                break;
            case 3:
                // Calculate GPA
                System.out.print("Enter the number of classes: ");
                int numClasses = input.nextInt();
                double[] classGrades = new double[numClasses];
                for (int i = 0; i < numClasses; i++) {
                    System.out.printf("Enter class %d grade: ", i + 1);
                    classGrades[i] = input.nextDouble();
                }
                double gpa = calculateGPA(classGrades);
                System.out.printf("The GPA is: %.2f\n", gpa);
                break;
            case 4:
                // Calculate Final Grade
                System.out.print("Enter the grade percentage: ");
                gradePercent = input.nextDouble();
                System.out.print("Enter the final exam percentage: ");
                double finalExamPercent = input.nextDouble();
                double finalGrade = calculateFinalGrade(gradePercent, finalExamPercent);
                System.out.printf("The final grade is: %.2f\n", finalGrade);
                break;
            case 5:
                // Calculate Class Rank
                System.out.print("Enter the number of students: ");
                int numStudents = input.nextInt();
                double[] studentGrades = new double[numStudents];
                for (int i = 0; i < numStudents; i++) {
                    System.out.printf("Enter student %d grade: ", i + 1);
                    studentGrades[i] = input.nextDouble();
                }
                int rank = calculateClassRank(studentGrades);
                System.out.printf("The class rank is: %d\n", rank);
                break;
            default:
                // Invalid choice
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                break;
        }
    }

    public static double calculateAverage(double[] grades) {
        /*
         * Calculates the average of a set of grades
         * @param grades an array of grades
         * @return the average of the grades
         */
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public static char calculateGrade(double gradePercent) {
        /*
         * Calculates the letter grade corresponding to a given percentage grade.
         *
         * @param gradePercent the percentage grade to convert to a letter grade
         * @return the letter grade (A, B, C, D, or F)
         */
        if (gradePercent >= 90) {
            return 'A';
        } else if (gradePercent >= 80) {
            return 'B';
        } else if (gradePercent >= 70) {
            return 'C';
        } else if (gradePercent >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }



    public static double calculateGPA(double[] classGrades) {
        /*
         * Calculates the GPA corresponding to a list of class grades.
         *
         * @param classGrades an array of letter grades (A, B, C, D, or F)
         * @return the calculated GPA (between 0.0 and 4.0)
         */
        int totalGradePoints = 0;
        int numClasses = classGrades.length;
        for (double grade : classGrades) {
            totalGradePoints += calculateGradePoints(grade);
        }
        return (double)totalGradePoints / numClasses;
    }

    private static int calculateGradePoints(double gradePercent) {
        /*
         * Calculates the grade points based on a percentage grade.
         * @param gradePercent the percentage grade
         * @return the grade points
         */
        if (gradePercent >= 90) {
            return 4;
        } else if (gradePercent >= 80) {
            return 3;
        } else if (gradePercent >= 70) {
            return 2;
        } else if (gradePercent >= 60) {
            return 1;
        } else {
            return 0;
        }
    }



    public static double calculateFinalGrade(double gradePercent, double finalExamPercent) {
        /*
         * Calculates the final grade for a class given the percentage grade and the percentage weight of the final exam.
         *
         * @param gradePercent the percentage grade for the class
         * @param finalExamPercent the percentage weight of the final exam
         * @return the calculated final grade (between 0.0 and 100.0)
         */
        return gradePercent * (1 - finalExamPercent) + calculateGradePoints(100) * finalExamPercent;
    }


    public static int calculateClassRank(double[] studentGrades) {
        /*
         * Calculates the class rank of a student given an array of their grades.
         *
         * @param studentGrades an array of percentage grades for the student's classes
         * @return the student's class rank (between 1 and the length of the array)
         */
        int numBetterGrades = 0;
        int studentGrade = (int) studentGrades[0];
        for (double grade : studentGrades) {
            if (grade > studentGrade) {
                numBetterGrades++;
            }
        }
        return numBetterGrades + 1;
    }

}



