package Conditionals;
import java.util.Scanner;

public class Pos_evenVSNeg_odd {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = in.nextInt();
        if (num >= 0 && num % 2 == 0)
            System.out.println("Succeeding numbers are " + (num + 2) + "," + (num + 4) + "," + (num + 6));
        else if (num < 0 && num % 2 != 0)
            System.out.println("Preceeding numbers are " + (num - 2) + "," + (num - 4) + "," + (num - 6));
        else
            System.out.println("Number is neither positive even nor negative odd.");
    }
}

