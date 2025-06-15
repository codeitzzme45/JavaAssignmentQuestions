//15. In a company an employee is paid as under:
If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA =
90% of basic
salary. If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA =
98% of
basic salary. If the employee&#39;s salary is input by the user write a program to find his
gross salary.
GS=Basic+DA+HRA
//

import java.util.Scanner;

public class GrossSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the basic salary of the employee: ");
        double basicSalary = scanner.nextDouble();
        double HRA, DA, grossSalary;

        if (basicSalary < 1500) {
            HRA = 0.1 * basicSalary; // 10% of basic salary
            DA = 0.9 * basicSalary;  // 90% of basic salary
        } else {
            HRA = 500;               // Fixed HRA
            DA = 0.98 * basicSalary; // 98% of basic salary
        }

        grossSalary = basicSalary + HRA + DA; // Gross Salary formula

        System.out.println("Gross Salary: Rs. " + grossSalary);
    }
}
