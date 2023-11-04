package task9;

import java.util.Random;

public class Ball {
    public enum Color{Red, Green, Blue}

    public  Color _color;

    public static int _weight = 2;

    public Ball(){
        _color = setColor();
    }

    public Color setColor(){
        Random rand = new Random();
        return switch (rand.nextInt(3)) {
            case 1 -> Color.Green;
            case 2 -> Color.Blue;
            default -> Color.Red;
        };
    }
}
