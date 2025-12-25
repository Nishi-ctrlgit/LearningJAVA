package Calculator;
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        num1 = sc.nextDouble();
        System.out.print("Enter second number :");
        num2 = sc.nextDouble();

        while (true) {
            System.out.println("Enter the operator (+,-,*,/):");
            char op = sc.next().charAt(0);
            double result = 0;

            switch (op) {
                // case to add two numbers
                case '+':
                    result = num1 + num2;
                    break;

                // case to subtract two numbers
                case '-':
                    result = num1 - num2;
                    break;

                // case to multiply two numbers
                case '*':
                    result = num1 * num2;
                    break;

                // case to divide two numbers
                case '/':
                    result = num1 / num2;
                    break;

                default:
                    System.exit(0);
            }
            System.out.println("The final result:");
            System.out.println();

            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        }
    }
}
