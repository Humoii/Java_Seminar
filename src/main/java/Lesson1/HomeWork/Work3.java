package Lesson1.HomeWork;

import java.time.LocalTime;
import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
//        В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
        greetingByTime();
    }

    public static void greetingByTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        scanner.close();
        LocalTime date = LocalTime.now();
        int hour = date.getHour();
        if (hour >= 5 & hour < 12) {
            System.out.printf("Доброе утро, %s", name);
        }
        if (hour >= 12 & hour < 18) {
            System.out.printf("Добрый день, %s", name);
        }
        if (hour >= 18 & hour < 23) {
            System.out.printf("Добрый вечер, %s", name);
        }
        if (hour < 5) {
            System.out.printf("Доброй ночи, %s", name);
        }
    }
}
