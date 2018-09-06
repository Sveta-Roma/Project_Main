package org.itstep.qa.lessons.lesson_one.home;

public class Task04
{ // Дана геометрическая прогрессия 99, 33, 11, ... найти сумму данной прогрессии
    public static void main(String[] args)
    {
        float b1 = 99;
        float b2 = 33;
        // float b3 = 11;
        float q = b2/b1;
        float s = b1/(1-q);
        System.out.println(s);
    }
}
