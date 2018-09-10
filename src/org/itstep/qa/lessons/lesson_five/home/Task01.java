package org.itstep.qa.lessons.lesson_five.home;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 { /* Объявить массив целых чисел длиной 10 элементов.
   * Ввести значения для элементов массива с клавиатуры, сделать проверку правильности ввода элемента типа Integer,
   * если элемент введен неправильно – дать возможность повторить его ввод. Вывести массив на экран.
   */
    public static void main(String[] args) {
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            do {
                System.out.println("Введите целое число");
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
    }
}
