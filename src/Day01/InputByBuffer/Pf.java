package InputByBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pf {
    public static void main(String args[])throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int sal;
        double pf,remainingsal,hr,ed;
        System.out.println("Enter total salary:");
        sal=Integer.parseInt(in.readLine());
        pf=(double)(12.0/100.0)*sal;
        remainingsal=sal-pf;
        hr=(double)(10.0/100.0)*remainingsal;
        ed=(double)(20.0/100.0)*remainingsal;
        System.out.println("Provident funds = "+pf);
        System.out.println("House rent = "+hr);
        System.out.println("Educational purpose = "+ed);

    }
}


