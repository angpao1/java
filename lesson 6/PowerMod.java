package lesson6;

import org.omg.PortableInterceptor.INACTIVE;

public class PowerMod {
    public static void main(String[] args) {
        System.out.println(powerMod(2, 5002, 73));
    }
    public static int powerMod(int a, int  k, int m) {
        if (k == 0) return 1;
        int p = powerMod(a, k / 2, m);
        p = (p * p) % m;
        if (k % 2 == 1) p = (a * p) % m;
        return p;
    }
    public static int powerMod2(int a, int k, int m) {
        if (k == 0) return 1;
        int p = powerMod(a, k - 1, m);
        return (a * p) % m;
    }
    public static int powerMod3(int a, int k, int m) {
        int p = 1;
        for (int i = 0; i < k; i++) {
            p = (p * a) % m;
        }
        return p;
    }
}
