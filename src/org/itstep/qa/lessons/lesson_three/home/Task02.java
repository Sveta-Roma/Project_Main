package org.itstep.qa.lessons.lesson_three.home;

import java.util.Scanner;

public class Task02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и только число");
        int inputValue = 0;
        //int i = 0; // контроль количества введенных
        while (true)
        { // бесконечный цикл
            if (scanner.hasNextInt())
            {
                inputValue = scanner.nextInt();
                break; // прерывания цикла
            } else
                {
                System.out.println("Это не число. Попробуйте еще раз");
                scanner.nextLine(); // очистка буфера со значениями
                }
        }
        System.out.println("Итоговый результат " + inputValue);
    }
}
