package SeriesQues;
import java.util.Scanner;

// s = 1 - a + a^2 - a^3 + ..... + a^10

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a = ");
        int a = sc.nextInt();
        double sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                sum = sum + Math.pow(a, i);
            } else {
                sum = sum - Math.pow(a, i);
            }
        }
        System.out.println("The sum is " + sum);
    }
}
