import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int n = 10;
        int k = 1;
        while (true) {
            if (k > n) break;
            System.out.println(k);
            sum += scan.nextDouble();
            k++;
        }
        double avg = sum / n;
        System.out.println("Average = " + avg);
    }
}