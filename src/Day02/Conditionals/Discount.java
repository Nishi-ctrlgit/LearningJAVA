package Conditionals;
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int choice;
        double price,price_after_dis=0.0d,tax=0.0d,dis=0.0d,total_amt=0.0d;
        System.out.println("Enter name of Customer : ");
        name=sc.nextLine();
        System.out.println("Enter 1 for Air-Conditioner");
        System.out.println("Enter 2 for LCD TV");
        System.out.println("Enter your choice : ");
        choice=sc.nextInt();
        if(choice == 1) {
            System.out.println("Enter the amount of purchase for the item :");
            price = sc.nextDouble();
            if (price <= 20000)
                dis = (5.0 / 100.0) * price;
            if (20000 < price && price <= 40000)
                dis = (7.5 / 100.0) * price;
            if (40000 < price && price <= 60000)
                dis = (10.0 / 100.0) * price;
            if (price > 60000)
                dis = (12.0 / 100.0) * price;
            price_after_dis = price - dis;
            tax = (12.5 / 100.0) * price_after_dis;
            total_amt = price_after_dis + tax;
            System.out.println("Customer : " + name + "\t" + "Bill : " + total_amt);
        }
        if(choice == 2) {
            System.out.println("Enter the amount of purchase for the item :");
            price = sc.nextDouble();
            if (price <= 20000)
                dis = (2.5 / 100.0) * price;
            if (20000 < price && price <= 40000)
                dis = (5.0 / 100.0) * price;
            if (price > 40000 && price <= 60000)
                dis = (7.0 / 100.0) * price;
            if (price > 60000)
                dis = (8.5 / 100.0) * price;
            price_after_dis = price - dis;
            tax = (12.5 / 100.0) * price_after_dis;
            total_amt = price_after_dis + tax;
            System.out.println("Customer : " + name + "\t" + "Bill : " + total_amt);
        }
        if(choice !=1 && choice !=2 )
            System.out.println("Invalid choice");




    }
}