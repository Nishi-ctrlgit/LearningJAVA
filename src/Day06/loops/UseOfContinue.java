package loops;
import java.util.Scanner;

public class UseOfContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0,num;
        while(i < 10)
        {
            i++;
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            if(num%2==0)
                continue;
            System.out.println(num);
        }

    }
}
