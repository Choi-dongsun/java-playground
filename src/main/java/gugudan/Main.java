package gugudan;

import gugudan.domain.Gugudan;
import gugudan.domain.GugudanValue;
import gugudan.util.StringUtil;
import gugudan.view.InputView;
import gugudan.view.OutputView;

public class Main {
    public static void main(String[] args) {
        int[] gugudan = StringUtil.splitValue(InputView.input());
        GugudanValue gugudanValue = new GugudanValue(gugudan[0], gugudan[1]);
        for (int i = 2; i <= gugudanValue.getFirstNum(); i++) {
            int[] result = Gugudan.calculate(i, gugudanValue.getSecondNum());
            OutputView.printEachGugudan(result);
        }
    }
}
