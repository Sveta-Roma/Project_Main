package org.itstep.qa.lessons.lesson_two.work;

import java.util.Random;
import java.util.Scanner;

public class Task01
{ // программа проверяет знание таблицы умножения
    public static void main(String[] args)
    {
        Random r = new Random();
        int a = r.nextInt(10);
        int b = r.nextInt(10);
        System.out.println("Проверка знаний ТАБЛИЦЫ УМНОЖЕНИЯ");
        System.out.println("Решите пример:");
        System.out.print(a+" * "+b+" = ");
        Scanner sc=new Scanner(System.in);
        int c = sc.nextInt();
        if (c == a*b) System.out.println("Верно!");
        else System.out.println("Неверно!");
    }
}
