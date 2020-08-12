package mars_rover;

public class MarsRover {
	private Coordinates coordinates;
	private Direction direction;
	private String positionTemplate = "%d:%d:%s";

	public MarsRover() {
		this.coordinates = new Coordinates(0, 0);
		this.direction = Direction.NORTH;
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
		coordinates = direction.getNextCoordinates(coordinates);
	}

	private String buildPositionString() {
		return String.format(
			positionTemplate,
			coordinates.getX(),
			coordinates.getY(),
			direction.toString()
		);
	}

}
