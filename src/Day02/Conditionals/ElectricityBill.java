package Conditionals;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double bill=0.0d;
        System.out.println("Enter Consumer Name : ");
        String consumerName=sc.nextLine();
        System.out.println("Enter Consumer Number : ");
        int consumerNo=sc.nextInt();
        System.out.println("Enter Month : ");
        String month=sc.next();
        System.out.println("Units Consumed : ");
        int units=sc.nextInt();
        if(units<=100)
            bill=bill+(1.80*units);
        if(units>100 && units<=300)
            bill=bill+(1.80*100)+((units-100)*2.30);
        if(units>300 && units<=500)
            bill=bill+(1.80*100)+(2.30*200)+((units-300)*2.80);
        if(units>500)
            bill=bill+(1.80*100)+(2.30*200)+(2.80*200)+((units-500)*3.50);
        System.out.println("Consumer Name : "+consumerName);
        System.out.println("Consumer Number : "+consumerNo);
        System.out.println("Month : "+month);
        System.out.println("Units Consumed : "+units);
        System.out.println("Bill : "+bill);

    }
}

