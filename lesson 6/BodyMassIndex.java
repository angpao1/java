package lesson6;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double weight = readDouble(in, "น้ำหนัก = ");
        double height = readDouble(in, "ความสูง = ");
        double hm = height / 100.0;
        double bmi = weight / (hm * hm);
        System.out.println("ดัชนีมวลกาย = " + bmi);
    }
    public static double readDouble(Scanner kb, String msg) {
        System.out.print(msg);
        double value = kb.nextDouble();
        return value;
    }
    public static int readInt(Scanner kb, String msg) {
        System.out.print(msg);
        int value = kb.nextInt();
        return value;
    }
}
