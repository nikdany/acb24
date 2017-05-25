package week1.hometask1;

import java.util.Scanner;

/**Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19
 * Created by 4iamn on 20.05.2017.
 */
public class _06HomeTask_1 {
    public static void main(String[] args) {
        Scanner scannout = new Scanner(System.in);
        System.out.println("Enter first number...");
        int number1 = scannout.nextInt();
        System.out.println("Enter second number...");
        int number2 = scannout.nextInt();
        if ((number1 + number2) > 11 && (number1 + number2) < 19){
            System.out.println("Sum of your numbers is " + (number1 + number2));
        } else
            System.out.println("Try other numbers.");
    }
}
