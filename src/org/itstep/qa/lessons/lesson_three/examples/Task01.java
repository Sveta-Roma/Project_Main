package org.itstep.qa.lessons.lesson_three.examples;

import java.util.Scanner;

public class Task01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int result = 25;
        do
            {
            System.out.println("Введите число 25");
            result = scanner.nextInt();
            if(result == 25)
            {
                break;
            }
            }
        while (true);// бесконечный цикл
        System.out.println("Вы восхитительны!!!");
    }
}
