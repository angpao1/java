package lesson5;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Grading {
    public static void main(String[] args)throws IOException {
        Scanner in = new Scanner (new File("/C:\Downloads\scores.txt"));
        PrintStream out = new PrintStream(new File("/C:\Downloads\grades.txt"));
        while (in.hasNext()) {
            String t = in.nextLine ();
            t = t.trim();
            int j = t.indexOf(" ");
            if (j >= 0) {
                double p = Double.parseDouble(t.substring(j, t.length()));
                // p >=80 --> A
                // 70<=p<80 --> B
                // 60<=p<70 --> c
                //50<=p<60 --> D
                //p<50 --> F
                String grade;
                if (p >= 80) geade = "A";
                else if (p >= 70) grade = "B";
                else if (p >= 60) grade = "C";
                else if (p >= 50) grade = "D";
                else grade = "F";
                out.println(t + "  " + grade);
            }
        }
        in.close();
        out.close();
    }
}
