//This example shows that objects in Java can be stored in variables,
// passed as parameters, and returned from methods across different classes,
// hence objects are treated as first-class citizens.

package DemoClass;
class School {

    // object as method parameter
    static void printStudent(Student s) {
        s.display();
    }

    // Object as return type
    static Student createTopper() {
        Student top = new Student("Nishi", 95);
        return top;   // returning an object
    }

    public static void main(String[] args) {

        // Object stored in variable
        Student s1 = new Student("Aman", 88);

        // passing object to method
        printStudent(s1);

        // topper receives the reference "top"
        Student topper = createTopper();// now topper is also referencing to the same object top was referencing too
        topper.display();
    }
}
