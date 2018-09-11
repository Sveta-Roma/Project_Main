package org.itstep.qa.lessons.lesson_six.home;

import java.util.Scanner;

public class Task05_1 {
    // нужно еще в цикл обернуть

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите один символ: ");
        String temp = sc.nextLine();// временное хранилище
        if (temp.length() == 1){
            char ch = temp.charAt(0);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                if (Character.isLowerCase(ch)){
                    System.out.println("Результат = " + Character.toUpperCase(ch));
                }else {
                    System.out.println("Результат = " + Character.toLowerCase(ch));
                }
            }else System.out.println("Вы вели не латинскую букву");
        }else {
            System.out.println("Вы вели слишком длинное значение");
        }

    }
}
