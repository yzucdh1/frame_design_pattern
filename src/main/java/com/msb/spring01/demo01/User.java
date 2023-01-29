package com.msb.spring01.demo01;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/29 8:48
 */
public class User {

    private String name;

    private Friends friends;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Friends getFriends() {
        return friends;
    }

    public void setFriends(Friends friends) {
        this.friends = friends;
    }
}
