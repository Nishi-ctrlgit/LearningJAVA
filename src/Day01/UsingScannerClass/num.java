package UsingScannerClass;
import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter number");
        a=sc.nextInt();
        System.out.println("Enter number");
        b=sc.nextInt();
        System.out.println("Initial value of a:"+a);
        System.out.println("Initial value of b:"+b);
        c=a;
        a=b;
        b=c;
        System.out.println("Final value of a:"+a);
        System.out.println("Final value of b:"+b);
    }

}
