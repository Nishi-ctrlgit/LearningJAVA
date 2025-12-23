package SeriesQues;
import java.util.Scanner;

//  1/2 + 1/4 + 1/8 + 1/16 + ...... + 1/2^n
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length of series : ");
        int n = sc.nextInt();
        double sum = 0d;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / Math.pow(2, i);
        }
        System.out.print("Result = " + sum);
    }
}