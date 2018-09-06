package org.itstep.qa.lessons.lesson_three.examples;

import java.util.Scanner;

public class Task03
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int nn = num.nextInt();
        int pr = 1;
        int i = 1;
        do
            {
            pr = i * pr;
            i++;
            }
        while (i <= nn);
        System.out.println(pr);
    }
}
