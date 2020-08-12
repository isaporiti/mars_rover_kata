package mars_rover;

import java.util.ArrayList;
import java.util.List;

import mars_rover.exceptions.GridCoordinatesBlockedException;

public class Grid {
    private Integer horizontalSize;
    private Integer verticalSize;
    private List<Obstacle> obstacles;

    public Grid(Integer horizontalSize, Integer verticalSize) {
        this.horizontalSize = horizontalSize;
        this.verticalSize = verticalSize;
        this.obstacles = new ArrayList<Obstacle>();
    }

    public Grid(Integer horizontalSize, Integer verticalSize, List<Obstacle> obstacles) {
        this.horizontalSize = horizontalSize;
        this.verticalSize = verticalSize;
        this.obstacles = obstacles;
    }

    public Coordinates getNextCoordinates(MarsRover marsRover) throws GridCoordinatesBlockedException {
        Coordinates marsRoverCoordinates = marsRover.getDirectedNextCoordinates();
        Coordinates wrappedAroundCoordinates = wrapAroundCoordinates(marsRoverCoordinates);

        if (coordinatesAreBlocked(wrappedAroundCoordinates)) {
            throw new GridCoordinatesBlockedException();
        }

        return wrappedAroundCoordinates;
    }

    private Boolean coordinatesAreBlocked(Coordinates wrappedAroundCoordinates) {
        return obstacles.stream().anyMatch(obstacle -> {
            return obstacle.isBlockingCoordinates(wrappedAroundCoordinates);
        });
    }

    private Coordinates wrapAroundCoordinates(Coordinates marsRoverCoordinates) {
        return new Coordinates(
            marsRoverCoordinates.getX() % horizontalSize,
            marsRoverCoordinates.getY() % verticalSize
        );
    }

}
