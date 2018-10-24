package calculator.view;

import java.util.Scanner;

public class InputView {
    private static Scanner sc = new Scanner(System.in);

    public static String getUserInput() {
        System.out.printf("계산할 식을 입력해주세요 : ");
        return sc.nextLine();
    }
}
