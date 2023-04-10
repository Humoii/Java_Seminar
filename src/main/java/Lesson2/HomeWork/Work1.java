package Lesson2.HomeWork;

public class Work1 {
    //    Напишите метод, который принимает на вход строку
//    (String) и определяет, является ли строка палиндромом (возвращает boolean значение).
    public static void main(String[] args) {
        stringPalindrome();
    }

    public static void stringPalindrome() {
        String str = "доход";
        String res = "";
        int i = 0;
        int strEnd = str.length();
        while (i <= str.length() - 1) {
            strEnd--;
            res = res + str.charAt(strEnd);
            i++;
        }
        if (res.toUpperCase().equals(str.toUpperCase())) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
