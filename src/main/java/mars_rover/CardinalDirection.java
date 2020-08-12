package mars_rover;

public enum CardinalDirection {
    NORTH("N") {
        @Override
        public CardinalDirection getLeftDirection() {
            return WEST;
        }

        @Override
        public CardinalDirection getRightDirection() {
            return EAST;
        }
    },
    EAST("E") {
        @Override
        public CardinalDirection getLeftDirection() {
            return NORTH;
        }

        @Override
        public CardinalDirection getRightDirection() {
            return SOUTH;
        }
    },
    SOUTH("S") {
        @Override
        public CardinalDirection getLeftDirection() {
            return EAST;
        }

        @Override
        public CardinalDirection getRightDirection() {
            return WEST;
        }
    },
    WEST("W") {
        @Override
        public CardinalDirection getLeftDirection() {
            return SOUTH;
        }

        @Override
        public CardinalDirection getRightDirection() {
            return NORTH;
        }
    };

    private String name;

    CardinalDirection(String name) {
        this.name = name;
    }
    public abstract CardinalDirection getLeftDirection();
    public abstract CardinalDirection getRightDirection();

    public String toString() {
        return this.name;
    }
}