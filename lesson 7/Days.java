package lesson7;

public class Days {
    public static void main(String[] args) {
        System.out.println(dayOfWeek(2));
    }
    public static String dayOfWeek(int d) { // 0 - SUN,..., 6 - SAT
        if (d < 0 || d > 6) {
            throw new IllegalArgumentException("d = " + d);
        }
        String dow = "";
        if (d == 0) dow = "SUN";
        else if (d == 1) dow = "MON";
        else if (d == 2) dow = "TUE";
        else if (d == 3) dow = "WED";
        else if (d == 4) dow = "THU";
        else if (d == 5) dow = "FRI";
        else dow = "SAT";
        return dow;


    }
}
