//Accept person age(int), gender(int 1 for male and 0 for female), then check whether
person is
eligible for marriage or not.
Loops and arrays//

import java.util.Scanner;

public class MarriageEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people to check: ");
        int n = scanner.nextInt();

        int[] ages = new int[n];
        int[] genders = new int[n];
        boolean[] isEligible = new boolean[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Gender (1 for Male, 0 for Female): ");
            genders[i] = scanner.nextInt();

            if ((genders[i] == 1 && ages[i] >= 21) || (genders[i] == 0 && ages[i] >= 18)) {
                isEligible[i] = true;
            } else {
                isEligible[i] = false;
            }
        }

        System.out.println("\nMarriage Eligibility Results:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " (Age: " + ages[i] + ", Gender: " 
                                + (genders[i] == 1 ? "Male" : "Female") + "): " 
                                + (isEligible[i] ? "Eligible" : "Not Eligible"));
        }
    }
}
