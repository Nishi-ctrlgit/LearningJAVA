package Conditionals;
import java.util.Scanner;

public class TaxiRent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dist;
        double fare=0.0d;
        System.out.print("Enter distance in km: ");
        dist = input.nextInt();
        if(dist<=5)
            fare=100.0;
        if(5<dist && dist<=15)
            fare=100+(dist-5)*10;
        if(15<dist && dist<=25)
            fare=100+(10*10)+(dist-15)*8;
        if(25<dist)
            fare=100+(10*10)+(10*8)+(dist-25)*5;
        System.out.println("Total TaxiRent : "+fare);

    }
}

