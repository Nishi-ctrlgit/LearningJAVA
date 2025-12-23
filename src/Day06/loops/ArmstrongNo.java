package loops;
import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // 1. Use descriptive names (avoid 'dig' as a global variable)
        int temp = num;
        int count_dig = 0;

        // 2. Count digits
        while (temp != 0) {
            count_dig++;
            temp /= 10;
        }

        // 3. CRITICAL: Reset temp back to the original number
        temp = num;
        double sum = 0; // Math.pow returns a double

        // 4. Calculate sum (Loop until the number is exhausted)
        while (temp != 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, count_dig);
            temp /= 10;
        }

        // 5. Comparison
        if (num == sum) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }

        sc.close(); // Good practice to close the scanner
    }
}
