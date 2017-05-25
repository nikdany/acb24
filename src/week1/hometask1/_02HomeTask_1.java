package week1.hometask1;

import java.util.Scanner;

/**Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
 * Created by User on 14.05.2017.
 */
public class _02HomeTask_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = sc.nextInt();
        System.out.println("Enter second number");
        int number2 = sc.nextInt();
        System.out.println("Enter third number");
        int number3 = sc.nextInt();
        int big = number1;
        if (big < number2) {
            big = number2;
        }
        if (big < number3) {
            big = number3;
        }
        System.out.println("MAXIMUM = " + big);
        int min = number1;
        if (min > number2) {
            min = number2;
        }
        if (min > number3) {
            min = number3;
        }
        System.out.println("MINIMUM = " + min);
    }
}
