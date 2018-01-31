import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        String s1 = "";
        switch ((int) (4 * Math.random())) {
            case 0: s1 = "Love"; break;
            case 1: s1 = "Work"; break;
            case 2: s1 = "Eduction"; break;
            case 3: s1 = "Money"; break;
        }
        String s2 = "";
        switch ((int) (4 * Math.random())) {
            case 0: s2 = "Bright"; break;
            case 1: s2 = "to gel"; break;
            case 2: s2 = "be congested"; break;
            case 3: s2 = "Desperate"; break;
        }
        System.out.println("Today your " + s1 + " is " + s2);
    }
}