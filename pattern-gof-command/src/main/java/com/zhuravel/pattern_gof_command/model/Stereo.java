package com.zhuravel.pattern_gof_command.model;

/**
 * @author Evgenii Zhuravel created on 15.06.2022
 * @version 1.0
 */
public class Stereo implements Switch {

    String roomName;

    public Stereo(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public void on() {
        System.out.printf("Stereo in %s is on", roomName);
    }

    @Override
    public void off() {
        System.out.printf("Stereo in %s is off", roomName);
    }

    public void setCD() {
        System.out.printf("Stereo in %s set CD", roomName);
    }

    public void setVolume(int volume) {
        System.out.printf("Stereo in %s set volume: %s", roomName, volume);
    }
}
