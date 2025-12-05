package Conditionals;
import java.util.Scanner;
import java.lang.*;

public class QuadraticEquation {
    public static void main(String[] args) {
        double d=0.0d,r1=0.0d,r2=0.0d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a = ");
        double a=sc.nextDouble();
        System.out.println("Enter b = ");
        double b=sc.nextDouble();
        System.out.println("Enter c = ");
        double c=sc.nextDouble();
        d=b*b-4*a*c;
        if(d>0) {
            System.out.println("Roots are real and unequal");
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Root 1 = "+r1);
            System.out.println("Root 2 = "+r2);
        }
        else if(d==0) {
            System.out.println("Roots are real and equal");
            r1 = r2 = -b / (2 * a);
            System.out.println("Root 1 = "+r1);
            System.out.println("Root 2 = "+r2);
        }
        else {
            System.out.println("Roots are imaginary and unequal");
            double real = -b / (2 * a);
            double imag = Math.sqrt(Math.abs(d)) / (2 * a);

            System.out.println("Root 1 = " + real + " + " + imag + "i");
            System.out.println("Root 2 = " + real + " - " + imag + "i");
        }
    }
}
