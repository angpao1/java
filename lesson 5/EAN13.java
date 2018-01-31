package lesson5;

import java.util.Scanner;

public class EAN13 {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.print("enter 12-digit code = ");
        String d = kb.nextLine();
        d = d.trim ();
        int s = 0;
        s +=Integer.parseInt(d.substring(0,1));
        s +=Integer.parseInt(d.substring(2,3));
        s +=Integer.parseInt(d.substring(4,5));
        s +=Integer.parseInt(d.substring(6,7));
        s +=Integer.parseInt(d.substring(8,9));
        s +=Integer.parseInt(d.substring(10,11));
        int s1 = 0;
        s +=Integer.parseInt(d.substring(1,2));
        s +=Integer.parseInt(d.substring(3,4));
        s +=Integer.parseInt(d.substring(5,6));
        s +=Integer.parseInt(d.substring(7,8));
        s +=Integer.parseInt(d.substring(9,10));
        s +=Integer.parseInt(d.substring(11,12));
        s += 3 * s1;
        int c = (10 - s % 10) % 10;
        System.out.println("check digit = " + c );
    }

}

