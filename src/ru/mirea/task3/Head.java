package ru.mirea.task3;

public class Head {
    private boolean hair;
    private int quantity;

    public void setHair(boolean hair) {
        this.hair = hair;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isHair() {
        return hair;
    }

    public int getQuantity() {
        return quantity;
    }

    public Head(boolean hair, int quantity) {
        this.hair = hair;
        this.quantity = quantity;
    }

    public String toString() {
        return "Head{" +
                "hair=" + hair +
                ", quantity=" + quantity +
                '}';
    }
}
