
public class Utility {
    public static String validateString(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "default" : value;
    }

    public static int validateInt(int value) {
        return value<0 ? 0 : value;
    }

    public static double validateDouble(double value){
        return value<0 ? 0 : value;
    }

}
