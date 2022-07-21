package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_0_1_N_when_execute_command_given_0_0_N_and_M() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "N";
        String command = "M";

        int expectedLocationX = 0;
        int expectedLocationY = 1;
        String expectedDirection = "N";

        //when
        MarsRover marsRover = new MarsRover(locationX, locationY, direction);
        marsRover.executeCommand(command);

        //then
        assertEquals(expectedLocationX, marsRover.getLocationX());
        assertEquals(expectedLocationY, marsRover.getLocationY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    @Test
    void should_return_0_0_W_when_execute_command_given_0_0_N_and_L() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "N";
        String command = "L";

        int expectedLocationX = 0;
        int expectedLocationY = 0;
        String expectedDirection = "W";

        //when
        MarsRover marsRover = new MarsRover(locationX, locationY, direction);
        marsRover.executeCommand(command);

        //then
        assertEquals(expectedLocationX, marsRover.getLocationX());
        assertEquals(expectedLocationY, marsRover.getLocationY());
        assertEquals(expectedDirection, marsRover.getDirection());
    }


}
