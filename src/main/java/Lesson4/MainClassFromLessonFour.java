package Lesson4;

import java.util.LinkedList;
import java.util.Scanner;

public class MainClassFromLessonFour {
    public static void main(String[] args) {

        ex1();
    }

    private static void ex1() {
        Scanner in = new Scanner(System.in);

        LinkedList<String> list = new LinkedList<>();
        while (true) {
            System.out.printf("Введите строку-позицию: ");
            String text = in.nextLine();

            String[] array = text.split("\\~");
            int index = Integer.parseInt(array[1]);
            String val = array[0];
            if (val.equals("print")) {
                if (list.get(index - 1) == null) {
                    System.out.println("значения нет");
                } else {
                    System.out.println(list.get(index - 1));
                    list.remove(index - 1);
                }
            } else {
                if (index < list.size()) {
                    list.set(index - 1, val);
                } else {
                    for (int i = list.size(); i < index - 1; i++) {
                        list.add(null);
                    }
                    list.add(val);
                }
            }
            System.out.println(list);
        }
    }
}