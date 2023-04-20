package Lesson4.HomeWork;

import java.util.LinkedList;
import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
//        Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,
//        а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.
        ex();
    }

    public static void ex() {
        Scanner acceptUser = new Scanner(System.in);
        String text = acceptUser.nextLine();
        while (true) {
            int count = 0;
            System.out.println("Введите строку: ");
            LinkedList list = new LinkedList<>();
            if (text.equals("print")) {
                System.out.println(text);
            }else {
                list.add(text);
            }
            System.out.println(count);
            System.out.println(list);
        }
    }
}
