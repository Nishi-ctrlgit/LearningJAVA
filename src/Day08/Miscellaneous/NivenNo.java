package Miscellaneous;
import java.util.Scanner;

// Niven number is a number that can be successfully divisible by the  sum of it's digits

public class NivenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = sc.nextInt();
        int sum = 0;
        int temp =n;
        while(temp>0) {
            int last_digit = temp % 10;
            sum += last_digit;
            temp /= 10;

        }
        if(n%sum==0) {
            System.out.println(n + " is a Niven Number");}
        else {
            System.out.println(n + " is not a Niven Number");
        }
    }
}
