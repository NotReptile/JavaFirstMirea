package ru.mirea.task3;

public class Legs {
    private int quantity;
    private boolean legsMove;

    public int getQuantity() {
        return quantity;
    }

    public boolean isLegsMove() {
        return legsMove;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setLegsMove(boolean legsMove) {
        this.legsMove = legsMove;
    }
    public Legs(int quantity, boolean legsMove) {
        this.quantity = quantity;
        this.legsMove = legsMove;
    }
    public String toString() {
        return "Legs{" +
                "quantity=" + quantity +
                ", legsMove=" + legsMove +
                '}';
    }
}
