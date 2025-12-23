package Conditionals;
import java.io.IOException;
import java.util.*;

public class Grades{
    public static void main(String args[]){
        double phy,chem,bio,avg=0.0d;
        String gr="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter physics marks = ");
        phy = sc.nextDouble();
        System.out.print("Enter cheminary marks = ");
        chem = sc.nextDouble();
        System.out.print("Enter biology marks = ");
        bio = sc.nextDouble();
        avg = (phy+chem+bio)/3.0;
        System.out.println("The average of these marks is "+avg);
        if(avg>=80)
            gr="Distinction";
        if(60<=avg && avg<80)
            gr="First Division";
        if(45<=avg && avg<60)
            gr="Second Division";
        if(40<=avg && avg<45)
            gr="Pass";
        if(avg<40)
            gr="Promotion not granted.";
        System.out.println("GRADE = "+gr);


    }
}
