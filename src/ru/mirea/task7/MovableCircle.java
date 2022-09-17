package ru.mirea.task7;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;


    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
        this.center.x = center.x;
        this.center.y = center.y;
        this.center.xSpeed = center.xSpeed;
        this.center.ySpeed = center.ySpeed;
    }

    @Override
    public void moveUp() {

    }
    @Override
    public void moveDown() {

    }
    @Override
    public void moveLeft() {

    }
    @Override
    public void moveRight() {

    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
