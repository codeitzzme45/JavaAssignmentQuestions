//Calculate series : 1 2 +2 2 +3 2 +4 2 +.........+n 2//
import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        System.out.println("The sum of the series 1^2 + 2^2 + ... + " + n + "^2 is: " + sum);
    }
}
