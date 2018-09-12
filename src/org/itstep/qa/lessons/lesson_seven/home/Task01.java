package org.itstep.qa.lessons.lesson_seven.home;

import java.util.Scanner;

public class Task01 {
    // Пользователь вводит название месяца (все слово в нижнем регистре). Вывести количество дней этого месяца. февраль
    // всегда равен 28
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите месяц:");
        String str = sc.nextLine();
        switch (str){
            case "январь":{
                System.out.println("Количество дней равно 31 дней");
                break;
            }
            case "февраль": {
                System.out.println("Количество дней равно 28 дней");
                break;
            }
            case "март":{
                System.out.println("Количество дней равно 31 дней");
                break;
            }
            case "апрель": {
                System.out.println("Количество дней равно 30 дней");
                break;
            }
            case "май":{
                System.out.println("Количество дней равно 31 дней");
                break;
            }
            case "июнь":{
                System.out.println("Количество дней равно 30 дней");
                break;
            }
            case "июль":{
                System.out.println("Количество дней равно 31 дней");
                break;
            }
            case "август":{
                System.out.println("Количество дней равно 31 дней");
                break;
            }
            case "сентябрь":{
                System.out.println("Количество дней равно 30 дней");
                break;
            }
            case "октябрь":{
                System.out.println("Количество дней равно 31 дней");
                break;
            }
            case "ноябрь":{
                System.out.println("Количество дней равно 30 дней");
                break;
            }
            case "декабрь":{
                System.out.println("Количество дней равно 31 дней");
                break;
            }
            default: {
                System.out.println("Нет такого месяца");
            }
        }
    }
}
