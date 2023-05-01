package com.zhuravel.pattern_gof_command.commands;

import com.zhuravel.pattern_gof_command.model.Light;

/**
 * @author Evgenii Zhuravel created on 15.06.2022
 * @version 1.0
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
