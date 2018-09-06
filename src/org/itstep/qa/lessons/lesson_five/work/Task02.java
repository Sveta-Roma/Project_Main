package org.itstep.qa.lessons.lesson_five.work;

import java.util.Arrays;
import java.util.Scanner;

public class Task02
{ // Для массива из задачи 1 вычислить среднее арифметическое элементов. Вывести результат на экран.

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        array = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt(10);
        }
        int temp;
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(Arrays.toString(array));// выводим массив на экран в столбик
            temp = array[i]/10;
            System.out.println(temp);
        }
    }
}
