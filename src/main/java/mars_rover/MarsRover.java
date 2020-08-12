package mars_rover;

import mars_rover.exceptions.GridCoordinatesBlockedException;

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
		try {
			executeCommand(command);
		} catch (GridCoordinatesBlockedException e) {
			e.printStackTrace();
		}
		return buildPositionString();
	}

	private void executeCommand(String command) throws GridCoordinatesBlockedException {
		for (String subcommand : command.split("")) {
			if (subcommand.equals("L")) {
				turnLeft();
			} else if (subcommand.equals("R")) {
				turnRight();
			} else {
				doOneStep();
			}
		}
	}

	private void turnLeft() {
		direction = direction.turnLeft();
	}

	private void turnRight() {
		direction = direction.turnRight();
	}

	private void doOneStep() throws GridCoordinatesBlockedException {
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
