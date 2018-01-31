package lesson5;

import java.util.Scanner;

public class Rot13 {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.print("ข้อความ = ");
        String text = kb.nextLine();
        String upperCase = "ABCDEFGHIJKMNOPQRSTUVWXYZ" ;
        String lowerCase = upperCase.toLowerCase();
        String rot13 = "";
        for (int k = 0; k < text.length(); k++) {
            String c = text.substring(k, k + 1);
            int j = upperCase.indexOf(c);
            if (j >= 0) {
                int i = (j+13) %upperCase.length();
                rot13 = rot13 + upperCase.substring(i, i+1);

            } else {
                j = lowerCase.indexOf(c);
                if (j >= 0) {
                    int i = (j+13) %lowerCase.length();
                    rot13 = rot13 +lowerCase.substring(i, i+1);


                } else {
                    rot13 = rot13 + c;

                }
            }
            System.out.println(rot13);
        }
    }
}
