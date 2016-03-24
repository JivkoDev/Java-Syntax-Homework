/**
 * Created by Jivko on 3/23/2016.
 */
import java.util.Scanner;
public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        float b = input.nextFloat();
        float c = input.nextFloat();

        String aHex = Integer.toHexString(a);
        String aBin = Integer.toBinaryString(a);

        System.out.printf("|%1$-10X|", a);
        System.out.printf(String.format("%010d", Integer.parseInt(aBin)));
        System.out.printf ("|%1$10.2f|%2$-10.3f|", b, c);
    }
}

