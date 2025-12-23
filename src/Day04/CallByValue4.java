//Application of pass by value while returning a value from the method and storing it into a variable.
public class CallByValue4 {
    static int change(int a) {
        a = a + 10;
        return a;
    }

    public static void main(String[] args) {
        int x = 5;
        x = change(x);
        System.out.println(x);
    }

}
