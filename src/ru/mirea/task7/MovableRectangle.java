package ru.mirea.task7;

public class MovableRectangle implements Movable{
    int x1,y1,x2,y2;
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
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, MovablePoint topLeft, MovablePoint bottomRight) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.topLeft.xSpeed = topLeft.xSpeed;
        this.bottomRight.ySpeed = bottomRight.ySpeed;
    }
}
