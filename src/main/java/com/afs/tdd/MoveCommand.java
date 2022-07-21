package com.afs.tdd;

public class MoveCommand implements Command {
    @Override
    public void doCommand(MarsRover marsRover) {
        if("N".equals(marsRover.getLocation().getDirection())) {
            marsRover.getLocation().setLocationY(marsRover.getLocation().getLocationY()+1);
        } else if ("S".equals(marsRover.getLocation().getDirection())) {
            marsRover.getLocation().setLocationY(marsRover.getLocation().getLocationY()-1);
        }
    }
}
