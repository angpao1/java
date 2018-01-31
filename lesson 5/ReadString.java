package lesson5;

import java.util.Scanner;

public class ReadString {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in); {
            System.out.print("ชื่อ = ");
            String name = kb.nextLine();
            System.out.println("สวัสดีครับคุณ"+ name);
        }


    }
}

