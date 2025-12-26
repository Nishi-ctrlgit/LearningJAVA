package Encapsulation.Data_Hiding;

import java.util.Scanner;

public class InstagramPort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // we will take input from the user for each data entry
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

        InstagramAcc acc = new InstagramAcc();// Data Transfer Object

        // After taking inputs from the user, it's time to store this collected data into our Data Transfer Object
        acc.setUsername(username);
        acc.setEmailID(emailID);
        acc.setPassword(password);
        acc.setPosts(posts);
        acc.setFollowers(followers);
        acc.setFollowing(following);

        // Calling of the method to print the values
        InstagramAccCopy.display(acc);

    }
}
