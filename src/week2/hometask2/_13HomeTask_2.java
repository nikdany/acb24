package week2.hometask2;

import ua.artcode.utils.Utils;

import java.util.Scanner;

/**
 *  Найдите среднее арифметическое массива из 10 элементов типа double.
 *
 * Created by 4iamn on 27.05.2017.
 */
public class _13HomeTask_2 {
    public static void main(String[] args) {
        double[] midsum = new double[10];
        double result = 0;
        for (int i = 0; i < 10; i++){
            midsum[i] = Math.random()*100;
            result += midsum[i];
        }
        Utils.printArray(midsum);
        System.out.println( "Your result =>>> " + result/midsum.length);
    }
}
