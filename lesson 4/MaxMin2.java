import java.util.Scanner;

public class MaxMin2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double max = -1;
        double min = Double.MAX_VALUE;
        while (true) {
            System.out.print("ข้อมูล (-1 คือเลิก)");
            double v = scan.nextDouble();
            if (v < 0) break;
            if (v > max) max = v;
            if (v < min) min = v;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}