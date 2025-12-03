package SwitchCasePrograms;
import java.util.Scanner;
public class Deposit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for Term Deposit and Enter 2 for Recurring Deposit");
        System.out.print("Enter the choice : ");
        int choice = input.nextInt();
        double amt=0.0d;
        switch(choice){
            case 1: {
                System.out.print("Principle = ");
                double p = input.nextDouble();
                System.out.print("rate of interest(without %) = ");
                double r = input.nextDouble();
                System.out.print("Time(in years) = ");
                double n = input.nextDouble();
                amt = p * (Math.pow((1 + r / 100.0), n));
                System.out.println("TOTAL AMOUNT = " + amt);
                break;
            }
            case 2: {
                System.out.print("Monthly instalment = ");
                double p = input.nextDouble();
                System.out.print("rate of interest(without %) = ");
                double r = input.nextDouble();
                System.out.println("Time(in months) = ");
                double n = input.nextDouble();
                amt = p * n + (n * (n + 1) / 2.0) * (r / 100.0) * (1.0 / 12.0);
                System.out.println("TOTAL AMOUNT = " + amt);
                break;
            }
            default:{
                System.out.println("Invalid choice");

            }
        }
    }
}
