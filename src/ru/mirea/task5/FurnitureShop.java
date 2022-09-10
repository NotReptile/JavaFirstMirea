package ru.mirea.task5;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public  class FurnitureShop extends Furniture {
    String formattedDouble = new DecimalFormat("#0.00").format(0.1321231);
    private double price;
    private boolean isAvailable;
    private Random random = new Random();
    public String addToCart(){
        if(isAvailable = true){
            return "Added to cart!";
        }
        else
            return "NotAvailable!";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String use() {
        return "Buy Something!";
    }

    public FurnitureShop(double price, boolean isAvailable) {
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String toString() {
        return "FurnitureShop{" +
                "price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
    public static void main(String[] args){
        FurnitureShop greenTable = new FurnitureShop(1500.54,false);
        greenTable.setForm("Square");
        greenTable.setColor("Green");
        greenTable.setName("GreenTable");
        System.out.println(greenTable);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = 0;
        FurnitureShop[] furniture = new FurnitureShop[n];
        for (int i = 0; i < n; i++){
            furniture[i] = new FurnitureShop(Math.random()*10000,Math.random()<0.5);
            //System.out.println("Furniture " + i + " " + furniture[i].addToCart()); если раскоментить то рандом почему-то ломается -_-
        }
        for (int i = 0; i < n; i++){
            System.out.println(furniture[i]);
        }
    }
}
