package org.itstep.qa.lessons.lesson_six.home;

import java.util.Arrays;

public class Task04_1 {
    public static void main(String[] args) {
        // когда один пробел
        String str = "bhuy  fuh ujhu ";
        String [] result = str.split(" ");
        //System.out.println("Количество слов равно " + result.length);
        System.out.println(Arrays.toString(result));// посмотрим массив

        // когда пробел не один
        int counter = 0;
        for (int i = 0; i<result.length; i++){
            if (!result[i].isEmpty()){
                counter++;
            }
        }

        /* краткая форма записи for, работает как и верхний for
        //counter = 0;
        for(String temp : result){
            if (!temp.isEmpty()){
                counter++;
            }
        }
        System.out.println("Количество слов равно " + counter);
        */

        // регулярные выражения
        /*String str = "bhuy  fuh ujhu ";
        String [] result = str.split(" +");
        System.out.println(Arrays.toString(result));// посмотрим массив
        System.out.println("Количество слов равно " + result.length);*/
    }
}
