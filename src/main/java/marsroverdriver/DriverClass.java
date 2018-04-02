package marsroverdriver;

import marsrover.MarsRover;
import parser.InputParser;

import java.util.HashMap;

public class DriverClass {

    public static void main(String args[]) {

        String inputValue = "1 2 N";

        InputParser parser = new InputParser();
        MarsRover rover = parser.parseInputPosition(inputValue);

        String[] listOfInstructions = {"M", "M", "M"};

        for (String command : listOfInstructions) {
            executeCommands(rover, command);
        }

        System.out.println(" OUTPUT "+rover.toString());
    }

    public static void executeCommands(MarsRover marsRover, String command) {

        String dir = marsRover.getCurrPosition().getCurrentDirection().getCurrDir();

        if (command.equals("M")) {
            marsRover.move(dir);

        } else if (command.equals("L")) {
            marsRover.turnLeft(dir);

        } else if (command.equals("R")) {
            marsRover.turnRight(dir);
        }

    }


}
