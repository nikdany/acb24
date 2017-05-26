package week2;

import ua.artcode.utils.Utils;

/**
 * Created by 4iamn on 26.05.2017.
 */
public class _012StrinMethods {
    public static void main(String[] args) {
        String testString = "Hello world." +
                " I'm java developer and I want to sleep";
        System.out.println(testString);
        //length
        System.out.println("Length is: " + testString.length());

        //equals
        String a = "Hello";
        String b = "Hello";
        System.out.println(a + "==" + b);
        System.out.println(a.equals(b));

        a = "Hello";
        b = "HeLLo";
        System.out.println(a + "==" + b);
        System.out.println(a.equals(b));
        //equalsIgnoreCase
        System.out.println("IgnoreCase:");
        System.out.println(a.equalsIgnoreCase(b));
        //replace
        testString = testString.replace("I", "ZZZZ");
        System.out.println(testString);

        //replase first
        testString = testString.replaceFirst("l", "Rep1");
        System.out.println(testString);

        System.out.println(testString.charAt(5));

        // + vs concat
        System.out.println("a".concat("b"));
        System.out.println("a" + "b");

        //contains
        System.out.println(testString.contains("ZZZZ"));

        //endsWith
        System.out.println(testString.endsWith("2"));
        System.out.println(testString.startsWith("He"));

        byte[] bytes = testString.getBytes();

        System.out.println(testString.indexOf("l"));
        System.out.println(testString.lastIndexOf("l"));
        System.out.println(testString.indexOf("Rep"));

        String manySpaces = "     some words     ";
        System.out.println(manySpaces);
        System.out.println(manySpaces.trim());

        String emp = "";
        System.out.println(emp.isEmpty());

        String testSplit = "Cars, sport, java, qa asdd, js";
        String[] splitted = testSplit.split(", ");
        Utils.printArray(splitted);
        /*for (int i = 0; i < splitted.length; i++) {
            splitted[i] = splitted[i].trim();
        }
        MyUtils.printArray(splitted);*/

        System.out.println(testSplit.substring(5));
        System.out.println(testSplit.substring(6, 11));

        System.out.println(" ".isEmpty());

    }
}
