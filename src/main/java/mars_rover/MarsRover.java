package mars_rover;

public class MarsRover {

	private Integer yCoordinate = 0;
	private CardinalDirection cardinalDirection = CardinalDirection.NORTH;

	public String execute(String command) {
		for (String subcommand : command.split("")) {
			if (subcommand.equals("L")) {
				cardinalDirection = cardinalDirection.getLeftDirection();
			}
			else {
				yCoordinate++;
			}
		}

		return "0:"+ yCoordinate + ":" + cardinalDirection.toString();
	}

}
