package task7;

public class Logic {
    public static double[] calculate(double[] array){
        int i = 0;
        double swap;
        while (i < array.length-1){
            if (array[i] <= array[i+1])
                i++;
            else {
                swap = array[i];
                array[i] = array[i+1];
                array[i+1] = swap;
                if (i != 0)
                    i--;
            }
        }
        return array;
    }
}
