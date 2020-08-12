package mars_rover;

public class Grid {
    private Integer horizontalSize;
    private Integer verticalSize;

    public Grid(Integer horizontalSize, Integer verticalSize) {
        this.horizontalSize = horizontalSize;
        this.verticalSize = verticalSize;
    }

    public Coordinates getNextCoordinates(MarsRover marsRover) {
        Coordinates newCoordinates = marsRover.getDirectedNextCoordinates();
        return new Coordinates(
            newCoordinates.getX() % horizontalSize,
            newCoordinates.getY() % verticalSize
        );
	}

}
