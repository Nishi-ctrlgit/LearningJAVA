package Conditionals;
import java.util.Scanner;
import java.lang.*;

public class EnteringNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n>=0 && n<10) {
            System.out.println("One digit number");
            System.out.print("It's square is " + n * n);
        }
        if(n>=10 && n<100) {
            System.out.println("Two digit number");
            System.out.print("It's squareroot is " + Math.sqrt(n));
        }
        if(n>=100 && n<1000) {
            System.out.println("Three digit number");
            System.out.print("It's cuberoot digit is " + Math.cbrt(n));
        }
        if(n>=1000) {
            System.out.println("Four digit number or more digits");
        }
    }
}