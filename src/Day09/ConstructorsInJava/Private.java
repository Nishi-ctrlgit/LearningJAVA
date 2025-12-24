package ConstructorsInJava;


class GFG {

    // Private constructor
    private GFG(){

        System.out.println("Private constructor called");
    }

    // Static method
    public static void displayMessage(){

        System.out.println("Hello from GFG class!");
    }
}

class Main{

    public static void main(String[] args){

        // GFG u = new GFG(); // Error: constructor is
        // private
        GFG.displayMessage();//calling of method
    }
}