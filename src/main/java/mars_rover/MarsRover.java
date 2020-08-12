package mars_rover;

public class MarsRover {

	private Integer yCoordinate = 0;

	public String execute(String command) {
		for (String subcommand : command.split("")) {
			yCoordinate++;
		}

		return "0:"+ yCoordinate + ":N";
	}

}
