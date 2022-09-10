package ru.mirea.task5;

public class Table extends Furniture{
    @Override
    public String use() {
        return "Just put something on it!";
    }
    public static void main(String[] args){
        Table redTable = new Table();
        redTable.setForm("Circle");
        redTable.setColor("red");
        redTable.setName("Table");
        System.out.println(redTable.use());
        System.out.println(redTable);
    }
}
