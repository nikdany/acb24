package ua.artcode.utils;

import java.util.Scanner;

/**
 * Created by User on 14.05.2017.
 */
public class NovaPpshtaApp2 {
    public static void main(String[] args) {
        String code1 = "234555544";
        String name1 = "helmet";

        String code2 = "234555545";
        String name2 = "cat";

        String code3 = "234555546";
        String name3 = "234555546";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your code");
        String userCode = scanner.nextLine();

        // if (userCode.equels(code1) || userCode.equels(code2) || userCode.equels(code3))
        if (userCode.equals(code1)) {
            System.out.println("You got it!");
            System.out.println("Your code" + code1);
            System.out.println("Your product is" + name1);
        } else if (userCode.equals(code2)) {
            System.out.println("You got it!");
            System.out.println("Your code" + code2);
            System.out.println("Your product is" + name2);
        } else if (userCode.equals(code3)) {
            System.out.println("You got it!");
            System.out.println("Your code" + code3);
            System.out.println("Your product is" + name3);
        } else {
            System.out.println("Product mot found");
        }
    }

        /*if(userCode.equels)
        public static String getSuccessMessage(String c, String n){
            String message = "Your code is " + c + ", Your product" + n;
            return message;*/


}
