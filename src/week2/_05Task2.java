package week2;

import ua.artcode.utils.Utils;

import java.util.Scanner;

/**
 * Created by 4iamn on 20.05.2017.
 */
public class _05Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input size of array");

        int size = scan.nextInt();
        scan.nextLine();
        String[] words = new String[size];

        for (int i = 0; i < size; i++){
            System.out.println("Input word");
            words[i] = scan.nextLine();
            if (Utils.checkLetter(words[i].charAt(0))){
                words[i] = words[i].toUpperCase();
            }
        }
        Utils.printArray(words);
    }
}
