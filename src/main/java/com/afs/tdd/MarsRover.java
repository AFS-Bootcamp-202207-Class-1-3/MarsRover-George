package com.afs.tdd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarsRover {

    private int locationX;
    private int locationY;
    private String direction;

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
        if ("M".equals(command)) {
            move();
        } else if ("L".equals(command)) {
            switch (this.getDirection()){
                case "N": this.setDirection("W");
            }
        } else if ("R".equals(command)) {
            switch (this.getDirection()) {
                case "N": this.setDirection("E");
            }
        }
    }

    private void move() {
        if("N".equals(this.direction)) {
            this.locationY++;
        }
    }
}
