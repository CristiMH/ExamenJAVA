package edu.step.oop;

public class Product {
    private int productID;
    private String name;
    private double price;
    private int quantity;

    public Product (int productID) {
        this.productID = productID;
    }

    public Product (int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public Product (int productID, String name, double price, int quantity) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity entered.");
        }
    }
}