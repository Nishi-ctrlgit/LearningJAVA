package PracticeSeriesQ;
import java.util.Scanner;

 // 3,6,12,15,..........

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n = ");
        int n=sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            System.out.print(3*i + " ");
        }
    }
}
