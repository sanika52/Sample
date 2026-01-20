
import java.util.Scanner;

public class Add{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = readInteger(scanner, "Enter first number: ");
        int num2 = readInteger(scanner, "Enter second number: ");

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);

        scanner.close();
    }

    // Method to validate integer input
    private static int readInteger(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // discard invalid input
            }
        }
    }
}

