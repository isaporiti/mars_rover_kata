package mars_rover;

public class Coordinates {
    private Integer x;
    private Integer y;

    public Coordinates(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Coordinates getNextCoordinatesLeft() {
        return new Coordinates(x - 1, y);
    }

    public Coordinates getNextCoordinatesRight() {
        return new Coordinates(x + 1, y);
    }

    public Coordinates getNextCoordinatesUp() {
        return new Coordinates(x, y + 1);
    }

    public Coordinates getNextCoordinatesDown() {
        return new Coordinates(x, y - 1);
    }

    @Override
    public boolean equals(Object object) {
        Coordinates otherCoordinates = (Coordinates) object;
        return (
            super.equals(otherCoordinates)
            || (x.equals(otherCoordinates.getX()) && y.equals(otherCoordinates.getY()))
        );
    }

}