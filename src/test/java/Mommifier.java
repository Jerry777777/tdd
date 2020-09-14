public class Mommifier {
    public static String doubleA = "aa";
    public static String doubleE = "ee";
    public static String doubleI = "ii";
    public static String doubleO = "oo";
    public static String doubleU = "uu";

    public String convertString(String string) {
        if (string != null) {
            if (hasRepeatVowels(string)) {
                return insertMommy(string);
            } else {
                return string;
            }
        } else {
            throw new RuntimeException();
        }
    }

    public boolean hasRepeatVowels(String string) {
        boolean result = false;
        if (string.contains(doubleA) || string.contains(doubleE) || string.contains(doubleI) || string.contains(doubleO) || string.contains(doubleU)) {
            result = true;
        }
        return result;
    }

    public String insertMommy(String string) {
        return "";
    }
}
