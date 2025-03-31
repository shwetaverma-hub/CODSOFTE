import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Input: Marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Calculate total marks
        System.out.println("\nTotal Marks: " + totalMarks + " out of " + (numSubjects * 100));

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);

        // Grade calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display final grade
        System.out.println("Final Grade: " + grade);

        scanner.close();
    }
}