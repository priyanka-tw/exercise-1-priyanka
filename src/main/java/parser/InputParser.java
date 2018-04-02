package parser;

import mars.Coordinates;
import mars.Direction;
import mars.Position;
import marsrover.MarsRover;

/*
Parses the input to generate MarsRover Object
 */
public class InputParser {

    Coordinates coord = new Coordinates();
    Direction currDir = new Direction();
    MarsRover marsRover = new MarsRover();
    Position pos = new Position();

    public MarsRover parseInputPosition(String inputString){

        String[] spaceSeperatedInput = inputString.split(" ");

        coord.setXcor(Integer.parseInt(spaceSeperatedInput[0]));
        coord.setYcor(Integer.parseInt(spaceSeperatedInput[1]));
        currDir.setCurrDir(spaceSeperatedInput[2]);

        pos.setCurrenctCoordinates(coord);
        pos.setCurrentDirection(currDir);

        marsRover.setCurrPosition(pos);

        return marsRover;
    }

}
