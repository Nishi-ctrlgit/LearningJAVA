import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms =  ");
        int terms=input.nextInt(); // Number of Fibonacci terms to generate
        int num1 = 0, num2 = 1, num3;

        System.out.print("Fibonacci Series (Iterative): ");

        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
        } else if (terms == 1) {
            System.out.print(num1);
        } else {
            System.out.print(num1 + " " + num2); // Print first two terms
            for (int i = 2; i < terms; i++) {
                num3 = num1 + num2;
                System.out.print(" " + num3);
                num1 = num2; // Update for next iteration
                num2 = num3; // Update for next iteration
            }
        }
        System.out.println(); // New line at the end
    }
}
