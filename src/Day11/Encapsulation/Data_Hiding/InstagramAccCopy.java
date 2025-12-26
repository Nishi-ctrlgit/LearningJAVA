package Encapsulation.Data_Hiding;

public class InstagramAccCopy {
    public static void display(InstagramAcc acc) {
        System.out.println("Username : " +acc.username);
        System.out.println("Email ID : " +acc.emailID);
        System.out.println("Password : "+acc.password);
        System.out.println("No. of posts: "+acc.posts);
        System.out.println("No. of followers: "+acc.followers);
        System.out.println("No. of following: "+acc.followers);

    }
}
