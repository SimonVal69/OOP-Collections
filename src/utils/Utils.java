package utils;
public class Utils {

    private Utils() {
    }

    public static String checkData(String string) {
        if (string == null || string.equals("") || string.trim().equals("")) {
            return "default";
        } else {
            return string;
        }
    }

    public static double checkData(double engineVolume) {
        if (engineVolume <= 0) {
            return 1.5;
        } else {
            return engineVolume;
        }
    }
}
