package mars_rover;

public class Obstacle {
    private Coordinates coordinates;

    public Obstacle(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    Boolean isBlockingCoordinates(Coordinates coordinates) {
        return this.coordinates.equals(coordinates);
    }

}
