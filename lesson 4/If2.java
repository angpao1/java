import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        double a = scan.nextDouble();
        if (a < 0) {
            System.out.println("positive number");
            System.exit(-1);
        }
        double x = 1;
        while (true) {
            x = (x + a / x) /   2.0;
            if (Math.abs(x * x - a) < 1e-10) break;
        }
        System.out.print("Square root = " + x);
    }
}