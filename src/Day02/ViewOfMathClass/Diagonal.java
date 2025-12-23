
package ViewOfMathClass;
import java.util.*;
public class Diagonal {
    public static void main(String[] args){
        int side;
        double diagonal;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of the square =");
        side=sc.nextInt();
        diagonal=Math.sqrt(2)*side;
        System.out.println("Diagonal of the square ="+diagonal);

    }
}
