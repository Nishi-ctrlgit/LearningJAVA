import java.util.Scanner;


public class Temperature {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        double c,f,c1,f1;
        System.out.println("Enter 1 to convert the temperature from Fahrenheit to Celsius ");
        System.out.println("Enter 2 to convert the temperature from Fahrenheit to Celsius ");
        System.out.print("Enter your choice between 1 or 2 : ");
        ch=sc.nextInt();
        switch(ch) {
            case 1:{
                System.out.println("Enter the temperature in Fahrenheit ");
                f = sc.nextDouble();
                c1 = (double) 5 / 9 * (f - 32);
                System.out.println("The temperature in degree Celsius is " + c1);
                break;}
            case 2: {
                System.out.println("Enter the temperature in Celsius ");
                c = sc.nextDouble();
                f1 = (double) 1.8 * (c + 32);
                System.out.println("The temperature in degree Fahrenheit is " + f1);
                break;
            }
            default:
            {
                System.out.println("Invalid choice");

            }


        }
    }
}
