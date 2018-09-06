package org.itstep.qa.lessons.lesson_two.home;

import java.util.Scanner;

public class Task04
{ /*
  Составить программу, которая вводит число, обозначающее количество лет,
  и выводит для этого числа наименование «год», «года» или «лет». Например, «14 лет», «183 года», «31 год».
  */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {// бесконечный цикл
            System.out.println("Введите число лет");
            int result = scanner.nextInt();
            // 0 -- 99
            int temp = result % 10;
            if ((temp > 4 && temp <= 9) || temp == 0)
            {
                System.out.println("Ваш возраст " + result + " лет");
            }
            else
                {
                if(result % 100 >= 11 && result % 100 <= 14)
                {
                    System.out.println("Ваш возраст " + result + " лет");
                }
                else
                    {
                    if(result == 1)
                    {
                        System.out.println("Ваш возраст " + result + " год");
                    }
                    else
                        {
                        System.out.println("Ваш возраст " + result + " года");
                        }
                    }
                }
        }
    }
}
