package com.afs.tdd;

public class TurnLeftCommand implements Command {
    @Override
    public void doCommand(MarsRover marsRover) {
        if ("N".equals(marsRover.getLocation().getDirection())) {
            marsRover.getLocation().setDirection("W");
        } else if ("S".equals(marsRover.getLocation().getDirection())) {
            marsRover.getLocation().setDirection("E");
        }
    }
}
