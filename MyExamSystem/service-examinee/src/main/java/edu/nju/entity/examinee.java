package edu.nju.entity;

/**
 * Created by NJU on 2017/11/10.
 */
public class examinee {
    int userID;
    int examID;
    String email;
    int answerSheetID;
    int grade;
    String state;

    public int getUserID() {
        return userID;
    }

    public int getExamID() {
        return examID;
    }

    public String getEmail() {
        return email;
    }

    public int getAnswerSheetID() {
        return answerSheetID;
    }

    public int getGrade() {
        return grade;
    }

    public String getState() {
        return state;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAnswerSheetID(int answerSheetID) {
        this.answerSheetID = answerSheetID;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setState(String state) {
        this.state = state;
    }
}
