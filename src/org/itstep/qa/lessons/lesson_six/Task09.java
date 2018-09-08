package org.itstep.qa.lessons.lesson_six;

public class Task09 {
    public static void main(String[] args) {
        // проверить является ли введенный символ цифрой
        Character ch = new Character('A');
        boolean ch1 = Character.isDigit(ch);
        System.out.println(ch1);
    }
}
