package mars_rover;

public class MarsRover {
	private Grid grid;
	private Coordinates coordinates;
	private Direction direction;
	private String positionTemplate = "%d:%d:%s";

	public MarsRover(Grid grid) {
		this.coordinates = new Coordinates(0, 0);
		this.direction = Direction.NORTH;
		this.grid = grid;
	}

	public String execute(String command) {
		for (String subcommand : command.split("")) {
			if (subcommand.equals("L")) {
				turnLeft();
			} else if (subcommand.equals("R")) {
				turnRight();
			} else {
				doOneStep();
			}
		}
		return buildPositionString();
	}

	private void turnLeft() {
		direction = direction.turnLeft();
	}

	private void turnRight() {
		direction = direction.turnRight();
	}

	private void doOneStep() {
		coordinates = grid.getNextCoordinates(this);
	}

	private String buildPositionString() {
		return String.format(
			positionTemplate,
			coordinates.getX(),
			coordinates.getY(),
			direction.toString()
		);
	}

	public Coordinates getDirectedNextCoordinates() {
		return direction.getNextCoordinates(coordinates);
	}

}
