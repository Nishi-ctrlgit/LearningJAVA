public class CallingStaticMethod {
    public static void main(String[] args) {
        MyClass.hello();
    }
}

class MyClass {
    static void hello() {
        System.out.println("Hello");
    }
}

