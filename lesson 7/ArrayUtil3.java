package lesson7;

public class ArrayUtil3 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 0, 9, 2, -5, 8, 6, 3, 4, 3, };
        System.out.println(search(a, 9));

    }
    //------------------------------------
    public static int search(int[] d, int x) {
        // ¡ÒÃ¤é¹áººÅÓ´Ñº sequential search
        for (int i = 0; i < d.length; i++) {
            if (d[i] == x)  return i;
        }
        return -1;
    }
}
