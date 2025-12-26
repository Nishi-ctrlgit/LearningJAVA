package Encapsulation.Data_Hiding;

import java.util.Scanner;

public class InstagramPort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();
        System.out.print("Enter email: ");
        String emailID = sc.next();
        System.out.print("Enter no. of posts : ");
        int posts = sc.nextInt();
        System.out.print("Enter no. of followers: ");
        int followers = sc.nextInt();
        System.out.print("Enter no. of  following: ");
        int following = sc.nextInt();

        InstagramAcc acc = new InstagramAcc();

        acc.username=username;
        acc.emailID=emailID;
        acc.password=password;
        acc.posts=posts;
        acc.followers=followers;
        acc.following=following;


        InstagramAccCopy.display(acc);

    }
}
