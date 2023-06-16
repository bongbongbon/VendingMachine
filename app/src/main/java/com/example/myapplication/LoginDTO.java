package com.example.myapplication;

public class LoginDTO {
    private String id, pw, name, age, money;

    public LoginDTO(String id, String pw, String name, String age, String money ) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
