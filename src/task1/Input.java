package task1;

import java.util.Scanner;

public class Input {

    private static Scanner scanner;
    public int x,y;
    public Input(){
        scanner = new Scanner(System.in);
        x=0;
        y=0;
    }

    public void inputValues(){
        x=scanner.nextInt();
        y=scanner.nextInt();
    }
}
