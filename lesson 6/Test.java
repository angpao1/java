package lesson6;

public class Test {
    public static void main(String[] args) {
        jeng3(10);
    }
    public static void jeng3(int n) {
        if (n == 0) return;
        System.out.println(n);
        jeng3(-1);
        System.out.println(">" + n);
    }
}
