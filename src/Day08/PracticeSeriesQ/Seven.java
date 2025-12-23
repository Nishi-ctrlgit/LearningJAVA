package PracticeSeriesQ;
import java.util.*;

// s = 1^2/a + 3^2/a^2 + 5^2/a^3 +n .....

public class Seven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print("Enter value of a : ");
        int a=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            sum += Math.pow(2*i-1,2) / Math.pow(a, i );
        }
        System.out.println(sum);
    }
}

