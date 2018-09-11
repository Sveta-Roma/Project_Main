package org.itstep.qa.lessons.lesson_seven.work;

public class Task03 {
    public static void main(String[] args) {
        //float = 1.1f;// дробные не добустит в switch
        int a = 1;
        switch (a) {
            case 1:{
                System.out.println("Была введена 1");
                break;// прерывает если нашел совпадений
            }
            case 2:{
                System.out.println("Была введена 2");
                break;
            }
            case 3:{
                System.out.println("Была введена 3");
                break;
            }
            default:{
                System.out.println("Совпадение не найдено");// необязательно
            }
        }
    }
}
