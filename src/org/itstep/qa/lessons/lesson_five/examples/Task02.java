package org.itstep.qa.lessons.lesson_five.examples;

import java.util.Random;

public class Task02
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
        int temp;
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]*25);// выводим массив на экран
            temp = array[i]+345;// выполняем операции как и спеременными
        }
    }
}
