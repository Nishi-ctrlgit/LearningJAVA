public class CallByValue1 {
    static void swap(int a, int b) {
        //x-->3            y-->7
        //a-->3(copy)      b-->7(copy)
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int x = 3, y = 7;
        swap(x, y);
        System.out.println(x + " " + y);//no change on original values of x and y is observed.
    }

}
