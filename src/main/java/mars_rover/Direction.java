package mars_rover;

public enum Direction {
    NORTH("N") {
        @Override
        public Direction turnLeft() {
            return WEST;
        }

        @Override
        public Direction turnRight() {
            return EAST;
        }

        @Override
        public Coordinates getNextCoordinates(Coordinates coordinates) {
            return coordinates.getNextCoordinatesUp();
        }

    },
    EAST("E") {
        @Override
        public Direction turnLeft() {
            return NORTH;
        }

        @Override
        public Direction turnRight() {
            return SOUTH;
        }

        @Override
        public Coordinates getNextCoordinates(Coordinates coordinates) {
            return coordinates.getNextCoordinatesRight();
        }
    },
    SOUTH("S") {
        @Override
        public Direction turnLeft() {
            return EAST;
        }

        @Override
        public Direction turnRight() {
            return WEST;
        }

        @Override
        public Coordinates getNextCoordinates(Coordinates coordinates) {
            return coordinates.getNextCoordinatesDown();
        }
    },
    WEST("W") {
        @Override
        public Direction turnLeft() {
            return SOUTH;
        }

        @Override
        public Direction turnRight() {
            return NORTH;
        }

        @Override
        public Coordinates getNextCoordinates(Coordinates coordinates) {
            return coordinates.getNextCoordinatesLeft();
        }
    };

    private String name;

    Direction(String name) {
        this.name = name;
    }

    public abstract Direction turnLeft();

    public abstract Direction turnRight();

    public String toString() {
        return this.name;
    }

    public abstract Coordinates getNextCoordinates(Coordinates coordinates);
}