package Encapsulation.Data_Binding;

public class DuplicateStudentRecordManagement {

    //without creating this method, it would be very difficult to pass so many parameters at once.
    public static void print(Student child) {
        System.out.println(child.name);
        System.out.println(child.Roll);
        System.out.println(child.name);
        System.out.println(child.St_class);
        System.out.println(child.St_class);
        System.out.println(child.Mobile_No);
        System.out.println(child.address);
        System.out.println(child.Result_status);
    }
}