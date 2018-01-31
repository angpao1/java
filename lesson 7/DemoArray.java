package lesson7;

import java.util.Scanner;

public class DemoArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in) ;
        int n = 5;
        double[] data = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print ("¢éÍÁÙÅµÑÇ·Õè" + (i + 1) + " = ");
            data[i] = kb.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += data[i];
        }
        System.out.println("¤èÒà©ÅÕèÂ = " + (sum / n));
    }
}
