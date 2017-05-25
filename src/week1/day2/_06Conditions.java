package week1.day2;

import java.util.Scanner;

/**
 * Created by User on 14.05.2017.
 */
public class _06Conditions {
    public static void main(String[] args) {
        String name = "Nik";
        int pass = 123456;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password");
        int enterdPass = sc.nextInt();
        boolean isEquel = pass == enterdPass;
        if (isEquel){
            System.out.println("Welcome " + name);
                    }
                    else{
            System.out.println("Wrong password");
        }
    }
}
