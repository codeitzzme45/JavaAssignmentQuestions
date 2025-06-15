//. Program to convert temperature from Fahrenheit to Celsius as C= 5*(f-32)/9//
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = 5 * (fahrenheit - 32) / 9;
        System.out.println("Temperature in Celsius: " + celsius);
    }
}

