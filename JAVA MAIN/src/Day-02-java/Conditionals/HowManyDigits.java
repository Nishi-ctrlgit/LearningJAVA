package Conditionals;
import java.util.Scanner;import java.util.Scanner;

public class HowManyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n>0) {
            if (n > 10) {
                if (n < 100)
                    System.out.println("Number is a 2-digit-number.");
                else
                    System.out.println("Number is not a 2-digit-number.");
            } else {
                System.out.println("Number is a 1-digit-number.");
            }
        }
        else
        {
            System.out.println("Number is a negative number.");
        }
    }
}
