package org.itstep.qa.lessons.lesson_five.home;

import java.util.Arrays;
import java.util.Scanner;

public class Task02
{ // В массиве из задачи 1 поменять местами первый и последний элементы. Вывести массив на экран до замены и после замены.
    public static void main(String[] args) {
        System.out.println("Введите значения:");
        Scanner sc = new Scanner(System.in);
        int[] a;
        a = new int[10];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();// заполнили массив
        }

        System.out.println(Arrays.toString(a));// выводит в строчку массив

            //int temp = a[0];
            //a[0] = a[a.length];
            //a[a.length] = temp;
    }
}
