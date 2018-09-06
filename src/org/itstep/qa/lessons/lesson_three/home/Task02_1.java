package org.itstep.qa.lessons.lesson_three.home;

import java.util.Scanner;

public class Task02_1
{ /* Придумать способ ввода 3-х целых чисел с проверкой того, что пользователь вводит целые числа.
   * Если пользователь допускает ошибку – дать ему возможность ввести число повторно.
   * (Для очистки входного потока можно использовать метод nextLine()).
   */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и только число");
        int i = 0; // контроль количества введенных
        do
            {
            System.out.println("Вводите число");
            if (scanner.hasNextInt())
            {
                scanner.nextInt();
                i++;
                scanner.nextLine();
            }
            else
                {
                System.out.println("Это не число. Попробуйте еще раз");
                scanner.nextLine();
                }
            }
        while (i<3);
    }
}
