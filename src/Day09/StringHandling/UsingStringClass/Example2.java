package StringHandling.UsingStringClass;

public class Example2 {
    public static void main(String[] args) {
        /*char[]arr={'J','a','v','a'};
        String s = new String(arr);
        System.out.println(s);*/

        char[]arr = {'N','A','N','D','I','N','I'};
        String s = new String(arr,2,4);
        System.out.println(s);
    }
}
