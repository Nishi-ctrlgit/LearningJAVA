package PracticeSeriesQ;
import java.util.Scanner;
 // S = 1 + 2^2/a +  a^3/2 + .....

public class Six {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print("Enter value of a : ");
        int a=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            sum += Math.pow(i, n) / Math.pow(a, n - 1);
        }
        System.out.println(sum);
    }
}

