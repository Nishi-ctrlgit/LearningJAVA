package Encapsulation.Data_Binding;
import java.util.Scanner;

public class StudentRecordManagement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student child = new Student(); //through this child object only,I am able to access the data of Student class
        // Hence this object is known as DTO --> data transfer object

//printing the values manually after creating the object of Data Transfer class
        /*System.out.println(child.name);
        System.out.println(child.Roll);
        System.out.println(child.St_class);
        System.out.println(child.St_section);
        System.out.println(child.Mobile_No);
        System.out.println(child.address);
        System.out.println(child.Result_status);*/


        // we will take input from the user for each data entry
        System.out.print("Enter Student name : ");
        String name = sc.nextLine();
        System.out.print("Enter Student Roll Number : ");
        int roll = sc.nextInt();
        System.out.print("Enter Student Class : ");
        int St_class = sc.nextInt();
        System.out.print("Enter Student Section : ");
        String St_section = sc.next();
        System.out.print("Enter Student Mobile number : ");
        int Mobile_No = sc.nextInt();
        System.out.print("Enter Student Address : ");
        String address = sc.next();
        System.out.print("Enter Student Result Status : ");
        String Result_status = sc.next();


        // After taking inputs from the user, it's time to store this collected data into our Data Transfer Object
        child.name = name;
        child.Roll = roll;
        child.St_class = St_class;
        child.St_section = St_section;
        child.Mobile_No = Mobile_No;
        child.address = address;
        child.Result_status = Result_status;






// Calling of the method to print the values
       DuplicateStudentRecordManagement.print(child);

    }
}
