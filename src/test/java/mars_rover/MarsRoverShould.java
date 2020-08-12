package mars_rover;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MarsRoverShould {

    @Test void move_forward_as_many_times_as_M_commands() {
        Grid grid = new Grid(10, 10);
        MarsRover marsRover = new MarsRover(grid);
        assertEquals("0:1:N", marsRover.execute("M"));
        assertEquals("0:3:N", marsRover.execute("MM"));
        assertEquals("0:9:N", marsRover.execute("MMMMMM"));
    }

    @Test void rotate_and_face_four_cardinal_directions_when_receiving_L_command() {
        Grid grid = new Grid(10, 10);
        MarsRover marsRover = new MarsRover(grid);
        assertEquals("0:0:W", marsRover.execute("L"));
        assertEquals("0:0:S", marsRover.execute("L"));
        assertEquals("0:0:E", marsRover.execute("L"));
        assertEquals("0:0:N", marsRover.execute("L"));
        assertEquals("0:0:N", marsRover.execute("LLLL"));
    }

    @Test void rotate_and_face_four_cardinal_directions_when_receiving_R_command() {
        Grid grid = new Grid(10, 10);
        MarsRover marsRover = new MarsRover(grid);
        assertEquals("0:0:E", marsRover.execute("R"));
        assertEquals("0:0:S", marsRover.execute("R"));
        assertEquals("0:0:W", marsRover.execute("R"));
        assertEquals("0:0:N", marsRover.execute("R"));
        assertEquals("0:0:N", marsRover.execute("RRRR"));
    }

    @Test void rotate_and_face_all_directions_and_advance_towards_them() {
        Grid grid = new Grid(10, 10);
        MarsRover marsRover = new MarsRover(grid);
        assertEquals("2:0:E", marsRover.execute("RMM"));
        assertEquals("2:-2:S", marsRover.execute("RMM"));
        assertEquals("-2:-2:W", marsRover.execute("RMMMM"));
        assertEquals("-2:-2:N", marsRover.execute("R"));

        assertEquals("-4:-2:W", marsRover.execute("LMM"));
        assertEquals("-4:-4:S", marsRover.execute("LMM"));
        assertEquals("0:-4:E", marsRover.execute("LMMMM"));
        assertEquals("0:-4:N", marsRover.execute("L"));
    }

    @Test void move_through_a_grid_with_no_obstacles() {
        Grid grid = new Grid(10, 10);
        MarsRover marsRover = new MarsRover(grid);
        assertEquals("2:3:N", marsRover.execute("MMRMMLM"));
    }

    @Test void move_through_a_grid_with_wraparound_and_no_obstacles() {
        Grid grid = new Grid(10, 10);
        MarsRover marsRover = new MarsRover(grid);
        assertEquals("0:0:N", marsRover.execute("MMMMMMMMMM"));
    }

}