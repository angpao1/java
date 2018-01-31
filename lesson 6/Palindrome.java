package lesson6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) throws IOException{
        String fn = "c:/java101/engwords.txt";
        Scanner in = new Scanner(new File(fn));
        while (in.hasNext()) {
            String line = in.nextLine().trim();
            if (line.length() > 3 && !line.substring(0, 1).equals("#")) {
                if (isPalindrome(line)) System.out.println(line);
            }
        }
    }
    public static boolean isPalindrome(String word) {
        for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
            if (!word.substring(i, i + 1).equalsIgnoreCase(word.substring(j, j + 1)))
                return false;
        }
        return true;
    }
}
