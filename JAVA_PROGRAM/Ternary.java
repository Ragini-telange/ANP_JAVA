public class Ternary {
    public static void main(String[] args) {
        int daysInFebruary = 29;
        String result;

        // Ternary operator
        result = (daysInFebruary == 28) ? "Not a leap year" : "Leap year";

        System.out.println(result);
    }
}
