package org.itstep.qa.lessons.lesson_five.examples;

import java.util.Arrays;
import java.util.Random;

public class Task03
{
    public static void main(String[] args)
    {
        int[][] array;// int array []
        array = new int[10][5];// зарезервировали длину
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {// вложенный массив
                array[i][j] = random.nextInt(100);// заполнили массив случайным образом двумерное пространство
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)// вложенный массив
            {
                System.out.print(array [i][j] + " ");// выводим массив на экран выводит в одну строку
            }
            System.out.println();// переводит на новую
        }
    }
}
