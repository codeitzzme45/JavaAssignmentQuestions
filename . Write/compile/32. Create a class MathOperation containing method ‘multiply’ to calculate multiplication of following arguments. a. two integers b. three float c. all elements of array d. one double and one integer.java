//32. Create a class MathOperation containing method ‘multiply’ to calculate multiplication
of following arguments.
a. two integers
b. three float
c. all elements of array
d. one double and one integer//

class MathOperation {
    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply three floats
    public float multiply(float a, float b, float c) {
        return a * b * c;
    }

    // Method to multiply all elements of an array
    public int multiply(int[] arr) {
        int result = 1;
        for (int num : arr) {
            result *= num;
        }
        return result;
    }

    // Method to multiply one double and one integer
    public double multiply(double a, int b) {
        return a * b;
    }
}

public class MathOperationDemo {
    public static void main(String[] args) {
        MathOperation mathOp = new MathOperation();

        // Multiply two integers
        System.out.println("Multiplication of two integers: " + mathOp.multiply(4, 5));

        // Multiply three floats
        System.out.println("Multiplication of three floats: " + mathOp.multiply(1.2f, 3.4f, 2.5f));

        // Multiply all elements of an array
        int[] array = {2, 3, 4};
        System.out.println("Multiplication of all elements in the array: " + mathOp.multiply(array));

        // Multiply one double and one integer
        System.out.println("Multiplication of one double and one integer: " + mathOp.multiply(5.5, 3));
    }
}
