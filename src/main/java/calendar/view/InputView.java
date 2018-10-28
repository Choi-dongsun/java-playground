package calendar.view;

import java.util.Scanner;

public class InputView {
    private static Scanner sc = new Scanner(System.in);
    private static Scanner sc2 = new Scanner(System.in);

    public static int getMonth() {
        System.out.println("월을 입력하세요 ex) 5 ");
        System.out.print("MONTH> ");
        return sc.nextInt();
    }

    public static int getYear() {
        System.out.println("년도를 입력하세요 (-1 입력시 달력보기 종료)");
        System.out.print("YEAR> ");
        return sc.nextInt();
    }

    public static String getCommend() {
        System.out.println("명령 (1, 2, 3, h, q)");
        System.out.print("> ");
        return sc.next();
    }

    public static String registScheduleDay() {
        System.out.println();
        System.out.println("1. 일정 등록");
        System.out.println("[일정 등록] 날짜를 입력하세요. ex) 2010-12-31 ");
        System.out.print("> ");
        return sc.next();
    }

    public static String registScheduleContents() {
        System.out.println("[일정 등록] 일정을 입력하세요. ex) 포비와 면담 ");
        System.out.print("> ");
        return sc2.nextLine();
    }

    public static int fixScheduleNum() {
        System.out.println("[일정 수정] 몇 번째 일정을 수정하시겠습니까? (0 입력시 수정안함) ");
        System.out.print("> ");
        return sc2.nextInt();
    }

    public static String fixScheduleContents() {
        System.out.println("[일정 수정] 뭐라고 수정하시겠습니까? ");
        System.out.print("> ");
        return sc2.nextLine();
    }

    public static int findSchedule() {
        System.out.println();
        System.out.println("2. 일정 검색");
        System.out.println("[일정 검색] 날짜를 입력하세요. ex) 2010-12-31 ");
        System.out.print("> ");
        return sc.nextInt();
    }

}
