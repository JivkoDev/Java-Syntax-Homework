/**
 * Created by Jivko on 3/23/2016.
 */
import java.util.*;
public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String [] firstLineInput = input.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < firstLineInput.length; i++) {
            numbers.add(Integer.parseInt(firstLineInput[i]));
        }

        String[] secondLineInput = input.nextLine().split(" ");
        int numbersToGet = Integer.parseInt(secondLineInput[1]);
        String evenOrOdd = secondLineInput[2];
        findingEvenOrOdd(numbers, numbersToGet, evenOrOdd);
    }

    static int findingEvenOrOdd(List<Integer> numbers, int numbersToGet, String evenOrOdd) {
        if (evenOrOdd.equals("even")) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    System.out.print(numbers.get(i) + " ");
                    numbersToGet--;
                    if (numbersToGet == 0) {
                        System.exit(0);
                    }
                }
            }
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 != 0) {
                    System.out.print(numbers.get(i) + " ");
                    numbersToGet--;
                    if (numbersToGet == 0) {
                        System.exit(0);
                    }
                }
            }
        }
        return 1;
    }
}
