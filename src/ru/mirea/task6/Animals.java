package ru.mirea.task6;

public class Animals implements Nameable{
    @Override
    public void getName() {
        System.out.println("Cat");
    }
    public static void main(String[] args){
        Animals cat = new Animals();
        cat.getName();
    }
}
