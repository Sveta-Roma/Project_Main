package org.itstep.qa.lessons.lesson_five.examples;

import java.util.Arrays;
import java.util.Random;

public class Task01
{
    public static void main(String[] args)
    {
        int[] array;// int array []
        array = new int[10];// зарезервировали длину
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(150);// заполнили массив случайным образом
            // array[i] = random.nextInt(bound: 300)-150; может заполнить не только положительными -150 до 150
            // array[i] = random.nextInt(bound: 150)-150; может заполнить не только положительными 0 до -150
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("dfs" + array[i]);// выводим массив на экран
        }
        System.out.println(Arrays.toString(array));// выводит в строчку массив

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));// сортировка по возрастанию

        Arrays.sort(array, 0, 5);// сортирует от 0 до 5 не включительно
        System.out.println(Arrays.toString(array));
    }
}
