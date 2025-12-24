package StringHandling.UsingStringBuffer;

public class Example5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        System.out.println(sb.charAt(2));


        sb.setCharAt(2, 'n');
        System.out.println(sb);// StringBuffer is mutable.

        sb.delete(0,2);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.replace(0,1,"hello");
        System.out.println(sb);






    }
}
