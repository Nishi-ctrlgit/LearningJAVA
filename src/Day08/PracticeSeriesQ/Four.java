package PracticeSeriesQ;


// 1/2 + 2/3 + ..... + 19/20

public class Four {
    public static void main(String[] args) {

        double sum=0;
        for(int i=1;i<20;i++)
        {
            sum=sum+(double)i/(i+1);

        }
        System.out.println("The sum is "+sum);
    }
}
