package gugudan.view;

import java.util.Scanner;

public class InputView {
    public static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력하고 싶은 N단을 입력하시오.");

        return sc.nextLine();
    }

}
