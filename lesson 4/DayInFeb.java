import java.util.Scanner;

public class DayInFeb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ปี (ค.ศ)");
        int y = scan.nextInt();
        int days = 28;
        if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {
            days = 29;
        }
        System.out.println("February " + days + " day");
    }
}