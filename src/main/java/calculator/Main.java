package calculator;

import calculator.domain.Calculator;
import calculator.util.StringUtil;
import calculator.view.InputView;
import calculator.view.OutputView;

public class Main {
    public static void main(String[] args) {
        String[] userInput = StringUtil.splitValue(InputView.getUserInput());

        int firstValue = Integer.parseInt(userInput[0]);
        int result = firstValue;

        for (int i = 1; i < userInput.length; i += 2) {
            String symbol = userInput[i];
            int nextNum = Integer.parseInt(userInput[i + 1]);
            result = Calculator.calculate(result, symbol, nextNum);
        }

        OutputView.printOutput(result);
    }
}