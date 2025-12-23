//pass by value application on a returnable method
public class CallByValue3 {
    static int change(int a) {
        a = a + 10;
        return a;
    }

    public static void main(String[] args) {
        int x = 5;
        change(x);//here there is no variable to store the return value of the change method,hence no change
        System.out.println(x);
    }

}
