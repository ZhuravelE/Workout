package com.zhuravel.pattern_gof_command.commands;

import com.zhuravel.pattern_gof_command.model.Stereo;

/**
 * @author Evgenii Zhuravel created on 15.06.2022
 * @version 1.0
 */
public class StereoOffWithCDCommand implements Command {

    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
