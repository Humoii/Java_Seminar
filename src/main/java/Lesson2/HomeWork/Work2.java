package Lesson2.HomeWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Work2 {
    //Напишите метод, который составит строку. Состоящую из 100 повторений слова TEST и метод,
    //который запишет эту строку в простой текстовый файл, обработайте исключения.
    public static void main(String[] args) {
        String res = wordRepetitionTest("TEST");
        stringEntry(res);
        System.out.println(res);
//        ex("C:\\Users\\serge\\Desktop\\Java_Seminar\\Seminar");
    }

    public static String wordRepetitionTest(String str) {
        StringBuilder res = new StringBuilder(str);
        int repetitions = 100;
        for (int i = 0; i < repetitions; i++) {
            res.append(" ");
            res.append(str);
        }
        return res.toString();
    }

    public static void stringEntry(String res){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("src/main/java/Lesson2/HomeWork/StringTEST.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        pw.print(res);
        pw.close();
    }


}

