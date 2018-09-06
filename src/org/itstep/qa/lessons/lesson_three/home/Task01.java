package org.itstep.qa.lessons.lesson_three.home;

import java.util.Scanner;

public class Task01
{ //Даны переменные x и n. Вычислить x в степени n.
    public static void main(String[] args)
    {
        Scanner num_1 = new Scanner(System.in);
        Scanner num_2 = new Scanner(System.in);
        int a = num_1.nextInt();
        int b = num_2.nextInt();
        System.out.println("Значение x = " +a + " ,y = " + b);
        int pr = 1;
        for (int i = 1; i <= b; i++)
        {
            pr = a * pr;
        }
        System.out.println("x в степени y равно " + pr);
    }
}
