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
        for (int i = 0; i < arr.length; i++) {
            do {
                System.out.println("Введите целое чилсо");
                if (sc.hasNextInt()){
                    arr[i] = sc.nextInt();
                    break;
                } else {
                    System.out.println("Это не верный элемент! Введите правильный элемент");
                    sc.nextLine();
                }
            }while (true);
        }
        System.out.println("В итоге получился массив");
        System.out.println(Arrays.toString(arr));

        int temp = 0;
        temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.println("В итоге получился массив");
        System.out.println(Arrays.toString(arr));

        temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                temp++;
            }
        }
        System.out.println("Количество нулевых элементов равно" + temp);
    }
}
