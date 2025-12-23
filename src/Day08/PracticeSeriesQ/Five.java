package PracticeSeriesQ;


// (1*2) + (2*3) + (3*4) + ...... + (19*20)

public class Five {
    public static void main(String[] args) {

        int p=1;
        int s=0;
        for(int i=1;i<20;i++)
        {
            p=i*(i+1);
            s=s+p;
        }
        System.out.println(s);
    }
}
