package org.itstep.qa.lessons.lesson_seven.home;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату");
        int a = sc.nextInt();
        switch (a){
            case 30:{
                System.out.println("апрель, июнь, сентябрь, ноябрь");
            }
            case 31:{
                System.out.println("январь, март, май, июль, август, октябрь, декабрь");
                break;
            }
            default: {
                System.out.println("январь, февраль, март, апрель, май, июнь, июль, август, сентябрь, октябрь, ноябрь, декабрь");
            }
        }
    }
}
