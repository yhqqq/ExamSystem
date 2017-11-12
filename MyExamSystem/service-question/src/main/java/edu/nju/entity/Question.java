package edu.nju.entity;

/**
 * Created by 69401 on 2017/11/10.
 */
public class Question {

    long questionID;//试题ID

    long courseID;//试题课程ID

    int type;//试题类型

    String c_answer;//试题正确答案

    String ex_answer1;//试题备选答案1

    String ex_answer2;//试题备选答案2

    String ex_answer3;//试题备选答案3

    String ex_answer4;//试题备选答案4

    String ex_answer5;//试题备选答案5

    String content;//试题内容

    public long getQuestionID() {
        return questionID;
    }

    public void setQuestionID(long questionID) {
        this.questionID = questionID;
    }

    public long getCourseID() {
        return courseID;
    }

    public void setCourseID(long courseID) {
        this.courseID = courseID;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getC_answer() {
        return c_answer;
    }

    public void setC_answer(String c_answer) {
        this.c_answer = c_answer;
    }

    public String getEx_answer1() {
        return ex_answer1;
    }

    public void setEx_answer1(String ex_answer1) {
        this.ex_answer1 = ex_answer1;
    }

    public String getEx_answer2() {
        return ex_answer2;
    }

    public void setEx_answer2(String ex_answer2) {
        this.ex_answer2 = ex_answer2;
    }

    public String getEx_answer3() {
        return ex_answer3;
    }

    public void setEx_answer3(String ex_answer3) {
        this.ex_answer3 = ex_answer3;
    }

    public String getEx_answer4() {
        return ex_answer4;
    }

    public void setEx_answer4(String ex_answer4) {
        this.ex_answer4 = ex_answer4;
    }

    public String getEx_answer5() {
        return ex_answer5;
    }

    public void setEx_answer5(String ex_answer5) {
        this.ex_answer5 = ex_answer5;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionID=" + questionID +
                ", courseID=" + courseID +
                ", type=" + type +
                ", c_answer='" + c_answer + '\'' +
                ", ex_answer1='" + ex_answer1 + '\'' +
                ", ex_answer2='" + ex_answer2 + '\'' +
                ", ex_answer3='" + ex_answer3 + '\'' +
                ", ex_answer4='" + ex_answer4 + '\'' +
                ", ex_answer5='" + ex_answer5 + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
