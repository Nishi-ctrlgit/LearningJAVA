package DemoClass;
class Student {
    String name;
    int marks;

    // constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(name + " scored " + marks);
    }
}

