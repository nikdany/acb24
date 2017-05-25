package week1.hometask1;

import java.util.Scanner;

/**
 * Created by 4iamn on 20.05.2017.
 */
public class _05HomeTask_1 {
    public static void main(String[] args) {
        //Вводим 2 числа. Если первое число больше второго,
        // то вывести на экран разницу чисел. Если второе больше, то выводим сумму.
        Scanner scannout = new Scanner(System.in);
        System.out.println("Enter first number.");
        int number1 = scannout.nextInt();
        System.out.println("Enter second number.");
        int number2 = scannout.nextInt();
        if (number1 > number2) {
            System.out.println("Substraction of numbers = " + (number1 - number2));
        } else if (number1 < number2){
            System.out.println("Sum of numbers = " + (number1 + number2));
        } else
            System.out.println("Your numbers are equal.");
    }
}
