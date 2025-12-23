package loops;
import java.util.Scanner;

public class PerfectSquare {         //4=2*2=4      9=3*3=9
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            if (num == 0)
                break;
            double p = Math.sqrt(num);
            if ((int) p*p == num) {
                System.out.println(num + " is a Perfect Square");
            } else {
                System.out.println(num + " is not a Perfect Square");
            }
        }
        while(true);
    }
}
