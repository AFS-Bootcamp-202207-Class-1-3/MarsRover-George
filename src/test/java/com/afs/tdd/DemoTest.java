package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_0_1_N_when_execute_command_given_0_0_N_and_M() {
        //given
        Location location = new Location(0, 0, "N");
        String command = "M";
        Location expectedLocation = new Location(0, 1, "N");

        //when
        MarsRover marsRover = new MarsRover(location);
        marsRover.executeCommand(command);

        //then
        assertEquals(expectedLocation, marsRover.getLocation());

    }

    @Test
    void should_return_0_0_W_when_execute_command_given_0_0_N_and_L() {
        //given
        Location location = new Location(0, 0, "N");
        String command = "L";
        Location expectedLocation = new Location(0, 0, "W");

        //when
        MarsRover marsRover = new MarsRover(location);
        marsRover.executeCommand(command);

        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }

    @Test
    void should_return_0_0_E_when_execute_command_given_0_0_N_and_R() {
        //given
        Location location = new Location(0, 0, "N");
        String command = "R";
        Location expectedLocation = new Location(0, 0, "E");

        //when
        MarsRover marsRover = new MarsRover(location);
        marsRover.executeCommand(command);

        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }

    @Test
    void should_return_0_minus_1_S_when_execute_command_given_0_0_S_and_M() {
        //given
        Location location = new Location(0,0,"S");
        String command = "M";
        Location expectedLocation = new Location(0,-1,"S");

        //when
        MarsRover marsRover = new MarsRover(location);
        marsRover.executeCommand(command);

        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }

    @Test
    void should_return_0_0_E_when_execute_command_given_0_0_S_and_L() {
        //given
        Location location = new Location(0,0,"S");
        String command = "L";
        Location expectedLocation = new Location(0,0,"E");

        //when
        MarsRover marsRover = new MarsRover(location);
        marsRover.executeCommand(command);

        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }

    @Test
    void should_return_0_0_W_when_execute_command_given_0_0_S_and_R() {
        //given
        Location location = new Location(0,0,"S");
        String command = "R";
        Location expectedLocation = new Location(0,0,"W");

        //when
        MarsRover marsRover = new MarsRover(location);
        marsRover.executeCommand(command);

        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }

    @Test
    void should_return_1_0_E_when_execute_command_given_0_0_E_and_M() {
        //given
        Location location = new Location(0,0,"E");
        String command = "M";
        Location expectedLocation = new Location(1,0,"E");

        //when
        MarsRover marsRover = new MarsRover(location);
        marsRover.executeCommand(command);

        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }

    @Test
    void should_return_0_0_N_when_execute_command_given_0_0_E_and_L() {
        //given
        Location location = new Location(0,0,"E");
        String command = "L";
        Location expectedLocation = new Location(1,0,"N");

        //when
        MarsRover marsRover = new MarsRover(location);
        marsRover.executeCommand(command);

        //then
        assertEquals(expectedLocation, marsRover.getLocation());
    }
}
