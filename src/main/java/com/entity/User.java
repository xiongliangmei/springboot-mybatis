package com.entity;

public class User {
    private int id;
    private String u_name;
    private String u_pass;

    public User() {
    }

    public User(int id, String u_name, String u_pass) {
        this.id = id;
        this.u_name = u_name;
        this.u_pass = u_pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_pass() {
        return u_pass;
    }

    public void setU_pass(String u_pass) {
        this.u_pass = u_pass;
    }
}
