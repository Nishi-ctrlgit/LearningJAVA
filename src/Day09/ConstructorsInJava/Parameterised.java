package ConstructorsInJava;

public class Parameterised {

    // data members of the class
    String name;
    int id;

    // Parameterized Constructor
    Parameterised(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Method to display object data
    void display(){

        System.out.println("GeekName: " + name
                + " and GeekId: " + id);
    }

    // main() method — placed inside the same class for
    // universal compatibility
    public static void main(String[] args){

        // This will invoke the parameterized constructor
        Parameterised geek1 = new Parameterised("Sweta", 68);
        geek1.display();
    }
}