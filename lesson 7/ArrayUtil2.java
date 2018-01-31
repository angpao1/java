package lesson7;

public class ArrayUtil2 {
    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 5, 6, 0 };
        int[] b = cloneInt(a);

    }
    public static int[] cloneInt(int[] d) {
        int [] t  = new int [d.length];
        for (int i = 0; i < d.length; i++) {
            t[i] = d[i];
        }
        return t;
    }
}
