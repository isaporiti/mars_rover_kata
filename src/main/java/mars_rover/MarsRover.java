package mars_rover;

public class MarsRover {

	private Integer yCoordinate = 0;
	private CardinalDirection cardinalDirection = CardinalDirection.NORTH;

	public String execute(String command) {
		for (String subcommand : command.split("")) {
			if (subcommand.equals("L")) {
				turnLeft();
			} else if (subcommand.equals("R")) {
				turnRight();
			} else {
				advanceOneStep();
			}
		}

		return "0:" + yCoordinate + ":" + cardinalDirection.toString();
	}

	private void advanceOneStep() {
		yCoordinate++;
	}

	private void turnLeft() {
		cardinalDirection = cardinalDirection.turnLeft();
	}

	private void turnRight() {
		cardinalDirection = cardinalDirection.turnRight();
	}

}
