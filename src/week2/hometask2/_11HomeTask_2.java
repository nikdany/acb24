package week2.hometask2;

import ua.artcode.utils.Utils;

import java.util.Scanner;

/**Реализовать метод, который меняет местами слова в строке, состоящей из двух слов.
 * Created by 4iamn on 27.05.2017.
 */
public class _11HomeTask_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words.");
        String twoWords = input.nextLine();

        System.out.println("Revert sentence is =>>> " + Utils.stringWordsRevert(twoWords));
    }
}
   /* public static String stringWordsRevert (String text){
        String buffer[] = text.split(" ");
        String revert = "";
        for (int i = buffer.length - 1; i >= 0; i--){
            revert = revert.concat(buffer[i] + " ");
        }
        return revert;
    }*/