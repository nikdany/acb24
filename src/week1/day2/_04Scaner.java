package week1.day2;

import java.util.Scanner;

/**
 * Created by User on 14.05.2017.
 */
public class _04Scaner {
    public static void main(String[] args) {
        //String name = "Christmas";
        //System.out.println(name);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("your name is -" + name + ", your age is -" + age);

    }
}
