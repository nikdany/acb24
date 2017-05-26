package week2.hometask2;

import java.util.Scanner;

/**
 * Составить расписание на неделю. Пользователь вводит порядковый номер дня недели
 *      и у него на экране отображается то, что запланировано на этот день.
 * Created by 4iamn on 26.05.2017.
 */
public class _08HomeTask_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dayTask = "Task for what day you whant to now? Type number of the day.";
        System.out.println(dayTask);
        int day = input.nextInt();

        switch (day){
            case 1: dayTask = "To do homework on monday";
                break;
            case 2: dayTask = "To do homework on tuesday";
                break;
            case 3: dayTask = "To do homework on wendsday";
                break;
            case 4: dayTask = "To do homework on thursday";
                break;
            case 5: dayTask = "To do homework on friday";
                break;
            case 6: dayTask = "To go on classes at saturday morning";
                break;
            case 7: dayTask = "To go on classes at sunday morning";
                break;
            default:
                System.out.println("Wrong number of day, try more.");
                break;
        }
        System.out.println("Today your task is: " + dayTask + "\nGood bye!");
    }
}
