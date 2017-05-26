package week2.hometask2;

import java.util.Scanner;

/**
 *  Необходимо суммировать все нечётные целые числа в диапазоне, который введёт пользователь с клавиатуры.
 * Created by 4iamn on 26.05.2017.
 */
public class _07HomeTask_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two values two manage range.");
        int range1 = input.nextInt();
        int range2 = input.nextInt();

        int odd = 0;
        if (range1 < range2){
            while (range1 <= range2){
                if ((range1 % 2) != 0)
                    odd += range1;
                    range1++;
            }
        } else {
            while (range2 <= range1){
                if((range2 %2) != 0){
                    odd += range2;
                    range2++;
                }
            }
        }
        System.out.println("Result is " + odd);
    }
}
