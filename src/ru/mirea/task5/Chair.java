package ru.mirea.task5;

public class Chair extends Furniture{

    @Override
    public String use() {
        return "Just sit on it!";
    }
    public static void main(String[] args){
        Chair greenChair = new Chair();
        greenChair.setForm("ChairFormIDK");
        greenChair.setColor("green");
        greenChair.setName("Chair");
        System.out.println(greenChair.use());
        System.out.println(greenChair);
    }
}
