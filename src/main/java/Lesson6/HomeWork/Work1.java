package Lesson6.HomeWork;

import java.util.*;
import java.util.Scanner;
public class Work1 {
//    1. Подумать над структурой класса Ноутбук для магазина техники -
//    выделить поля и методы. Реализовать в java.
//    2. Создать множество ноутбуков (ArrayList).
//    3. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//    Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//    Выводить только те ноутбуки, что соответствуют условию.

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenova IdealPad 5",
                                    "8",
                                    "черный",
                                    15.6,
                                    5);

        Laptop laptop2 = new Laptop("Huawei MateBook D 16 RLEF-X 16",
                                    "16",
                                    "серый",
                                    16.0,
                                    3);

        Laptop laptop3 = new Laptop("ASUS A516JP-EJ461",
                                    "32",
                                    "серебристый",
                                    15.6,
                                    0);

        Laptop laptop4 = new Laptop("MSI GF63 Thin 11UC-207XRU",
                                    "16",
                                    "черный",
                                    15.6,
                                    1);

        Laptop laptop5 = new Laptop("Lenova IdealPad 5",
                                    "8",
                                    "черный",
                                    15.6,
                                    5);

        List<Laptop> uniqueLaptop = new ArrayList<>();
        uniqueLaptop.add(laptop1);
        uniqueLaptop.add(laptop2);
        uniqueLaptop.add(laptop3);
        uniqueLaptop.add(laptop4);
        uniqueLaptop.add(laptop5);

        Scanner searchLaptop = new Scanner(System.in);
        System.out.println("Введите параметр поиска: цвет или минимальный размер оперативной памяти: ");
        String scanner = searchLaptop.next();
        int count = 0;
        for (Laptop laptop : uniqueLaptop) {
            if (Integer.parseInt(laptop.getRamLaptop()) >= Integer.parseInt(scanner)){
                count++;
                System.out.printf("Название ноутбука: %s, Оставшиеся количество: %d, Оперативная память: %s%n",
                                                                                        laptop.getNameLaptop(),
                                                                                        laptop.getQuantityLaptop(),
                                                                                        laptop.getRamLaptop());
            }
            if (laptop.getColorLaptop().equals(scanner.toLowerCase())){
                count++;
                System.out.printf("Название ноутбука: %s, Оставшиеся количество: %d%n",laptop.getNameLaptop(),
                                                                                        laptop.getQuantityLaptop());
            }
        }
        if (count == 0){
            System.out.println("По данному запросу ничего не найдено!");
        }
    }
}
