package com.afs.tdd;

import java.util.*;

public class MarsRover {

    private Location location;
    private static final Map<String, Command> commandTypeActionMap = new HashMap<>();

    static {
        commandTypeActionMap.put("M", new MoveCommand());
        commandTypeActionMap.put("L", new TurnLeftCommand());
        commandTypeActionMap.put("R", new TurnRightCommand());
    }

    public MarsRover(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void executeCommand(String command) {
        for (char instruction : command.toCharArray()) {
            commandTypeActionMap.get(String.valueOf(instruction)).doCommand(this);
        }
    }

}
