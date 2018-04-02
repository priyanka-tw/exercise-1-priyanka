package marsroverdriver;

import marsrover.MarsRover;
import parser.InputParser;

import java.util.HashMap;

public class DriverClass {

    public static void main(String args[]) {

        String inputValue = "1 2 N";

        InputParser parser = new InputParser();
        MarsRover rover = parser.parseInputPosition(inputValue);

        String[] listOfInstructions = {"L", "M", "R"};

        for (String command : listOfInstructions) {


        }
    }

    public MarsRover executeCommands(MarsRover marsRover, String command) {

        if (command.equals("M")) {
            marsRover = executeMoveCommand(marsRover);

        } else if (command.equals("L")) {
            marsRover = executeLeftCommand(marsRover);

        } else if (command.equals("R")) {
            marsRover = executeRightCommand(marsRover);
        }

        return marsRover;
    }

    private MarsRover executeMoveCommand(MarsRover marsRover) {

        String direction = marsRover.getCurrentDirection().getCurrDir();

        return marsRover;
    }


    private MarsRover executeLeftCommand(MarsRover marsRover) {

        String direction = marsRover.getCurrentDirection().getCurrDir();

        return marsRover;
    }


    private MarsRover executeRightCommand(MarsRover marsRover) {

        String direction = marsRover.getCurrentDirection().getCurrDir();

        return marsRover;
    }


}
