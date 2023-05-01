package com.zhuravel.pattern_gof_command.model;

/**
 * @author Evgenii Zhuravel created on 15.06.2022
 * @version 1.0
 */
public class Light implements Switch{

    String roomName;

    public Light(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public void on() {
        System.out.printf("Light in %s is on\n", roomName);
    }

    @Override
    public void off() {
        System.out.printf("Light in %s is off\n", roomName);
    }
}
