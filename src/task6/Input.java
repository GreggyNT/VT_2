package task6;

import java.util.Scanner;

public class Input {

    public final int n;
    public final int[] values;
    public Input(){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        values = new int[n];
        for (int i = 0; i < n; i++)
            values[i] = scanner.nextInt();
    }
}
