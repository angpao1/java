package lesson5;

import java.io.File;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner (new File("Downloads/scores.txt"));
        double sum = 0.0;
        int n = 0;
        while (in.hasNext()) {
            // 51394847421 90.0
            String t = in.nextLine();
            t = t.trim();
            int j = t.indexOf(" ");
            if (j >= 0) {
                String sc = t.substring(j, t.length());
                double p = Double.parseDouble(se);
                sum += p;
                n++;
            }
        }
        double avg = sum / n;
        System.out.println("¤Ðá¹¹à©ÅÕÂ = " + avg);

