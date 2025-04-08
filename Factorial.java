import java.util.Scanner;

public class Factorial {
    // Method to calculate factorial
    public static long factorial(int num) {
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        long result = factorial(number);
        if (result != -1) {
            System.out.println("Factorial of " + number + " is: " + result);
        }
    }
}
