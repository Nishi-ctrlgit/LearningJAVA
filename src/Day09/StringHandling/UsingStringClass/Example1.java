package StringHandling.UsingStringClass;

public class Example1 {
    public static void main(String[] args) {
        /*String city1=new String("Bhopal");
        String city2=new String("Bhopal");
        System.out.println("city1: "+city1);
        System.out.println("city2: "+city2);
        System.out.println(city1==city2);*/
        // if you write city1.equals(city2)--> it will return true as you are comparing the string
        // but by use relational operator == --> you are comparing the values of references

        String city3="Bhopal";
        String city4="Bhopal";
        System.out.println("city3: "+city3);
        System.out.println("city4: "+city4);
        System.out.println(city3==city4);

    }
}
