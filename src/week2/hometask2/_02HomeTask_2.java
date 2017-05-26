package week2.hometask2;

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

        int digit1 = number % 10;
        int digit2 = (number - digit1) / 10;
        int result = digit1 * digit2;
        System.out.println("Multiply of digits will be " + result + "!");
    }
}
