public class CallByValue2 {
    static void square(int n) {
    n = n * n;
}

    public static void main(String[] args) {
        int num = 5;
        square(num);
        System.out.println(num);
    }


}
