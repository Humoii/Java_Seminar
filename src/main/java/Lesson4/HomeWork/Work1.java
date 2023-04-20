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
        LinkedList list = new LinkedList<>();
        while (true) {
            int count = 0;
            System.out.println("Введите строку: ");
            String text = acceptUser.nextLine();
            if (text.equals("print")) {
                for (int i = 0; i < list.size(); i++) {
                    count++;
                    System.out.println(list.get(list.size()-count));
                }
            }else {
                list.add(text);
            }
            System.out.println(list);
        }
    }
}
