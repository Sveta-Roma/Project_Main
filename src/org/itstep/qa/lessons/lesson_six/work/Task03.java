package org.itstep.qa.lessons.lesson_six.work;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int i = 1; // примитивная переменная
        Scanner sc_1 = new Scanner(System.in); // ссылочная переменная
        Scanner sc_2 = new Scanner(System.in);

        System.out.println(sc_1 == sc_2); // false

        String b = "hbhg"; // "литерал"
        String v = "hbhg";

        System.out.println(b == v); // true
        System.out.println(b.equals(v)); //true

        String y = new String("hbhg"); // ссылочный тип
        String u = new String("hbhg");

        System.out.println(y == u); // false это ссылочный тип
        System.out.println(y.equals(u)); // true вот так нужно сравнивать ссылочные типы
    }
}
