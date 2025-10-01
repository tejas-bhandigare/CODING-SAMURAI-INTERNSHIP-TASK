import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // Display the operations
        System.out.println("Welcome to Simple Calculator!");
        System.out.println("----------------------------");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("----------------------------");

        Scanner sc = new Scanner(System.in);

        // Get user choice 
        System.out.print("Choose an operator (1-4): ");
        int operator = sc.nextInt();

        // Get input numbers 
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        int result = 0;
        boolean validOperation = true;

        // Perform calculation based on operator
        switch (operator) {
            case 1:
                result = n1 + n2;
                break;

            case 2:
                result = n1 - n2;
                break;

            case 3:
                result = n1 * n2;
                break;

            case 4:
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                    validOperation = false;
                }
                break;

            default:
                System.out.println("Error: Invalid operator selected!");
                validOperation = false;
        }

        // Display the result if operation was valid
        if (validOperation) {
            System.out.println("Result: " + result);
        }

        sc.close();
        System.out.println("Thank you for using Simple Calculator!");
    }
}
