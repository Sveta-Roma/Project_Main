package org.itstep.qa.lessons.lesson_three.work;

public class Task01
{ //При помощи цикла for вывести на экран нечетные числа от 1 до 99.
    public static void main(String[] args)
    {
        for (int i = 1; i <= 99; i++ )
        {
            if (i%2!=0)
                System.out.println("Нечетные числа: " + i);
        }
    }
}
