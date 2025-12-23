import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        // Use try-with-resources to ensure the scanner closes automatically
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number = ");
            int n = sc.nextInt();

            if (isPrime(n)) {
                System.out.println(n + " is a Prime no");
            } else {
                System.out.println(n + " is Not a Prime no");
            }
        }
    }
// 0 an 1 are not prime
    public static boolean isPrime(int n) {
        // Handle edge cases: 0, 1, and negative numbers are not prime
        if (n <= 1) return false;
        // 2 and 3 are prime
        if (n <= 3) return true;
        // Eliminate even numbers and multiples of 3 immediately
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Check from 5 to sqrt(n), skipping even numbers
        /*Agar kisi number ka koi factor hona hai, toh wo uske square root se pehle ya barabar (equal) hi mil jayega.
        1 × 36 = 36
        2 × 18 = 36
        3 × 12 = 36
        4 × 9 = 36
        6 × 6 = 36  <-- Ye square root hai sqrt{36}=6
        9 × 4 = 36  (Repeat hona shuru ho gaya)
        12 × 3 = 36
        18 × 2 = 36
        36 × 1 = 36
         */
        for (int i = 5; i <= Math.sqrt(n); i += 1) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
