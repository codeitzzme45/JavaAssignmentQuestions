//Find the result of following (accept values for variables used in right side of
expression)
a. y=x 2 +3x-7 (print value of Z)
b. y=x++ + ++x (print value of x and y)
c. z= x++ - --y - --x + x++ (print value of x ,y and z)
d. z = x &amp;&amp; y || !(x||y) (print value of Z)//

  import java.util.Scanner;

public class ExpressionEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part a
        System.out.print("Enter value of x for part (a): ");
        int x = scanner.nextInt();
        int y = x * x + 3 * x - 7;
        System.out.println("Value of y (part a): " + y);

        // Part b
        System.out.print("Enter value of x for part (b): ");
        x = scanner.nextInt();
        y = x++ + ++x;
        System.out.println("Value of x (part b): " + x);
        System.out.println("Value of y (part b): " + y);

        // Part c
        System.out.print("Enter value of x for part (c): ");
        x = scanner.nextInt();
        System.out.print("Enter value of y for part (c): ");
        y = scanner.nextInt();
        int z = x++ - --y - --x + x++;
        System.out.println("Value of x (part c): " + x);
        System.out.println("Value of y (part c): " + y);
        System.out.println("Value of z (part c): " + z);

        // Part d
        System.out.print("Enter value of x for part (d) (true/false): ");
        boolean bx = scanner.nextBoolean();
        System.out.print("Enter value of y for part (d) (true/false): ");
        boolean by = scanner.nextBoolean();
        boolean bz = bx && by || !(bx || by);
        System.out.println("Value of z (part d): " + bz);
    }
}
