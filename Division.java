import java.util.Scanner;

public class Division{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter dividend: ");
            double a = sc.nextDouble();

            System.out.print("Enter divisor: ");
            double b = sc.nextDouble();

            if (b == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                double result = a / b;
                System.out.println("Result = " + result);
            }

        } catch (Exception e) {
            System.out.println("Error: Please enter valid numeric values.");
        } finally {
            sc.close();
        }

        
    }
}
