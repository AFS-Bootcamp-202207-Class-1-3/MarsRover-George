package com.afs.tdd;

public class MoveCommand implements Command {
    @Override
    public void doCommand(MarsRover marsRover) {
        if("N".equals(marsRover.getDirection())) {
            marsRover.setLocationY(marsRover.getLocationY()+1);
        } else if ("S".equals(marsRover.getDirection())) {
            marsRover.setLocationY(marsRover.getLocationY()-1);
        }
    }
}
