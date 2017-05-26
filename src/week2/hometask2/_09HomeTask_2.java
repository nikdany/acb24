package week2.hometask2;

import java.util.Scanner;

/**
 * Создать массив, размер которого указвывает пользователь с консоли.
 * Заполнить его случайным образом от 0 до 10.
 * Найти и вернуть индекс первого элемента который = 5.Если такой элемент не найден - вернуть -1
 * Created by 4iamn on 27.05.2017.
 */
public class _09HomeTask_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array, you want to create.");
        int size = input.nextInt();

        int[] userArray = new int[size];
        for (int i = 0; i < size; i++){
            userArray[i] = (int)(Math.random() * 10);
            if (userArray[i] == 5){
                System.out.println("First element with value 5 index is - " + i);
                break;
            } else if ((i + 1) == size){
                System.out.println("-1");
            }
        }
    }
}
