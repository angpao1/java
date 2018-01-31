public class TypeCasting {
    public static void main(String[] args) {
        int a = 9;
        double d = 1.9;
        a = (int) d;
        String s = "" + d;
        s = "1.0";
        d = Double.parseDouble(s);
    }
}