package ru.mirea.task5;

public class Cup extends Dish{
    @Override
    public String use() {
        return "Drink!";
    }
    public static void main(String[] args){
        Cup redCup = new Cup();
        redCup.setName("cup");
        redCup.setForm("cylinder");
        redCup.setColor("red");
        redCup.setMaterial("steel");
        System.out.println("How to use: ");
        System.out.println(redCup.use());
        System.out.println(redCup);
    }
}
