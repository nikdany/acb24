package week1.hometask1;

import java.util.Scanner;

/**Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
 * Created by 4iamn on 20.05.2017.
 */
public class _03HomeTask_1 {
    public static void main(String[] args) {
        Scanner scanme = new Scanner(System.in);
        System.out.println("Enter your devidend to 7 number. Get it doubled result.");
        int input = scanme.nextInt();
        if (input % 7 == 0){
            System.out.println("Result is " + (input * 2));
        } else
            System.out.println("Try more");
    }
}
