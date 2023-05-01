package com.zhuravel.pattern_gof_command;

import com.zhuravel.pattern_gof_command.commands.LightOffCommand;
import com.zhuravel.pattern_gof_command.commands.LightOnCommand;
import com.zhuravel.pattern_gof_command.commands.StereoOffWithCDCommand;
import com.zhuravel.pattern_gof_command.commands.StereoOnWithCDCommand;
import com.zhuravel.pattern_gof_command.model.Light;
import com.zhuravel.pattern_gof_command.model.Stereo;

/**
 * @author Evgenii Zhuravel created on 15.06.2022
 * @version 1.0
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOn, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.undoButtonWasPressed();
    }
}
