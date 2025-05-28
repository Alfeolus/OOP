package main;

public class Coordinate<T extends Number> {
    public T x;
    public T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T power(T v){
        return v * v;
    }

}
