package org.itstep.qa.lessons.lesson_four.work;

import java.util.Scanner;

public class Task04
{ // Пользователь вводит целое число. Если число чётное, то к нему прибавить 2, а если нечётное, то 1. Вывести результат.
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите целое число");
        int i = number.nextInt();
        if (i % 2 == 0)
        {
            System.out.println(i+2);
        }
        else System.out.println(i+1);
    }
}
