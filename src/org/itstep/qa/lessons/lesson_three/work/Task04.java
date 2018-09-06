package org.itstep.qa.lessons.lesson_three.work;

import java.util.Scanner;

public class Task04
{ //Дано число n. При помощи цикла while определить факториал n!(Определение n! = 1*2*3*…*n, 0! = 1)
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int nn = num.nextInt();
        int sum = 1;
        int i = 1;
        while (i <= nn)
        {
            sum = i * sum;
            i++;
        }
        System.out.println(sum);
    }
}
