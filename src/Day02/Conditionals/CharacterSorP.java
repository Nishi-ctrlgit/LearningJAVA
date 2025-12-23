package Conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterSorP {
    public static void main(String[] args) throws IOException {

        InputStreamReader abc = new InputStreamReader(System.in);
        BufferedReader xyz = new BufferedReader(abc);
        System.out.println("Enter First number");
        int a = Integer.parseInt(xyz.readLine());
        System.out.println("Enter Second number");
        int b = Integer.parseInt(xyz.readLine());
        System.out.println("Enter Third number");
        int c = Integer.parseInt(xyz.readLine());
        System.out.println("Enter a character : ");
        char ch = (char) xyz.read();
        if (ch == 's' | ch == 'S')
            System.out.println("RESULT = " + (a + b + c));
        else if (ch == 'p' | ch == 'P')
            System.out.println("RESULT = " + (a * b * c));
        else
            System.out.println("Invalid character");
    }
}

