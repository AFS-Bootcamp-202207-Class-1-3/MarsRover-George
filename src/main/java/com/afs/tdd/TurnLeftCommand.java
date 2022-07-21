package com.afs.tdd;

public class LeftDirectionCommand implements CommandAction {
    @Override
    public void doCommand(MarsRover marsRover) {
        if ("N".equals(marsRover.getDirection())) {
            marsRover.setDirection("W");
        }
    }
}
