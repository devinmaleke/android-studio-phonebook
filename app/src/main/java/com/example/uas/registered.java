package com.example.uas;

import java.io.Serializable;

public class registered implements Serializable {
    public String date;
    public String age;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
