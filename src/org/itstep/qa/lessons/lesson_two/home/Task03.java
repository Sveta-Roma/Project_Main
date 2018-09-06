package org.itstep.qa.lessons.lesson_two.home;

import java.util.Scanner;

public class Task03
{ /*
  Составить программу, которая определит,
  является ли треугольник с заданными сторонами равносторонним, равнобедренным или разносторонним.
  */
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        if (a == b & b == c) System.out.println("Треугольник равносторонний");
        else if (a == b & b != c) System.out.println("Треугольник равнобедренный");
            else if (a == c & c != b) System.out.println("Треугольник равнобедренный");
                else if (b == c & c != a) System.out.println("Треугольник равнобедренный");
                    else System.out.println("Треугольник разносторонний");
    }
}
