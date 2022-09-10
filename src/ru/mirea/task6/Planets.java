package ru.mirea.task6;

public class Planets implements Nameable{
    @Override
    public void getName() {
        System.out.println("Earth");
    }
    public static void main(String[] args){
        Planets earth = new Planets();
        earth.getName();
    }
}
