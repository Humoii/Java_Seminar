package Lesson1;

import java.util.Scanner;

public class MainClassFromLessonOne {
    public static void main(String[] args) {

        inputNameAndPrint();
        printSizeLengthSequences();
    }

    private static void inputNameAndPrint() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Hello, %s", name);
        scanner.close();
    }

    public static void printSizeLengthSequences() {
        int count = 0;
        int maxLine = 0;
        int[] arr = new int[]{1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1};
        for (int num : arr) {
            if (num == 1) {
                count++;
                if (maxLine < count) {
                    maxLine = count;
                }
            }
            if (num == 0) {
                count = 0;
            }
        }
        System.out.printf("%nНаибольшая длина последовательности:%s", maxLine);
    }
}


