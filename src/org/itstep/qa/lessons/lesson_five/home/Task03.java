package org.itstep.qa.lessons.lesson_five.home;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task03
{ /* Напишите программу, выводящую количество нулевых элементов в заданном целочисленном массиве.
   * Массив можно задать любым удобным способом
   */
    public static void main(String[] args) {
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значения массива 10 элементов: ");
        for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
        }
        System.out.println("В итоге получился массив");
        System.out.println(Arrays.toString(arr));
// нулевые элементы
        int temp = 0;
        temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                temp++;
            }
        }
        System.out.println("Количество нулевых элементов равно " + temp);
    }
}
