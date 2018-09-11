package org.itstep.qa.lessons.lesson_seven.work;

public class Task02 {
    public static void main(String[] args) {
        String str = "11";
        int a = 0;
        a = Integer.parseInt(str);// сначала парсим строку преобразовали в число
        System.out.println(a);

        a = 345;
        str = String.valueOf(a);// число переводится в строку
        str = Integer.toString(a);// число переводится в строку
        System.out.println(str);
    }
}
