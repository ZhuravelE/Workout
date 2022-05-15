package com.zhuravel.entity;

/**
 * Evgenii Zhuravel created on 13.05.2022
 */
public class Order extends Entity {
    private int id;
    private int phone;
    private String LastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
