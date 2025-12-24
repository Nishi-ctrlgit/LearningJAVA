package ConstructorsInJava;
class Student {

    int id;
    String name;

    // Normal constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor (user-defined)
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }

    void show() {
        System.out.println(id + " " + name);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Nishi"); // original object
        Student s2 = new Student(s1);           // copy object

        s1.show();
        s2.show();
        System.out.println(s1==s2);
    }
}

