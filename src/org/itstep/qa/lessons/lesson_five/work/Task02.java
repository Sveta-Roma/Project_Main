package org.itstep.qa.lessons.lesson_five.work;

import java.util.Arrays;
import java.util.Scanner;

public class Task02
{ // Для массива из задачи 1 вычислить среднее арифметическое элементов. Вывести результат на экран.

    public static void main(String[] args) {
        System.out.println("Введите значения: ");
        int[] a;
        a = new int[10];
        Scanner sc = new Scanner(System.in);
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();// заполнили массив
        }
        System.out.println(Arrays.toString(a));// выводит в строчку массив

        for (int i = 0; i < a.length; i++)
        {
            result = result + a[i];
        }
        result = result / a.length;
            System.out.println("Среднее арифметическое равно " + result);
    }
}
