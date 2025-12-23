// 1 + 1/2 + 1/3 + ............... + 1/20

package PracticeSeriesQ;


public class One {
    public static void main(String[] args) {

        double sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum = sum + 1/i;
        }
        System.out.println("The sum is " + sum);
    }
}
