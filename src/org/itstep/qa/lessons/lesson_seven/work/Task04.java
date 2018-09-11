package org.itstep.qa.lessons.lesson_seven.work;

public class Task04 {
    public static void main(String[] args) {
    String str = "Январь";
        switch (str) {
        case "Декабрь":{
        }
        case "Январь":{
        }
        case "Февраль":{
            System.out.println("Это зимний месяц");
            break;// прерывает если нашел совпадений
        }
        case "Март":{
        }
        case "Апрель":{
        }
        case "Май":{
            System.out.println(str + "это весенний месяц");
            break;// прерывает если нашел совпадений
        }
        default:{
            System.out.println("Совпадение не найдено");// необязательно
        }

        }
    }
}
