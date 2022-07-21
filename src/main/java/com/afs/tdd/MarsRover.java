package com.afs.tdd;

import java.util.*;

public class MarsRover {

    private int locationX;
    private int locationY;
    private String direction;

    private static Map<String,CommandAction> commandTypeActionMap = new HashMap<>();

    static {
        commandTypeActionMap.put("M", new MoveCommand());
        commandTypeActionMap.put("L", new LeftDirectionCommand());
        commandTypeActionMap.put("R", new RightDirectionCommand());
    }

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public int getLocationX() {
        return locationX;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void executeCommand(String command) {
        commandTypeActionMap.get(command).doCommand(this);
    }

}
