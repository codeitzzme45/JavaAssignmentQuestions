//Program to calculate sum of 5 subjects &amp; find percentage.//
import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSubjects = 5;
        int[] marks = new int[totalSubjects];
        int sum = 0;

        System.out.println("Enter the marks for " + totalSubjects + " subjects:");
        for (int i = 0; i < totalSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }

        System.out.println("\nTotal Marks Obtained: " + sum);

        System.out.print("Enter the maximum marks for each subject: ");
        int maxMarks = scanner.nextInt();
        int totalMaxMarks = totalSubjects * maxMarks;

        double percentage = (sum / (double) totalMaxMarks) * 100;
        System.out.printf("Percentage: %.2f%%\n", percentage);
    }
}
