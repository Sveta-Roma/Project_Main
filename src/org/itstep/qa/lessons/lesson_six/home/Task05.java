package org.itstep.qa.lessons.lesson_six.home;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {
    // Изменить регистр введенного символа, если он был латинской буквой.
    public static void main(String[] args) {
        Character sym = new Character('A');
        System.out.println(sym);
        Character symb = Character.toLowerCase(sym);
        System.out.println(symb);

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите слово:");
        String str = sc.nextLine();
        char [] ch = new char[str.length()];
        for(int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for(int i = 0; i < str.length(); i++) {
            System.out.println(ch[i]);
        }
        System.out.println(Arrays.toString(ch));

        for(int i = 0; i < str.length(); i++) {
            int a = ch[i];
            if (a >= 97 && a <= 122){
                Character ch1 = Character.toUpperCase(ch);
            }
            if else ((a >= 65 && a <= 90)){
                Character ch1 = Character.toLowerCase(ch);
            } else System.out.println("Это не латинская буква");
        }
       */
    }
}
