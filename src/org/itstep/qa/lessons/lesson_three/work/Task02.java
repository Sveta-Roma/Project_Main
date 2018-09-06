package org.itstep.qa.lessons.lesson_three.work;

import java.util.Scanner;

public class Task02
{ //Дано число n. При помощи цикла for определить факториал n!(Определение n! = 1*2*3*…*n, 0! = 1)
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int nn = num.nextInt();
        int sum = 1;
        for (int i = 1; i <= nn; i++)
        {
            sum = i * sum;
        }
        System.out.println(sum);
    }
}

