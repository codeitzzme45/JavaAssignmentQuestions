//Calculate sum of Lucas series (up to 10 terms) :
1, 2, 3, 6, 11, 20 ,........//

public class LucasSeriesSum {
    public static void main(String[] args) {
        int terms = 10; // Number of terms in the series
        int[] lucas = new int[terms]; // Array to store Lucas series terms
        lucas[0] = 1; // First term
        lucas[1] = 2; // Second term
        int sum = lucas[0] + lucas[1]; // Sum of the first two terms

        for (int i = 2; i < terms; i++) {
            lucas[i] = lucas[i - 1] + lucas[i - 2]; // Calculate the next term
            sum += lucas[i]; // Add the term to the sum
        }

        System.out.println("The first 10 terms of the Lucas series are:");
        for (int i = 0; i < terms; i++) {
            System.out.print(lucas[i] + " ");
        }
        System.out.println("\nThe sum of the Lucas series up to 10 terms is: " + sum);
    }
}
