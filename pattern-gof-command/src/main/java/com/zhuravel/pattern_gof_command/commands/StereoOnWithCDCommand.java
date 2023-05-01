package com.zhuravel.pattern_gof_command.commands;

import com.zhuravel.pattern_gof_command.model.Stereo;

/**
 * @author Evgenii Zhuravel created on 15.06.2022
 * @version 1.0
 */
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
