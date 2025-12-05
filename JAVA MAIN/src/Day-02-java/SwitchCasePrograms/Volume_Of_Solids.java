package SwitchCasePrograms;
import java.util.Scanner;


public class Volume_Of_Solids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vol = 0.0d;
        System.out.println("Enter choice among cuboid,cylinder,cone: ");
        String choice = sc.nextLine();
        switch (choice) {
            case "cuboid": {
                System.out.println("Enter length,breadth and height of cuboid");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                vol = l * b * h;
                System.out.println("Volume of cuboid: " + vol);
                break;
            }
            case "cylinder": {
                System.out.println("Enter radius and height of cylinder");
                double r = sc.nextDouble();
                double h = sc.nextDouble();
                vol = Math.PI * r * r * h;
                System.out.println("Volume of cylinder: " + vol);
                break;
            }
            case "cone": {
                System.out.println("Enter radius and height of cone");
                double r = sc.nextDouble();
                double h = sc.nextDouble();
                vol = 1.0 / 3 / 0 * Math.PI * r * r * h;
                System.out.println("Volume of cone: " + vol);
                break;
            }
            default:
                System.out.println("Invalid choice");
        }
    }
}
