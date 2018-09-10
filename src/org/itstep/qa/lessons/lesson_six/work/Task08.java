package org.itstep.qa.lessons.lesson_six.work;

public class Task08 {
    public static void main(String[] args) {

        Character ch = new Character('A');
        Character ch1 = Character.toLowerCase(ch);
        System.out.println(ch1);
        ch1 = Character.toUpperCase(ch);
        System.out.println(ch1);
    }
}
