package week2.hometask2;

import java.util.Scanner;

/**
 * Created by 4iamn on 26.05.2017.
 */
public class _00Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        WhileLoop:
        while (true) {
            System.out.println("Welcome in primitive calc. \n" +
                    "Chose your option:\n" +
                    "1) sum\n" +
                    "2) substract\n" +
                    "3) multipy\n" +
                    "4) divide\n" +
                    "0) quit");

            String operation = scan.nextLine();
            if (operation.equals("1") || operation.equals("2") || operation.equals("3") || operation.equals("4")) {

                System.out.println("Enter first number");
                int number1 = scan.nextInt();
                System.out.println("Enter second number");
                int number2 = scan.nextInt();

                switch (operation) {
                    case "1":
                        System.out.println("Your result equals " + (number1 + number2));
                        break;

                    case "2":
                        System.out.println("Your result equals " + (number1 - number2));
                        break;

                    case "3":
                        System.out.println("Your result equals " + (number1 * number2));
                        break;

                    case "4":
                        System.out.println("Your result equals " + (number1 / number2));
                        break;
                }
                System.out.println("May be you want try more?\nType YES to continue, NO to quit.");
                operation = scan.nextLine();

                switch (operation) {
                    case "YES":
                        break;
                    case "NO":
                        break WhileLoop;
                    default:
                        System.out.println("Wrong operation!\nType YES or NO");
                }

            } else if (operation.equals("0")) {
                break;
            } else
                System.out.println("Wrong operation!\nChose beyond 0 and 4");
        }

        System.out.println("Good bye.");
    }
}
