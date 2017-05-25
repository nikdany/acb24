package week1.hometask1;

import java.util.Scanner;

/**Вводим два числа, если одно из них делиться на другое без остатка,
 * то выводим тру и показываем результат деления (целую часть от деления  и остачу)
   в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
 * Created by 4iamn on 20.05.2017.
 */
public class _07HomeTask_1 {
    public static void main(String[] args) {
        Scanner scanout = new Scanner(System.in);
        System.out.println("Enter first number...");
        double number1 = scanout.nextDouble();
        System.out.println("Enter second number...");
        double number2 = scanout.nextDouble();

        double result = number1 / number2;
        int resultPart1 = (int) result;
        double resultPart2 = number1 % number2;

        if (resultPart2 == 0){
            System.out.println("True " + resultPart1 + " and " + resultPart2);
        } else
            System.out.println("False " + resultPart1 + " and " + resultPart2);
    }
}
