package week2.hometask2;

import java.util.Scanner;

/**
 * 6)Найдите минимальный по модулю элемент массива (Math.abs(value))
 * Created by 4iamn on 26.05.2017.
 */
public class _06HomeTask_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = input.nextInt();

        System.out.println("Enter array values");
        int[] array1 = new int[size];

        int minAbsValue = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++){
            array1[i] = input.nextInt();
            if (Math.abs(array1[i]) < minAbsValue){
                minAbsValue = Math.abs(array1[i]);
                }
            }

        System.out.println("Minimum absolut value in array is  " + minAbsValue);
    }
}
