import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Please enter the x coordinate");
        double x = In.readInt();

        Out.println("Please enter the y coordinate");
        double y = In.readInt();

        boolean coordinates = false;

        double c = Math.sqrt(x * x + y * y);

        if (y <= 4 && y >= 0 && x <= 4 && x >= 0 && c >= 4){
            coordinates = true;
        } else {
            coordinates = false;
        }

        if (coordinates) {
            Out.println("point is within the green area");
        } else {
            Out.println("point is not within the green area");
        }
    }
}
