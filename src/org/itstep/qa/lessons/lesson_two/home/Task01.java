package org.itstep.qa.lessons.lesson_two.home;

import java.util.Scanner;

public class Task01
{ // Составить программу, которая определит большее из двух введенных чисел.
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b) System.out.print("Большее " + a);
        else if (b>a) System.out.print("Большее " + b);
        else System.out.print("Числа равны");
    }
}
