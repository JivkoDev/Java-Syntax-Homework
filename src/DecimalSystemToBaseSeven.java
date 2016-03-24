/**
 * Created by Jivko on 3/22/2016.
 */
import java.util.Scanner;
public class DecimalSystemToBaseSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String convNum = Integer.toString (number,7);
        System.out.println (convNum);
    }
}
