package mars;

/*
*  Defines the x-coordinates and y-coordinates of the Mars Rover.
*/

public class Coordinates {

    private Integer xcor;
    private Integer ycor;

    public Integer getXcor() {
        return xcor;
    }

    public void setXcor(Integer xcor) {
        this.xcor = xcor;
    }

    public Integer getYcor() {
        return ycor;
    }

    public void setYcor(Integer ycor) {
        this.ycor = ycor;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "xcor=" + xcor +
                ", ycor=" + ycor +
                '}';
    }
}
