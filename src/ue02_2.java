import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.println("Please enter year");
        int year = In.readInt();

        Out.println("Please enter month (1-12)");
        int month = In.readInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                Out.print("days: 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                Out.print("days: 30");
                break;
            case 2: 
                if (leapYear(year)) {
                    Out.print("days: 29");
                } else {
                    Out.print("days:28");
                }
                break;
            default:
                break;
        }

    }
}
