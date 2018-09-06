package org.itstep.qa.lessons.lesson_four.examples;

import java.util.Date;

public class Task02
{ /* «Временной интервал»
   * Заданы моменты начала и конца некоторого промежутка времени в часах, минутах и секундах (в пределах одних суток).
   * Найти продолжительность этого промежутка в тех же единицах измерения.
   * Пример вывода:
   *               Начало  10:30:45
   *               Конец    13:20:15
   *               Продолжительность     2:49:30
   */
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println(date.toString());
    }
}
