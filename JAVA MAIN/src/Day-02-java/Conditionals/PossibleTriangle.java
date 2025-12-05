package Conditionals;
import java.io.*;

public class PossibleTriangle {
    public static void main(String[] args) throws IOException {
        InputStreamReader abc = new InputStreamReader(System.in);
        BufferedReader xyz = new BufferedReader(abc);
        System.out.println("Enter first side = ");
        int a = Integer.parseInt(xyz.readLine());
        System.out.println("Enter second side = ");
        int b = Integer.parseInt(xyz.readLine());
        System.out.println("Enter third side = ");
        int c = Integer.parseInt(xyz.readLine());
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            if (a == b && b == c && c == a)
                System.out.println("Equilateral Triangle");
            else if (a == b || b == c || c == a)
                System.out.println("Isosceles Triangle");
            else if (a != c && b != c && c != a)
                System.out.println("Scalene Triangle");
        } else
            System.out.println("Not a triangle");
    }
}


