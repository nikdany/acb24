package week1.day1;

/**
 * Created by User on 13.05.2017.
 */
public class _02DataTypeCasting {
    public static void main(String[] args) {
//переприсвоение переменной типа данных с меньшего на больший разрешаеться
        byte b = 25;
        int i = b;
        System.out.println(i);

//КАСТИРОВАНИЕ - насильное, умышленное присвоение переменной меньшего типа данных значения переменной большего типа
        int i2 = 27;
        byte b2 = (byte)i2;
        System.out.println(b2);
    }
}
