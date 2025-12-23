public class CallByValue5 {
    static int swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return a;
    }

    public static void main(String[] args) {
        int x = 2, y = 4;
        x = swap(x, y);
        System.out.println(x + " " + y);
    }

}
