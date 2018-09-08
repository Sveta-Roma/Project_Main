package org.itstep.qa.lessons.lesson_six;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // Создать строку и проинициализировать ее каким-либо знгачениемю. Вывесть значение строки на экран.
        // Присвоить этой же строке значение введенное с клавиатуры и также вывести его на экран
        String str = new String ("dfghjb");
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println(str);
    }
}
