package Misc;
public class CountVowelConsonant {
    public static void main(String[] args) {

        int vCount = 0, cCount = 0;

        String str = "This is a really simple sentence";
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            }

            else if(ch >= 'a' && ch<='z') {
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}