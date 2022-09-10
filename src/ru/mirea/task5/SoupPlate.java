package ru.mirea.task5;

public class SoupPlate extends Dish{
    @Override
    public String use() {
        return "Eat! with spoon";
    }
    public static void main(String[] args){
        SoupPlate orangeSoupPlate = new SoupPlate();
        orangeSoupPlate.setName("soupPlate");
        orangeSoupPlate.setForm("plateButForSoup");
        orangeSoupPlate.setColor("orange");
        orangeSoupPlate.setMaterial("ceramics");
        System.out.println("How to use: ");
        System.out.println(orangeSoupPlate.use());
        System.out.println(orangeSoupPlate);
    }
}
