package Encapsulation.Data_Hiding;
import java.util.Scanner;

public class InstagramAcc {
    private String username;
    private String emailID;
    private String password;
    private int posts;
    private int followers;
    private int following;

    Scanner sc = new Scanner(System.in);

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID.toLowerCase();
        while (true) {
            System.out.print("Enter your emailID : ");
            String key = sc.next();
            key = key.toLowerCase();

            //“kya poori key string ek valid Gmail ID ke pattern se match karti hai?”match() compares the whole string
           // jab match NA kare tab invalid bolo
            if (!key.matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")) {
                System.out.println("Invalid Email ID, Retry.");
                continue;
            }

            // compare with already stored email
            if (this.emailID.equals(key)) {
                break;
            } else {
                System.out.print("Invalid EmailID. Retry \n");
            }
        }
    }


    public void setPassword(String password) {
        while (true) {
            System.out.print("Enter your password : ");
            String pass = sc.next();
            if (pass.equals(password)) {
                this.password = pass;
                break;
            } else {
                System.out.print("Wrong Password. Retry \n");
            }
        }
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public void setFollowing(int following) {
        this.following = following;
    }


    public String getUsername() {
        return username;
    }

    public String getEmailID() {
        return emailID;
    }

    public String getPassword() {
        return password;
    }

    public int getPosts() {
        return posts;
    }

    public int getFollowers() {
        return followers;
    }

    public int getFollowing() {
        return following;
    }
}

