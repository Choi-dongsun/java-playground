package gugudan.util;

public class StringUtil {
    public static int[] splitValue(String input) {
        String[] strResult = input.split(",");
        int[] result = new int[strResult.length];
        for (int i = 0; i < strResult.length; i++) {
            result[i] = Integer.parseInt(strResult[i]);
        }
        return result;
    }
}
