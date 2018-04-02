package mars;

public class Position {

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
