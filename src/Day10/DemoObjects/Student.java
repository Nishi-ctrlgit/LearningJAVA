package DemoObjects;

public class Student {
    String name;
    int age;

    // constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter methods
    public String getName() {
        return name;// this is how you return things from a get function
    }

    public int getAge() {
        return age; // this is how you return things from a get function
    }

    // using setter methods
    public String setName(String xyz)
    {
        this.name = xyz;
        System.out.println("setName: " + xyz);
        return name;
    }

    public int setAge(int num) {
        this.age = num;
        System.out.println("setAge: " + num);
        return age;
    }
    // setter functions mein key point is if you return type as void -> no need to return it and use getter function while printing
    // if you are using a return type other than void in your setter function -> you must return it back,by returning there is no need to write getter again in printing statement
    public void vote()
    {
        System.out.println(name + " is Eligible to vote whose age is "+age);
    }

    public static void main(String args[])
    {
        Student s1 = new Student("John",20);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        s1.setName("Arun");
        s1.setAge(30);

        s1.vote();

    }
}
