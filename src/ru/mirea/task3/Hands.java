package ru.mirea.task3;

public class Hands {
    private int quantity;
    private boolean isThereAnythingInHand;

    public int getQuantity() {
        return quantity;
    }

    public boolean isThereAnythingInHand() {
        return isThereAnythingInHand;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setThereAnythingInHand(boolean thereAnythingInHand) {
        isThereAnythingInHand = thereAnythingInHand;
    }

    public Hands(int quantity, boolean isThereAnythingInHand) {
        this.quantity = quantity;
        this.isThereAnythingInHand = isThereAnythingInHand;
    }
    public String toString() {
        return "Hands{" +
                "quantity=" + quantity +
                ", isThereAnythingInHand=" + isThereAnythingInHand +
                '}';
    }
}
