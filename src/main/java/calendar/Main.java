package calendar;

import calendar.domain.Calendar;
import calendar.domain.Schedule;
import calendar.view.InputView;
import calendar.view.OutputView;

public class Main {
    public static void main(String[] args) {
        OutputView.printInitMessage();
        Schedule schedule = new Schedule();

        OutputView.printTodaySchedule(schedule);
        OutputView.printTodayCalendar();

        while (true) {
            String userCommend = InputView.getCommend();

            if (userCommend.equals("1")) {
                String date = InputView.registScheduleDay();
                String content = InputView.registScheduleContents();
                if(schedule.isExistDate(date)) schedule.addSchedule(content);
                else schedule.registerSchedule(date, content);

            } else if (userCommend.equals("2")) {
                String date = InputView.registScheduleDay();
                schedule.getSchedule(date);
                int ss = InputView.fixScheduleNum();
                if(ss <= schedule.getContents().size() && ss >= 0) {
                    schedule.fixSchedule(ss, InputView.fixScheduleContents());
                }

            } else if (userCommend.equals("3")) {
                Calendar.runCalendar();

            } else if (userCommend.equals("h")) {
                System.out.println("도와줄게 없습니다. 돌아가세요.");
            } else if (userCommend.equals("q")) {
                System.out.println("Good Bye");
                break;
            }
            else System.out.println("올바른 명령어를 입력해주세요.");

        }
    }

}

