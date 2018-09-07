package org.itstep.qa.lessons.lesson_five.home;

import java.util.Arrays;
import java.util.Scanner;

public class Task01
{ /* Объявить массив целых чисел длиной 10 элементов.
   * Ввести значения для элементов массива с клавиатуры, сделать проверку правильности ввода элемента типа Integer,
   * если элемент введен неправильно – дать возможность повторить его ввод. Вывести массив на экран.
   */
    public static void main(String[] args)
    {
        int [] a;
        a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значения");
        while (true) {
            if (sc.hasNextInt())
            {
                for (int i = 0; i < a.length; i++)
                {
                    a[i] = sc.nextInt();
                }
                System.out.println(Arrays.toString(a));
                break;
            }
            else
                {
                System.out.println("Это не верный элемент! Введите правильный элемент");
                sc.nextLine();
                }
        }
    }
}
