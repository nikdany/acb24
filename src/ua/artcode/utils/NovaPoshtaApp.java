package ua.artcode.utils;

import java.util.Scanner;

/**
 * Created by User on 14.05.2017.
 */
public class NovaPoshtaApp {
    public static void main(String[] args) {
        //init post data
        //at least three codes
        int code1 = 12345;
        int code2 = 54321;
        int code3 = 88888;

        String codeName1 = "helmet";
        String codeName2 = "cat";
        String codeName3 = "dog";

        //input user code and name
        //String userCode = System().readline()
        // if (userCode.equels(code1) || userCode.equels(code2) || userCode.equels(code3))
        // Для сравнения стрингов используеться
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your code :");
        int code = sc.nextInt();
        //chek
        if (code == code1){
            System.out.println("Your " + codeName1 + " arrived");
            System.out.println("Get your package at next window.");
        }   else if (code == code2){
            System.out.println("Your " + codeName2 + " arrived");
            System.out.println("Get your package at next window.");
        }   else if (code == code3){
            System.out.println("Your " + codeName3 + " arrived");
            System.out.println("Собака сьела товар, теперь она наркоман.");
        }   else {
            System.out.println("Wrong code.");
        }
    }
}
