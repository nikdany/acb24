package week2.hometask2;

import java.util.Scanner;

/**
 * 5)Найдите наибольший элемент массива.
 * Created by 4iamn on 26.05.2017.
 */
public class _05HomeTask_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = input.nextInt();
        int maxValue = -100;//, minValue = -100, result = -100;

        int[] array1 = new int[size];
        for (int i = 0; i < size; i++){
            array1[i] =(int)(Math.random() * 100);
            int sign = (int)(Math.random()*10);
            if (sign > 4){
                array1[i] *= -1;
            }
            if (array1[i] > maxValue){
               maxValue = array1[i];
            }
        }
        System.out.println("Maximum value in array is - " + maxValue);
    }
}
