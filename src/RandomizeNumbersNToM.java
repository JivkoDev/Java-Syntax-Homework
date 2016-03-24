/**
 * Created by Jivko on 3/23/2016.
 */
import java.util.Scanner;
import java.util.*;
public class RandomizeNumbersNToM {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();

        int greater = 0;
        int smaller = 0;
        if (firstNum>secondNum){
             greater= firstNum;
            smaller = secondNum;
        }
        else if (secondNum>firstNum){
            greater = secondNum;
            smaller = firstNum  ;
        }
        else {
            System.out.println(firstNum);
        }
    List <Integer> numbers = new ArrayList<>();
        for (int i = smaller; i <greater+1 ; i++) {
        numbers.add(i);
            Collections.shuffle(numbers);
        }
        for (Integer number : numbers) {
            System.out.println(number);
        }


    }
}
