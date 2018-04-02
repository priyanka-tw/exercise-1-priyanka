package marsrover;

import mars.Coordinates;
import mars.Direction;

/*
Model for Mars Rover
 */
public class MarsRover {

    Coordinates currenctCoordinates;
    Direction currentDirection;

    public Coordinates getCurrenctCoordinates() {
        return currenctCoordinates;
    }

    public void setCurrenctCoordinates(Coordinates currenctCoordinates) {
        this.currenctCoordinates = currenctCoordinates;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }
}
