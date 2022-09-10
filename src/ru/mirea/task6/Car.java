package ru.mirea.task6;

public class Car implements Priceable{
    @Override
    public void getPrice() {
        System.out.printf("%.2f",Math.random()*1000000);
    }
    public static void main(String[] args){
        Car sedan = new Car();
        sedan.getPrice();
    }
}
