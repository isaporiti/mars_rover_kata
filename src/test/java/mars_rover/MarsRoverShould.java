package mars_rover;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MarsRoverShould {

    @Test void move_forward_as_many_times_as_M_commands() {
        MarsRover marsRover = new MarsRover();
        assertEquals("0:1:N", marsRover.execute("M"));
        assertEquals("0:3:N", marsRover.execute("MM"));
        assertEquals("0:9:N", marsRover.execute("MMMMMM"));
    }

    @Test void rotate_and_face_four_cardinal_directions_when_receiving_L_command() {
        MarsRover marsRover = new MarsRover();
        assertEquals("0:0:W", marsRover.execute("L"));
        assertEquals("0:0:S", marsRover.execute("L"));
        assertEquals("0:0:E", marsRover.execute("L"));
        assertEquals("0:0:N", marsRover.execute("L"));
    }

    @Test void rotate_and_face_four_cardinal_directions_when_receiving_R_command() {
        MarsRover marsRover = new MarsRover();
        assertEquals("0:0:E", marsRover.execute("R"));
        assertEquals("0:0:S", marsRover.execute("R"));
        assertEquals("0:0:W", marsRover.execute("R"));
        assertEquals("0:0:N", marsRover.execute("R"));
    }

}