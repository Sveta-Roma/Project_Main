package org.itstep.qa.lessons.lesson_three.work;

public class Task03
{ //При помощи цикла while вывести на экран нечетные числа от 1 до 99.
    public static void main(String[] args)
    {
        int i = 1;
        while (i <= 99)
        {
            if (i%2!=0)
                System.out.println("Нечетные числа: " + i);
            i++;
        }
    }
}
