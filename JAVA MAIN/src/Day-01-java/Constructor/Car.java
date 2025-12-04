package Constructor;

public class Car {
    String color;
    String model;
    int speed;

    public Car(String color, String model, int speed) {
        this.color=color;
        this.model=model;
        this.speed=speed;

    }



    public void drive()
    {
        System.out.println(model+ " is driving at " +speed);
}

    public int getSpeed() {
           return speed;
}

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
