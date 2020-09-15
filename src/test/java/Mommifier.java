public class Mommifier {
    public static String doubleA = "aa";
    public static String doubleE = "ee";
    public static String doubleI = "ii";
    public static String doubleO = "oo";
    public static String doubleU = "uu";
    public static char charA = 'a';
    public static char charE = 'e';
    public static char charI = 'i';
    public static char charO = 'o';
    public static char charU = 'u';

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
        String result = string;
        for (int i = 1; i < string.length(); i++) {
            if ((string.charAt(i) == charA || string.charAt(i) == charE || string.charAt(i) == charI || string.charAt(i) == charO || string.charAt(i) == charU) && string.charAt(i) == string.charAt(i - 1)) {
                result = string.substring(0, i) + "mommy" + string.substring(i);
                break;
            }
        }
        if (hasRepeatVowels(result)) {
            return insertMommy(result);
        }
        return result;
    }
}
