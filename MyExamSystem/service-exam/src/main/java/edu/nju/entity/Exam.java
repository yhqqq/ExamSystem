package edu.nju.entity;

import java.sql.Date;

/**
 * Created by 69401 on 2017/11/10.
 */
public class Exam {

    long examID;//考试id

    int single_num;//单选题数量

    int multiple_num;//多选题数量

    int completion_num;//填空题数量

    int single_score;//单选题分值

    int multiple_score;//多选题分值

    int completion_score;//填空题分值

    Date starttime;//考试开始时间

    Date endtime;//考试结束时间

    long courseID;//考试科目id

    public Long getExamID() {
        return examID;
    }

    public int getSingle_num() {
        return single_num;
    }

    public int getMultiple_num() {
        return multiple_num;
    }

    public int getCompletion_num() {
        return completion_num;
    }

    public int getSingle_score() {
        return single_score;
    }

    public int getMultiple_score() {
        return multiple_score;
    }

    public int getCompletion_score() {
        return completion_score;
    }

    public Date getStarttime() {
        return starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public Long getCourseID() {
        return courseID;
    }

    public void setExamID(Long examID) {
        this.examID = examID;
    }

    public void setSingle_num(int single_num) {
        this.single_num = single_num;
    }

    public void setMultiple_num(int multiple_num) {
        this.multiple_num = multiple_num;
    }

    public void setCompletion_num(int completion_num) {
        this.completion_num = completion_num;
    }

    public void setSingle_score(int single_score) {
        this.single_score = single_score;
    }

    public void setMultiple_score(int multiple_score) {
        this.multiple_score = multiple_score;
    }

    public void setCompletion_score(int completion_score) {
        this.completion_score = completion_score;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examID=" + examID +
                ", single_num=" + single_num +
                ", multiple_num=" + multiple_num +
                ", completion_num=" + completion_num +
                ", single_score=" + single_score +
                ", multiple_score=" + multiple_score +
                ", completion_score=" + completion_score +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                ", courseID=" + courseID +
                '}';
    }
}
