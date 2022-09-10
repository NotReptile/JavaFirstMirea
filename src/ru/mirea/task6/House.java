package ru.mirea.task6;

public class House implements Priceable{
    @Override
    public void getPrice() {
        System.out.printf("%.2f",Math.random()*10000000);
    }
    public static void main(String[] args){
        House bigHouse = new House();
        bigHouse.getPrice();
    }
}
