import java.util.*;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean success = false;
        do {
            try {
                System.out.print("name file = ");
                String fn = scan.nextLine();
                Scanner in = new Scanner(new File(fn));
                while (in.hasNext()) {
                    String line = in.nextLine();
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("file not found");
            } catch (IOException e) {
                System.out.println("Error");
            }
        } while (!success);

    }
}