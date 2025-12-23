
package ViewOfMathClass;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int res1,res2,mid1,mid2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter values of a,b,c:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        //Math.max() and Math.min() both takes only two arguments
        mid1=Math.max(a,b);
        res1=Math.max(c,mid1);
        System.out.println("Maximum of three numbers = "+res1);
        mid2=Math.min(a,b);
        res2=Math.min(c,mid2);
        System.out.println("Minimum of three numbers = "+res2);

    }
}
