package org.itstep.qa.lessons.lesson_five.home;

import java.util.Arrays;
import java.util.Random;

public class Task03
{ /* Напишите программу, выводящую количество нулевых элементов в заданном целочисленном массиве.
   * Массив можно задать любым удобным способом
   */
    {
        int[] a;
        a = new int[10];
        Random random = new Random();
        for (int i = 0; i < a.length; i++)
        {
            a[i] = random.nextInt(150);
        }

        System.out.println(Arrays.toString(a));// выводит в строчку массив
    }
}
