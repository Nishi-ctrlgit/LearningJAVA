package PracticeSeriesQ;


//      1 + 1/3 + 1/5 + ......+ 1/19

public class Two {
    public static void main(String[] args) {

        double sum=0;
        for(int i=1;i<=20;i++)
        {
            if(i%2!=0)
            {
                sum+=1/i;
            }
        }
        System.out.println("The sum is "+sum);
    }
}
