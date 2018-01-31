import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("weight = ");
        double weight = scan.nextDouble();
        System.out.println("height = ");
        double height = scan.nextDouble();
        double hm = height / 100.0;
        double bmi = weight / (hm * hm);
        System.out.println("bmi = " + bmi);
    }
}