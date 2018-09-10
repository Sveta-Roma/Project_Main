package org.itstep.qa.lessons.lesson_six.home;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Task03 {
    // Даны две строки. Определите, является ли первая строка подстрокой второй строки. (Можно использовать метод contains).
    public static void main(String[] args) {
        String str1 = new String("privet");
        String str2 = new String("privrtu");
        boolean b = str2.contains(str1);
        System.out.println(b);
        if(str2.contains("privet")){
            System.out.println("Первая строка является подстрокой для второй строки");
        } else System.out.println("Первая строка не является подстрокой для второй строки");
    }
}
