import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Selected Month = ");
        int m = scan.nextInt();
        String name = "";
        if(m == 1) {
            name = "January";
        }
        if(m == 2) {
            name = "February";
        }
        if(m == 3) {
            name = "March";
        }
        if(m == 4) {
            name = "April";
        }
        if(m == 5) {
            name = "May";
        }
        if(m == 6) {
            name = "June";
        }
        if(m == 7) {
            name = "July";
        }
        if(m == 8) {
            name = "August";
        }
        if(m == 9) {
            name = "September";
        }
        if(m == 10) {
            name = "October";
        }
        if(m == 11) {
            name = "November";
        }
        if(m == 12) {
            name = "December";
        }
        System.out.println(name);
    }
}