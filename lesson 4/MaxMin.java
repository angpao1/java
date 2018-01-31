import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("a = ");
        double a = scan.nextDouble();
        
        System.out.println("b = ");
        double b = scan.nextDouble();

        System.out.println("c = ");
        double c = scan.nextDouble();

        System.out.println("d = ");
        double d = scan.nextDouble();

        double max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        
        double min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}