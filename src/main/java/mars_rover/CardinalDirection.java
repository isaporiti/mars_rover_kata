package mars_rover;

public enum CardinalDirection {
    NORTH("N") {
        @Override
        public CardinalDirection turnLeft() {
            return WEST;
        }

        @Override
        public CardinalDirection turnRight() {
            return EAST;
        }
    },
    EAST("E") {
        @Override
        public CardinalDirection turnLeft() {
            return NORTH;
        }

        @Override
        public CardinalDirection turnRight() {
            return SOUTH;
        }
    },
    SOUTH("S") {
        @Override
        public CardinalDirection turnLeft() {
            return EAST;
        }

        @Override
        public CardinalDirection turnRight() {
            return WEST;
        }
    },
    WEST("W") {
        @Override
        public CardinalDirection turnLeft() {
            return SOUTH;
        }

        @Override
        public CardinalDirection turnRight() {
            return NORTH;
        }
    };

    private String name;

    CardinalDirection(String name) {
        this.name = name;
    }
    public abstract CardinalDirection turnLeft();
    public abstract CardinalDirection turnRight();

    public String toString() {
        return this.name;
    }
}