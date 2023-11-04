package task3;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.tanh;

public class Logic
{
    public static HashMap<Integer, Double> Solver(int a, int b, int h){
        int x = a;
        HashMap<Integer,Double> map = new HashMap<Integer, Double>();
        while (x<=b ){
            map.put(x,tanh(x));
            x+=h;
        }
        return map;
    }
}
