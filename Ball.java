package ru.mirea.kvbo1.gurtovaya;

public class Ball {
    double x = 0.0, y = 0.0;

    public Ball() {}

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        setX(x);
        setY(y);
    }

    public void move(double xDisp, double yDisp) {
        setX(x+xDisp);
        setY(y+yDisp);
    }

    public String toString() {
        return "Мяч: " + "x = " + x + "; y = " + y + ".";
    }
}
