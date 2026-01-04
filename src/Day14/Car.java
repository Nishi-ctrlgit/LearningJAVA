public class Car {
    // Attributes (state)
    private String color;
    private String model;
    private int speed;

    // Constructor
    public Car(String color, String model) {
        this.color = color;
        this.model = model;
        this.speed = 0; // Initially, the car is stationary
    }

    // Methods (behavior)
    public void start() {
        System.out.println(model + " is starting.");
        speed = 10; // Starting speed
    }

    public void accelerate(int increment) {
        speed += increment;
        System.out.println(model + " is accelerating. Speed: " + speed + " km/h");
    }

    public void brake() {
        speed = 0;
        System.out.println(model + " has stopped.");
    }

    // Getters
    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }
}


