package org.itstep.qa.lessons.lesson_five.home;

import java.util.Arrays;
import java.util.Scanner;

public class Task02
{ // В массиве из задачи 1 поменять местами первый и последний элементы. Вывести массив на экран до замены и после замены.
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

        int temp = 0;
        temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.println("В итоге получился массив");
        System.out.println(Arrays.toString(arr));
    }
}
