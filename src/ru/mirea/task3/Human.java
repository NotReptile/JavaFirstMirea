package ru.mirea.task3;
import java.util.Scanner;

public class Human {
    private String name;
    private int age;
    private double height;
    private double weight;

    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Human(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public static void main(String[] args){
        Head head = new Head(true, 1);
        Hands hands = new Hands(2, false);
        Legs legs = new Legs(2, false);
        Chest chest = new Chest(1, true);
        Human human = new Human("human1", 19, 180, 80.5);
        System.out.println(head);
        System.out.println(hands);
        System.out.println(legs);
        System.out.println(chest);
        System.out.println(human);


    }
}
