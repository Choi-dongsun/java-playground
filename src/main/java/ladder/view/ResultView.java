package ladder.view;

import ladder.dto.LadderGameDto;
import java.util.List;

public class ResultView {
    private static final String HORIZONTAL_BAR = "-";
    private static final String VERTCIAL_BAR = "|";
    private static final String NEW_LINE = "\n";
    private static final String BALNK = " ";

    private ResultView() {
    }

    public static void printResult(LadderGameDto result) {
        List<List<Boolean>> ladders = result.getLadder();
        for (List<Boolean> ladder : ladders) printLine(ladder);
    }

    private static void printLine(List<Boolean> ladder) {
        for (Boolean b : ladder) {
            System.out.printf(VERTCIAL_BAR);
            isHorizontalBar(b);
        }
        System.out.printf(VERTCIAL_BAR + NEW_LINE);
    }

    private static void isHorizontalBar(Boolean b) {
        if (b) {
            System.out.printf(HORIZONTAL_BAR);
            return;
        } System.out.printf(BALNK);
    }
}
