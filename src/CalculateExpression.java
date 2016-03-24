/**
 * Created by Jivko on 21-Mar-16.
 */
import java.util.Scanner;
public class CalculateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float a = input.nextInt();
        input.nextLine();
        float b = input.nextInt();
        input.nextLine();
        float c = input.nextInt();
        double firstFormulae = Math.pow(((Math.pow(a, 2)+Math.pow(b, 2))/(Math.pow (a, 2)-Math.pow(b, 2))), ((a+b+c)/Math.sqrt(c)));
        double secondFormulae = Math.pow((Math.pow(a, 2) + Math.pow (b, 2)-Math.pow(c, 3)), (a-b));
        double threeNumAve = (a+b+c)/3;
        double formulaeAve = (firstFormulae+secondFormulae)/2;
        double diff = Math.abs(threeNumAve-formulaeAve);
        System.out.printf("F1 result: %1.2f; F2 result: %2.2f; Diff: %3.2f", firstFormulae, secondFormulae, diff);


    }
}
