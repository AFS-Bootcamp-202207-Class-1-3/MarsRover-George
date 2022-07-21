package com.afs.tdd;

public class Location {
    private int locationX;
    private int locationY;
    private String direction;

    public Location(int locationX, int locationY, String direction) {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return false;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Location location = (Location) obj;
        return location.getLocationX() == this.locationX
                && location.getLocationY() == this.locationY
                && location.getDirection().equals(this.direction);
    }
}
