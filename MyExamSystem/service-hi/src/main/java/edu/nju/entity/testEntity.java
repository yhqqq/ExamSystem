package edu.nju.entity;

/**
 * Created by Administrator on 2017/11/8.
 */
public class testEntity {
    int id;

    String test2;

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    @Override
    public String toString() {
        return "testEntity{" +
                "id=" + id +
                ", test2='" + test2 + '\'' +
                '}';
    }
}
