package week1.day1;

/**
 * Created by User on 13.05.2017.
 */
public class _01DataTypes {
    public static void main(String[] args) {
//Main Types
//        <data type> <variable name> = <value>
        // rename variable/class/package shift+F6 (замена во всех строчках)
        // right mouse>refactor>rename
//byte	8 бит	от -128 до 127
        byte age = 100;
//short	16 бит	от -32768 до 32767
        short Summery = 1567;
//char	16 бит	без знаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)
// когда присваиваешь значение символ ставиться в одинарные скобки
        char letter1 = 'C';
        char letter2 = 'V';
        System.out.println(letter2);
//int	32 бит	от -2147483648 до 2147483647
        int room = 65111;
        System.out.println(room);
//long	64 бит	от -9223372036854775808 до 9223372036854775807
        //после числа надо ставить L или l
        long ReallyLongNumber = 5555999955500004444L;
//boolean	логический	true (истина) или false (ложь)
        boolean GrannyAt7AMAtTrolley = true;
        boolean LittleSmartBoy = false;
// float	32	от -1.4e-45f до 3.4e+38f
        // При использовании типа float требуется указывать суффикс f или F
        float ResultOfDeviding = 25999999.799999999999999999f;
//double	от -4.9e-324 до 1.7e+308
        double d = 37.8;
    }


}
