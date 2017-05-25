package week2;

import java.util.Scanner;

/**
 * Created by User on 14.05.2017.
 */
public class _04Tasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two values, to check if there digits are same.\n" +
                "Enter first value:");
        String value1 = scan.nextLine();
        System.out.println("Enter second value");
        String value2 = scan.nextLine();

        if (value1.length() != value2.length())
        {
            for ( int i = 0; i < value1.length(); i++){
                if(value1.charAt(i) != value2.charAt(i)){
                    System.out.println("Different numbers" + value1 + " and " + value2);
                    return;
                } else
                    System.out.println("Numbers are equal");
            }
        }


    }
}
