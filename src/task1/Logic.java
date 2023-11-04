package task1;

public class Logic {
    public double result(int x, int y){ return (1+Math.pow(Math.sin(x+y),2))/(2+Math.abs(x-2*x/(1+Math.pow(x,2)*Math.pow(y,2))))+x; }
}
