package InputByBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Days {
    public static void main(String args[])throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int days,y,m,remainingdays,left;
        System.out.println("Enter total number of days:");
        days=Integer.parseInt(in.readLine());
        y=days/365;
        left=days%365;
        m=left/30;
        remainingdays=left%30;


        System.out.println("Number of years= "+y);
        System.out.println("Number of months = "+m);
        System.out.println("Number of days left = "+remainingdays);

    }
}

