import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method for division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN; // Not-a-Number, indicates an invalid operation
        }
        return num1 / num2;
    }

    // Main method to test the calculator
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");

        // User input for first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // User input for second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // User input for operation
        System.out.print("Enter operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Perform calculation based on operator
        double result = 0;

        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        // Output the result
        System.out.println("Result: " + result);
    }
}
