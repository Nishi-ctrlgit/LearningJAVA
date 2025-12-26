package Encapsulation.Data_Hiding;

public class InstagramAccCopy {
    //without creating this method, it would be very difficult to pass so many parameters at once.
    public static void display(InstagramAcc acc) {
        System.out.println("Username : " +acc.getUsername());
        System.out.println("Email ID : " +acc.getEmailID());
        System.out.println("Password : "+acc.getPassword());
        System.out.println("No. of posts: "+acc.getPosts());
        System.out.println("No. of followers: "+acc.getFollowers());
        System.out.println("No. of following: "+acc.getFollowing());


    }
}
