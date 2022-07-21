package com.afs.tdd;

public class TurnRightCommand implements Command {
    @Override
    public void doCommand(MarsRover marsRover) {
        if ("N".equals(marsRover.getLocation().getDirection())) {
            marsRover.getLocation().setDirection("E");
        } else if ("S".equals(marsRover.getLocation().getDirection())) {
            marsRover.getLocation().setDirection("W");
        }
    }
}
