package lesson5;

import java.util.Scanner;


    public class Concatnation {
        public static void main(String[] args) {
            Scanner kb = new Scanner (System.in);
            String out = ""; // out.length() -> 0
            while (true) {
                System.out.print(">> ");
                String input = kb.nextLine ();
                out += " " + input;
                if (input.equals(".")) break;
            }
            System.out.println("-> "+ out);
        }
    }

