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
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

    }
    public static void printArray(String[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }

    public static void printArray(double[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) ;
            {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

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

    public static int intLength(int size){
        int range = Math.abs(size);
        int digit = 0;
        while (range >= 10){
            range /= 10;
            digit++;
        }
        return digit+1;
    }

    public static int intDigitMult (int number){

        int range = Math.abs(number);
        int length = 0;
        while (range >= 10){
            range /= 10;
            length++;
        }

        int result = 1;
        for (int i = 0; i <= length; i++){
            int digit = Math.abs(number) / (int)Math.pow(10, (length - i));
            if (digit > 10){
                digit = digit % 10;
            }
            result *= digit;
        }
        return result;
    }

    public static int intEvenDigNum (int number){

        int range = Math.abs(number);
        int length = 0;
        while (range >= 10){
            range /= 10;
            length++;
        }

        int result = 0;
        for (int i = 0; i <= length; i++){
            int digit = Math.abs(number) / (int)Math.pow(10, (length - i));
            if (digit > 10){
                digit = digit % 10;
            }
            if (digit != 10 && digit!=0 && digit % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static int intMaxDigit (int number) {

        int range = Math.abs(number);
        int length = 0;
        while (range >= 10) {
            range /= 10;
            length++;
        }

        int result = 0;
        for (int i = 0; i <= length; i++) {
            int digit = Math.abs(number) / (int) Math.pow(10, (length - i));
            if (digit > 10) {
                digit = digit % 10;
            }
            if (digit != 10 && digit > result) {
                result = digit;
            }
        }
        return result;

    }

    public static String stringWordsRevert (String text){
        String buffer[] = text.split(" ");
        String revert = "";
        for (int i = buffer.length - 1; i >= 0; i--){
            revert = revert.concat(buffer[i] + " ");
        }
        return revert;
    }
}

