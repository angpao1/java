import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("No. month = ");
        int m = scan.nextInt();
        System.out.println("ปี (พ.ศ) = ");
        int yb = scan.nextInt();
        int y = yb - 543;
        int days = 31;
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            days = 30;
        } else if (m == 2) {
            if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
                days = 29;  
            } else {
                days = 28;
            }
        }
        System.out.println("เดือน " + m + " ปี (พ.ศ.) " + yb + "มี " + days + " วัน");
    }
}