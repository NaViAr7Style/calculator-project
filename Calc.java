// Calculator.java
public class Calculator {

    // Method to add three numbers
    public double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    // Method to subtract the second number from the first
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide the first number by the second
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    // Main method for testing the Calculator class
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test cases
        double num1 = 12.5;
        double num2 = 3.5;

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
    }
}
