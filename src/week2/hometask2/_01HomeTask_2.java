package week2.hometask2;

import ua.artcode.utils.Utils;

/**
 * 1)Даны натуральные числа от 35 до 87.
 * Вывести на консоль те из них, которые при делении на 7 дают остаток 1, 2 или 5.
 * Created by 4iamn on 26.05.2017.
 */
public class _01HomeTask_2 {
    public static void main(String[] args) {

        int[] numbers = new int[53];
        System.out.print("[");

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = 35 + i;
            if ((numbers[i]%7 == 1) || (numbers[i] % 7 == 2) || (numbers[i] % 7 == 5)){
                System.out.print(numbers[i]);
                if (i < (numbers.length - 2) ){
                    System.out.print(", ");
                }
            }
        }
        System.out.println("]");


    }
}
