package task6;

import java.util.Arrays;

public class Logic {
    public static int[][] GetMatrix(int [] matrix) {
        int [][] res = new int[matrix.length][matrix.length];
        for (int i = 0; i < res.length; i++) {
            System.arraycopy(matrix,i,res[i],0,res.length-i);
            System.arraycopy(matrix,0,res[i],i,i);
        }
        return res;
    }
}
