import java.util.Scanner;

public class QuadraticRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("a = ");
        double a = scan.nextDouble();
        System.out.println("b = ");
        double b = scan.nextDouble();
        System.out.println("c = ");
        double c = scan.nextDouble();

        boolean isTrivial = (a == 0 && b == 0 && c == 0);
        boolean noRoot = (a == 0 && b == 0 && c != 0);
        boolean isLinear = (a == 0 && b != 0);
        boolean isComplex = (a != 0 && (b * b < 4 * a * c));

        if (isTrivial) {
            System.out.println("รากคืนจำนวนใดๆ");
        } else if (noRoot) {
            System.out.println("สมการไม่มีราก");
        } else if (isLinear) {
            System.out.println("รากคือ " + (-c / b));
        } else if (isComplex) {
            System.out.println("รากเป็นจำนวนเชิงซ้อน : โปรแกรมไม่สามารถหารากได้");
        } else {
            double t = Math.sqrt(b * b - 4 * a * c);
            double r1 = (-b + t) / (2 * a);
            double r2 = (-b - t) / (2 * a);
            System.out.println("รากคือ " + r1 + "และ " + r2);
        }
    }
}