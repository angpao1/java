import java.util.Scanner;

public class ScanAverage {
    public static void main(Stinrg[] args) {
        double d, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Data 1 = ");
        d = scan.nextDouble();
        sum = sum + d;
        System.out.println("Data 2 = ");
        d = scan.nextDouble();
        sum = sum + d;
        System.out.println("Data 3 = ");
        d = scan.nextDouble();
        sum = sum + d;
        System.out.println("Data 4 = ");
        d = scan.nextDouble();
        sum = sum + d;
        System.out.println("Data 5 = ");
        d = scan.nextDouble();
        sum = sum + d;
        double avg = sum / 5.0;
        System.out.println("Average = "  + avg);
    }
}