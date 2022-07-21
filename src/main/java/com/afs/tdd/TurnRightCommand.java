package com.afs.tdd;

public class TurnRightCommand implements Command {
    @Override
    public void doCommand(MarsRover marsRover) {
        if ("N".equals(marsRover.getDirection())) {
            marsRover.setDirection("E");
        }
    }
}
