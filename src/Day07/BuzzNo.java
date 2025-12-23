// A buzz number is the number which either ends with digit 7 or is divisible by 7
import javax.swing.*;
import java.util.Scanner;

public class BuzzNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n = in.nextInt();
        if (n % 7 == 0 || n % 10 == 7) {
            System.out.println("The number is a Buzz Number");
        } else {
            System.out.println("The number is not a Buzz Number");
        }
    }
}