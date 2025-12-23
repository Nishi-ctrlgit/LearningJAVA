package ViewOfMathClass;

import java.util.Scanner;

public class Result {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter value of b = ");
        int b = sc.nextInt();
        System.out.println("Enter value of c = ");
        int c = sc.nextInt();
        double res = 1/Math.pow(a,2)+1/Math.pow(b,3)+1/Math.pow(c,4);
        System.out.println(res);



    }
}
