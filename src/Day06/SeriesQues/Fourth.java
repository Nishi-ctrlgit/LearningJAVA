package SeriesQues;
import java.util.Scanner;

// s = 1 + (1*2) + (1*2*3) + .......... + (1*2*3*4*....*n)
// sum of factorial of all natural nos.

public class Fourth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n = ");
        int n=sc.nextInt();
        int sum = 0, p = 1;
        for(int i=1;i<=n;i++){
            p =  p*i;
            sum = sum + p;
        }
        System.out.println("The sum is " + sum);
    }
}
