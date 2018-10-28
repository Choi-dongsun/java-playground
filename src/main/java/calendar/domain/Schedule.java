package calendar.domain;

import calendar.view.OutputView;

import java.util.ArrayList;

public class Schedule {
    private String date;
    private ArrayList<String> contents = new ArrayList<>();

    public void registerSchedule(String date, String content) {
        this.date = date;
        this.contents.add(content);
    }

    public void addSchedule(String content) {
        this.contents.add(content);
    }

    public void getSchedule(String date) {
        if (date.equals(this.date)) {
            System.out.println(contents.size() + "개의 일정이 있습니다.");
        } else {
            System.out.println("등록된 일정이 없습니다.");
            return;
        }
        OutputView.printDateSchedule(contents);
    }

    public void fixSchedule(int fixNum, String fixContents) {
        if (fixNum == 0) return;
        contents.set(fixNum - 1, fixContents);
    }

    public boolean isExistDate(String date) {
        return date.equals(this.date);
    }

    public String getDate() {
        return date;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

}
