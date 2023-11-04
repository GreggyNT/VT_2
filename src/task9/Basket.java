package task9;

import java.util.Random;

public class Basket {
    public static int _capacity;

    public Ball[] _balls;
    public Basket(int capacity) {
        _balls = new Ball[capacity];
        Random rand = new Random();
         for (int i = 0; i < capacity; i++)
             _balls[i] = new Ball();
    }

    public int AllBallsWeight(){return _balls.length*Ball._weight;}

    public int BlueAmount(){
        int res = 0;
        for (Ball ball : _balls) if (ball._color == Ball.Color.Blue) res++;
        return res;
    }
}
