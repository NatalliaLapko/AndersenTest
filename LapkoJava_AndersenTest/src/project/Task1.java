package project;

import java.util.Scanner;

public class Task1 {
    Scanner input = new Scanner(System.in);

    void enterNumber() {
        System.out.println("Задание 1");
        System.out.println("Введите число:");
        int number = input.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }

    }
}

