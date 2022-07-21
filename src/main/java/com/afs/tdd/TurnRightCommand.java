package com.afs.tdd;

public class RightDirectionCommand implements CommandAction{
    @Override
    public void doCommand(MarsRover marsRover) {
        if ("N".equals(marsRover.getDirection())) {
            marsRover.setDirection("E");
        }
    }
}
