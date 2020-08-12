package mars_rover;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MarsRoverShould {
    @Test void move_forward_when_receiving_M_command() {
        MarsRover marsRover = new MarsRover();
        assertEquals("0:1:N", marsRover.execute("M"));
    }
}