package libraries;
import java.util.Scanner;

public class In {

    private static Scanner scanner = new Scanner(System.in);


    /**
     * Reads a string from the console.
     * @return int
     */
    public static int readInt() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Reads a double from the console.
     * @return double
     */
    public static double readDouble() {
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
