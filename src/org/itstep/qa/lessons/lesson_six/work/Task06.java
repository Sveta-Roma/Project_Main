package org.itstep.qa.lessons.lesson_six.work;

public class Task06 {
    public static void main(String[] args) {
        String str = new String("Добро-пожаловать-сюда");
        System.out.println("Возвращаемое значение: ");
        String[] result = str.split("-", 2); // если лимит убрать то разделит на три строки по каждому элементу
        for (int i =0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
