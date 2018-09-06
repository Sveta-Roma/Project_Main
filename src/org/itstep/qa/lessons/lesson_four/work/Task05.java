package org.itstep.qa.lessons.lesson_four.work;

public class Task05
{ // Составить программу, которая поменяет местами значения двух переменных и выведет результат до замены и после замены.
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        System.out.print(a);
        System.out.println(b);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.print(a);
        System.out.println(b);
    }
}
