package org.itstep.qa.lessons.lesson_four.work;

import java.util.Scanner;

public class Task02
{ // Ввести катеты прямоугольного треугольника. Вывести его гипотенузу и площадь.
    public static void main(String[] args)
    {
        Scanner str = new Scanner(System.in);
        System.out.println("Введите первый катет");
        double a = str.nextInt();
        System.out.println("Введите второй катет");
        double b = str.nextInt();
        double c = Math.sqrt(a*a+b*b);
        System.out.println("Гипотенуза равна " + c);
        double s = (a*b)/2;
        System.out.println("Площадь равна " + s);
    }
}
