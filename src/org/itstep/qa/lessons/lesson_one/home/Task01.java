package org.itstep.qa.lessons.lesson_one.home;

public class Task01
{ // Реализовать алгоритм вычисляющий среднее  арифметическое 4х чисел и выводящий это на экран
    public static void main(String[] args)
    {
        float a = 1;
        float b = 2;
        float c = 3;
        float d = 4;
        float i = a + b + c + d;
        float f = i/4;
        System.out.println("Среднее арифметическое равно " + f);
    }
}
