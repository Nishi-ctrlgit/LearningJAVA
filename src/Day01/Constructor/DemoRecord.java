package Constructor;
record Bike(String model,int speed){}

public class DemoRecord {
    public static void main(String[] args) {
        Bike bike1=new Bike("Honda",600);
        System.out.println(bike1);

    }
}
