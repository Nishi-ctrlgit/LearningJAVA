package SwitchCasePrograms;
import java.lang.*;
import java.io.*;

public class Program1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader abc = new InputStreamReader(System.in);
        BufferedReader xyz = new BufferedReader(abc);
        System.out.println("Enter 1 to print Natural logarithm of the number.");
        System.out.println("Enter 2 to print the absolute value of the number.");
        System.out.println("Enter 3 to print the Square root of the number.");
        System.out.println("Enter 4 to print the cube root of the number.");
        System.out.println("Enter 5 to print the random number between 0 and 1.");
        int choice;
        System.out.print("Enter choice: ");
        choice = Integer.parseInt(xyz.readLine());
        switch (choice) {
            case 1: {
                System.out.print("Enter the number = ");
                int number = Integer.parseInt(xyz.readLine());
                System.out.println("Natural Log value of " + number + " is " + Math.log(number));
                break;
            }
            case 2: {
                System.out.print("Enter the number = ");
                int number = Integer.parseInt(xyz.readLine());
                System.out.println("Absolute of " + number + " is " + Math.abs(number));
                break;
            }
            case 3: {
                System.out.print("Enter the number = ");
                int number = Integer.parseInt(xyz.readLine());
                System.out.println("Square root of " + number + " is " + Math.sqrt(number));
                break;
            }
            case 4: {
                System.out.print("Enter the number = ");
                int number = Integer.parseInt(xyz.readLine());
                System.out.println("Cube root of " + number + " is " + Math.cbrt(number));
                break;
            }
            case 5: {
                System.out.println("Random number between 0 and 1 is " + Math.random());
                break;
            }
            default: {
                System.out.println("Invalid choice");
            }
        }
    }
}

