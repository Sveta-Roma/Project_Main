package org.itstep.qa.lessons.lesson_four.home;

import java.util.Random;
import java.util.Scanner;

public class Task06_1
{ /* Задать случайное число от 0 до 20. У пользователя пять попыток на угадывание.
   * При каждой попытке выводить сообщение - "Мало" или "Много". Если угадано за пять попыток – вывести «Победа!»,
   * в противном случае – «Проигрыш!». (Необходимо реализовать контроль ввода пользователем нечисловых символов –
   * программа должна обрабатывать эту ситуацию)
  */
    public static void main(String[] args)
    {
        Random r = new Random();
        int a = r.nextInt(20);
        // System.out.println(a);
        System.out.println("У Вас пять попыток на угадывания");
        int i = 0; // контроль количества введенных
        do
            {
            System.out.println("Вводите число");
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();
            if (c < a)
            {
                System.out.println("Мало");
                sc.nextLine();
                i++;
            }
            else if (c > a)
            {
                System.out.println("Много");
                sc.nextLine();
                i++;
            }
            else
            {
                System.out.println("Победа!");
                sc.nextLine();
                i++;
                //break;
            }
            /*if (sc.hasNextInt())
            {
                sc.nextInt();
                i++;
                sc.nextLine();
            }
            else
            {
                System.out.println("Это не число. Попробуйте еще раз");
                i++;
                sc.nextLine();
            }*/
        }
        while (i < 5) ;
        System.out.println("Проигрыш!");
    }
}
