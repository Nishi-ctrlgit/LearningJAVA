package Miscellaneous;
import javax.swing.*;
import java.util.Scanner;

// A spy number is a number if the sum of its digits equals the product of its digits

public class SpyNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n = sc.nextInt();
        int s=0,p=1,last_digit=0;
        int temp=n;
        while(temp!=0){
            last_digit=temp%10;
            s=s+last_digit;
            p=p*last_digit;
            temp=temp/10;
        }
        if(s==p){
            System.out.println("The number is a Spy Number");}
        else{
            System.out.println("The number is not a Spy Number");
        }
    }
}
