/**
 * Created by Jivko on 3/23/2016.
 */
import java.util.Scanner;
import java.util.*;
public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String textLine = input.nextLine();
        String[] stringArray = textLine.split(" ");
        int[] intArray = new int[stringArray.length];

        if (intArray.length % 2 != 0) {
            System.out.println("Invalid length");
            return;
        }

        for (int i = 0; i < intArray.length - 1; i += 2) {
            intArray[i] = Integer.parseInt(stringArray[i]);
            intArray[i + 1] = Integer.parseInt(stringArray[i + 1]);

            if (intArray[i] % 2 == 0 && intArray[i + 1] % 2 == 0) {
                System.out.printf("%d, %d -> both are even", intArray[i], intArray[i + 1]);
                System.out.println();
            } else if (intArray[i] % 2 == 0 && intArray[i + 1] % 2 != 0) {
                System.out.printf("%d, %d -> different", intArray[i], intArray[i + 1]);
                System.out.println();
            } else if (intArray[i] % 2 != 0 && intArray[i + 1] % 2 == 0) {
                System.out.printf("%d, %d -> different", intArray[i], intArray[i + 1]);
                System.out.println();
            } else if (intArray[i] % 2 != 0 && intArray[i + 1] % 2 != 0) {
                System.out.printf("%d, %d -> both are odd", intArray[i], intArray[i + 1]);
                System.out.println();
            }
        }
    }
}