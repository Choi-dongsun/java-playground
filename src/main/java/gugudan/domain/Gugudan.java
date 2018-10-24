package gugudan.domain;

public class Gugudan {

    public static int[] calculate(int i, int size) {
        int[] result = new int[size];
        for(int k = 0; k < size; k++) {
            result[k] = (k + 1) * i;
        }
        return result;
    }
}

