package PracticeSeriesQ;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to display sum of the series x^1 - x^2 + x^3 - x^4 where x = 2");
        System.out.println("Enter 2 to display the series 1 , 11 , 111 , 1111 , 11111");
        System.out.print("Enter your choice = ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1: {
                int x = 2;
                int sum = 0;
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 != 0) {
                        sum += Math.pow(x, i);
                    } else {
                        sum -= Math.pow(x, i);
                    }

                }
                System.out.println("The sum of the first series is " + sum);
                break;
            }
            case 2: {
                int next=0;
                for(int i = 1; i <= 5; i++)
                {
                    next=next*10+1;
                    System.out.print(next+ " , ");
                }
                break;
            }
        }
    }
}
