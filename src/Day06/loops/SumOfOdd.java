package loops;
import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int num;
        for(int i=1;i<=10;i++)
        {
            System.out.print("Enter a number : ");
            num=sc.nextInt();
            if(num%2!=0)
            {
                sum+=num;
            }
        }
        System.out.print("The sum of all entered odd numbers = "+sum);
    }
}
