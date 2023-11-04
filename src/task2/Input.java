package task2;

import java.awt.*;
import java.util.Scanner;

public class Input {

    private static Scanner scanner;
    public Point point;
    public Input(){
        scanner = new Scanner(System.in);
        point = new Point(scanner.nextInt(), scanner.nextInt());
    }
}
