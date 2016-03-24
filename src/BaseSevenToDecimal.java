/**
 * Created by Jivko on 3/23/2016.
 */
import java.util.Scanner;
public class BaseSevenToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String sevenBaseNum = input.nextLine();
        int decimalNum = Integer.valueOf (sevenBaseNum, 7);
        System.out.println(decimalNum);
    }
}
