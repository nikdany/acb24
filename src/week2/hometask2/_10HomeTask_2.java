package week2.hometask2;

/**
        10)Найти слово, стоящее в тексте под номером 3 и вывести его первую букву.
        (Example: Hello world and you!
        text.split( ) -> return array of words)

        test text:
        Strings are constant their values cannot be changed after they are created.
        String buffers support mutable strings.
        Because String objects are immutable they can be shared.

 * Created by 4iamn on 27.05.2017.
 */
public class _10HomeTask_2 {
    public static void main(String[] args) {
        String text = "String buffers support mutable strings.";
        String words[] = text.split(" ");
        System.out.println("Word you are looking for starts with character = " + words[2].substring(0,1));
    }
}
