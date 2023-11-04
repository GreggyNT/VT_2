package task2;

import java.awt.*;
import java.util.HashMap;
public class Logic {

    private final Point[] cornerValues1;
    private final Point[] cornerValues2;
    public Logic(){
        cornerValues1 = new Point[]{new Point(-4,5),
                                    new Point(4,0)};

        cornerValues2 = new Point[]{new Point(-6,0),
                                    new Point(6,-3)};
    }
    public boolean checkIfIn(Point point){
        return (point.x >= cornerValues1[1].x && point.y <= cornerValues1[1].y && point.x <= cornerValues1[2].x && point.y >= cornerValues1[2].y) || (point.x >= cornerValues2[1].x && point.y <= cornerValues2[1].y && point.x <= cornerValues2[2].x && point.y >= cornerValues2[2].y);
    }
}
