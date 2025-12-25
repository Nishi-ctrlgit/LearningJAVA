package DemoObjects;

public class Flower {

    // Properties are defined in Flower class
    public String name;
    public String color;
    public int no_of_flowers;

    // Constructor
    Flower(String name, String color, int no_of_flowers) {
        this.name = name;
        this.color = color;
        this.no_of_flowers = no_of_flowers;
    }

    //Using Getter Methods //we know that how to write a method --> <access specifier> <return type> <method name()>
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getNo_of_flowers() {
        return no_of_flowers;
    }

    // Using Setter Methods
    public String setName(String xyz) {     // return type can pf set method can be anything ofcourse it can be void also depending upon what user wants....
        //passing parameters inside set function is mandatory as we want to update a value,so we need to pass the updated value.
        //the parameter variable  can be anything-->  xyz,s,pys,rest,abc1234, a_9 anything
        this.name = xyz;
        System.out.println("setName: " + xyz);
        return xyz;
    }

    public String setColor(String abc) {
        this.color = abc;
        return abc;
    }

    public void setNo_of_flowers(int n) {
        this.no_of_flowers = n;// we know that void function requires no return statement
    }// also if you are taking the return type as void so you need to use getter function in your printing statement

    //user-defined methods
    public void printFlowers() {
        System.out.println("Name: " + name + "; Color: " + color + "; Number of Flowers: " + no_of_flowers);
    }

    public void blooming() {
        System.out.println("yes," + name + " is Blooming");
    }

    public static void main(String[] args) {
        Flower f1 = new Flower("Lily", "Red", 5);
        System.out.println(f1.getName());
        System.out.println(f1.getColor());
        System.out.println(f1.getNo_of_flowers());
        f1.setName("Daisy");
        f1.setColor("White");
        f1.setNo_of_flowers(3);
        System.out.println("set No of flowers: " + f1.getNo_of_flowers());// set karne ke baad humne get bhi kiya tabhi no of flowers 5 se set hokar 3 de raha h
        f1.printFlowers();
        f1.blooming();
    }
}
