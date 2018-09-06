package org.itstep.qa.lessons.lesson_two.home;

import java.util.Scanner;

public class Task02
{ /*
  Три шахматиста играют в шахматы. Известно количество очков, набранных каждым из них.
  Составить программу, которая определит, на сколько очков победитель оторвался от самого слабого игрока.
  */
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        if (a > b & b > c) System.out.println("Победитель оторвался от самого слабого игрока на " + (a-c));
        else if (a > c & c > b) System.out.println("Победитель оторвался от самого слабого игрока на " + (a-b));
            else if (b > a & a > c) System.out.println("Победитель оторвался от самого слабого игрока на " + (b-c));
                else if (c > a & a > b) System.out.println("Победитель оторвался от самого слабого игрока на " + (c-b));
                    else if (c > b & b > a) System.out.println("Победитель оторвался от самого слабого игрока на " + (c-a));
                        else if (b > c & c > a) System.out.println("Победитель оторвался от самого слабого игрока на " + (b-a));
                            else System.out.println("Победителя нет");
    }
}
