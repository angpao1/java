package lesson5;

import java.util.Scanner;

public class Eng2Thai {
    public static void main(String[] args) {
        String url = "http://wordbook.rackhub.com/school.html";
        Scanner web = new Scanner (new URLStream(url));
        while (web.hasNext()) {
            String t = web.nextLine();
            System.out.println(t);
        }

    }
}
