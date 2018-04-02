package parser;

import mars.Coordinates;
import mars.Direction;
import marsrover.MarsRover;

/*
Parses the input to generate MarsRover Object
 */
public class InputParser {

    Coordinates coord = new Coordinates();
    Direction currDir = new Direction();
    MarsRover marsRover = new MarsRover();

    public MarsRover parseInputPosition(String inputString){

        String[] spaceSeperatedInput = inputString.split(" ");

        coord.setXcor(Integer.parseInt(spaceSeperatedInput[0]));
        coord.setYcor(Integer.parseInt(spaceSeperatedInput[1]));
        currDir.setCurrDir(spaceSeperatedInput[2]);
        marsRover.setCurrenctCoordinates(coord);
        marsRover.setCurrentDirection(currDir);

        return marsRover;
    }

}
