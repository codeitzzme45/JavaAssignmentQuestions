//. Sort a ten element array in descending order.//
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = new Integer[10];

        System.out.println("Enter 10 elements for the array:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println("Array elements in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
