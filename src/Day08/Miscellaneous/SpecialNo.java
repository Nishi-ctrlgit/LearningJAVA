package Miscellaneous;
import java.util.Scanner;

// A special two-digit number is such when sum of its digits is added to the product of its digits, the result is equal to the original tw0-digit number

public class SpecialNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        int s=0,p=1,sp=0;
        int temp=n;
        while(temp!=0){
            int last_digit=temp%10;
            s=s+last_digit;
            p=p*last_digit;
            temp=temp/10;

        }
        sp=s+p;
        if(sp==n){
            System.out.println("The number is a Special Number");}
        else{
            System.out.println("The number is not a Special Number");
        }
    }
}
