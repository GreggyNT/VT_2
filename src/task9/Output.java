package task9;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Basket b = new Basket(new Scanner(System.in).nextInt());
        System.out.println(b.AllBallsWeight());
        System.out.println(b.BlueAmount());
    }
}
