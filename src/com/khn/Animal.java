package com.khn;

public class Animal {
    String sex;
    String id;
    String name;

    public Animal(String sex, String id, String name) {
        this.sex = sex;
        this.id = id;
        this.name = name;
    }

    public Animal() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
