package org.itstep.qa.lessons.lesson_one.home;

public class Task03
{ // Дано 1865 часов. Вывести на экран количество целых дней и часов в виде: "Было дано 1865 часов. Это равно х дней и у часов"
    public static void main(String[] args)
    {
        float h = 1865;
        float s = 24;
        float y = h%s;
        float x = (h-y)/s;
        // System.out.println(y + " часов");
        // System.out.println(x + " дней");
        System.out.println("Было дано " + h + " часов. " + "Это равно " + x + " дней и " + y + " часов");
    }
}
