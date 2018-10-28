package calendar.view;

import calendar.domain.Calendar;
import calendar.domain.Schedule;
import calendar.util.DateUtil;
import calendar.util.StringUtil;

import java.util.ArrayList;

public class OutputView {
    public static void printCalendar(int year, int month, int weekday) {
        System.out.printf("   <<%4d년, %2d월>>\n", year, month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println("---------------------");

        printDay(year, month, weekday);
        System.out.printf("\n\n");

        printLastDayComment(year, month);
        System.out.println();
    }

    private static void printLastDayComment(int year, int month) {
        System.out.printf("[%d월은 %d일이 마지막 날입니다.]\n", month, Calendar.getMaxDayOfMonth(year, month));
    }

    public static void printDay(int year, int month, int weekday) {
        int maxDay = Calendar.getMaxDayOfMonth(year, month);
        printFirstWeekBlank(weekday);
        printExtraWeek(weekday, maxDay);
    }

    private static void printExtraWeek(int weekday, int maxDay) {
        for (int i = 1; i <= maxDay; i++) {
            System.out.printf("%3d", i);
            if((i + weekday) % 7 == 0) {
                System.out.println();
                System.out.println();
            }
        }
    }

    private static void printFirstWeekBlank(int weekday) {
        for (int j = 0; j < weekday; j++) System.out.printf("%3s", " ");
    }

    public static void printInitMessage() {
        System.out.println("+----------------------+");
        System.out.println("| 1. 일정 등록");
        System.out.println("| 2. 일정 검색");
        System.out.println("| 3. 달력 보기");
        System.out.println("| h. 도움말 q. 종료");
        System.out.println("+----------------------+");
    }

    public static void printTodayCalendar() throws NullPointerException {
        String today = DateUtil.getTodayDate();
        String[] todays = StringUtil.splitValue(today);
        int weekday = Calendar.getWeekday(Integer.parseInt(todays[0]), Integer.parseInt(todays[1]), 1);
        printCalendar(Integer.parseInt(todays[0]),Integer.parseInt(todays[1]), weekday);
    }

    public static void printTodaySchedule(Schedule schedule) throws NullPointerException{
        String today = DateUtil.getTodayDate();
        try {
            if(schedule.getDate().equals(today)) {
                System.out.println(today + " 의 일정은 다음과 같습니다");
                printDateSchedule(schedule.getContents());
            }
        } catch(NullPointerException e) {
            System.out.println(today + " 의 일정은 없습니다.");
        }
    }

    public static void printDateSchedule(ArrayList<String> contents) {
        for (int i = 0; i < contents.size(); i++) {
            System.out.println((i + 1) + ". " + contents.get(i));
        }
    }
}
