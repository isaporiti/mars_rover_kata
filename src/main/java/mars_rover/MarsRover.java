package mars_rover;

public class MarsRover {

	private Integer yCoordinate = 0;
	private String cardinalDirection = "N";

	public String execute(String command) {
		for (String subcommand : command.split("")) {
			if (subcommand.equals("L")) {
				cardinalDirection = "W";
			}
			else {
				yCoordinate++;
			}
		}

		return "0:"+ yCoordinate + ":" + cardinalDirection;
	}

}
