/**
 * Created by Jivko on 21-Mar-16.
 */
import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int firstX = input.nextInt();
        int firstY = input.nextInt();
        input.nextLine();
        int secondX = input.nextInt();
        int secondY = input.nextInt();
        input.nextLine();
        int thirdX = input.nextInt();
        int thirdY = input.nextInt();

        double area = Math.abs((firstX*(secondY-thirdY)+secondX*(thirdY-firstY)+thirdX*(firstY-secondY))/2);
        System.out.printf("%.0f", area);

    }
}
