package week2.hometask2;

import ua.artcode.utils.Utils;

import java.util.Scanner;

/**
 * Created by 4iamn on 26.05.2017.
 */
public class _04HomeTask_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input number");
        int number = input.nextInt();

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
        System.out.println("Maximum digits is " + result);
    }
}
