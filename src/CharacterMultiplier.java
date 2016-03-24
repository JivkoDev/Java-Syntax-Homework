/**
 * Created by Jivko on 3/23/2016.
 */import java.util.Scanner;
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstString = input.next();
        String secondString = input.next();
        System.out.println(multiplyChars(firstString, secondString));

    }

    static int multiplyChars(String firstString, String secondString) {
        int product = 0;
        if (firstString.length() == secondString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                product += firstString.charAt(i) * secondString.charAt(i);
            }
        } else if (firstString.length() < secondString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                product += firstString.charAt(i) * secondString.charAt(i);
            }
            for (int i = firstString.length(); i < secondString.length(); i++) {
                product += secondString.charAt(i);
            }

        } else {
            for (int i = 0; i < secondString.length(); i++) {
                product += firstString.length() * secondString.length();
            }
            for (int i = secondString.length(); i < firstString.length(); i++) {
                product += firstString.charAt(i);
            }
        }
        return product;

    }
}