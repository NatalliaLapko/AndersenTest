package project;

import java.util.Scanner;

public class Task2 {
    static Scanner input = new Scanner(System.in);

     void enterName(){
         System.out.println("Задание 2");
        System.out.println("Введите имя:");
        String name = input.next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }


    }

}
