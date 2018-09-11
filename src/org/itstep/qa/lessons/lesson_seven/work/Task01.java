package org.itstep.qa.lessons.lesson_seven.work;

public class Task01 {
    // приведение типов для примитивных типов
    public static void main(String[] args) {
        int a = 1;
        long b = 3;
        double c = 1.1d;
        float e = 3.4f;
        char ch = 'a';

        b = a;
        c = b;

        a = (int) b;// long положили int
        b = (long) c;// double положили long

        a = ch;
        System.out.println(a);
        boolean bb = true;// boolean и ссылочные типы сами по себе
        //a = (int) bb;
    }
}
