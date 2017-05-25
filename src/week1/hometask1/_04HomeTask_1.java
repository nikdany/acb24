package week1.hometask1;

import java.util.Scanner;

/**Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
 * Created by 4iamn on 20.05.2017.
 */
public class _04HomeTask_1 {
    public static void main(String[] args) {
        Scanner scanout = new Scanner(System.in);
        System.out.println("Enter your float number (with coma, example: 0,1).\n" +
                "Let's check it beyond 0 and 1.");
        float input = scanout.nextFloat();
        if (input < 1 && input > 0){
            System.out.println("Your number is correct. It is " + input);
        } else
            System.out.println("Wrong number. Try one more time \n" +
                    "Check out it couldn't be a dot in a float number or it's not beyond 0 and 1.");
    }
}
