package InputByBuffer;
import java.io.*;

public class NumberOfStudents {
    public static void main(String args[])throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int n,m,b;
        double perb,perm;
        System.out.println("Enter total number of students:");
        n=Integer.parseInt(in.readLine());
        System.out.println("Enter number of girls");
        m=Integer.parseInt(in.readLine());
        b=n-m;
        perb=(double)b/n*100;
        perm=(double)m/n*100;
        System.out.println("Number of boys = "+b);
        System.out.println("Percentage of boys = "+perb);
        System.out.println("Percentage of girls = "+perm);

    }
}
