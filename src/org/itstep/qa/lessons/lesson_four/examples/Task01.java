package org.itstep.qa.lessons.lesson_four.examples;

import java.util.Scanner;

public class Task01
{ /* Составить программу вычисления площади треугольника, заданного длинами своих сторон (по формуле Герона).
   * Для вычисления корня использовать метод sqrt() класса Math: Math.sqrt(число).
  */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую сторону треугольника");
        double a = sc.nextInt();
        System.out.println("Введите вторую сторону треугольника");
        double b = sc.nextInt();
        System.out.println("Введите третью сторону треугольника");
        double c = sc.nextInt();
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Площадь треугольника равна " + s);
    }
}
