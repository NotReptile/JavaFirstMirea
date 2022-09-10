package ru.mirea.task5;

public class Plate extends Dish{
    @Override
    public String use() {
        return "Eat! with fork";
    }
    public static void main(String[] args){
        Plate greenPlate = new Plate();
        greenPlate.setName("Plate");
        greenPlate.setForm("circle");
        greenPlate.setColor("green");
        greenPlate.setMaterial("ceramics");
        System.out.println("How to use: ");
        System.out.println(greenPlate.use());
        System.out.println(greenPlate);
    }

}
