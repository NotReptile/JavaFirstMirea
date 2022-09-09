package ru.mirea.task3;

public class Chest {
    private int quantity;
    private boolean isBreathing;

    public int getQuantity() {
        return quantity;
    }

    public boolean isBreathing() {
        return isBreathing;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBreathing(boolean breathing) {
        isBreathing = breathing;
    }

    public Chest(int quantity, boolean isBreathing) {
        this.quantity = quantity;
        this.isBreathing = isBreathing;
    }
    public String toString() {
        return "Chest{" +
                "quantity=" + quantity +
                ", isBreathing=" + isBreathing +
                '}';
    }
}
