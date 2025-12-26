package Encapsulation;

public class StudentRecordManagement {
    public static void main(String args[]) {
        Student child = new Student(); //through this child object only,I am able to access the data of Student class
        //without creating this object, it would be very difficult to pass so many parameters at once.

        System.out.println(child.name);
        System.out.println(child.Roll);
        System.out.println(child.St_class);
        System.out.println(child.St_section);
        System.out.println(child.Mobile_No);
        System.out.println(child.address);
        System.out.println(child.Result_status);

    }
}
