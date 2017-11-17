package edu.nju.entity;

/**
 * Created by Administrator on 2017/11/17.
 */
public class User {
    long userID;

    String userName;

    String mailAddress;

    String password;

    int identity;

    public User(String userName, String mailAddress, String password, int identity) {
        this.userName = userName;
        this.mailAddress = mailAddress;
        this.password = password;
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", password='" + password + '\'' +
                ", identity=" + identity +
                '}';
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }




}
