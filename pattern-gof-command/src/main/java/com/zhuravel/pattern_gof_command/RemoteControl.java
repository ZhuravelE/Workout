package com.zhuravel.pattern_gof_command;

import com.zhuravel.pattern_gof_command.commands.Command;
import com.zhuravel.pattern_gof_command.commands.NoCommand;

/**
 * @author Evgenii Zhuravel created on 15.06.2022
 * @version 1.0
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuff = new StringBuilder();

        stringBuff.append("\n------ Remote Control -------\n");

        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot ").append(i)
                    .append("] ")
                    .append(onCommands[i].getClass().getSimpleName())
                    .append("\t")
                    .append(offCommands[i].getClass().getSimpleName()).append("\n");
        }
        return stringBuff.toString();
    }
}
