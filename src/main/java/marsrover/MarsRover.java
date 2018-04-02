package marsrover;

import mars.Position;

import java.util.HashMap;

/*
Model for Mars Rover
 */
public class MarsRover {

    Position currPosition;

    public void move(String direction) {

        if (direction.equals("N")) {
            int yCor = currPosition.getCurrenctCoordinates().getYcor();
            currPosition.getCurrenctCoordinates().setYcor(yCor + 1);

        } else if (direction.equals("S")) {
            int yCor = currPosition.getCurrenctCoordinates().getYcor();
            currPosition.getCurrenctCoordinates().setYcor(yCor - 1);

        } else if (direction.equals("E")) {
            int xCor = currPosition.getCurrenctCoordinates().getXcor();
            currPosition.getCurrenctCoordinates().setXcor(xCor + 1);

        } else if (direction.equals("W")) {
            int xCor = currPosition.getCurrenctCoordinates().getXcor();
            currPosition.getCurrenctCoordinates().setXcor(xCor - 1);
        }

    }

    public void turnLeft(String direction) {

        HashMap<String, String> leftDirectionMap = initLeftDirections();
        currPosition.getCurrentDirection().setCurrDir(leftDirectionMap.get(direction));
    }

    public void turnRight(String direction) {

        HashMap<String, String> rightDirectionMap = initRightDirections();
        currPosition.getCurrentDirection().setCurrDir(rightDirectionMap.get(direction));
    }

    public Position getCurrPosition() {
        return currPosition;
    }

    public void setCurrPosition(Position currPosition) {
        this.currPosition = currPosition;
    }

    @Override
    public String toString() {
        return currPosition.getCurrenctCoordinates().getXcor().toString() + " " + currPosition.getCurrenctCoordinates().getYcor().toString() + " " + currPosition.getCurrentDirection().getCurrDir();
    }

    private HashMap<String, String> initLeftDirections() {

        HashMap<String, String> leftDirMap = new HashMap<>();
        leftDirMap.put("E", "N");
        leftDirMap.put("N", "W");
        leftDirMap.put("W", "S");
        leftDirMap.put("S", "E");

        return leftDirMap;
    }

    private HashMap<String, String> initRightDirections() {

        HashMap<String, String> rightDirMap = new HashMap<>();
        rightDirMap.put("E", "S");
        rightDirMap.put("N", "E");
        rightDirMap.put("W", "N");
        rightDirMap.put("S", "W");

        return rightDirMap;
    }


}
