package com.zhuravel.pattern_gof_command.commands;

/**
 * @author Evgenii Zhuravel created on 15.06.2022
 * @version 1.0
 */
public class NoCommand implements Command {

    @Override
    public void execute() {
    }

    @Override
    public void undo() {

    }
}
