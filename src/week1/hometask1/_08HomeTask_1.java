package week1.hometask1;

import java.util.Scanner;

/**
 * Created by 4iamn on 20.05.2017.
 */;

public class _08HomeTask_1 {
    public static void main(String[] args) {
        Scanner scanout = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = scanout.nextInt();
        System.out.println("Enter second number");
        int number2 = scanout.nextInt();

        if (number1 % 10 == number2 % 10){
            System.out.println("Last digit of numbers is equal to " + number1 % 10);
        } else
            System.out.println("Last digits of numbers are not equal\n" +
                    "They are " + number1 % 10 +" and " + number2 % 10 );
    }
}
