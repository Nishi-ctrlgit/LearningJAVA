package Constructor;

public class DemoConstructor {
    public static void main(String[] args){
        Car Car1=new Car("Blue","Thar",1600);
        //Car1.color="red";
        //Car1.model="Maruti";
        //Car1.speed=500;
        Car1.drive();

        Car Car2=new Car("White","Alto",700);
        //Car2.color="blue";
        //Car2.model="Swift";
        //Car2.speed=2000;
        Car2.drive();
        System.out.println("Speed of Car2 is "+Car2.getSpeed());
        Car2.setSpeed(2000);
        System.out.println("New speed of Car2 is "+Car2.getSpeed());


    }
}
