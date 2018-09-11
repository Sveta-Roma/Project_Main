package org.itstep.qa.lessons.lesson_six.home;

import java.util.Scanner;

public class Task02 {
    // Создать строку и проинициализировать ее каким-либо значением. Вывесть значение строки на экран.
    // Присвоить этой же строке значение введенное с клавиатуры и также вывести его на экран
    public static void main(String[] args) {
        System.out.println("Исходный текст:");
        String str = new String ("dfghjb");
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст:");
        str = sc.nextLine();
        System.out.println(str);
    }
}
