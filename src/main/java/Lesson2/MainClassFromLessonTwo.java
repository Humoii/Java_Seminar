package Lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainClassFromLessonTwo {
    public static void main(String[] args) {
//        returnLengthN();
//        stringCompression();
        ex("C:\\Users\\serge\\Desktop\\Java_Seminar\\Seminar");
    }
    private static void returnLengthN() {
        int n = 6;
        String a = "a";
        String b = "B";
        StringBuilder c = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                c.append(a);
            } else {
                c.append(b);
            }
        }
        System.out.println(c);
    }
    private static void stringCompression() {
        String str = "aaaabbbcdd";
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count > 1) {
                    res.append(str.charAt(i)).append(count);
                } else {
                    res.append(str.charAt(i));
                }
                count = 1;
            }
        }
        if (count > 1) {
            res.append(str.charAt(str.length() - 1)).append(count);
        } else {
            res.append(str.charAt(str.length() - 1));
        }
        System.out.println(res);
    }
    public static void ex(String pathDir) {
        File file = new File(pathDir);
        if (!file.isDirectory()){
            return;
        }
        String[] dirListNames = file.list();
        StringBuilder sb = new StringBuilder();
        for (String fileName : dirListNames) {
            sb.append(fileName).append(System.lineSeparator());

        }
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("src/main/java/Lesson2/output.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        pw.print(sb);
        pw.close();
    }

}
