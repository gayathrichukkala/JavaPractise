import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input: Take two numbers from the user
            System.out.print("Enter the first number: ");
            double number1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double number2 = scanner.nextDouble();

            // Perform operations
            System.out.println("Addition: " + (number1 + number2));
            System.out.println("Subtraction: " + (number1 - number2));
            System.out.println("Multiplication: " + (number1 * number2));

            // Handle division by zero
            if (number2 != 0) {
                System.out.println("Division: " + (number1 / number2));
            } else {
                System.out.println("Division: Cannot divide by zero.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close(); // Close the scanner to avoid resource leaks
        }
    }
}
