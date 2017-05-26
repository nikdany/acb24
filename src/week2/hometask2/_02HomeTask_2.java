package week2.hometask2;

import ua.artcode.utils.Utils;

import java.util.Scanner;

/**
 * Найдите произведение цифр числа.
 * Created by 4iamn on 26.05.2017.
 */
public class _02HomeTask_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input number");
        int number = input.nextInt();

        /*int digit;
        int result = 1;

        int length = Utils.intLength(number);
        int pow = length -1;
        for (int i = 0; i < length; i++){
            digit = Math.abs(number) / (int)Math.pow(10, (pow -i));
            if (digit > 10){
                digit = digit % 10;
            }
            result *= digit;
        }*/
        int result = Utils.intDigitMult(number);
        System.out.println("Multiply of digits will be " + result + "!");
    }
}
