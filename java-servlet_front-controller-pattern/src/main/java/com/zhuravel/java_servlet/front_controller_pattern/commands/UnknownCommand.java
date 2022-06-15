package com.zhuravel.java_servlet.front_controller_pattern.commands;

import jakarta.servlet.ServletException;

import java.io.IOException;

/**
 * @author Evgenii Zhuravel created on 14.06.2022
 * @version 1.0
 */
public class UnknownCommand extends FrontCommand {

    @Override
    public void process() throws ServletException, IOException {
        forward("unknown");
    }
}
