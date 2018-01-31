package lesson6;

public class Fib {


        public static void main(String[] args) {
            System.out.println(f(10));

        }
        public static int f(int n)
        {
            if(n==0) return 0 ;
            if(n==1) return 1 ;
            int fk2 = 0 , fk1 = 1 , fk = 0;
            for(int k=2;k<=n;k++)
            {
                fk =  fk1+fk2;
                fk2 = fk1;
                fk1 = fk;
            }
            return fk;

        }
}
