public class MethodOverloading {

    // Circle
    void area(double r) {
        System.out.println("Area of circle = " + (3.14 * r * r));
    }

    // Rectangle
    void area(int l, int b) {
        System.out.println("Area of rectangle = " + (l * b));
    }

    // Triangle
    void area(double b, double h) {
        System.out.println("Area of triangle = " + (0.5 * b * h));
    }
}

class Test {
    public static void main(String[] args) {
        MethodOverloading a = new MethodOverloading();
        a.area(5);        // circle
        a.area(4, 6);     // rectangle
        a.area(4.0, 6.0); // triangle
    }
}
