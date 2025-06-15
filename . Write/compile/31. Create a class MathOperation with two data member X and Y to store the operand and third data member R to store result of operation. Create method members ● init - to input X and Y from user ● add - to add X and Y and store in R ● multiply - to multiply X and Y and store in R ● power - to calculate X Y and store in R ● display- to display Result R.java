//*31. Create a class MathOperation with two data member X and Y to store the operand and
third data member R to store result of operation.
Create method members
● init - to input X and Y from user
● add - to add X and Y and store in R
● multiply - to multiply X and Y and store in R
● power - to calculate X Y and store in R
● display- to display Result R
*//

import java.util.Scanner;

class MathOperation {
    private double X;
    private double Y;
    private double R;

    // Method to initialize X and Y
    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of X: ");
        X = scanner.nextDouble();
        System.out.print("Enter the value of Y: ");
        Y = scanner.nextDouble();
    }

    // Method to add X and Y
    public void add() {
        R = X + Y;
    }

    // Method to multiply X and Y
    public void multiply() {
        R = X * Y;
    }

    // Method to calculate X^Y
    public void power() {
        R = Math.pow(X, Y);
    }

    // Method to display the result
    public void display() {
        System.out.println("The result is: " + R);
    }
}

public class MathOperationDemo {
    public static void main(String[] args) {
        MathOperation mathOp = new MathOperation();
        Scanner scanner = new Scanner(System.in);

        mathOp.init(); // Initialize X and Y

        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Multiply");
        System.out.println("3. Power (X^Y)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                mathOp.add();
                break;
            case 2:
                mathOp.multiply();
                break;
            case 3:
                mathOp.power();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        mathOp.display(); // Display the result
    }
}
