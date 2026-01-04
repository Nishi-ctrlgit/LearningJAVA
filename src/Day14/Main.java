public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Red", "Toyota Corolla");

        // Using the object
        myCar.start();
        myCar.accelerate(20);
        myCar.brake();

        // Accessing the object's attributes
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Car Color: " + myCar.getColor());
        System.out.println("Car Speed: " + myCar.getSpeed() + " km/h");
    }
}
