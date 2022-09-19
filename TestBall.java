package ru.mirea.kvbo1.gurtovaya;

public class TestBall {
    public static void main(String[] args) {
        Ball a = new Ball();
        System.out.println(a);
        a.setXY(4.4, 6.3);
        System.out.println(a);
        a.move(19, 5);
        System.out.println(a);
    }
}
