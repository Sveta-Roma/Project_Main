package org.itstep.qa.lessons.lesson_four.work;

import java.util.Scanner;

public class Task03
{
    // Ввести два действительных положительных числа. Вывести среднее арифметическое и среднее геометрическое этих чисел.
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите одно число");
        double a = number.nextInt();
        System.out.println("Введите другое число");
        double b = number.nextInt();
        if (a>0 & b>0)
        {
            double c = (a+b)/2;
            System.out.println("Среднее арифметическое равно " + c);
            double d = Math.sqrt(a*b);
            System.out.println("Среднее геометрическое равно " + d);
        }
        else System.out.println("Неверно введены числа");
    }
}
