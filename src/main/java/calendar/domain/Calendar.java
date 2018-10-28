package calendar.domain;

import calendar.view.InputView;
import calendar.view.OutputView;

public class Calendar {
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31 ,30 ,31 ,30 ,31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31 ,30 ,31 ,30 ,31};

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static int getMaxDayOfMonth(int year, int month) {
        if(isLeapYear(year)) return LEAP_MAX_DAYS[month - 1];
        return MAX_DAYS[month - 1];
    }

    public static int getWeekday(int year, int month, int day) {
        int Y = Integer.parseInt(Integer.toString (year).substring(0,2));
        int C = Integer.parseInt(Integer.toString (year).substring(2));
        double monthD = (double) month;
        return Math.abs(((Y + (Y / 4)) + (C / 4) - (2 * C) + (int)(26 * (monthD + 1) / 10) + day) % 7);
    }

    public static void runCalendar() {
        System.out.println();
        System.out.println("3. 달력 보기");
        while (true) {
            int year = InputView.getYear();
            if (year == -1) break;

            int month = InputView.getMonth();
            if (month > 12 || month < 1) {
                System.out.println("올바른 값을 입력해주세요.");
                continue;
            }

            int weekday = getWeekday(year, month, 1);
            OutputView.printCalendar(year, month, weekday);
        }
        System.out.println("달력 보기를 종료합니다.");
        System.out.println();
    }
}
