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
}