package com.personalblog.model;

/**
 * @Author lyuWalle
 * @Date 2020/5/6 0:26
 * @Version 1.0
 */
public class Diary {
    private int diaryid;
    private String diary;
    private String time;

    public int getDiaryid() {
        return diaryid;
    }

    public void setDiaryid(int diaryid) {
        this.diaryid = diaryid;
    }

    public String getDiary() {
        return diary;
    }

    public void setDiary(String diary) {
        this.diary = diary;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
