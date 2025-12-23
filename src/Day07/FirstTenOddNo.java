import java.util.Scanner;

// n=7 ---> 7,9,11,13,15,17,19,21,23,25

public class FirstTenOddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number from where you'd like to begin =  ");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            if(n%2==0){
                continue;}
            else {
                System.out.println(n);
                n = n + 2;
            }
        }
    }
}
