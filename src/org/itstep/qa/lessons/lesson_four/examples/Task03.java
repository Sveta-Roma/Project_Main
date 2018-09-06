package org.itstep.qa.lessons.lesson_four.examples;

import java.util.Scanner;

public class Task03
{ // Ввести длину ребра куба. Вывести объем куба и площадь его боковой поверхности.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину ребра куба");
        double l = sc.nextInt();
        double v = l*l*l;
        System.out.println("Объем куба равен " + v);
        double  s = 4*l*l;
        System.out.println("Площадь боковой поверхности куба равна " + s);
    }
}
