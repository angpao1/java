import java.util.Scanner;

public class Exception1
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n <= 0) {
		    System.out.println("please input number more than 0");
		    System.exit(-1);
		}
		if(n >= 10000) {
		    System.out.println("please input number less than 10000");
		    System.exit(-1);
		}
		
		int a[] = sortedArray(n);
	}
	
	public static int[] sortedArray(int size) {
	    int[] d = new int[size];
	    for (int i = 0; i <= d.length; i++) {
	        d[i] = i;
	    }
	    return d;
	}
}



