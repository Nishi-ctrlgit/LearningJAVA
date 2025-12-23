package SeriesQues;
import java.util.Scanner;

// s = a - a/2 + a/3 - a/4 + ........... -a/20

public class Third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a = ");
        int a=sc.nextInt();
        double sum=0d;
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                sum=sum+(double)a/i;
            }
            else {
                sum=sum-(double)a/i;
            }
        }
        System.out.println("The sum is " + sum);

    }
}
