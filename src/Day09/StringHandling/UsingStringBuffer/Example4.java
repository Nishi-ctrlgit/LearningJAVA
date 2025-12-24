package StringHandling.UsingStringBuffer;

public class Example4 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("College");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
        /*sb.append("Placement");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("Announcement");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());*/


    }
}
