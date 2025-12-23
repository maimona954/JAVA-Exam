class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two integers
    // Exception handling is used to handle division by zero
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
            return 0; // Returning 0 if division fails
        }
    }
}


public class Main {
    public static void main(String[] args) {

        // Create an object of Calculator
        Calculator calc = new Calculator();

        // Call add method
        System.out.println("Addition: " + calc.add(10, 5));

        // Call subtract method
        System.out.println("Subtraction: " + calc.subtract(10, 5));

        // Call multiply method
        System.out.println("Multiplication: " + calc.multiply(10, 5));

        // Call divide method
        System.out.println("Division: " + calc.divide(10, 0)); // Division by zero
    }
}