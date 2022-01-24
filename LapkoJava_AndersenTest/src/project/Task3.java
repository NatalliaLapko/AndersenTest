package project;

import java.util.Scanner;

public class Task3 {

    Scanner input = new Scanner(System.in);
    void showArray(){
        int[] array = new int[6];
        int i = 0;
        System.out.println("Задание 3");
        System.out.println("Введите 6 чисел");
        while(i < array.length){
            array[i] = input.nextInt();
            i++;
        }
        i=0;
        System.out.println("Числа кратные 3: ");
        while (i < array.length) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        }
    }


}
