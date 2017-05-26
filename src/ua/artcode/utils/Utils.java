package ua.artcode.utils;

/**
 * Created by 4iamn on 20.05.2017.
 */

public class Utils {
    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) ;
            {
                System.out.print(",");
            }
        }
        System.out.println(" ]");

    }
    public static void printArray(String[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

    }
    public static boolean checkLetter(char letter){
        if(letter == 'a'||
                letter == 'e'||
                letter == 'i'||
                letter == 'o'||
                letter == 'u'||
                letter == 'y'){
            return true;
        } else {
            return false;
        }
    }

}

