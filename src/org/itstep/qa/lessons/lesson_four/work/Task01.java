package org.itstep.qa.lessons.lesson_four.work;

import java.util.Scanner;

public class Task01
{ // Составить программу для ввода с консоли возраста человека и вывода на консоль строки вида: «Вам NN лет».
    public static void main(String[] args)
    {
        Scanner str = new Scanner(System.in);
        // System.out.println("Введите ваше имя");
        String a = str.nextLine();
        // System.out.println("Введите ваш возраст");
        int b = str.nextInt();
        System.out.println("Ваше имя " + a + ", Вам " + b + " лет.");
    }
}
