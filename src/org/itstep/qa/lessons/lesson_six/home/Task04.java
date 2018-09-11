package org.itstep.qa.lessons.lesson_six.home;

import java.util.Scanner;

public class Task04 {
    /* Дана строка, содержащая пробелы. Найдите, сколько в ней слов (слово – это последовательность символов,
     * отличных от пробела). Все слова разделены одним пробелом.
     */
    public static void main(String[] args) {
        String words = new String("Привет из будущего");
        System.out.println(words);

        // длина строки
        //System.out.println(words.length() + " символов");

        // ввод с консоли
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова в строку через пробел:");
        String words = sc.nextLine();
        */

        // разделяет строку
        /*String[] result = words.split(" ");
        for (int i =0; i < result.length; i++){
            System.out.println(result[i]);
        }*/

        int prob = 0;
        if (words.length() != 0) {
            prob++;
            for (int i = 0; i < words.length(); i++) {
                if (words.charAt(i) == ' ') {
                    prob++;
                }
            }
        }
        System.out.println("В строке " + prob + " слов(а).");

    }
}
