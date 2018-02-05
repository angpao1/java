import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean success = false;

        do {
           try {
               System.out.print("file name = ");
               String fn = scan.nextLine();
               Scanner in = new Scanner(new File(fn));
               while (in.hasNext()) {
                   String line = in.nextLine();
                   System.out.println(line);
               }
               success = true;
           } catch (FileNotFoundException e) {
               System.out.println("file not found");
               System.out.println(e.getMessage());
           } catch (IOException e) {
               System.out.println("Error");
           }
        } while (!success);
    }
}