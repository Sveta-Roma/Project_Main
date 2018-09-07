package org.itstep.qa.lessons.lesson_five.work;

import java.util.Arrays;
import java.util.Scanner;

public class Task01
{ /* Объявить массив целых чисел длиной 10 элементов.
   * Ввести значения для элементов массива с клавиатуры, заполнить массив. Вывести массив на экран.
   */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        array = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();// заполнили массив
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);// выводим массив на экран в столбик
        }
        System.out.println(Arrays.toString(array));// выводит в строчку массив
    }
}
