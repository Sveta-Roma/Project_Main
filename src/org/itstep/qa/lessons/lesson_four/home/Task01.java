package org.itstep.qa.lessons.lesson_four.home;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(20);
        // System.out.println("Случайное число " + a);
        System.out.println("У Вас пять попыток на угадывания");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("Вводите число");
            //Scanner sc = new Scanner(System.in);
            //int c = sc.nextInt();
            if (sc.hasNextInt())
            {
                if (sc.nextInt() < a)
                {
                System.out.println("Мало");
                sc.nextLine();
                i++;
                }
                if (sc.nextInt() > a)
                {
                    System.out.println("Много");
                    sc.nextLine();
                    i++;
                }
                if (sc.nextInt() == a)
                {
                System.out.println("Победа!");
                sc.nextLine();
                i++;
                break;
                }
                else System.out.println("Проигрыш!");
            }
            else
            {
                System.out.println("Это не число. Попробуйте еще раз");
                i++;
                sc.nextLine();
            }
        } while (i < 5);
    }
}
