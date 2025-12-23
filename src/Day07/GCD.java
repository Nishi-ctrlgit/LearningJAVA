import java.util.Scanner;

//Euclid’s algorithm repeatedly replaces the larger number by the remainder of dividing the two numbers until the remainder becomes zero. The last non-zero value is the GCD.
/* 135%25=10                                                   28%22=6
25%10=5                                                        22%6=4
10%5=0---> 5 is the answer                                      6%4=2
                                                                4%2=0----> 2 is the answer */
public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        int temp;
        while(b!=0)// number cannot be divided by zero
        {
            temp=a%b;
            a=b;
            b=temp;
        }
        System.out.println("The GCD is: "+a);

    }
}
