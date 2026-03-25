import java.util.Scanner;

public class MaxVowelSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int maxVowels = 0;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = i; j < str.length(); j++) {
                char ch = Character.toLowerCase(str.charAt(j));

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }

                if (count > maxVowels) {
                    maxVowels = count;
                }
            }
        }

        System.out.println("Maximum vowel count in any substring: " + maxVowels);
    }
}