package com.jeenms.test.greendao3.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by zhangdy on 2016/7/11.
 */

@Entity
public class Teacher {
    @Id
    private long id;
    private String name;
    private int age;

    public Teacher(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Teacher() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}