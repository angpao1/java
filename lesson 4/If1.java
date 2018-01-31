import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a > 0) {
            System.out.println("a > 0");
            System.out.println("-----");
        }
        System.out.println("OK");
    }
}