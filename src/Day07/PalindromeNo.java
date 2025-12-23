import java.util.Scanner;

// A palindrome number is a number if the new number obtained after reversing the digits is same as the original number
// example - 707

public class PalindromeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;

        /* for (int i = 1; i <= num; i++) {
            int last_digit = temp % 10;
            rev = rev * 10 + last_digit;
            temp = temp / 10;
        } */

        //using for loop makes no sense, as we first need to count the total number of digits to get the idea of number of iterations
        //so we will use while loop or do while loop

        do{
            int last_digit = temp % 10;
            rev = rev * 10 + last_digit;
            temp = temp / 10;
        }while(temp != 0);

        if (rev == num) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is not Palindrome");
        }
    }
}

