package task3;

import java.util.HashMap;
import java.util.Scanner;

public class Ouput
{
    public static void Out(HashMap<Integer,Double> map){
        for(int entry : map.keySet()){
            System.out.print(entry);
            System.out.println(map.get(entry).toString());
        }
    }
}
