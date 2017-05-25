package week1.hometask1;

import java.util.Scanner;

/**Пользователь вводит параметр с консоли (текущий час от 0 до 24)
 Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
 * Created by User on 14.05.2017.
 */
public class _01HomeTask_1 {
    public static void main(String[] args) {
        Scanner userData = new Scanner(System.in);
        System.out.println("Enter current hour from 0 to 23 :");
        int time = userData.nextInt();
        if (time >= 9 && time < 18){
            System.out.println("I am working");}
            else if (time < 0 || time > 23){
            System.out.println("Wrong number! Try one more time.");
                }
                else{
                System.out.println("I am at home");
        }
    }
}
