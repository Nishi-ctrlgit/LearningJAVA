package StringHandling.UsingStringClass;

public class Example3 {
    public static void main(String[] args) {
        String s = "What are you doing?";
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.substring(6));
        System.out.println(s.substring(0,6));
        System.out.println(s.replace("What","How"));
        System.out.println(s.startsWith("What"));
        System.out.println(s.endsWith("?"));
        System.out.println(s.charAt(12));
        System.out.println(s.charAt(20));
        System.out.println(s.indexOf("you"));
        System.out.println(s.indexOf("THIS"));
        System.out.println(s.lastIndexOf("you"));
        System.out.println(s.lastIndexOf("are",16));
        System.out.println(s.equals("This is perfect."));


    }
}
