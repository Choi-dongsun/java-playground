package calculator.domain;

public class Calculator {
    public static int calculate(int first, String symbol, int nextNum) {
        int result = 0;

        if (symbol.equals("+")) result = first + nextNum;
        else if (symbol.equals("-")) result = first - nextNum;
        else if (symbol.equals("*")) result = first * nextNum;
        else if (symbol.equals("/")) result = first / nextNum;
        else System.out.println("제대로된 기호를 입력해주세요");

        return result;
    }
}
