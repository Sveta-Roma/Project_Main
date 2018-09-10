package org.itstep.qa.lessons.lesson_six.home;

public class Task09 {
    public static void main(String[] args) {
        // проверить является ли введенный символ цифрой

        Character ch = new Character('A');// массив char
        boolean ch1 = Character.isDigit(ch);// проверяет, явл. ли символ цифрой
        System.out.println(ch1);
    }
}
