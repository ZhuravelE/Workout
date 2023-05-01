package com.zhuravel.pattern_gof_command.commands;

/**
 * @author Evgenii Zhuravel created on 15.06.2022
 * @version 1.0
 */
public interface Command {

    void execute();

    void undo();
}
