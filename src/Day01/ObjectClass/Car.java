package ObjectClass;

import java.util.Date;
import java.util.Scanner;

public class Car {
    String color;
    String model;
    int speed;


    public void drive()
    {
        System.out.println(model+"is driving at"+speed);
}
}
 class abc{
    public static void main(String[] args){
        Car car1=new Car();
        car1.speed=100;
        car1.model="Toyota";
        car1.drive();
    }
}